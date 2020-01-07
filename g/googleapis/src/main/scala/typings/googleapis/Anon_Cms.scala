package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Cms extends js.Object {
  var cms: js.UndefOr[String] = js.native
  var cssResponseBytes: js.UndefOr[String] = js.native
  var flashResponseBytes: js.UndefOr[String] = js.native
  var htmlResponseBytes: js.UndefOr[String] = js.native
  var imageResponseBytes: js.UndefOr[String] = js.native
  var javascriptResponseBytes: js.UndefOr[String] = js.native
  var numRenderBlockingRoundTrips: js.UndefOr[Double] = js.native
  var numTotalRoundTrips: js.UndefOr[Double] = js.native
  var numberCssResources: js.UndefOr[Double] = js.native
  var numberHosts: js.UndefOr[Double] = js.native
  var numberJsResources: js.UndefOr[Double] = js.native
  var numberResources: js.UndefOr[Double] = js.native
  var numberRobotedResources: js.UndefOr[Double] = js.native
  var numberStaticResources: js.UndefOr[Double] = js.native
  var numberTransientFetchFailureResources: js.UndefOr[Double] = js.native
  var otherResponseBytes: js.UndefOr[String] = js.native
  var overTheWireResponseBytes: js.UndefOr[String] = js.native
  var robotedUrls: js.UndefOr[js.Array[String]] = js.native
  var textResponseBytes: js.UndefOr[String] = js.native
  var totalRequestBytes: js.UndefOr[String] = js.native
  var transientFetchFailureUrls: js.UndefOr[js.Array[String]] = js.native
}

object Anon_Cms {
  @scala.inline
  def apply(
    cms: String = null,
    cssResponseBytes: String = null,
    flashResponseBytes: String = null,
    htmlResponseBytes: String = null,
    imageResponseBytes: String = null,
    javascriptResponseBytes: String = null,
    numRenderBlockingRoundTrips: Int | Double = null,
    numTotalRoundTrips: Int | Double = null,
    numberCssResources: Int | Double = null,
    numberHosts: Int | Double = null,
    numberJsResources: Int | Double = null,
    numberResources: Int | Double = null,
    numberRobotedResources: Int | Double = null,
    numberStaticResources: Int | Double = null,
    numberTransientFetchFailureResources: Int | Double = null,
    otherResponseBytes: String = null,
    overTheWireResponseBytes: String = null,
    robotedUrls: js.Array[String] = null,
    textResponseBytes: String = null,
    totalRequestBytes: String = null,
    transientFetchFailureUrls: js.Array[String] = null
  ): Anon_Cms = {
    val __obj = js.Dynamic.literal()
    if (cms != null) __obj.updateDynamic("cms")(cms.asInstanceOf[js.Any])
    if (cssResponseBytes != null) __obj.updateDynamic("cssResponseBytes")(cssResponseBytes.asInstanceOf[js.Any])
    if (flashResponseBytes != null) __obj.updateDynamic("flashResponseBytes")(flashResponseBytes.asInstanceOf[js.Any])
    if (htmlResponseBytes != null) __obj.updateDynamic("htmlResponseBytes")(htmlResponseBytes.asInstanceOf[js.Any])
    if (imageResponseBytes != null) __obj.updateDynamic("imageResponseBytes")(imageResponseBytes.asInstanceOf[js.Any])
    if (javascriptResponseBytes != null) __obj.updateDynamic("javascriptResponseBytes")(javascriptResponseBytes.asInstanceOf[js.Any])
    if (numRenderBlockingRoundTrips != null) __obj.updateDynamic("numRenderBlockingRoundTrips")(numRenderBlockingRoundTrips.asInstanceOf[js.Any])
    if (numTotalRoundTrips != null) __obj.updateDynamic("numTotalRoundTrips")(numTotalRoundTrips.asInstanceOf[js.Any])
    if (numberCssResources != null) __obj.updateDynamic("numberCssResources")(numberCssResources.asInstanceOf[js.Any])
    if (numberHosts != null) __obj.updateDynamic("numberHosts")(numberHosts.asInstanceOf[js.Any])
    if (numberJsResources != null) __obj.updateDynamic("numberJsResources")(numberJsResources.asInstanceOf[js.Any])
    if (numberResources != null) __obj.updateDynamic("numberResources")(numberResources.asInstanceOf[js.Any])
    if (numberRobotedResources != null) __obj.updateDynamic("numberRobotedResources")(numberRobotedResources.asInstanceOf[js.Any])
    if (numberStaticResources != null) __obj.updateDynamic("numberStaticResources")(numberStaticResources.asInstanceOf[js.Any])
    if (numberTransientFetchFailureResources != null) __obj.updateDynamic("numberTransientFetchFailureResources")(numberTransientFetchFailureResources.asInstanceOf[js.Any])
    if (otherResponseBytes != null) __obj.updateDynamic("otherResponseBytes")(otherResponseBytes.asInstanceOf[js.Any])
    if (overTheWireResponseBytes != null) __obj.updateDynamic("overTheWireResponseBytes")(overTheWireResponseBytes.asInstanceOf[js.Any])
    if (robotedUrls != null) __obj.updateDynamic("robotedUrls")(robotedUrls.asInstanceOf[js.Any])
    if (textResponseBytes != null) __obj.updateDynamic("textResponseBytes")(textResponseBytes.asInstanceOf[js.Any])
    if (totalRequestBytes != null) __obj.updateDynamic("totalRequestBytes")(totalRequestBytes.asInstanceOf[js.Any])
    if (transientFetchFailureUrls != null) __obj.updateDynamic("transientFetchFailureUrls")(transientFetchFailureUrls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cms]
  }
}

