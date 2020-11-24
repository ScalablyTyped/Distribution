package typings.devextreme.mod.default.ui

import typings.devextreme.anon.Buttons
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devextreme", "ui.dialog")
@js.native
object dialog extends js.Object {
  
  def alert(messageHtml: String, title: String): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  def confirm(messageHtml: String, title: String): Promise[Boolean] with JQueryPromise[Boolean] = js.native
  
  def custom(options: Buttons): js.Any = js.native
}
