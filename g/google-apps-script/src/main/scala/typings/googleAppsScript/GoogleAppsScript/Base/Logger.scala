package typings.googleAppsScript.GoogleAppsScript.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class allows the developer to write out text to the debugging logs.
  */
@js.native
trait Logger extends js.Object {
  def clear(): Unit = js.native
  def getLog(): String = js.native
  def log(data: js.Any): Logger = js.native
  def log(format: String, values: js.Any*): Logger = js.native
}

