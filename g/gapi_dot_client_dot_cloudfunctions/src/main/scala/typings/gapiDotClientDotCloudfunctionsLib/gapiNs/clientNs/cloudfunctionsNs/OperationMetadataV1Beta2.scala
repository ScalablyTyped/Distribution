package typings
package gapiDotClientDotCloudfunctionsLib.gapiNs.clientNs.cloudfunctionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationMetadataV1Beta2 extends js.Object {
  /** The original request that started the operation. */
  var request: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /**
    * Target of the operation - for example
    * projects/project-1/locations/region-1/functions/function-1
    */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /** Type of operation. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Version id of the function created or updated by an API call.
    * This field is only pupulated for Create and Update operations.
    */
  var versionId: js.UndefOr[java.lang.String] = js.undefined
}

