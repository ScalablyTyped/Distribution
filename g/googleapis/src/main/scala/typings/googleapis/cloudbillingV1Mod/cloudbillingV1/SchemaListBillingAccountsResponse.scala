package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for `ListBillingAccounts`.
  */
@js.native
trait SchemaListBillingAccountsResponse extends js.Object {
  
  /**
    * A list of billing accounts.
    */
  var billingAccounts: js.UndefOr[js.Array[SchemaBillingAccount]] = js.native
  
  /**
    * A token to retrieve the next page of results. To retrieve the next page,
    * call `ListBillingAccounts` again with the `page_token` field set to this
    * value. This field is empty if there are no more results to retrieve.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListBillingAccountsResponse {
  
  @scala.inline
  def apply(): SchemaListBillingAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBillingAccountsResponse]
  }
  
  @scala.inline
  implicit class SchemaListBillingAccountsResponseOps[Self <: SchemaListBillingAccountsResponse] (val x: Self) extends AnyVal {
    
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
    def setBillingAccountsVarargs(value: SchemaBillingAccount*): Self = this.set("billingAccounts", js.Array(value :_*))
    
    @scala.inline
    def setBillingAccounts(value: js.Array[SchemaBillingAccount]): Self = this.set("billingAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingAccounts: Self = this.set("billingAccounts", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
