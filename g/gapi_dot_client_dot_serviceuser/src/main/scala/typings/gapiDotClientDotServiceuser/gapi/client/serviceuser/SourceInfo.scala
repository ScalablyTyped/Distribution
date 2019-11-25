package typings.gapiDotClientDotServiceuser.gapi.client.serviceuser

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceInfo extends js.Object {
  /** All files used during config generation. */
  var sourceFiles: js.UndefOr[js.Array[Record[String, _]]] = js.undefined
}

object SourceInfo {
  @scala.inline
  def apply(sourceFiles: js.Array[Record[String, _]] = null): SourceInfo = {
    val __obj = js.Dynamic.literal()
    if (sourceFiles != null) __obj.updateDynamic("sourceFiles")(sourceFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceInfo]
  }
}

