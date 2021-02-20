package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaApksListResponse extends StObject {
  
  var apks: js.UndefOr[js.Array[SchemaApk]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidpublisher#apksListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaApksListResponse {
  
  @scala.inline
  def apply(): SchemaApksListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApksListResponse]
  }
  
  @scala.inline
  implicit class SchemaApksListResponseMutableBuilder[Self <: SchemaApksListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApks(value: js.Array[SchemaApk]): Self = StObject.set(x, "apks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApksUndefined: Self = StObject.set(x, "apks", js.undefined)
    
    @scala.inline
    def setApksVarargs(value: SchemaApk*): Self = StObject.set(x, "apks", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
