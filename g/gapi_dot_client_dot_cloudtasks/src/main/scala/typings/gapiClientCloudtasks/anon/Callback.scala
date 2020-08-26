package typings.gapiClientCloudtasks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callback extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.native
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /**
    * Sort order used for the query. The fields supported for sorting
    * are Task.schedule_time and PullMessage.tag. All results will be
    * returned in ascending order. The default ordering is by
    * Task.schedule_time.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Requested page size. Fewer tasks than requested might be returned.
    *
    * The maximum page size is 1000. If unspecified, the page size will
    * be the maximum. Fewer tasks than requested might be returned,
    * even if more tasks exist; use
    * ListTasksResponse.next_page_token to determine if more tasks
    * exist.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying the page of results to return.
    *
    * To request the first page results, page_token must be empty. To
    * request the next page of results, page_token must be the value of
    * ListTasksResponse.next_page_token returned from the previous
    * call to CloudTasks.ListTasks method.
    *
    * The page token is valid for only 2 hours.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required.
    *
    * The queue name. For example:
    * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    */
  var parent: String = js.native
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /**
    * The response_view specifies which subset of the Task will be
    * returned.
    *
    * By default response_view is Task.View.BASIC; not all
    * information is retrieved by default because some data, such as
    * payloads, might be desirable to return only when needed because
    * of its large size or because of the sensitivity of data that it
    * contains.
    *
    * Authorization for Task.View.FULL requires `cloudtasks.tasks.fullView`
    * [Google IAM](/iam/) permission on the
    * Task.name resource.
    */
  var responseView: js.UndefOr[String] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}

object Callback {
  @scala.inline
  def apply(parent: String): Callback = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
  @scala.inline
  implicit class CallbackOps[Self <: Callback] (val x: Self) extends AnyVal {
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
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def set$Dotxgafv(value: String): Self = this.set("$.xgafv", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$Dotxgafv: Self = this.set("$.xgafv", js.undefined)
    @scala.inline
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setBearer_token(value: String): Self = this.set("bearer_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBearer_token: Self = this.set("bearer_token", js.undefined)
    @scala.inline
    def setCallback(value: String): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    @scala.inline
    def setOrderBy(value: String): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setPp(value: Boolean): Self = this.set("pp", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePp: Self = this.set("pp", js.undefined)
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    @scala.inline
    def setResponseView(value: String): Self = this.set("responseView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseView: Self = this.set("responseView", js.undefined)
    @scala.inline
    def setUploadType(value: String): Self = this.set("uploadType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadType: Self = this.set("uploadType", js.undefined)
    @scala.inline
    def setUpload_protocol(value: String): Self = this.set("upload_protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpload_protocol: Self = this.set("upload_protocol", js.undefined)
  }
  
}

