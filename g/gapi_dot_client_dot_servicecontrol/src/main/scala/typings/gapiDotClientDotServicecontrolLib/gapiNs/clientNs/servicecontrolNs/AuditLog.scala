package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuditLog extends js.Object {
  /** Authentication information. */
  var authenticationInfo: js.UndefOr[AuthenticationInfo] = js.undefined
  /**
    * Authorization information. If there are multiple
    * resources or permissions involved, then there is
    * one AuthorizationInfo element for each {resource, permission} tuple.
    */
  var authorizationInfo: js.UndefOr[js.Array[AuthorizationInfo]] = js.undefined
  /**
    * Other service-specific data about the request, response, and other
    * information associated with the current audited event.
    */
  var metadata: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /**
    * The name of the service method or operation.
    * For API calls, this should be the name of the API method.
    * For example,
    *
    * "google.datastore.v1.Datastore.RunQuery"
    * "google.logging.v1.LoggingService.DeleteLog"
    */
  var methodName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number of items returned from a List or Query API method,
    * if applicable.
    */
  var numResponseItems: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The operation request. This may not include all request parameters,
    * such as those that are too large, privacy-sensitive, or duplicated
    * elsewhere in the log record.
    * It should never include user-generated data, such as file contents.
    * When the JSON object represented here has a proto equivalent, the proto
    * name will be indicated in the `@type` property.
    */
  var request: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /** Metadata about the operation. */
  var requestMetadata: js.UndefOr[RequestMetadata] = js.undefined
  /**
    * The resource or collection that is the target of the operation.
    * The name is a scheme-less URI, not including the API service name.
    * For example:
    *
    * "shelves/SHELF_ID/books"
    * "shelves/SHELF_ID/books/BOOK_ID"
    */
  var resourceName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The operation response. This may not include all response elements,
    * such as those that are too large, privacy-sensitive, or duplicated
    * elsewhere in the log record.
    * It should never include user-generated data, such as file contents.
    * When the JSON object represented here has a proto equivalent, the proto
    * name will be indicated in the `@type` property.
    */
  var response: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /**
    * Deprecated, use `metadata` field instead.
    * Other service-specific data about the request, response, and other
    * activities.
    */
  var serviceData: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /**
    * The name of the API service performing the operation. For example,
    * `"datastore.googleapis.com"`.
    */
  var serviceName: js.UndefOr[java.lang.String] = js.undefined
  /** The status of the overall operation. */
  var status: js.UndefOr[Status] = js.undefined
}

