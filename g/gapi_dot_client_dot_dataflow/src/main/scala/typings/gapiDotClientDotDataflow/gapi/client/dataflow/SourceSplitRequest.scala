package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceSplitRequest extends js.Object {
  /** Hints for tuning the splitting process. */
  var options: js.UndefOr[SourceSplitOptions] = js.undefined
  /** Specification of the source to be split. */
  var source: js.UndefOr[Source] = js.undefined
}

object SourceSplitRequest {
  @scala.inline
  def apply(options: SourceSplitOptions = null, source: Source = null): SourceSplitRequest = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[SourceSplitRequest]
  }
}

