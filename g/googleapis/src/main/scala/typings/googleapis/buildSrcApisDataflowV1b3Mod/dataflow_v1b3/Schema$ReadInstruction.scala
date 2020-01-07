package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instruction that reads records. Takes no inputs, produces one output.
  */
@js.native
trait Schema$ReadInstruction extends js.Object {
  /**
    * The source to read from.
    */
  var source: js.UndefOr[Schema$Source] = js.native
}

object Schema$ReadInstruction {
  @scala.inline
  def apply(source: Schema$Source = null): Schema$ReadInstruction = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReadInstruction]
  }
}

