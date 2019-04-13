package typings
package domDashTestingDashLibraryLib.typingsQueryDashHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectorMatcherOptions
  extends domDashTestingDashLibraryLib.typingsMatchesMod.MatcherOptions {
  var selector: js.UndefOr[java.lang.String] = js.undefined
}

object SelectorMatcherOptions {
  @scala.inline
  def apply(
    collapseWhitespace: js.UndefOr[scala.Boolean] = js.undefined,
    exact: js.UndefOr[scala.Boolean] = js.undefined,
    normalizer: domDashTestingDashLibraryLib.typingsMatchesMod.NormalizerFn = null,
    selector: java.lang.String = null,
    trim: js.UndefOr[scala.Boolean] = js.undefined
  ): SelectorMatcherOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapseWhitespace)) __obj.updateDynamic("collapseWhitespace")(collapseWhitespace)
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    if (normalizer != null) __obj.updateDynamic("normalizer")(normalizer)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim)
    __obj.asInstanceOf[SelectorMatcherOptions]
  }
}

