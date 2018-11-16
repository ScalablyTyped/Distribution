package typings
package easyDashXapiDashSupertestLib.readlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadLine
  extends easyDashXapiDashSupertestLib.eventsMod.EventEmitter {
  def close(): scala.Unit = js.native
  def pause(): scala.Unit = js.native
  def prompt(): scala.Unit = js.native
  def prompt(preserveCursor: scala.Boolean): scala.Unit = js.native
  def question(query: java.lang.String, callback: js.Function): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def setPrompt(prompt: java.lang.String, length: scala.Double): scala.Unit = js.native
  def write(data: js.Any): scala.Unit = js.native
  def write(data: js.Any, key: js.Any): scala.Unit = js.native
}

