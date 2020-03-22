package typings.devextreme.mod.default.ui

import typings.devextreme.AnonButtons
import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "ui.dialog")
@js.native
object dialog extends js.Object {
  def alert(messageHtml: String, title: String): Promise[Unit] with JQueryPromise[Unit] = js.native
  def confirm(messageHtml: String, title: String): Promise[Boolean] with JQueryPromise[Boolean] = js.native
  def custom(options: AnonButtons): js.Any = js.native
}

