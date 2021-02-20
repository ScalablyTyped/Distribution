package typings.devexpressUtils

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupMod {
  
  @JSImport("@devexpress/utils/lib/utils/popup", "PopupUtils")
  @js.native
  class PopupUtils () extends StObject
  /* static members */
  object PopupUtils {
    
    @JSImport("@devexpress/utils/lib/utils/popup", "PopupUtils.preventContextMenu")
    @js.native
    def preventContextMenu(evt: MouseEvent): Unit = js.native
  }
}
