package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot2Mod.adexchangebuyer_v1_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An account feed lists Ad Exchange buyer accounts that the user has access
  * to. Each entry in the feed corresponds to a single buyer account.
  */
@js.native
trait Schema$AccountsList extends js.Object {
  /**
    * A list of accounts.
    */
  var items: js.UndefOr[js.Array[Schema$Account]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$AccountsList {
  @scala.inline
  def apply(items: js.Array[Schema$Account] = null, kind: String = null): Schema$AccountsList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccountsList]
  }
}

