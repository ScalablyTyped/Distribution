package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportOptionArguments extends js.Object {
  var apiVersion: js.UndefOr[java.lang.String] = js.undefined
  var includeZeroImpressions: js.UndefOr[scala.Boolean] = js.undefined
  var resolveGeoNames: js.UndefOr[scala.Boolean] = js.undefined
  var returnMoneyInMicros: js.UndefOr[scala.Boolean] = js.undefined
}

object ReportOptionArguments {
  @scala.inline
  def apply(
    apiVersion: java.lang.String = null,
    includeZeroImpressions: js.UndefOr[scala.Boolean] = js.undefined,
    resolveGeoNames: js.UndefOr[scala.Boolean] = js.undefined,
    returnMoneyInMicros: js.UndefOr[scala.Boolean] = js.undefined
  ): ReportOptionArguments = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion)
    if (!js.isUndefined(includeZeroImpressions)) __obj.updateDynamic("includeZeroImpressions")(includeZeroImpressions)
    if (!js.isUndefined(resolveGeoNames)) __obj.updateDynamic("resolveGeoNames")(resolveGeoNames)
    if (!js.isUndefined(returnMoneyInMicros)) __obj.updateDynamic("returnMoneyInMicros")(returnMoneyInMicros)
    __obj.asInstanceOf[ReportOptionArguments]
  }
}

