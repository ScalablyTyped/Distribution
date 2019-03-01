package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickThroughUrlSuffixProperties extends js.Object {
  /** Click-through URL suffix to apply to all ads in this entity's scope. Must be less than 128 characters long. */
  var clickThroughUrlSuffix: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this entity should override the inherited click-through URL suffix with its own defined value. */
  var overrideInheritedSuffix: js.UndefOr[scala.Boolean] = js.undefined
}

object ClickThroughUrlSuffixProperties {
  @scala.inline
  def apply(
    clickThroughUrlSuffix: java.lang.String = null,
    overrideInheritedSuffix: js.UndefOr[scala.Boolean] = js.undefined
  ): ClickThroughUrlSuffixProperties = {
    val __obj = js.Dynamic.literal()
    if (clickThroughUrlSuffix != null) __obj.updateDynamic("clickThroughUrlSuffix")(clickThroughUrlSuffix)
    if (!js.isUndefined(overrideInheritedSuffix)) __obj.updateDynamic("overrideInheritedSuffix")(overrideInheritedSuffix)
    __obj.asInstanceOf[ClickThroughUrlSuffixProperties]
  }
}

