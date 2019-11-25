package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeqMapTaskOutputInfo extends js.Object {
  /** The sink to write the output value to. */
  var sink: js.UndefOr[Sink] = js.undefined
  /** The id of the TupleTag the user code will tag the output value by. */
  var tag: js.UndefOr[String] = js.undefined
}

object SeqMapTaskOutputInfo {
  @scala.inline
  def apply(sink: Sink = null, tag: String = null): SeqMapTaskOutputInfo = {
    val __obj = js.Dynamic.literal()
    if (sink != null) __obj.updateDynamic("sink")(sink.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeqMapTaskOutputInfo]
  }
}

