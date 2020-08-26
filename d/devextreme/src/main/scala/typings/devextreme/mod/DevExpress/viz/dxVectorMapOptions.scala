package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.BorderColorColor
import typings.devextreme.anon.BorderWidth
import typings.devextreme.anon.Center
import typings.devextreme.anon.ElementEventJQueryEventModel
import typings.devextreme.anon.Margin
import typings.devextreme.anon.ZoomFactor
import typings.devextreme.anon.`27`
import typings.devextreme.devextremeStrings.equirectangular
import typings.devextreme.devextremeStrings.lambert
import typings.devextreme.devextremeStrings.mercator
import typings.devextreme.devextremeStrings.miller
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxVectorMapOptions extends BaseWidgetOptions[dxVectorMap] {
  /** @name dxVectorMap.Options.background */
  var background: js.UndefOr[BorderColorColor] = js.native
  /** @name dxVectorMap.Options.bounds */
  var bounds: js.UndefOr[js.Array[Double]] = js.native
  /** @name dxVectorMap.Options.center */
  var center: js.UndefOr[js.Array[Double]] = js.native
  /** @name dxVectorMap.Options.controlBar */
  var controlBar: js.UndefOr[Margin] = js.native
  /** @name dxVectorMap.Options.layers */
  var layers: js.UndefOr[js.Array[BorderWidth] | BorderWidth] = js.native
  /** @name dxVectorMap.Options.legends */
  var legends: js.UndefOr[js.Array[dxVectorMapLegends]] = js.native
  /** @name dxVectorMap.Options.maxZoomFactor */
  var maxZoomFactor: js.UndefOr[Double] = js.native
  /** @name dxVectorMap.Options.onCenterChanged */
  var onCenterChanged: js.UndefOr[js.Function1[/* e */ Center, _]] = js.native
  /** @name dxVectorMap.Options.onClick */
  var onClick: js.UndefOr[(js.Function1[/* e */ ElementEventJQueryEventModel, _]) | String] = js.native
  /** @name dxVectorMap.Options.onSelectionChanged */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ `27`, _]] = js.native
  /** @name dxVectorMap.Options.onTooltipHidden */
  var onTooltipHidden: js.UndefOr[js.Function1[/* e */ `27`, _]] = js.native
  /** @name dxVectorMap.Options.onTooltipShown */
  var onTooltipShown: js.UndefOr[js.Function1[/* e */ `27`, _]] = js.native
  /** @name dxVectorMap.Options.onZoomFactorChanged */
  var onZoomFactorChanged: js.UndefOr[js.Function1[/* e */ ZoomFactor, _]] = js.native
  /** @name dxVectorMap.Options.panningEnabled */
  var panningEnabled: js.UndefOr[Boolean] = js.native
  /** @name dxVectorMap.Options.projection */
  var projection: js.UndefOr[
    equirectangular | lambert | mercator | miller | VectorMapProjectionConfig | String | js.Any
  ] = js.native
  /** @name dxVectorMap.Options.tooltip */
  @JSName("tooltip")
  var tooltip_dxVectorMapOptions: js.UndefOr[dxVectorMapTooltip] = js.native
  /** @name dxVectorMap.Options.touchEnabled */
  var touchEnabled: js.UndefOr[Boolean] = js.native
  /** @name dxVectorMap.Options.wheelEnabled */
  var wheelEnabled: js.UndefOr[Boolean] = js.native
  /** @name dxVectorMap.Options.zoomFactor */
  var zoomFactor: js.UndefOr[Double] = js.native
  /** @name dxVectorMap.Options.zoomingEnabled */
  var zoomingEnabled: js.UndefOr[Boolean] = js.native
}

object dxVectorMapOptions {
  @scala.inline
  def apply(): dxVectorMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxVectorMapOptions]
  }
  @scala.inline
  implicit class dxVectorMapOptionsOps[Self <: dxVectorMapOptions] (val x: Self) extends AnyVal {
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
    def setBackground(value: BorderColorColor): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBoundsVarargs(value: Double*): Self = this.set("bounds", js.Array(value :_*))
    @scala.inline
    def setBounds(value: js.Array[Double]): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setCenterVarargs(value: Double*): Self = this.set("center", js.Array(value :_*))
    @scala.inline
    def setCenter(value: js.Array[Double]): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setControlBar(value: Margin): Self = this.set("controlBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlBar: Self = this.set("controlBar", js.undefined)
    @scala.inline
    def setLayersVarargs(value: BorderWidth*): Self = this.set("layers", js.Array(value :_*))
    @scala.inline
    def setLayers(value: js.Array[BorderWidth] | BorderWidth): Self = this.set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    @scala.inline
    def setLegendsVarargs(value: dxVectorMapLegends*): Self = this.set("legends", js.Array(value :_*))
    @scala.inline
    def setLegends(value: js.Array[dxVectorMapLegends]): Self = this.set("legends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegends: Self = this.set("legends", js.undefined)
    @scala.inline
    def setMaxZoomFactor(value: Double): Self = this.set("maxZoomFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoomFactor: Self = this.set("maxZoomFactor", js.undefined)
    @scala.inline
    def setOnCenterChanged(value: /* e */ Center => _): Self = this.set("onCenterChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCenterChanged: Self = this.set("onCenterChanged", js.undefined)
    @scala.inline
    def setOnClickFunction1(value: /* e */ ElementEventJQueryEventModel => _): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def setOnClick(value: (js.Function1[/* e */ ElementEventJQueryEventModel, _]) | String): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnSelectionChanged(value: /* e */ `27` => _): Self = this.set("onSelectionChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelectionChanged: Self = this.set("onSelectionChanged", js.undefined)
    @scala.inline
    def setOnTooltipHidden(value: /* e */ `27` => _): Self = this.set("onTooltipHidden", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTooltipHidden: Self = this.set("onTooltipHidden", js.undefined)
    @scala.inline
    def setOnTooltipShown(value: /* e */ `27` => _): Self = this.set("onTooltipShown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTooltipShown: Self = this.set("onTooltipShown", js.undefined)
    @scala.inline
    def setOnZoomFactorChanged(value: /* e */ ZoomFactor => _): Self = this.set("onZoomFactorChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnZoomFactorChanged: Self = this.set("onZoomFactorChanged", js.undefined)
    @scala.inline
    def setPanningEnabled(value: Boolean): Self = this.set("panningEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanningEnabled: Self = this.set("panningEnabled", js.undefined)
    @scala.inline
    def setProjection(value: equirectangular | lambert | mercator | miller | VectorMapProjectionConfig | String | js.Any): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setTooltip(value: dxVectorMapTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTouchEnabled(value: Boolean): Self = this.set("touchEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchEnabled: Self = this.set("touchEnabled", js.undefined)
    @scala.inline
    def setWheelEnabled(value: Boolean): Self = this.set("wheelEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWheelEnabled: Self = this.set("wheelEnabled", js.undefined)
    @scala.inline
    def setZoomFactor(value: Double): Self = this.set("zoomFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomFactor: Self = this.set("zoomFactor", js.undefined)
    @scala.inline
    def setZoomingEnabled(value: Boolean): Self = this.set("zoomingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomingEnabled: Self = this.set("zoomingEnabled", js.undefined)
  }
  
}

