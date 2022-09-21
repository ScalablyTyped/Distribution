package typings.devextreme.mod.default.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devextreme", "default.ui.dxOverlay")
@js.native
open class dxOverlay[TProperties] ()
  extends StObject
     with typings.devextreme.mod.DevExpress.ui.dxOverlay[TProperties]
object dxOverlay {
  
  @JSImport("devextreme", "default.ui.dxOverlay")
  @js.native
  val ^ : js.Any = js.native
  
  inline def baseZIndex(zIndex: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("baseZIndex")(zIndex.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
