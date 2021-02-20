package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetaProperty
  extends BaseNode
     with Expression {
  
  var meta: Identifier = js.native
  
  var property: Identifier = js.native
  
  @JSName("type")
  var type_MetaProperty: typings.estree.estreeStrings.MetaProperty = js.native
}
object MetaProperty {
  
  @scala.inline
  def apply(meta: Identifier, property: Identifier, `type`: typings.estree.estreeStrings.MetaProperty): MetaProperty = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaProperty]
  }
  
  @scala.inline
  implicit class MetaPropertyMutableBuilder[Self <: MetaProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeta(value: Identifier): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: Identifier): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.MetaProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
