package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AccountsCustomBatchResponseEntry extends js.Object {
  /** The retrieved, created, or updated account. Not defined if the method was delete or claimwebsite. */
  var account: js.UndefOr[Account] = js.undefined
  /** The ID of the request entry this entry responds to. */
  var batchId: js.UndefOr[scala.Double] = js.undefined
  /** A list of errors defined if and only if the request failed. */
  var errors: js.UndefOr[Errors] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#accountsCustomBatchResponseEntry". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

