package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OperationMetadata extends js.Object {
  /** Timestamp that this operation completed.@OutputOnly */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** Timestamp that this operation was created.@OutputOnly */
  var insertTime: js.UndefOr[java.lang.String] = js.undefined
  /** API method that initiated this operation. Example: google.appengine.v1beta4.Version.CreateVersion.@OutputOnly */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /** Type of this operation. Deprecated, use method field instead. Example: "create_version".@OutputOnly */
  var operationType: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the resource that this operation is acting on. Example: apps/myapp/modules/default.@OutputOnly */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /** User who requested this operation.@OutputOnly */
  var user: js.UndefOr[java.lang.String] = js.undefined
}

