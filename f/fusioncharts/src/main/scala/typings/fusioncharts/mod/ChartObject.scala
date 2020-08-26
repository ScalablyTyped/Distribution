package typings.fusioncharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartObject extends js.Object {
  var baseChartMessageColor: js.UndefOr[String] = js.native
  var baseChartMessageFont: js.UndefOr[String] = js.native
  var baseChartMessageFontSize: js.UndefOr[String] = js.native
  var baseChartMessageImageHAlign: js.UndefOr[ImageHAlign] = js.native
  var containerBackgroundColor: js.UndefOr[String] = js.native
  var containerBackgroundOpacity: js.UndefOr[Double] = js.native
  var containerClassName: js.UndefOr[String] = js.native
  var dataEmptyMessage: js.UndefOr[String] = js.native
  var dataEmptyMessageImageAlpha: js.UndefOr[Double] = js.native
  var dataEmptyMessageImageHAlign: js.UndefOr[ImageHAlign] = js.native
  var dataEmptyMessageImageScale: js.UndefOr[Double] = js.native
  var dataEmptyMessageImageVAlign: js.UndefOr[ImageVAlign] = js.native
  var dataFormat: js.UndefOr[ChartDataFormats] = js.native
  var dataInvalidMessage: js.UndefOr[String] = js.native
  var dataInvalidMessageImageAlpha: js.UndefOr[Double] = js.native
  var dataInvalidMessageImageHAlign: js.UndefOr[ImageHAlign] = js.native
  var dataInvalidMessageImageScale: js.UndefOr[Double] = js.native
  var dataInvalidMessageImageVAlign: js.UndefOr[ImageVAlign] = js.native
  var dataLoadErrorMessage: js.UndefOr[String] = js.native
  var dataLoadErrorMessageImageAlpha: js.UndefOr[Double] = js.native
  var dataLoadErrorMessageImageScale: js.UndefOr[Double] = js.native
  var dataLoadErrorMessageImageVAlign: js.UndefOr[ImageVAlign] = js.native
  var dataLoadStartMessage: js.UndefOr[String] = js.native
  var dataLoadStartMessageImageAlpha: js.UndefOr[Double] = js.native
  var dataLoadStartMessageImageHAlign: js.UndefOr[ImageHAlign] = js.native
  var dataLoadStartMessageImageScale: js.UndefOr[Double] = js.native
  var dataLoadStartMessageImageVAlign: js.UndefOr[ImageVAlign] = js.native
  var dataSource: js.UndefOr[String | js.Object] = js.native
  var events: js.UndefOr[js.Object] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var id: js.UndefOr[String] = js.native
  var link: js.UndefOr[js.Object] = js.native
  var loadMessage: js.UndefOr[String] = js.native
  var loadMessageImageAlpha: js.UndefOr[Double] = js.native
  var loadMessageImageHAlign: js.UndefOr[ImageHAlign] = js.native
  var loadMessageImageScale: js.UndefOr[Double] = js.native
  var loadMessageImageVAlign: js.UndefOr[ImageVAlign] = js.native
  var renderAt: js.UndefOr[String] = js.native
  var renderErrorMessage: js.UndefOr[String] = js.native
  var renderErrorMessageImageAlpha: js.UndefOr[Double] = js.native
  var renderErrorMessageImageHAlign: js.UndefOr[ImageHAlign] = js.native
  var renderErrorMessageImageScale: js.UndefOr[Double] = js.native
  var renderErrorMessageImageVAlign: js.UndefOr[ImageVAlign] = js.native
  var showChartLoadingMessage: js.UndefOr[Boolean] = js.native
  var showDataLoadingMessage: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
  var typeNotSupportedMessage: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double | String] = js.native
}

object ChartObject {
  @scala.inline
  def apply(): ChartObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartObject]
  }
  @scala.inline
  implicit class ChartObjectOps[Self <: ChartObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBaseChartMessageColor(value: String): Self = this.set("baseChartMessageColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseChartMessageColor: Self = this.set("baseChartMessageColor", js.undefined)
    @scala.inline
    def setBaseChartMessageFont(value: String): Self = this.set("baseChartMessageFont", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseChartMessageFont: Self = this.set("baseChartMessageFont", js.undefined)
    @scala.inline
    def setBaseChartMessageFontSize(value: String): Self = this.set("baseChartMessageFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseChartMessageFontSize: Self = this.set("baseChartMessageFontSize", js.undefined)
    @scala.inline
    def setBaseChartMessageImageHAlign(value: ImageHAlign): Self = this.set("baseChartMessageImageHAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseChartMessageImageHAlign: Self = this.set("baseChartMessageImageHAlign", js.undefined)
    @scala.inline
    def setContainerBackgroundColor(value: String): Self = this.set("containerBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerBackgroundColor: Self = this.set("containerBackgroundColor", js.undefined)
    @scala.inline
    def setContainerBackgroundOpacity(value: Double): Self = this.set("containerBackgroundOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerBackgroundOpacity: Self = this.set("containerBackgroundOpacity", js.undefined)
    @scala.inline
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerClassName: Self = this.set("containerClassName", js.undefined)
    @scala.inline
    def setDataEmptyMessage(value: String): Self = this.set("dataEmptyMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataEmptyMessage: Self = this.set("dataEmptyMessage", js.undefined)
    @scala.inline
    def setDataEmptyMessageImageAlpha(value: Double): Self = this.set("dataEmptyMessageImageAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataEmptyMessageImageAlpha: Self = this.set("dataEmptyMessageImageAlpha", js.undefined)
    @scala.inline
    def setDataEmptyMessageImageHAlign(value: ImageHAlign): Self = this.set("dataEmptyMessageImageHAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataEmptyMessageImageHAlign: Self = this.set("dataEmptyMessageImageHAlign", js.undefined)
    @scala.inline
    def setDataEmptyMessageImageScale(value: Double): Self = this.set("dataEmptyMessageImageScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataEmptyMessageImageScale: Self = this.set("dataEmptyMessageImageScale", js.undefined)
    @scala.inline
    def setDataEmptyMessageImageVAlign(value: ImageVAlign): Self = this.set("dataEmptyMessageImageVAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataEmptyMessageImageVAlign: Self = this.set("dataEmptyMessageImageVAlign", js.undefined)
    @scala.inline
    def setDataFormat(value: ChartDataFormats): Self = this.set("dataFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataFormat: Self = this.set("dataFormat", js.undefined)
    @scala.inline
    def setDataInvalidMessage(value: String): Self = this.set("dataInvalidMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataInvalidMessage: Self = this.set("dataInvalidMessage", js.undefined)
    @scala.inline
    def setDataInvalidMessageImageAlpha(value: Double): Self = this.set("dataInvalidMessageImageAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataInvalidMessageImageAlpha: Self = this.set("dataInvalidMessageImageAlpha", js.undefined)
    @scala.inline
    def setDataInvalidMessageImageHAlign(value: ImageHAlign): Self = this.set("dataInvalidMessageImageHAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataInvalidMessageImageHAlign: Self = this.set("dataInvalidMessageImageHAlign", js.undefined)
    @scala.inline
    def setDataInvalidMessageImageScale(value: Double): Self = this.set("dataInvalidMessageImageScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataInvalidMessageImageScale: Self = this.set("dataInvalidMessageImageScale", js.undefined)
    @scala.inline
    def setDataInvalidMessageImageVAlign(value: ImageVAlign): Self = this.set("dataInvalidMessageImageVAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataInvalidMessageImageVAlign: Self = this.set("dataInvalidMessageImageVAlign", js.undefined)
    @scala.inline
    def setDataLoadErrorMessage(value: String): Self = this.set("dataLoadErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLoadErrorMessage: Self = this.set("dataLoadErrorMessage", js.undefined)
    @scala.inline
    def setDataLoadErrorMessageImageAlpha(value: Double): Self = this.set("dataLoadErrorMessageImageAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLoadErrorMessageImageAlpha: Self = this.set("dataLoadErrorMessageImageAlpha", js.undefined)
    @scala.inline
    def setDataLoadErrorMessageImageScale(value: Double): Self = this.set("dataLoadErrorMessageImageScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLoadErrorMessageImageScale: Self = this.set("dataLoadErrorMessageImageScale", js.undefined)
    @scala.inline
    def setDataLoadErrorMessageImageVAlign(value: ImageVAlign): Self = this.set("dataLoadErrorMessageImageVAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLoadErrorMessageImageVAlign: Self = this.set("dataLoadErrorMessageImageVAlign", js.undefined)
    @scala.inline
    def setDataLoadStartMessage(value: String): Self = this.set("dataLoadStartMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLoadStartMessage: Self = this.set("dataLoadStartMessage", js.undefined)
    @scala.inline
    def setDataLoadStartMessageImageAlpha(value: Double): Self = this.set("dataLoadStartMessageImageAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLoadStartMessageImageAlpha: Self = this.set("dataLoadStartMessageImageAlpha", js.undefined)
    @scala.inline
    def setDataLoadStartMessageImageHAlign(value: ImageHAlign): Self = this.set("dataLoadStartMessageImageHAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLoadStartMessageImageHAlign: Self = this.set("dataLoadStartMessageImageHAlign", js.undefined)
    @scala.inline
    def setDataLoadStartMessageImageScale(value: Double): Self = this.set("dataLoadStartMessageImageScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLoadStartMessageImageScale: Self = this.set("dataLoadStartMessageImageScale", js.undefined)
    @scala.inline
    def setDataLoadStartMessageImageVAlign(value: ImageVAlign): Self = this.set("dataLoadStartMessageImageVAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLoadStartMessageImageVAlign: Self = this.set("dataLoadStartMessageImageVAlign", js.undefined)
    @scala.inline
    def setDataSource(value: String | js.Object): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setEvents(value: js.Object): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLink(value: js.Object): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setLoadMessage(value: String): Self = this.set("loadMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadMessage: Self = this.set("loadMessage", js.undefined)
    @scala.inline
    def setLoadMessageImageAlpha(value: Double): Self = this.set("loadMessageImageAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadMessageImageAlpha: Self = this.set("loadMessageImageAlpha", js.undefined)
    @scala.inline
    def setLoadMessageImageHAlign(value: ImageHAlign): Self = this.set("loadMessageImageHAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadMessageImageHAlign: Self = this.set("loadMessageImageHAlign", js.undefined)
    @scala.inline
    def setLoadMessageImageScale(value: Double): Self = this.set("loadMessageImageScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadMessageImageScale: Self = this.set("loadMessageImageScale", js.undefined)
    @scala.inline
    def setLoadMessageImageVAlign(value: ImageVAlign): Self = this.set("loadMessageImageVAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadMessageImageVAlign: Self = this.set("loadMessageImageVAlign", js.undefined)
    @scala.inline
    def setRenderAt(value: String): Self = this.set("renderAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderAt: Self = this.set("renderAt", js.undefined)
    @scala.inline
    def setRenderErrorMessage(value: String): Self = this.set("renderErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderErrorMessage: Self = this.set("renderErrorMessage", js.undefined)
    @scala.inline
    def setRenderErrorMessageImageAlpha(value: Double): Self = this.set("renderErrorMessageImageAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderErrorMessageImageAlpha: Self = this.set("renderErrorMessageImageAlpha", js.undefined)
    @scala.inline
    def setRenderErrorMessageImageHAlign(value: ImageHAlign): Self = this.set("renderErrorMessageImageHAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderErrorMessageImageHAlign: Self = this.set("renderErrorMessageImageHAlign", js.undefined)
    @scala.inline
    def setRenderErrorMessageImageScale(value: Double): Self = this.set("renderErrorMessageImageScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderErrorMessageImageScale: Self = this.set("renderErrorMessageImageScale", js.undefined)
    @scala.inline
    def setRenderErrorMessageImageVAlign(value: ImageVAlign): Self = this.set("renderErrorMessageImageVAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderErrorMessageImageVAlign: Self = this.set("renderErrorMessageImageVAlign", js.undefined)
    @scala.inline
    def setShowChartLoadingMessage(value: Boolean): Self = this.set("showChartLoadingMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowChartLoadingMessage: Self = this.set("showChartLoadingMessage", js.undefined)
    @scala.inline
    def setShowDataLoadingMessage(value: Boolean): Self = this.set("showDataLoadingMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDataLoadingMessage: Self = this.set("showDataLoadingMessage", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setTypeNotSupportedMessage(value: String): Self = this.set("typeNotSupportedMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeNotSupportedMessage: Self = this.set("typeNotSupportedMessage", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

