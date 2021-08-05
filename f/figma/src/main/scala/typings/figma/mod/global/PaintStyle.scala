package typings.figma.mod.global

import typings.figma.figmaStrings.PAINT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaintStyle
  extends StObject
     with BaseStyle {
  
  var paints: js.Array[Paint]
  
  @JSName("type")
  var type_PaintStyle: PAINT
}
object PaintStyle {
  
  inline def apply(
    description: String,
    id: String,
    key: String,
    name: String,
    paints: js.Array[Paint],
    remote: Boolean,
    remove: () => Unit
  ): PaintStyle = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paints = paints.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove))
    __obj.updateDynamic("type")("PAINT")
    __obj.asInstanceOf[PaintStyle]
  }
  
  extension [Self <: PaintStyle](x: Self) {
    
    inline def setPaints(value: js.Array[Paint]): Self = StObject.set(x, "paints", value.asInstanceOf[js.Any])
    
    inline def setPaintsVarargs(value: Paint*): Self = StObject.set(x, "paints", js.Array(value :_*))
    
    inline def setType(value: PAINT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
