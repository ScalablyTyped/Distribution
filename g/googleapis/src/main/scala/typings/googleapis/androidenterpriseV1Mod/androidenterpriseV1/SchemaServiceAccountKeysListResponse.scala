package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaServiceAccountKeysListResponse extends StObject {
  
  /**
    * The service account credentials.
    */
  var serviceAccountKey: js.UndefOr[js.Array[SchemaServiceAccountKey]] = js.native
}
object SchemaServiceAccountKeysListResponse {
  
  @scala.inline
  def apply(): SchemaServiceAccountKeysListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccountKeysListResponse]
  }
  
  @scala.inline
  implicit class SchemaServiceAccountKeysListResponseMutableBuilder[Self <: SchemaServiceAccountKeysListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceAccountKey(value: js.Array[SchemaServiceAccountKey]): Self = StObject.set(x, "serviceAccountKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountKeyUndefined: Self = StObject.set(x, "serviceAccountKey", js.undefined)
    
    @scala.inline
    def setServiceAccountKeyVarargs(value: SchemaServiceAccountKey*): Self = StObject.set(x, "serviceAccountKey", js.Array(value :_*))
  }
}
