package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OperationMetadataV1 extends js.Object {
  /** Time that this operation completed.@OutputOnly */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** Ephemeral message that may change every time the operation is polled. @OutputOnly */
  var ephemeralMessage: js.UndefOr[java.lang.String] = js.undefined
  /** Time that this operation was created.@OutputOnly */
  var insertTime: js.UndefOr[java.lang.String] = js.undefined
  /** API method that initiated this operation. Example: google.appengine.v1.Versions.CreateVersion.@OutputOnly */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the resource that this operation is acting on. Example: apps/myapp/services/default.@OutputOnly */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /** User who requested this operation.@OutputOnly */
  var user: js.UndefOr[java.lang.String] = js.undefined
  /** Durable messages that persist on every operation poll. @OutputOnly */
  var warning: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

