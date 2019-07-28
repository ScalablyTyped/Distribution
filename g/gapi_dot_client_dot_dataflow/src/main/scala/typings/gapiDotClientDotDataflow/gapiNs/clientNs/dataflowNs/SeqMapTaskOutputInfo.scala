package typings.gapiDotClientDotDataflow.gapiNs.clientNs.dataflowNs

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
    if (sink != null) __obj.updateDynamic("sink")(sink)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[SeqMapTaskOutputInfo]
  }
}

