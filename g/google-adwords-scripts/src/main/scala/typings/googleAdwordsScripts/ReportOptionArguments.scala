package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportOptionArguments extends js.Object {
  var apiVersion: js.UndefOr[String] = js.undefined
  var includeZeroImpressions: js.UndefOr[Boolean] = js.undefined
  var resolveGeoNames: js.UndefOr[Boolean] = js.undefined
  var returnMoneyInMicros: js.UndefOr[Boolean] = js.undefined
}

object ReportOptionArguments {
  @scala.inline
  def apply(
    apiVersion: String = null,
    includeZeroImpressions: js.UndefOr[Boolean] = js.undefined,
    resolveGeoNames: js.UndefOr[Boolean] = js.undefined,
    returnMoneyInMicros: js.UndefOr[Boolean] = js.undefined
  ): ReportOptionArguments = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(includeZeroImpressions)) __obj.updateDynamic("includeZeroImpressions")(includeZeroImpressions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resolveGeoNames)) __obj.updateDynamic("resolveGeoNames")(resolveGeoNames.get.asInstanceOf[js.Any])
    if (!js.isUndefined(returnMoneyInMicros)) __obj.updateDynamic("returnMoneyInMicros")(returnMoneyInMicros.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportOptionArguments]
  }
}

