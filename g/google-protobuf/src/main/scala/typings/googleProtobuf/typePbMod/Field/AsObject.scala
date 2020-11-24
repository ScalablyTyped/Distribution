package typings.googleProtobuf.typePbMod.Field

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var cardinality: Cardinality = js.native
  
  var defaultValue: String = js.native
  
  var jsonName: String = js.native
  
  var kind: Kind = js.native
  
  var name: String = js.native
  
  var number: Double = js.native
  
  var oneofIndex: Double = js.native
  
  var optionsList: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject] = js.native
  
  var packed: Boolean = js.native
  
  var typeUrl: String = js.native
}
object AsObject {
  
  @scala.inline
  def apply(
    cardinality: Cardinality,
    defaultValue: String,
    jsonName: String,
    kind: Kind,
    name: String,
    number: Double,
    oneofIndex: Double,
    optionsList: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject],
    packed: Boolean,
    typeUrl: String
  ): AsObject = {
    val __obj = js.Dynamic.literal(cardinality = cardinality.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], jsonName = jsonName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], oneofIndex = oneofIndex.asInstanceOf[js.Any], optionsList = optionsList.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], typeUrl = typeUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    
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
    def setCardinality(value: Cardinality): Self = this.set("cardinality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonName(value: String): Self = this.set("jsonName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: Kind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneofIndex(value: Double): Self = this.set("oneofIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsListVarargs(value: typings.googleProtobuf.typePbMod.Option.AsObject*): Self = this.set("optionsList", js.Array(value :_*))
    
    @scala.inline
    def setOptionsList(value: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject]): Self = this.set("optionsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacked(value: Boolean): Self = this.set("packed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUrl(value: String): Self = this.set("typeUrl", value.asInstanceOf[js.Any])
  }
}
