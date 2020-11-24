package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A typed value for the restriction.
  */
@js.native
trait SchemaAppRestrictionsSchemaRestrictionRestrictionValue extends js.Object {
  
  /**
    * The type of the value being provided.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The boolean value - this will only be present if type is bool.
    */
  var valueBool: js.UndefOr[Boolean] = js.native
  
  /**
    * The integer value - this will only be present if type is integer.
    */
  var valueInteger: js.UndefOr[Double] = js.native
  
  /**
    * The list of string values - this will only be present if type is
    * multiselect.
    */
  var valueMultiselect: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The string value - this will be present for types string, choice and
    * hidden.
    */
  var valueString: js.UndefOr[String] = js.native
}
object SchemaAppRestrictionsSchemaRestrictionRestrictionValue {
  
  @scala.inline
  def apply(): SchemaAppRestrictionsSchemaRestrictionRestrictionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppRestrictionsSchemaRestrictionRestrictionValue]
  }
  
  @scala.inline
  implicit class SchemaAppRestrictionsSchemaRestrictionRestrictionValueOps[Self <: SchemaAppRestrictionsSchemaRestrictionRestrictionValue] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValueBool(value: Boolean): Self = this.set("valueBool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueBool: Self = this.set("valueBool", js.undefined)
    
    @scala.inline
    def setValueInteger(value: Double): Self = this.set("valueInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueInteger: Self = this.set("valueInteger", js.undefined)
    
    @scala.inline
    def setValueMultiselectVarargs(value: String*): Self = this.set("valueMultiselect", js.Array(value :_*))
    
    @scala.inline
    def setValueMultiselect(value: js.Array[String]): Self = this.set("valueMultiselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueMultiselect: Self = this.set("valueMultiselect", js.undefined)
    
    @scala.inline
    def setValueString(value: String): Self = this.set("valueString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueString: Self = this.set("valueString", js.undefined)
  }
}
