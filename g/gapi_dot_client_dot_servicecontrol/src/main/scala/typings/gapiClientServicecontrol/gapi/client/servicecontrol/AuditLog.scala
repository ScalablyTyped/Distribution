package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuditLog extends js.Object {
  /** Authentication information. */
  var authenticationInfo: js.UndefOr[AuthenticationInfo] = js.native
  /**
    * Authorization information. If there are multiple
    * resources or permissions involved, then there is
    * one AuthorizationInfo element for each {resource, permission} tuple.
    */
  var authorizationInfo: js.UndefOr[js.Array[AuthorizationInfo]] = js.native
  /**
    * Other service-specific data about the request, response, and other
    * information associated with the current audited event.
    */
  var metadata: js.UndefOr[Record[String, _]] = js.native
  /**
    * The name of the service method or operation.
    * For API calls, this should be the name of the API method.
    * For example,
    *
    * "google.datastore.v1.Datastore.RunQuery"
    * "google.logging.v1.LoggingService.DeleteLog"
    */
  var methodName: js.UndefOr[String] = js.native
  /**
    * The number of items returned from a List or Query API method,
    * if applicable.
    */
  var numResponseItems: js.UndefOr[String] = js.native
  /**
    * The operation request. This may not include all request parameters,
    * such as those that are too large, privacy-sensitive, or duplicated
    * elsewhere in the log record.
    * It should never include user-generated data, such as file contents.
    * When the JSON object represented here has a proto equivalent, the proto
    * name will be indicated in the `@type` property.
    */
  var request: js.UndefOr[Record[String, _]] = js.native
  /** Metadata about the operation. */
  var requestMetadata: js.UndefOr[RequestMetadata] = js.native
  /**
    * The resource or collection that is the target of the operation.
    * The name is a scheme-less URI, not including the API service name.
    * For example:
    *
    * "shelves/SHELF_ID/books"
    * "shelves/SHELF_ID/books/BOOK_ID"
    */
  var resourceName: js.UndefOr[String] = js.native
  /**
    * The operation response. This may not include all response elements,
    * such as those that are too large, privacy-sensitive, or duplicated
    * elsewhere in the log record.
    * It should never include user-generated data, such as file contents.
    * When the JSON object represented here has a proto equivalent, the proto
    * name will be indicated in the `@type` property.
    */
  var response: js.UndefOr[Record[String, _]] = js.native
  /**
    * Deprecated, use `metadata` field instead.
    * Other service-specific data about the request, response, and other
    * activities.
    */
  var serviceData: js.UndefOr[Record[String, _]] = js.native
  /**
    * The name of the API service performing the operation. For example,
    * `"datastore.googleapis.com"`.
    */
  var serviceName: js.UndefOr[String] = js.native
  /** The status of the overall operation. */
  var status: js.UndefOr[Status] = js.native
}

object AuditLog {
  @scala.inline
  def apply(): AuditLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditLog]
  }
  @scala.inline
  implicit class AuditLogOps[Self <: AuditLog] (val x: Self) extends AnyVal {
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
    def setAuthenticationInfo(value: AuthenticationInfo): Self = this.set("authenticationInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticationInfo: Self = this.set("authenticationInfo", js.undefined)
    @scala.inline
    def setAuthorizationInfoVarargs(value: AuthorizationInfo*): Self = this.set("authorizationInfo", js.Array(value :_*))
    @scala.inline
    def setAuthorizationInfo(value: js.Array[AuthorizationInfo]): Self = this.set("authorizationInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizationInfo: Self = this.set("authorizationInfo", js.undefined)
    @scala.inline
    def setMetadata(value: Record[String, _]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setMethodName(value: String): Self = this.set("methodName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethodName: Self = this.set("methodName", js.undefined)
    @scala.inline
    def setNumResponseItems(value: String): Self = this.set("numResponseItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumResponseItems: Self = this.set("numResponseItems", js.undefined)
    @scala.inline
    def setRequest(value: Record[String, _]): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setRequestMetadata(value: RequestMetadata): Self = this.set("requestMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestMetadata: Self = this.set("requestMetadata", js.undefined)
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    @scala.inline
    def setResponse(value: Record[String, _]): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    @scala.inline
    def setServiceData(value: Record[String, _]): Self = this.set("serviceData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceData: Self = this.set("serviceData", js.undefined)
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

