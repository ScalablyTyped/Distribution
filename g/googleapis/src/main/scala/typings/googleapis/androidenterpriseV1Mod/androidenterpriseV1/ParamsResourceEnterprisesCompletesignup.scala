package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesCompletesignup
  extends StObject
     with StandardParameters {
  
  /**
    * The Completion token initially returned by GenerateSignupUrl.
    */
  var completionToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Enterprise token appended to the Callback URL.
    */
  var enterpriseToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceEnterprisesCompletesignup {
  
  inline def apply(): ParamsResourceEnterprisesCompletesignup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesCompletesignup]
  }
  
  extension [Self <: ParamsResourceEnterprisesCompletesignup](x: Self) {
    
    inline def setCompletionToken(value: String): Self = StObject.set(x, "completionToken", value.asInstanceOf[js.Any])
    
    inline def setCompletionTokenUndefined: Self = StObject.set(x, "completionToken", js.undefined)
    
    inline def setEnterpriseToken(value: String): Self = StObject.set(x, "enterpriseToken", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseTokenUndefined: Self = StObject.set(x, "enterpriseToken", js.undefined)
  }
}
