package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OperationMetadataExperimental extends js.Object {
  /** Time that this operation completed.@OutputOnly */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** Time that this operation was created.@OutputOnly */
  var insertTime: js.UndefOr[java.lang.String] = js.undefined
  /** API method that initiated this operation. Example: google.appengine.experimental.CustomDomains.CreateCustomDomain.@OutputOnly */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the resource that this operation is acting on. Example: apps/myapp/customDomains/example.com.@OutputOnly */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /** User who requested this operation.@OutputOnly */
  var user: js.UndefOr[java.lang.String] = js.undefined
}

