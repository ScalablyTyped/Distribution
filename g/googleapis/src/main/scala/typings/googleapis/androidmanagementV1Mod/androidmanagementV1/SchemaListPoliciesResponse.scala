package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a request to list policies for a given enterprise.
  */
@js.native
trait SchemaListPoliciesResponse extends js.Object {
  /**
    * If there are more results, a token to retrieve next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of policies.
    */
  var policies: js.UndefOr[js.Array[SchemaPolicy]] = js.native
}

object SchemaListPoliciesResponse {
  @scala.inline
  def apply(): SchemaListPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPoliciesResponse]
  }
  @scala.inline
  implicit class SchemaListPoliciesResponseOps[Self <: SchemaListPoliciesResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setPoliciesVarargs(value: SchemaPolicy*): Self = this.set("policies", js.Array(value :_*))
    @scala.inline
    def setPolicies(value: js.Array[SchemaPolicy]): Self = this.set("policies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicies: Self = this.set("policies", js.undefined)
  }
  
}

