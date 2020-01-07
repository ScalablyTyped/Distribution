package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A position that encapsulates an inner position and an index for the inner
  * position. A ConcatPosition can be used by a reader of a source that
  * encapsulates a set of other sources.
  */
@js.native
trait Schema$ConcatPosition extends js.Object {
  /**
    * Index of the inner source.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * Position within the inner source.
    */
  var position: js.UndefOr[Schema$Position] = js.native
}

object Schema$ConcatPosition {
  @scala.inline
  def apply(index: Int | Double = null, position: Schema$Position = null): Schema$ConcatPosition = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ConcatPosition]
  }
}

