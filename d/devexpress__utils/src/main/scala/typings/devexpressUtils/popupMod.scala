package typings.devexpressUtils

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupMod {
  
  @JSImport("@devexpress/utils/lib/utils/popup", "PopupUtils")
  @js.native
  open class PopupUtils () extends StObject
  /* static members */
  object PopupUtils {
    
    @JSImport("@devexpress/utils/lib/utils/popup", "PopupUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def preventContextMenu(evt: MouseEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventContextMenu")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
