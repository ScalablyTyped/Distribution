package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesImportRequest extends js.Object {
  /** Contains details about the import operation. */
  var importContext: js.UndefOr[ImportContext] = js.undefined
}

object InstancesImportRequest {
  @scala.inline
  def apply(importContext: ImportContext = null): InstancesImportRequest = {
    val __obj = js.Dynamic.literal()
    if (importContext != null) __obj.updateDynamic("importContext")(importContext)
    __obj.asInstanceOf[InstancesImportRequest]
  }
}

