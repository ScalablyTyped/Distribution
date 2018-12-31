package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRule extends js.Object {
  /**
    * Additional HTTP bindings for the selector. Nested bindings must
    * not contain an `additional_bindings` field themselves (that is,
    * the nesting may only be one level deep).
    */
  var additionalBindings: js.UndefOr[js.Array[HttpRule]] = js.undefined
  /**
    * The name of the request field whose value is mapped to the HTTP body, or
    * `&#42;` for mapping all fields not captured by the path pattern to the HTTP
    * body. NOTE: the referred field must not be a repeated field and must be
    * present at the top-level of request message type.
    */
  var body: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The custom pattern is used for specifying an HTTP method that is not
    * included in the `pattern` field, such as HEAD, or "&#42;" to leave the
    * HTTP method unspecified for this rule. The wild-card rule is useful
    * for services that provide content to Web (HTML) clients.
    */
  var custom: js.UndefOr[CustomHttpPattern] = js.undefined
  /** Used for deleting a resource. */
  var delete: js.UndefOr[java.lang.String] = js.undefined
  /** Used for listing and getting information about resources. */
  var get: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Use this only for Scotty Requests. Do not use this for bytestream methods.
    * For media support, add instead [][google.bytestream.RestByteStream] as an
    * API to your configuration.
    */
  var mediaDownload: js.UndefOr[MediaDownload] = js.undefined
  /**
    * Use this only for Scotty Requests. Do not use this for media support using
    * Bytestream, add instead
    * [][google.bytestream.RestByteStream] as an API to your
    * configuration for Bytestream methods.
    */
  var mediaUpload: js.UndefOr[MediaUpload] = js.undefined
  /** Used for updating a resource. */
  var patch: js.UndefOr[java.lang.String] = js.undefined
  /** Used for creating a resource. */
  var post: js.UndefOr[java.lang.String] = js.undefined
  /** Used for updating a resource. */
  var put: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the response field whose value is mapped to the HTTP body of
    * response. Other response fields are ignored. This field is optional. When
    * not set, the response message will be used as HTTP body of response.
    * NOTE: the referred field must be not a repeated field and must be present
    * at the top-level of response message type.
    */
  var responseBody: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Selects methods to which this rule applies.
    *
    * Refer to selector for syntax details.
    */
  var selector: js.UndefOr[java.lang.String] = js.undefined
}

