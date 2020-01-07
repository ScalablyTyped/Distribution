package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about an operating system that can be targeted by ads.
  */
@js.native
trait Schema$OperatingSystem extends js.Object {
  /**
    * DART ID of this operating system. This is the ID used for targeting.
    */
  var dartId: js.UndefOr[String] = js.native
  /**
    * Whether this operating system is for desktop.
    */
  var desktop: js.UndefOr[Boolean] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#operatingSystem&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Whether this operating system is for mobile.
    */
  var mobile: js.UndefOr[Boolean] = js.native
  /**
    * Name of this operating system.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$OperatingSystem {
  @scala.inline
  def apply(
    dartId: String = null,
    desktop: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    mobile: js.UndefOr[Boolean] = js.undefined,
    name: String = null
  ): Schema$OperatingSystem = {
    val __obj = js.Dynamic.literal()
    if (dartId != null) __obj.updateDynamic("dartId")(dartId.asInstanceOf[js.Any])
    if (!js.isUndefined(desktop)) __obj.updateDynamic("desktop")(desktop.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(mobile)) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OperatingSystem]
  }
}

