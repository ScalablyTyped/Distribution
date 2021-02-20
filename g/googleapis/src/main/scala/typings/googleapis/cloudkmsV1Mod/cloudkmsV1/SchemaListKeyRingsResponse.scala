package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for KeyManagementService.ListKeyRings.
  */
@js.native
trait SchemaListKeyRingsResponse extends StObject {
  
  /**
    * The list of KeyRings.
    */
  var keyRings: js.UndefOr[js.Array[SchemaKeyRing]] = js.native
  
  /**
    * A token to retrieve next page of results. Pass this value in
    * ListKeyRingsRequest.page_token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The total number of KeyRings that matched the query.
    */
  var totalSize: js.UndefOr[Double] = js.native
}
object SchemaListKeyRingsResponse {
  
  @scala.inline
  def apply(): SchemaListKeyRingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListKeyRingsResponse]
  }
  
  @scala.inline
  implicit class SchemaListKeyRingsResponseMutableBuilder[Self <: SchemaListKeyRingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyRings(value: js.Array[SchemaKeyRing]): Self = StObject.set(x, "keyRings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyRingsUndefined: Self = StObject.set(x, "keyRings", js.undefined)
    
    @scala.inline
    def setKeyRingsVarargs(value: SchemaKeyRing*): Self = StObject.set(x, "keyRings", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
