package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickThroughUrlSuffixProperties extends js.Object {
  /** Click-through URL suffix to apply to all ads in this entity's scope. Must be less than 128 characters long. */
  var clickThroughUrlSuffix: js.UndefOr[String] = js.undefined
  /** Whether this entity should override the inherited click-through URL suffix with its own defined value. */
  var overrideInheritedSuffix: js.UndefOr[Boolean] = js.undefined
}

object ClickThroughUrlSuffixProperties {
  @scala.inline
  def apply(clickThroughUrlSuffix: String = null, overrideInheritedSuffix: js.UndefOr[Boolean] = js.undefined): ClickThroughUrlSuffixProperties = {
    val __obj = js.Dynamic.literal()
    if (clickThroughUrlSuffix != null) __obj.updateDynamic("clickThroughUrlSuffix")(clickThroughUrlSuffix.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideInheritedSuffix)) __obj.updateDynamic("overrideInheritedSuffix")(overrideInheritedSuffix.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickThroughUrlSuffixProperties]
  }
}

