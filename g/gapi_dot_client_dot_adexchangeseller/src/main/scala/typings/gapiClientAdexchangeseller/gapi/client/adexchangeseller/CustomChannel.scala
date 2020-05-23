package typings.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import typings.gapiClientAdexchangeseller.anon.AdsAppearOn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomChannel extends js.Object {
  /** Code of this custom channel, not necessarily unique across ad clients. */
  var code: js.UndefOr[String] = js.undefined
  /** Unique identifier of this custom channel. This should be considered an opaque identifier; it is not safe to rely on it being in any particular format. */
  var id: js.UndefOr[String] = js.undefined
  /** Kind of resource this is, in this case adexchangeseller#customChannel. */
  var kind: js.UndefOr[String] = js.undefined
  /** Name of this custom channel. */
  var name: js.UndefOr[String] = js.undefined
  /** The targeting information of this custom channel, if activated. */
  var targetingInfo: js.UndefOr[AdsAppearOn] = js.undefined
}

object CustomChannel {
  @scala.inline
  def apply(
    code: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    targetingInfo: AdsAppearOn = null
  ): CustomChannel = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (targetingInfo != null) __obj.updateDynamic("targetingInfo")(targetingInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomChannel]
  }
}

