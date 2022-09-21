package typings.figma.mod.global

import typings.figma.figmaStrings.GRID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridStyle
  extends StObject
     with BaseStyle {
  
  var layoutGrids: js.Array[LayoutGrid]
  
  @JSName("type")
  var type_GridStyle: GRID
}
object GridStyle {
  
  inline def apply(
    description: String,
    id: String,
    key: String,
    layoutGrids: js.Array[LayoutGrid],
    name: String,
    remote: Boolean,
    remove: () => Unit
  ): GridStyle = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], layoutGrids = layoutGrids.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove))
    __obj.updateDynamic("type")("GRID")
    __obj.asInstanceOf[GridStyle]
  }
  
  extension [Self <: GridStyle](x: Self) {
    
    inline def setLayoutGrids(value: js.Array[LayoutGrid]): Self = StObject.set(x, "layoutGrids", value.asInstanceOf[js.Any])
    
    inline def setLayoutGridsVarargs(value: LayoutGrid*): Self = StObject.set(x, "layoutGrids", js.Array(value*))
    
    inline def setType(value: GRID): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
