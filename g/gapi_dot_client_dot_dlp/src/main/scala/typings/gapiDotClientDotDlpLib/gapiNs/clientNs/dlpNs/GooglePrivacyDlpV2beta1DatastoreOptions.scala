package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1DatastoreOptions extends js.Object {
  /** The kind to process. */
  var kind: js.UndefOr[GooglePrivacyDlpV2beta1KindExpression] = js.undefined
  /**
    * A partition ID identifies a grouping of entities. The grouping is always
    * by project and namespace, however the namespace ID may be empty.
    */
  var partitionId: js.UndefOr[GooglePrivacyDlpV2beta1PartitionId] = js.undefined
  /**
    * Properties to scan. If none are specified, all properties will be scanned
    * by default.
    */
  var projection: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1Projection]] = js.undefined
}

