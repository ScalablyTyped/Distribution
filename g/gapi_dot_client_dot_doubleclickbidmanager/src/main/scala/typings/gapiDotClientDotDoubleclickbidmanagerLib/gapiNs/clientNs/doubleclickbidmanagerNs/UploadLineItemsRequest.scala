package typings
package gapiDotClientDotDoubleclickbidmanagerLib.gapiNs.clientNs.doubleclickbidmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UploadLineItemsRequest extends js.Object {
  /** Set to true to get upload status without actually persisting the line items. */
  var dryRun: js.UndefOr[scala.Boolean] = js.undefined
  /** Format the line items are in. Default to CSV. */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** Line items in CSV to upload. Refer to  Entity Write File Format for more information on file format. */
  var lineItems: js.UndefOr[java.lang.String] = js.undefined
}

