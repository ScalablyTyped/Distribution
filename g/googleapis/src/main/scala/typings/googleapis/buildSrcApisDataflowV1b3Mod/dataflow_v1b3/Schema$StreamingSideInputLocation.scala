package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies the location of a streaming side input.
  */
@js.native
trait Schema$StreamingSideInputLocation extends js.Object {
  /**
    * Identifies the state family where this side input is stored.
    */
  var stateFamily: js.UndefOr[String] = js.native
  /**
    * Identifies the particular side input within the streaming Dataflow job.
    */
  var tag: js.UndefOr[String] = js.native
}

object Schema$StreamingSideInputLocation {
  @scala.inline
  def apply(stateFamily: String = null, tag: String = null): Schema$StreamingSideInputLocation = {
    val __obj = js.Dynamic.literal()
    if (stateFamily != null) __obj.updateDynamic("stateFamily")(stateFamily.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StreamingSideInputLocation]
  }
}

