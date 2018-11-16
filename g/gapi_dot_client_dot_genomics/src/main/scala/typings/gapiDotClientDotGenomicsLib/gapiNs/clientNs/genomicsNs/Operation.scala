package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

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
  /** An OperationMetadata object. This will always be returned with the Operation. */
  var metadata: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /**
               * The server-assigned name, which is only unique within the same service that originally returns it. For example&#58;
               * `operations/CJHU7Oi_ChDrveSpBRjfuL-qzoWAgEw`
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               * If importing ReadGroupSets, an ImportReadGroupSetsResponse is returned. If importing Variants, an ImportVariantsResponse is returned. For pipelines and
               * exports, an Empty response is returned.
               */
  var response: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
}

