package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdCheckConfiguration extends StObject {
  
  /**
    * A list of ID check security steps, each specifying an authorization type.
    */
  var authSteps: js.UndefOr[js.Array[IdCheckSecurityStep]] = js.native
  
  /**
    * Boolean that specifies whether the signature is the default signature for the user.
    */
  var isDefault: js.UndefOr[String] = js.native
  
  /**
    * The name of the signature.
    */
  var name: js.UndefOr[String] = js.native
}
object IdCheckConfiguration {
  
  @scala.inline
  def apply(): IdCheckConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdCheckConfiguration]
  }
  
  @scala.inline
  implicit class IdCheckConfigurationMutableBuilder[Self <: IdCheckConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthSteps(value: js.Array[IdCheckSecurityStep]): Self = StObject.set(x, "authSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthStepsUndefined: Self = StObject.set(x, "authSteps", js.undefined)
    
    @scala.inline
    def setAuthStepsVarargs(value: IdCheckSecurityStep*): Self = StObject.set(x, "authSteps", js.Array(value :_*))
    
    @scala.inline
    def setIsDefault(value: String): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
