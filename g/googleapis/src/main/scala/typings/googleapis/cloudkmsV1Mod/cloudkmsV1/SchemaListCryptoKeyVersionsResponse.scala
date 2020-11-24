package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for KeyManagementService.ListCryptoKeyVersions.
  */
@js.native
trait SchemaListCryptoKeyVersionsResponse extends js.Object {
  
  /**
    * The list of CryptoKeyVersions.
    */
  var cryptoKeyVersions: js.UndefOr[js.Array[SchemaCryptoKeyVersion]] = js.native
  
  /**
    * A token to retrieve next page of results. Pass this value in
    * ListCryptoKeyVersionsRequest.page_token to retrieve the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The total number of CryptoKeyVersions that matched the query.
    */
  var totalSize: js.UndefOr[Double] = js.native
}
object SchemaListCryptoKeyVersionsResponse {
  
  @scala.inline
  def apply(): SchemaListCryptoKeyVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCryptoKeyVersionsResponse]
  }
  
  @scala.inline
  implicit class SchemaListCryptoKeyVersionsResponseOps[Self <: SchemaListCryptoKeyVersionsResponse] (val x: Self) extends AnyVal {
    
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
    def setCryptoKeyVersionsVarargs(value: SchemaCryptoKeyVersion*): Self = this.set("cryptoKeyVersions", js.Array(value :_*))
    
    @scala.inline
    def setCryptoKeyVersions(value: js.Array[SchemaCryptoKeyVersion]): Self = this.set("cryptoKeyVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCryptoKeyVersions: Self = this.set("cryptoKeyVersions", js.undefined)
    
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
