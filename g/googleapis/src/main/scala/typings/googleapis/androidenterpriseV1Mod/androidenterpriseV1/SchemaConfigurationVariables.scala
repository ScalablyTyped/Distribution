package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A configuration variables resource contains the managed configuration
  * settings ID to be applied to a single user, as well as the variable set
  * that is attributed to the user. The variable set will be used to replace
  * placeholders in the managed configuration settings.
  */
@js.native
trait SchemaConfigurationVariables extends js.Object {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#configurationVariables&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The ID of the managed configurations settings.
    */
  var mcmId: js.UndefOr[String] = js.native
  
  /**
    * The variable set that is attributed to the user.
    */
  var variableSet: js.UndefOr[js.Array[SchemaVariableSet]] = js.native
}
object SchemaConfigurationVariables {
  
  @scala.inline
  def apply(): SchemaConfigurationVariables = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigurationVariables]
  }
  
  @scala.inline
  implicit class SchemaConfigurationVariablesOps[Self <: SchemaConfigurationVariables] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMcmId(value: String): Self = this.set("mcmId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMcmId: Self = this.set("mcmId", js.undefined)
    
    @scala.inline
    def setVariableSetVarargs(value: SchemaVariableSet*): Self = this.set("variableSet", js.Array(value :_*))
    
    @scala.inline
    def setVariableSet(value: js.Array[SchemaVariableSet]): Self = this.set("variableSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariableSet: Self = this.set("variableSet", js.undefined)
  }
}
