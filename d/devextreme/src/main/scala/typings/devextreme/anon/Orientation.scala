package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxDiagram.DiagramDataLayoutType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Orientation extends StObject {
  
  /**
    * Specifies the diagram layout orientation.
    */
  var orientation: js.UndefOr[typings.devextreme.mod.DevExpress.common.Orientation] = js.undefined
  
  /**
    * Specifies an auto-layout algorithm that is used to automatically arrange shapes.
    */
  var `type`: js.UndefOr[DiagramDataLayoutType] = js.undefined
}
object Orientation {
  
  inline def apply(): Orientation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Orientation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Orientation] (val x: Self) extends AnyVal {
    
    inline def setOrientation(value: typings.devextreme.mod.DevExpress.common.Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setType(value: DiagramDataLayoutType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
