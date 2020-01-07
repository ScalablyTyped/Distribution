package typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Common audit log format for Google Cloud Platform API operations.
  */
@js.native
trait Schema$AuditLog extends js.Object {
  /**
    * Authentication information.
    */
  var authenticationInfo: js.UndefOr[Schema$AuthenticationInfo] = js.native
  /**
    * Authorization information. If there are multiple resources or permissions
    * involved, then there is one AuthorizationInfo element for each {resource,
    * permission} tuple.
    */
  var authorizationInfo: js.UndefOr[js.Array[Schema$AuthorizationInfo]] = js.native
  /**
    * Other service-specific data about the request, response, and other
    * information associated with the current audited event.
    */
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The name of the service method or operation. For API calls, this should
    * be the name of the API method. For example,
    * &quot;google.datastore.v1.Datastore.RunQuery&quot;
    * &quot;google.logging.v1.LoggingService.DeleteLog&quot;
    */
  var methodName: js.UndefOr[String] = js.native
  /**
    * The number of items returned from a List or Query API method, if
    * applicable.
    */
  var numResponseItems: js.UndefOr[String] = js.native
  /**
    * The operation request. This may not include all request parameters, such
    * as those that are too large, privacy-sensitive, or duplicated elsewhere
    * in the log record. It should never include user-generated data, such as
    * file contents. When the JSON object represented here has a proto
    * equivalent, the proto name will be indicated in the `@type` property.
    */
  var request: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Metadata about the operation.
    */
  var requestMetadata: js.UndefOr[Schema$RequestMetadata] = js.native
  /**
    * The resource location information.
    */
  var resourceLocation: js.UndefOr[Schema$ResourceLocation] = js.native
  /**
    * The resource or collection that is the target of the operation. The name
    * is a scheme-less URI, not including the API service name. For example:
    * &quot;shelves/SHELF_ID/books&quot;
    * &quot;shelves/SHELF_ID/books/BOOK_ID&quot;
    */
  var resourceName: js.UndefOr[String] = js.native
  /**
    * The resource&#39;s original state before mutation. Present only for
    * operations which have successfully modified the targeted resource(s). In
    * general, this field should contain all changed fields, except those that
    * are already been included in `request`, `response`, `metadata` or
    * `service_data` fields. When the JSON object represented here has a proto
    * equivalent, the proto name will be indicated in the `@type` property.
    */
  var resourceOriginalState: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The operation response. This may not include all response elements, such
    * as those that are too large, privacy-sensitive, or duplicated elsewhere
    * in the log record. It should never include user-generated data, such as
    * file contents. When the JSON object represented here has a proto
    * equivalent, the proto name will be indicated in the `@type` property.
    */
  var response: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Deprecated, use `metadata` field instead. Other service-specific data
    * about the request, response, and other activities.
    */
  var serviceData: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The name of the API service performing the operation. For example,
    * `&quot;datastore.googleapis.com&quot;`.
    */
  var serviceName: js.UndefOr[String] = js.native
  /**
    * The status of the overall operation.
    */
  var status: js.UndefOr[Schema$Status] = js.native
}

object Schema$AuditLog {
  @scala.inline
  def apply(
    authenticationInfo: Schema$AuthenticationInfo = null,
    authorizationInfo: js.Array[Schema$AuthorizationInfo] = null,
    metadata: StringDictionary[js.Any] = null,
    methodName: String = null,
    numResponseItems: String = null,
    request: StringDictionary[js.Any] = null,
    requestMetadata: Schema$RequestMetadata = null,
    resourceLocation: Schema$ResourceLocation = null,
    resourceName: String = null,
    resourceOriginalState: StringDictionary[js.Any] = null,
    response: StringDictionary[js.Any] = null,
    serviceData: StringDictionary[js.Any] = null,
    serviceName: String = null,
    status: Schema$Status = null
  ): Schema$AuditLog = {
    val __obj = js.Dynamic.literal()
    if (authenticationInfo != null) __obj.updateDynamic("authenticationInfo")(authenticationInfo.asInstanceOf[js.Any])
    if (authorizationInfo != null) __obj.updateDynamic("authorizationInfo")(authorizationInfo.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (methodName != null) __obj.updateDynamic("methodName")(methodName.asInstanceOf[js.Any])
    if (numResponseItems != null) __obj.updateDynamic("numResponseItems")(numResponseItems.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (requestMetadata != null) __obj.updateDynamic("requestMetadata")(requestMetadata.asInstanceOf[js.Any])
    if (resourceLocation != null) __obj.updateDynamic("resourceLocation")(resourceLocation.asInstanceOf[js.Any])
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    if (resourceOriginalState != null) __obj.updateDynamic("resourceOriginalState")(resourceOriginalState.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (serviceData != null) __obj.updateDynamic("serviceData")(serviceData.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AuditLog]
  }
}

