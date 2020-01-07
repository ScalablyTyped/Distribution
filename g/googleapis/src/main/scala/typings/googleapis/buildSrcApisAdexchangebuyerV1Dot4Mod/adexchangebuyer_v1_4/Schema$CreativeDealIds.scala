package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import typings.googleapis.Anon_ArcStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The external deal ids associated with a creative.
  */
@js.native
trait Schema$CreativeDealIds extends js.Object {
  /**
    * A list of external deal ids and ARC approval status.
    */
  var dealStatuses: js.UndefOr[js.Array[Anon_ArcStatus]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$CreativeDealIds {
  @scala.inline
  def apply(dealStatuses: js.Array[Anon_ArcStatus] = null, kind: String = null): Schema$CreativeDealIds = {
    val __obj = js.Dynamic.literal()
    if (dealStatuses != null) __obj.updateDynamic("dealStatuses")(dealStatuses.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreativeDealIds]
  }
}

