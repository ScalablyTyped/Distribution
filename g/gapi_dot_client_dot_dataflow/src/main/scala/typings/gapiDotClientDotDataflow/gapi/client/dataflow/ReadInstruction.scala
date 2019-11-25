package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadInstruction extends js.Object {
  /** The source to read from. */
  var source: js.UndefOr[Source] = js.undefined
}

object ReadInstruction {
  @scala.inline
  def apply(source: Source = null): ReadInstruction = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadInstruction]
  }
}

