package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.`20`
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.global.JQuery
import typings.std.SVGElement
import typings.std.SVGGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxFunnelLegend extends BaseLegend {
  /** @name dxFunnel.Options.legend.customizeHint */
  var customizeHint: js.UndefOr[js.Function1[/* itemInfo */ `20`, String]] = js.native
  /** @name dxFunnel.Options.legend.customizeItems */
  var customizeItems: js.UndefOr[js.Function1[/* items */ js.Array[FunnelLegendItem], js.Array[FunnelLegendItem]]] = js.native
  /** @name dxFunnel.Options.legend.customizeText */
  var customizeText: js.UndefOr[js.Function1[/* itemInfo */ `20`, String]] = js.native
  /** @name dxFunnel.Options.legend.markerTemplate */
  var markerTemplate: js.UndefOr[
    template | (js.Function2[
      /* legendItem */ FunnelLegendItem, 
      /* element */ SVGGElement, 
      String | SVGElement | JQuery
    ])
  ] = js.native
}

object dxFunnelLegend {
  @scala.inline
  def apply(): dxFunnelLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFunnelLegend]
  }
  @scala.inline
  implicit class dxFunnelLegendOps[Self <: dxFunnelLegend] (val x: Self) extends AnyVal {
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
    def setCustomizeHint(value: /* itemInfo */ `20` => String): Self = this.set("customizeHint", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomizeHint: Self = this.set("customizeHint", js.undefined)
    @scala.inline
    def setCustomizeItems(value: /* items */ js.Array[FunnelLegendItem] => js.Array[FunnelLegendItem]): Self = this.set("customizeItems", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomizeItems: Self = this.set("customizeItems", js.undefined)
    @scala.inline
    def setCustomizeText(value: /* itemInfo */ `20` => String): Self = this.set("customizeText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomizeText: Self = this.set("customizeText", js.undefined)
    @scala.inline
    def setMarkerTemplateFunction2(
      value: (/* legendItem */ FunnelLegendItem, /* element */ SVGGElement) => String | SVGElement | JQuery
    ): Self = this.set("markerTemplate", js.Any.fromFunction2(value))
    @scala.inline
    def setMarkerTemplate(
      value: template | (js.Function2[
          /* legendItem */ FunnelLegendItem, 
          /* element */ SVGGElement, 
          String | SVGElement | JQuery
        ])
    ): Self = this.set("markerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerTemplate: Self = this.set("markerTemplate", js.undefined)
  }
  
}

