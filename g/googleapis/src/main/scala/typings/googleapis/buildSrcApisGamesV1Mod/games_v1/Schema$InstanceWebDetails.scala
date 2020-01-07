package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for the Web details resource.
  */
@js.native
trait Schema$InstanceWebDetails extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#instanceWebDetails.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Launch URL for the game.
    */
  var launchUrl: js.UndefOr[String] = js.native
  /**
    * Indicates that this instance is the default for new installations.
    */
  var preferred: js.UndefOr[Boolean] = js.native
}

object Schema$InstanceWebDetails {
  @scala.inline
  def apply(kind: String = null, launchUrl: String = null, preferred: js.UndefOr[Boolean] = js.undefined): Schema$InstanceWebDetails = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (launchUrl != null) __obj.updateDynamic("launchUrl")(launchUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(preferred)) __obj.updateDynamic("preferred")(preferred.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstanceWebDetails]
  }
}

