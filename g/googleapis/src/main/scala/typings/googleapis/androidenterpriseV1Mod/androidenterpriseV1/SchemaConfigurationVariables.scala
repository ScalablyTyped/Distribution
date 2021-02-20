package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
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
trait SchemaConfigurationVariables extends StObject {
  
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
  implicit class SchemaConfigurationVariablesMutableBuilder[Self <: SchemaConfigurationVariables] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMcmId(value: String): Self = StObject.set(x, "mcmId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMcmIdUndefined: Self = StObject.set(x, "mcmId", js.undefined)
    
    @scala.inline
    def setVariableSet(value: js.Array[SchemaVariableSet]): Self = StObject.set(x, "variableSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableSetUndefined: Self = StObject.set(x, "variableSet", js.undefined)
    
    @scala.inline
    def setVariableSetVarargs(value: SchemaVariableSet*): Self = StObject.set(x, "variableSet", js.Array(value :_*))
  }
}
