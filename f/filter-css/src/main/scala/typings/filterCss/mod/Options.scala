package typings.filterCss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Whether to match CSS properties like `background-image`.
    * @default true
    */
  var matchDeclarationProperties: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to match CSS values like `url(...)`.
    * @default true
    */
  var matchDeclarationValues: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to match media queries like `min-device-pixel-ratio: 2`.
    * @default true
    */
  var matchMedia: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to match CSS selectors.
    * @default true
    */
  var matchSelectors: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to match [AST Node types]{@link https://github.com/reworkcss/css#types} like `font-face`.
    * @default true
    */
  var matchTypes: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    matchDeclarationProperties: js.UndefOr[Boolean] = js.undefined,
    matchDeclarationValues: js.UndefOr[Boolean] = js.undefined,
    matchMedia: js.UndefOr[Boolean] = js.undefined,
    matchSelectors: js.UndefOr[Boolean] = js.undefined,
    matchTypes: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(matchDeclarationProperties)) __obj.updateDynamic("matchDeclarationProperties")(matchDeclarationProperties.get.asInstanceOf[js.Any])
    if (!js.isUndefined(matchDeclarationValues)) __obj.updateDynamic("matchDeclarationValues")(matchDeclarationValues.get.asInstanceOf[js.Any])
    if (!js.isUndefined(matchMedia)) __obj.updateDynamic("matchMedia")(matchMedia.get.asInstanceOf[js.Any])
    if (!js.isUndefined(matchSelectors)) __obj.updateDynamic("matchSelectors")(matchSelectors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(matchTypes)) __obj.updateDynamic("matchTypes")(matchTypes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

