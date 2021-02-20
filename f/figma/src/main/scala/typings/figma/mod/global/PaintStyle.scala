package typings.figma.mod.global

import typings.figma.figmaStrings.PAINT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaintStyle extends BaseStyle {
  
  var paints: js.Array[Paint] = js.native
  
  @JSName("type")
  var type_PaintStyle: PAINT = js.native
}
object PaintStyle {
  
  @scala.inline
  def apply(
    description: String,
    id: String,
    key: String,
    name: String,
    paints: js.Array[Paint],
    remote: Boolean,
    remove: () => Unit,
    `type`: PAINT
  ): PaintStyle = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paints = paints.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaintStyle]
  }
  
  @scala.inline
  implicit class PaintStyleMutableBuilder[Self <: PaintStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaints(value: js.Array[Paint]): Self = StObject.set(x, "paints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaintsVarargs(value: Paint*): Self = StObject.set(x, "paints", js.Array(value :_*))
    
    @scala.inline
    def setType(value: PAINT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
