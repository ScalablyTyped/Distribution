package typings.devextreme.mod.default.ui

import typings.devextreme.mod.DevExpress.ui.CustomDialogOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialog {
  
  @JSImport("devextreme", "default.ui.dialog")
  @js.native
  val ^ : js.Any = js.native
  
  inline def alert(messageHtml: String, title: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(messageHtml.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def confirm(messageHtml: String, title: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(messageHtml.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def custom(options: CustomDialogOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("custom")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
}
