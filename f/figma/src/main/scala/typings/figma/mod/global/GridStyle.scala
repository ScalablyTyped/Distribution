package typings.figma.mod.global

import typings.figma.figmaStrings.GRID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridStyle extends BaseStyle {
  
  var layoutGrids: js.Array[LayoutGrid] = js.native
  
  @JSName("type")
  var type_GridStyle: GRID = js.native
}
object GridStyle {
  
  @scala.inline
  def apply(
    description: String,
    id: String,
    key: String,
    layoutGrids: js.Array[LayoutGrid],
    name: String,
    remote: Boolean,
    remove: () => Unit,
    `type`: GRID
  ): GridStyle = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], layoutGrids = layoutGrids.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridStyle]
  }
  
  @scala.inline
  implicit class GridStyleMutableBuilder[Self <: GridStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayoutGrids(value: js.Array[LayoutGrid]): Self = StObject.set(x, "layoutGrids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutGridsVarargs(value: LayoutGrid*): Self = StObject.set(x, "layoutGrids", js.Array(value :_*))
    
    @scala.inline
    def setType(value: GRID): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
