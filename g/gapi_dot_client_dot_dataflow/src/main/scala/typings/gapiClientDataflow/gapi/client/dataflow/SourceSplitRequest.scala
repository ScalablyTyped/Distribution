package typings.gapiClientDataflow.gapi.client.dataflow

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
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceSplitRequest]
  }
}

