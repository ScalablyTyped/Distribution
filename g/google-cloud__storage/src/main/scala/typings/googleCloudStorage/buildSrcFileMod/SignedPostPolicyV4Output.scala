package typings.googleCloudStorage.buildSrcFileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignedPostPolicyV4Output extends StObject {
  
  var fields: PolicyFields
  
  var url: String
}
object SignedPostPolicyV4Output {
  
  inline def apply(fields: PolicyFields, url: String): SignedPostPolicyV4Output = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedPostPolicyV4Output]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignedPostPolicyV4Output] (val x: Self) extends AnyVal {
    
    inline def setFields(value: PolicyFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
