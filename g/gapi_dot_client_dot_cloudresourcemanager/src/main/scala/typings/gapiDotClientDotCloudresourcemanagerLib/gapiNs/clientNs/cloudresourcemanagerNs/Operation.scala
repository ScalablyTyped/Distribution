package typings
package gapiDotClientDotCloudresourcemanagerLib.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Operation extends js.Object {
  /**
               * If the value is `false`, it means the operation is still in progress.
               * If `true`, the operation is completed, and either `error` or `response` is
               * available.
               */
  var done: js.UndefOr[scala.Boolean] = js.undefined
  /** The error result of the operation in case of failure or cancellation. */
  var error: js.UndefOr[Status] = js.undefined
  /**
               * Service-specific metadata associated with the operation.  It typically
               * contains progress information and common metadata such as create time.
               * Some services might not provide such metadata.  Any method that returns a
               * long-running operation should document the metadata type, if any.
               */
  var metadata: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /**
               * The server-assigned name, which is only unique within the same service that
               * originally returns it. If you use the default HTTP mapping, the
               * `name` should have the format of `operations/some/unique/name`.
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The normal response of the operation in case of success.  If the original
               * method returns no data on success, such as `Delete`, the response is
               * `google.protobuf.Empty`.  If the original method is standard
               * `Get`/`Create`/`Update`, the response should be the resource.  For other
               * methods, the response should have the type `XxxResponse`, where `Xxx`
               * is the original method name.  For example, if the original method name
               * is `TakeSnapshot()`, the inferred response type is
               * `TakeSnapshotResponse`.
               */
  var response: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
}

