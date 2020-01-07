package typings.googleapis.buildSrcApisTagmanagerV1Mod.tagmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List triggers response.
  */
@js.native
trait Schema$ListTriggersResponse extends js.Object {
  /**
    * All GTM Triggers of a GTM Container.
    */
  var triggers: js.UndefOr[js.Array[Schema$Trigger]] = js.native
}

object Schema$ListTriggersResponse {
  @scala.inline
  def apply(triggers: js.Array[Schema$Trigger] = null): Schema$ListTriggersResponse = {
    val __obj = js.Dynamic.literal()
    if (triggers != null) __obj.updateDynamic("triggers")(triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListTriggersResponse]
  }
}

