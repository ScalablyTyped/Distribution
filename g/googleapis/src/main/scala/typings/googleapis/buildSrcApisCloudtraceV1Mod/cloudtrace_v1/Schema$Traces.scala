package typings.googleapis.buildSrcApisCloudtraceV1Mod.cloudtrace_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of new or updated traces.
  */
@js.native
trait Schema$Traces extends js.Object {
  /**
    * List of traces.
    */
  var traces: js.UndefOr[js.Array[Schema$Trace]] = js.native
}

object Schema$Traces {
  @scala.inline
  def apply(traces: js.Array[Schema$Trace] = null): Schema$Traces = {
    val __obj = js.Dynamic.literal()
    if (traces != null) __obj.updateDynamic("traces")(traces.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Traces]
  }
}

