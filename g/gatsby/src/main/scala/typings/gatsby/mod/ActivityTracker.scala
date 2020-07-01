package typings.gatsby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityTracker extends js.Object {
  var span: js.Object = js.native
  def end(): js.Function0[Unit] = js.native
  def panic(errorMeta: String): scala.Nothing = js.native
  def panic(errorMeta: String, error: js.Object): scala.Nothing = js.native
  def panic(errorMeta: js.Object): scala.Nothing = js.native
  def panic(errorMeta: js.Object, error: js.Object): scala.Nothing = js.native
  def panicOnBuild(errorMeta: String): Unit = js.native
  def panicOnBuild(errorMeta: String, error: js.Object): Unit = js.native
  def panicOnBuild(errorMeta: js.Object): Unit = js.native
  def panicOnBuild(errorMeta: js.Object, error: js.Object): Unit = js.native
  def setStatus(status: String): Unit = js.native
  def start(): js.Function0[Unit] = js.native
}

