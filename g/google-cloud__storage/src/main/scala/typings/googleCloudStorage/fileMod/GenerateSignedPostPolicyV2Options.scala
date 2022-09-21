package typings.googleCloudStorage.fileMod

import typings.googleCloudStorage.anon.Max
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateSignedPostPolicyV2Options extends StObject {
  
  var acl: js.UndefOr[String] = js.undefined
  
  var contentLengthRange: js.UndefOr[Max] = js.undefined
  
  @JSName("equals")
  var equals_FGenerateSignedPostPolicyV2Options: js.UndefOr[js.Array[js.Array[String] | String]] = js.undefined
  
  var expires: String | Double | js.Date
  
  var startsWith: js.UndefOr[js.Array[js.Array[String] | String]] = js.undefined
  
  var successRedirect: js.UndefOr[String] = js.undefined
  
  var successStatus: js.UndefOr[String] = js.undefined
}
object GenerateSignedPostPolicyV2Options {
  
  inline def apply(expires: String | Double | js.Date): GenerateSignedPostPolicyV2Options = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateSignedPostPolicyV2Options]
  }
  
  extension [Self <: GenerateSignedPostPolicyV2Options](x: Self) {
    
    inline def setAcl(value: String): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    inline def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
    
    inline def setContentLengthRange(value: Max): Self = StObject.set(x, "contentLengthRange", value.asInstanceOf[js.Any])
    
    inline def setContentLengthRangeUndefined: Self = StObject.set(x, "contentLengthRange", js.undefined)
    
    inline def setEquals_(value: js.Array[js.Array[String] | String]): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
    
    inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
    
    inline def setEquals_Varargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "equals", js.Array(value*))
    
    inline def setExpires(value: String | Double | js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setStartsWith(value: js.Array[js.Array[String] | String]): Self = StObject.set(x, "startsWith", value.asInstanceOf[js.Any])
    
    inline def setStartsWithUndefined: Self = StObject.set(x, "startsWith", js.undefined)
    
    inline def setStartsWithVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "startsWith", js.Array(value*))
    
    inline def setSuccessRedirect(value: String): Self = StObject.set(x, "successRedirect", value.asInstanceOf[js.Any])
    
    inline def setSuccessRedirectUndefined: Self = StObject.set(x, "successRedirect", js.undefined)
    
    inline def setSuccessStatus(value: String): Self = StObject.set(x, "successStatus", value.asInstanceOf[js.Any])
    
    inline def setSuccessStatusUndefined: Self = StObject.set(x, "successStatus", js.undefined)
  }
}
