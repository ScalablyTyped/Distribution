package typings.estree.mod

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
  implicit class MetaPropertyOps[Self <: MetaProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMeta(value: Identifier): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: Identifier): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.MetaProperty): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
