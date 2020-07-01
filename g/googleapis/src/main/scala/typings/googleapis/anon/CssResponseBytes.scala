package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CssResponseBytes extends js.Object {
  var cssResponseBytes: js.UndefOr[String] = js.native
  var flashResponseBytes: js.UndefOr[String] = js.native
  var htmlResponseBytes: js.UndefOr[String] = js.native
  var imageResponseBytes: js.UndefOr[String] = js.native
  var javascriptResponseBytes: js.UndefOr[String] = js.native
  var numberCssResources: js.UndefOr[Double] = js.native
  var numberHosts: js.UndefOr[Double] = js.native
  var numberJsResources: js.UndefOr[Double] = js.native
  var numberResources: js.UndefOr[Double] = js.native
  var numberStaticResources: js.UndefOr[Double] = js.native
  var otherResponseBytes: js.UndefOr[String] = js.native
  var textResponseBytes: js.UndefOr[String] = js.native
  var totalRequestBytes: js.UndefOr[String] = js.native
}

object CssResponseBytes {
  @scala.inline
  def apply(
    cssResponseBytes: String = null,
    flashResponseBytes: String = null,
    htmlResponseBytes: String = null,
    imageResponseBytes: String = null,
    javascriptResponseBytes: String = null,
    numberCssResources: js.UndefOr[Double] = js.undefined,
    numberHosts: js.UndefOr[Double] = js.undefined,
    numberJsResources: js.UndefOr[Double] = js.undefined,
    numberResources: js.UndefOr[Double] = js.undefined,
    numberStaticResources: js.UndefOr[Double] = js.undefined,
    otherResponseBytes: String = null,
    textResponseBytes: String = null,
    totalRequestBytes: String = null
  ): CssResponseBytes = {
    val __obj = js.Dynamic.literal()
    if (cssResponseBytes != null) __obj.updateDynamic("cssResponseBytes")(cssResponseBytes.asInstanceOf[js.Any])
    if (flashResponseBytes != null) __obj.updateDynamic("flashResponseBytes")(flashResponseBytes.asInstanceOf[js.Any])
    if (htmlResponseBytes != null) __obj.updateDynamic("htmlResponseBytes")(htmlResponseBytes.asInstanceOf[js.Any])
    if (imageResponseBytes != null) __obj.updateDynamic("imageResponseBytes")(imageResponseBytes.asInstanceOf[js.Any])
    if (javascriptResponseBytes != null) __obj.updateDynamic("javascriptResponseBytes")(javascriptResponseBytes.asInstanceOf[js.Any])
    if (!js.isUndefined(numberCssResources)) __obj.updateDynamic("numberCssResources")(numberCssResources.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberHosts)) __obj.updateDynamic("numberHosts")(numberHosts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberJsResources)) __obj.updateDynamic("numberJsResources")(numberJsResources.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberResources)) __obj.updateDynamic("numberResources")(numberResources.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberStaticResources)) __obj.updateDynamic("numberStaticResources")(numberStaticResources.get.asInstanceOf[js.Any])
    if (otherResponseBytes != null) __obj.updateDynamic("otherResponseBytes")(otherResponseBytes.asInstanceOf[js.Any])
    if (textResponseBytes != null) __obj.updateDynamic("textResponseBytes")(textResponseBytes.asInstanceOf[js.Any])
    if (totalRequestBytes != null) __obj.updateDynamic("totalRequestBytes")(totalRequestBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssResponseBytes]
  }
}

