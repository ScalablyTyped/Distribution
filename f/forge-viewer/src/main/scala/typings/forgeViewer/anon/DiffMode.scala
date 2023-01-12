package typings.forgeViewer.anon

import typings.forgeViewer.Autodesk.Viewing.PixelCompare.DIFF_MODES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiffMode extends StObject {
  
  var diffMode: js.UndefOr[DIFF_MODES] = js.undefined
  
  var restoreModelVisibilityOnExit: js.UndefOr[Boolean] = js.undefined
}
object DiffMode {
  
  inline def apply(): DiffMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiffMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiffMode] (val x: Self) extends AnyVal {
    
    inline def setDiffMode(value: DIFF_MODES): Self = StObject.set(x, "diffMode", value.asInstanceOf[js.Any])
    
    inline def setDiffModeUndefined: Self = StObject.set(x, "diffMode", js.undefined)
    
    inline def setRestoreModelVisibilityOnExit(value: Boolean): Self = StObject.set(x, "restoreModelVisibilityOnExit", value.asInstanceOf[js.Any])
    
    inline def setRestoreModelVisibilityOnExitUndefined: Self = StObject.set(x, "restoreModelVisibilityOnExit", js.undefined)
  }
}
