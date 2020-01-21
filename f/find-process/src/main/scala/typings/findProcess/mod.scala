package typings.findProcess

import typings.findProcess.findProcessStrings.name
import typings.findProcess.findProcessStrings.pid
import typings.findProcess.findProcessStrings.port
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("find-process", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(`type`: name, value: String): js.Promise[js.Array[AnonCmd]] = js.native
  def apply(`type`: name, value: String, strict: Boolean): js.Promise[js.Array[AnonCmd]] = js.native
  def apply(`type`: name, value: Double): js.Promise[js.Array[AnonCmd]] = js.native
  def apply(`type`: name, value: Double, strict: Boolean): js.Promise[js.Array[AnonCmd]] = js.native
  def apply(`type`: name, value: RegExp): js.Promise[js.Array[AnonCmd]] = js.native
  def apply(`type`: name, value: RegExp, strict: Boolean): js.Promise[js.Array[AnonCmd]] = js.native
  def apply(`type`: pid, value: String): js.Promise[js.Array[AnonCmd]] = js.native
  def apply(`type`: pid, value: String, strict: Boolean): js.Promise[js.Array[AnonCmd]] = js.native
  def apply(`type`: pid, value: Double): js.Promise[js.Array[AnonCmd]] = js.native
  def apply(`type`: pid, value: Double, strict: Boolean): js.Promise[js.Array[AnonCmd]] = js.native
  def apply(`type`: pid, value: RegExp): js.Promise[js.Array[AnonCmd]] = js.native
  def apply(`type`: pid, value: RegExp, strict: Boolean): js.Promise[js.Array[AnonCmd]] = js.native
  def apply(`type`: port, value: String): js.Promise[js.Array[AnonCmd]] = js.native
  def apply(`type`: port, value: String, strict: Boolean): js.Promise[js.Array[AnonCmd]] = js.native
  def apply(`type`: port, value: Double): js.Promise[js.Array[AnonCmd]] = js.native
  def apply(`type`: port, value: Double, strict: Boolean): js.Promise[js.Array[AnonCmd]] = js.native
  def apply(`type`: port, value: RegExp): js.Promise[js.Array[AnonCmd]] = js.native
  def apply(`type`: port, value: RegExp, strict: Boolean): js.Promise[js.Array[AnonCmd]] = js.native
}

