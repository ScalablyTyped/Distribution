package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceInfo extends js.Object {
  /** All files used during config generation. */
  var sourceFiles: js.UndefOr[js.Array[stdLib.Record[java.lang.String, _]]] = js.undefined
}

object SourceInfo {
  @scala.inline
  def apply(sourceFiles: js.Array[stdLib.Record[java.lang.String, _]] = null): SourceInfo = {
    val __obj = js.Dynamic.literal()
    if (sourceFiles != null) __obj.updateDynamic("sourceFiles")(sourceFiles)
    __obj.asInstanceOf[SourceInfo]
  }
}

