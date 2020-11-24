package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for KeyManagementService.ListCryptoKeys.
  */
@js.native
trait SchemaListCryptoKeysResponse extends js.Object {
  
  /**
    * The list of CryptoKeys.
    */
  var cryptoKeys: js.UndefOr[js.Array[SchemaCryptoKey]] = js.native
  
  /**
    * A token to retrieve next page of results. Pass this value in
    * ListCryptoKeysRequest.page_token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The total number of CryptoKeys that matched the query.
    */
  var totalSize: js.UndefOr[Double] = js.native
}
object SchemaListCryptoKeysResponse {
  
  @scala.inline
  def apply(): SchemaListCryptoKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCryptoKeysResponse]
  }
  
  @scala.inline
  implicit class SchemaListCryptoKeysResponseOps[Self <: SchemaListCryptoKeysResponse] (val x: Self) extends AnyVal {
    
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
    def setCryptoKeysVarargs(value: SchemaCryptoKey*): Self = this.set("cryptoKeys", js.Array(value :_*))
    
    @scala.inline
    def setCryptoKeys(value: js.Array[SchemaCryptoKey]): Self = this.set("cryptoKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCryptoKeys: Self = this.set("cryptoKeys", js.undefined)
    
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
