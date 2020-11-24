package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a data source parameter with validation rules, so that
  * parameters can be rendered in the UI. These parameters are given to us by
  * supported data sources, and include all needed information for rendering
  * and validation. Thus, whoever uses this api can decide to generate either
  * generic ui, or custom data source specific forms.
  */
@js.native
trait SchemaDataSourceParameter extends js.Object {
  
  /**
    * All possible values for the parameter.
    */
  var allowedValues: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Parameter description.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Parameter display name in the user interface.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. This field has no effect.
    */
  var fields: js.UndefOr[js.Array[SchemaDataSourceParameter]] = js.native
  
  /**
    * Cannot be changed after initial creation.
    */
  var immutable: js.UndefOr[Boolean] = js.native
  
  /**
    * For integer and double values specifies maxminum allowed value.
    */
  var maxValue: js.UndefOr[Double] = js.native
  
  /**
    * For integer and double values specifies minimum allowed value.
    */
  var minValue: js.UndefOr[Double] = js.native
  
  /**
    * Parameter identifier.
    */
  var paramId: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. This field has no effect.
    */
  var recurse: js.UndefOr[Boolean] = js.native
  
  /**
    * Deprecated. This field has no effect.
    */
  var repeated: js.UndefOr[Boolean] = js.native
  
  /**
    * Is parameter required.
    */
  var required: js.UndefOr[Boolean] = js.native
  
  /**
    * Parameter type.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Description of the requirements for this field, in case the user input
    * does not fulfill the regex pattern or min/max values.
    */
  var validationDescription: js.UndefOr[String] = js.native
  
  /**
    * URL to a help document to further explain the naming requirements.
    */
  var validationHelpUrl: js.UndefOr[String] = js.native
  
  /**
    * Regular expression which can be used for parameter validation.
    */
  var validationRegex: js.UndefOr[String] = js.native
}
object SchemaDataSourceParameter {
  
  @scala.inline
  def apply(): SchemaDataSourceParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSourceParameter]
  }
  
  @scala.inline
  implicit class SchemaDataSourceParameterOps[Self <: SchemaDataSourceParameter] (val x: Self) extends AnyVal {
    
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
    def setAllowedValuesVarargs(value: String*): Self = this.set("allowedValues", js.Array(value :_*))
    
    @scala.inline
    def setAllowedValues(value: js.Array[String]): Self = this.set("allowedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedValues: Self = this.set("allowedValues", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: SchemaDataSourceParameter*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[SchemaDataSourceParameter]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setImmutable(value: Boolean): Self = this.set("immutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImmutable: Self = this.set("immutable", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    
    @scala.inline
    def setParamId(value: String): Self = this.set("paramId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParamId: Self = this.set("paramId", js.undefined)
    
    @scala.inline
    def setRecurse(value: Boolean): Self = this.set("recurse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurse: Self = this.set("recurse", js.undefined)
    
    @scala.inline
    def setRepeated(value: Boolean): Self = this.set("repeated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeated: Self = this.set("repeated", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValidationDescription(value: String): Self = this.set("validationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationDescription: Self = this.set("validationDescription", js.undefined)
    
    @scala.inline
    def setValidationHelpUrl(value: String): Self = this.set("validationHelpUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationHelpUrl: Self = this.set("validationHelpUrl", js.undefined)
    
    @scala.inline
    def setValidationRegex(value: String): Self = this.set("validationRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationRegex: Self = this.set("validationRegex", js.undefined)
  }
}
