package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.assets
import typings.ecmarkup.ecmarkupStrings.noneVerticallineinlineVerticallineexternal
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeLabel extends StObject {
  
  val description: /* Link to css and js assets (default: inline, unless --multipage) */ String
  
  val name: assets
  
  /* standard es5 */
  def `type`(): String
  def `type`(value: Any): String
  
  val typeLabel: noneVerticallineinlineVerticallineexternal
  
  @JSName("type")
  val type_Original: StringConstructor
}
object TypeLabel {
  
  inline def apply(`type`: StringConstructor): TypeLabel = {
    val __obj = js.Dynamic.literal(description = "Link to css and js assets (default: inline, unless --multipage)", name = "assets", typeLabel = "none|inline|external")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeLabel]
  }
  
  extension [Self <: TypeLabel](x: Self) {
    
    inline def setDescription(value: /* Link to css and js assets (default: inline, unless --multipage) */ String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: assets): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: StringConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeLabel(value: noneVerticallineinlineVerticallineexternal): Self = StObject.set(x, "typeLabel", value.asInstanceOf[js.Any])
  }
}
