package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about an output of a SeqMapTask.
  */
@js.native
trait Schema$SeqMapTaskOutputInfo extends js.Object {
  /**
    * The sink to write the output value to.
    */
  var sink: js.UndefOr[Schema$Sink] = js.native
  /**
    * The id of the TupleTag the user code will tag the output value by.
    */
  var tag: js.UndefOr[String] = js.native
}

object Schema$SeqMapTaskOutputInfo {
  @scala.inline
  def apply(sink: Schema$Sink = null, tag: String = null): Schema$SeqMapTaskOutputInfo = {
    val __obj = js.Dynamic.literal()
    if (sink != null) __obj.updateDynamic("sink")(sink.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SeqMapTaskOutputInfo]
  }
}

