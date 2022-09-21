package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdCheckConfiguration extends StObject {
  
  /**
    * A list of ID check security steps, each specifying an authorization type.
    */
  var authSteps: js.UndefOr[js.Array[IdCheckSecurityStep]] = js.undefined
  
  /**
    * Boolean that specifies whether the signature is the default signature for the user.
    */
  var isDefault: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the signature.
    */
  var name: js.UndefOr[String] = js.undefined
}
object IdCheckConfiguration {
  
  inline def apply(): IdCheckConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdCheckConfiguration]
  }
  
  extension [Self <: IdCheckConfiguration](x: Self) {
    
    inline def setAuthSteps(value: js.Array[IdCheckSecurityStep]): Self = StObject.set(x, "authSteps", value.asInstanceOf[js.Any])
    
    inline def setAuthStepsUndefined: Self = StObject.set(x, "authSteps", js.undefined)
    
    inline def setAuthStepsVarargs(value: IdCheckSecurityStep*): Self = StObject.set(x, "authSteps", js.Array(value*))
    
    inline def setIsDefault(value: String): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
