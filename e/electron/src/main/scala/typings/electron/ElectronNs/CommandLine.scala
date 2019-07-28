package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandLine extends js.Object {
  /**
    * Append an argument to Chromium's command line. The argument will be quoted
    * correctly. Note: This will not affect process.argv.
    */
  def appendArgument(value: String): Unit = js.native
  /**
    * Append a switch (with optional value) to Chromium's command line. Note: This
    * will not affect process.argv, and is mainly used by developers to control some
    * low-level Chromium behaviors.
    */
  def appendSwitch(the_switch: String): Unit = js.native
  def appendSwitch(the_switch: String, value: String): Unit = js.native
  /**
    * Note: When the switch is not present, it returns empty string.
    */
  def getSwitchValue(the_switch: String): String = js.native
  def hasSwitch(the_switch: String): Boolean = js.native
}

