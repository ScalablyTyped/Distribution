package typings.fullpageJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FadeBackground extends js.Object {
  /**
    * @default true
    */
  var fadeBackground: js.UndefOr[Boolean] = js.undefined
  /**
    * @default true
    */
  var fadeContent: js.UndefOr[Boolean] = js.undefined
  /**
    * @default 100
    */
  var perspective: js.UndefOr[Double] = js.undefined
}

object FadeBackground {
  @scala.inline
  def apply(
    fadeBackground: js.UndefOr[Boolean] = js.undefined,
    fadeContent: js.UndefOr[Boolean] = js.undefined,
    perspective: js.UndefOr[Double] = js.undefined
  ): FadeBackground = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fadeBackground)) __obj.updateDynamic("fadeBackground")(fadeBackground.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeContent)) __obj.updateDynamic("fadeContent")(fadeContent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(perspective)) __obj.updateDynamic("perspective")(perspective.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FadeBackground]
  }
}

