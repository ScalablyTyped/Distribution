package typings.fusioncharts.fusionchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartObject extends js.Object {
  var baseChartMessageColor: js.UndefOr[String] = js.undefined
  var baseChartMessageFont: js.UndefOr[String] = js.undefined
  var baseChartMessageFontSize: js.UndefOr[String] = js.undefined
  var baseChartMessageImageHAlign: js.UndefOr[ImageHAlign] = js.undefined
  var containerBackgroundColor: js.UndefOr[String] = js.undefined
  var containerBackgroundOpacity: js.UndefOr[Double] = js.undefined
  var containerClassName: js.UndefOr[String] = js.undefined
  var dataEmptyMessage: js.UndefOr[String] = js.undefined
  var dataEmptyMessageImageAlpha: js.UndefOr[Double] = js.undefined
  var dataEmptyMessageImageHAlign: js.UndefOr[ImageHAlign] = js.undefined
  var dataEmptyMessageImageScale: js.UndefOr[Double] = js.undefined
  var dataEmptyMessageImageVAlign: js.UndefOr[ImageVAlign] = js.undefined
  var dataFormat: js.UndefOr[ChartDataFormats] = js.undefined
  var dataInvalidMessage: js.UndefOr[String] = js.undefined
  var dataInvalidMessageImageAlpha: js.UndefOr[Double] = js.undefined
  var dataInvalidMessageImageHAlign: js.UndefOr[ImageHAlign] = js.undefined
  var dataInvalidMessageImageScale: js.UndefOr[Double] = js.undefined
  var dataInvalidMessageImageVAlign: js.UndefOr[ImageVAlign] = js.undefined
  var dataLoadErrorMessage: js.UndefOr[String] = js.undefined
  var dataLoadErrorMessageImageAlpha: js.UndefOr[Double] = js.undefined
  var dataLoadErrorMessageImageScale: js.UndefOr[Double] = js.undefined
  var dataLoadErrorMessageImageVAlign: js.UndefOr[ImageVAlign] = js.undefined
  var dataLoadStartMessage: js.UndefOr[String] = js.undefined
  var dataLoadStartMessageImageAlpha: js.UndefOr[Double] = js.undefined
  var dataLoadStartMessageImageHAlign: js.UndefOr[ImageHAlign] = js.undefined
  var dataLoadStartMessageImageScale: js.UndefOr[Double] = js.undefined
  var dataLoadStartMessageImageVAlign: js.UndefOr[ImageVAlign] = js.undefined
  var dataSource: js.UndefOr[String | js.Object] = js.undefined
  var events: js.UndefOr[js.Object] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var link: js.UndefOr[js.Object] = js.undefined
  var loadMessage: js.UndefOr[String] = js.undefined
  var loadMessageImageAlpha: js.UndefOr[Double] = js.undefined
  var loadMessageImageHAlign: js.UndefOr[ImageHAlign] = js.undefined
  var loadMessageImageScale: js.UndefOr[Double] = js.undefined
  var loadMessageImageVAlign: js.UndefOr[ImageVAlign] = js.undefined
  var renderAt: js.UndefOr[String] = js.undefined
  var renderErrorMessage: js.UndefOr[String] = js.undefined
  var renderErrorMessageImageAlpha: js.UndefOr[Double] = js.undefined
  var renderErrorMessageImageHAlign: js.UndefOr[ImageHAlign] = js.undefined
  var renderErrorMessageImageScale: js.UndefOr[Double] = js.undefined
  var renderErrorMessageImageVAlign: js.UndefOr[ImageVAlign] = js.undefined
  var showChartLoadingMessage: js.UndefOr[Boolean] = js.undefined
  var showDataLoadingMessage: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var typeNotSupportedMessage: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object ChartObject {
  @scala.inline
  def apply(
    baseChartMessageColor: String = null,
    baseChartMessageFont: String = null,
    baseChartMessageFontSize: String = null,
    baseChartMessageImageHAlign: ImageHAlign = null,
    containerBackgroundColor: String = null,
    containerBackgroundOpacity: Int | Double = null,
    containerClassName: String = null,
    dataEmptyMessage: String = null,
    dataEmptyMessageImageAlpha: Int | Double = null,
    dataEmptyMessageImageHAlign: ImageHAlign = null,
    dataEmptyMessageImageScale: Int | Double = null,
    dataEmptyMessageImageVAlign: ImageVAlign = null,
    dataFormat: ChartDataFormats = null,
    dataInvalidMessage: String = null,
    dataInvalidMessageImageAlpha: Int | Double = null,
    dataInvalidMessageImageHAlign: ImageHAlign = null,
    dataInvalidMessageImageScale: Int | Double = null,
    dataInvalidMessageImageVAlign: ImageVAlign = null,
    dataLoadErrorMessage: String = null,
    dataLoadErrorMessageImageAlpha: Int | Double = null,
    dataLoadErrorMessageImageScale: Int | Double = null,
    dataLoadErrorMessageImageVAlign: ImageVAlign = null,
    dataLoadStartMessage: String = null,
    dataLoadStartMessageImageAlpha: Int | Double = null,
    dataLoadStartMessageImageHAlign: ImageHAlign = null,
    dataLoadStartMessageImageScale: Int | Double = null,
    dataLoadStartMessageImageVAlign: ImageVAlign = null,
    dataSource: String | js.Object = null,
    events: js.Object = null,
    height: Double | String = null,
    id: String = null,
    link: js.Object = null,
    loadMessage: String = null,
    loadMessageImageAlpha: Int | Double = null,
    loadMessageImageHAlign: ImageHAlign = null,
    loadMessageImageScale: Int | Double = null,
    loadMessageImageVAlign: ImageVAlign = null,
    renderAt: String = null,
    renderErrorMessage: String = null,
    renderErrorMessageImageAlpha: Int | Double = null,
    renderErrorMessageImageHAlign: ImageHAlign = null,
    renderErrorMessageImageScale: Int | Double = null,
    renderErrorMessageImageVAlign: ImageVAlign = null,
    showChartLoadingMessage: js.UndefOr[Boolean] = js.undefined,
    showDataLoadingMessage: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    typeNotSupportedMessage: String = null,
    width: Double | String = null
  ): ChartObject = {
    val __obj = js.Dynamic.literal()
    if (baseChartMessageColor != null) __obj.updateDynamic("baseChartMessageColor")(baseChartMessageColor)
    if (baseChartMessageFont != null) __obj.updateDynamic("baseChartMessageFont")(baseChartMessageFont)
    if (baseChartMessageFontSize != null) __obj.updateDynamic("baseChartMessageFontSize")(baseChartMessageFontSize)
    if (baseChartMessageImageHAlign != null) __obj.updateDynamic("baseChartMessageImageHAlign")(baseChartMessageImageHAlign)
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor)
    if (containerBackgroundOpacity != null) __obj.updateDynamic("containerBackgroundOpacity")(containerBackgroundOpacity.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName)
    if (dataEmptyMessage != null) __obj.updateDynamic("dataEmptyMessage")(dataEmptyMessage)
    if (dataEmptyMessageImageAlpha != null) __obj.updateDynamic("dataEmptyMessageImageAlpha")(dataEmptyMessageImageAlpha.asInstanceOf[js.Any])
    if (dataEmptyMessageImageHAlign != null) __obj.updateDynamic("dataEmptyMessageImageHAlign")(dataEmptyMessageImageHAlign)
    if (dataEmptyMessageImageScale != null) __obj.updateDynamic("dataEmptyMessageImageScale")(dataEmptyMessageImageScale.asInstanceOf[js.Any])
    if (dataEmptyMessageImageVAlign != null) __obj.updateDynamic("dataEmptyMessageImageVAlign")(dataEmptyMessageImageVAlign)
    if (dataFormat != null) __obj.updateDynamic("dataFormat")(dataFormat)
    if (dataInvalidMessage != null) __obj.updateDynamic("dataInvalidMessage")(dataInvalidMessage)
    if (dataInvalidMessageImageAlpha != null) __obj.updateDynamic("dataInvalidMessageImageAlpha")(dataInvalidMessageImageAlpha.asInstanceOf[js.Any])
    if (dataInvalidMessageImageHAlign != null) __obj.updateDynamic("dataInvalidMessageImageHAlign")(dataInvalidMessageImageHAlign)
    if (dataInvalidMessageImageScale != null) __obj.updateDynamic("dataInvalidMessageImageScale")(dataInvalidMessageImageScale.asInstanceOf[js.Any])
    if (dataInvalidMessageImageVAlign != null) __obj.updateDynamic("dataInvalidMessageImageVAlign")(dataInvalidMessageImageVAlign)
    if (dataLoadErrorMessage != null) __obj.updateDynamic("dataLoadErrorMessage")(dataLoadErrorMessage)
    if (dataLoadErrorMessageImageAlpha != null) __obj.updateDynamic("dataLoadErrorMessageImageAlpha")(dataLoadErrorMessageImageAlpha.asInstanceOf[js.Any])
    if (dataLoadErrorMessageImageScale != null) __obj.updateDynamic("dataLoadErrorMessageImageScale")(dataLoadErrorMessageImageScale.asInstanceOf[js.Any])
    if (dataLoadErrorMessageImageVAlign != null) __obj.updateDynamic("dataLoadErrorMessageImageVAlign")(dataLoadErrorMessageImageVAlign)
    if (dataLoadStartMessage != null) __obj.updateDynamic("dataLoadStartMessage")(dataLoadStartMessage)
    if (dataLoadStartMessageImageAlpha != null) __obj.updateDynamic("dataLoadStartMessageImageAlpha")(dataLoadStartMessageImageAlpha.asInstanceOf[js.Any])
    if (dataLoadStartMessageImageHAlign != null) __obj.updateDynamic("dataLoadStartMessageImageHAlign")(dataLoadStartMessageImageHAlign)
    if (dataLoadStartMessageImageScale != null) __obj.updateDynamic("dataLoadStartMessageImageScale")(dataLoadStartMessageImageScale.asInstanceOf[js.Any])
    if (dataLoadStartMessageImageVAlign != null) __obj.updateDynamic("dataLoadStartMessageImageVAlign")(dataLoadStartMessageImageVAlign)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (link != null) __obj.updateDynamic("link")(link)
    if (loadMessage != null) __obj.updateDynamic("loadMessage")(loadMessage)
    if (loadMessageImageAlpha != null) __obj.updateDynamic("loadMessageImageAlpha")(loadMessageImageAlpha.asInstanceOf[js.Any])
    if (loadMessageImageHAlign != null) __obj.updateDynamic("loadMessageImageHAlign")(loadMessageImageHAlign)
    if (loadMessageImageScale != null) __obj.updateDynamic("loadMessageImageScale")(loadMessageImageScale.asInstanceOf[js.Any])
    if (loadMessageImageVAlign != null) __obj.updateDynamic("loadMessageImageVAlign")(loadMessageImageVAlign)
    if (renderAt != null) __obj.updateDynamic("renderAt")(renderAt)
    if (renderErrorMessage != null) __obj.updateDynamic("renderErrorMessage")(renderErrorMessage)
    if (renderErrorMessageImageAlpha != null) __obj.updateDynamic("renderErrorMessageImageAlpha")(renderErrorMessageImageAlpha.asInstanceOf[js.Any])
    if (renderErrorMessageImageHAlign != null) __obj.updateDynamic("renderErrorMessageImageHAlign")(renderErrorMessageImageHAlign)
    if (renderErrorMessageImageScale != null) __obj.updateDynamic("renderErrorMessageImageScale")(renderErrorMessageImageScale.asInstanceOf[js.Any])
    if (renderErrorMessageImageVAlign != null) __obj.updateDynamic("renderErrorMessageImageVAlign")(renderErrorMessageImageVAlign)
    if (!js.isUndefined(showChartLoadingMessage)) __obj.updateDynamic("showChartLoadingMessage")(showChartLoadingMessage)
    if (!js.isUndefined(showDataLoadingMessage)) __obj.updateDynamic("showDataLoadingMessage")(showDataLoadingMessage)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (typeNotSupportedMessage != null) __obj.updateDynamic("typeNotSupportedMessage")(typeNotSupportedMessage)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartObject]
  }
}

