package typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for BinauthzManagementService.ListAttestors.
  */
@js.native
trait SchemaListAttestorsResponse extends js.Object {
  /**
    * The list of attestors.
    */
  var attestors: js.UndefOr[js.Array[SchemaAttestor]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListAttestorsRequest.page_token field in the subsequent call to the
    * `ListAttestors` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListAttestorsResponse {
  @scala.inline
  def apply(): SchemaListAttestorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAttestorsResponse]
  }
  @scala.inline
  implicit class SchemaListAttestorsResponseOps[Self <: SchemaListAttestorsResponse] (val x: Self) extends AnyVal {
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
    def setAttestorsVarargs(value: SchemaAttestor*): Self = this.set("attestors", js.Array(value :_*))
    @scala.inline
    def setAttestors(value: js.Array[SchemaAttestor]): Self = this.set("attestors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttestors: Self = this.set("attestors", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

