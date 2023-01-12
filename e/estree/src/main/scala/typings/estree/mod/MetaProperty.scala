package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetaProperty
  extends StObject
     with BaseNode {
  
  var meta: Identifier
  
  var property: Identifier
  
  @JSName("type")
  var type_MetaProperty: typings.estree.estreeStrings.MetaProperty
}
object MetaProperty {
  
  inline def apply(meta: Identifier, property: Identifier): MetaProperty = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MetaProperty")
    __obj.asInstanceOf[MetaProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetaProperty] (val x: Self) extends AnyVal {
    
    inline def setMeta(value: Identifier): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: Identifier): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estree.estreeStrings.MetaProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
