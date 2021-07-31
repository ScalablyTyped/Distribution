package typings.googleCloudStorage.fileMod

import typings.googleCloudStorage.anon.Max
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSignedPolicyOptions extends StObject {
  
  var acl: js.UndefOr[String] = js.undefined
  
  var contentLengthRange: js.UndefOr[Max] = js.undefined
  
  @JSName("equals")
  var equals_FGetSignedPolicyOptions: js.UndefOr[js.Array[js.Array[String] | String]] = js.undefined
  
  var expires: String | Double | Date
  
  var startsWith: js.UndefOr[js.Array[js.Array[String] | String]] = js.undefined
  
  var successRedirect: js.UndefOr[String] = js.undefined
  
  var successStatus: js.UndefOr[String] = js.undefined
}
object GetSignedPolicyOptions {
  
  @scala.inline
  def apply(expires: String | Double | Date): GetSignedPolicyOptions = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSignedPolicyOptions]
  }
  
  @scala.inline
  implicit class GetSignedPolicyOptionsMutableBuilder[Self <: GetSignedPolicyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcl(value: String): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
    
    @scala.inline
    def setContentLengthRange(value: Max): Self = StObject.set(x, "contentLengthRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLengthRangeUndefined: Self = StObject.set(x, "contentLengthRange", js.undefined)
    
    @scala.inline
    def setEquals_(value: js.Array[js.Array[String] | String]): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
    
    @scala.inline
    def setEquals_Varargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "equals", js.Array(value :_*))
    
    @scala.inline
    def setExpires(value: String | Double | Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartsWith(value: js.Array[js.Array[String] | String]): Self = StObject.set(x, "startsWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartsWithUndefined: Self = StObject.set(x, "startsWith", js.undefined)
    
    @scala.inline
    def setStartsWithVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "startsWith", js.Array(value :_*))
    
    @scala.inline
    def setSuccessRedirect(value: String): Self = StObject.set(x, "successRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessRedirectUndefined: Self = StObject.set(x, "successRedirect", js.undefined)
    
    @scala.inline
    def setSuccessStatus(value: String): Self = StObject.set(x, "successStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessStatusUndefined: Self = StObject.set(x, "successStatus", js.undefined)
  }
}
