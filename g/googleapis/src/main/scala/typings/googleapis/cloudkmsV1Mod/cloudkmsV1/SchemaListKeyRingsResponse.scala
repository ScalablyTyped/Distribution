package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for KeyManagementService.ListKeyRings.
  */
@js.native
trait SchemaListKeyRingsResponse extends js.Object {
  
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
  implicit class SchemaListKeyRingsResponseOps[Self <: SchemaListKeyRingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKeyRingsVarargs(value: SchemaKeyRing*): Self = this.set("keyRings", js.Array(value :_*))
    
    @scala.inline
    def setKeyRings(value: js.Array[SchemaKeyRing]): Self = this.set("keyRings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyRings: Self = this.set("keyRings", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setTotalSize(value: Double): Self = this.set("totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalSize: Self = this.set("totalSize", js.undefined)
  }
}
