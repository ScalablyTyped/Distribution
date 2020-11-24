package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ColorEnd
import typings.devextreme.anon.Layer
import typings.devextreme.devextremeStrings.circle
import typings.devextreme.devextremeStrings.square
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.global.JQuery
import typings.std.SVGElement
import typings.std.SVGGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxVectorMapLegends extends BaseLegend {
  
  /**
    * [descr:dxVectorMap.Options.legends.customizeHint]
    */
  var customizeHint: js.UndefOr[js.Function1[/* itemInfo */ ColorEnd, String]] = js.native
  
  /**
    * [descr:dxVectorMap.Options.legends.customizeItems]
    */
  var customizeItems: js.UndefOr[
    js.Function1[/* items */ js.Array[VectorMapLegendItem], js.Array[VectorMapLegendItem]]
  ] = js.native
  
  /**
    * [descr:dxVectorMap.Options.legends.customizeText]
    */
  var customizeText: js.UndefOr[js.Function1[/* itemInfo */ ColorEnd, String]] = js.native
  
  /**
    * [descr:dxVectorMap.Options.legends.markerColor]
    */
  var markerColor: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxVectorMap.Options.legends.markerShape]
    */
  var markerShape: js.UndefOr[circle | square] = js.native
  
  /**
    * [descr:dxVectorMap.Options.legends.markerTemplate]
    */
  var markerTemplate: js.UndefOr[
    template | (js.Function2[
      /* legendItem */ VectorMapLegendItem, 
      /* element */ SVGGElement, 
      String | SVGElement | JQuery
    ])
  ] = js.native
  
  /**
    * [descr:dxVectorMap.Options.legends.source]
    */
  var source: js.UndefOr[Layer] = js.native
}
object dxVectorMapLegends {
  
  @scala.inline
  def apply(): dxVectorMapLegends = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxVectorMapLegends]
  }
  
  @scala.inline
  implicit class dxVectorMapLegendsOps[Self <: dxVectorMapLegends] (val x: Self) extends AnyVal {
    
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
    def setCustomizeHint(value: /* itemInfo */ ColorEnd => String): Self = this.set("customizeHint", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeHint: Self = this.set("customizeHint", js.undefined)
    
    @scala.inline
    def setCustomizeItems(value: /* items */ js.Array[VectorMapLegendItem] => js.Array[VectorMapLegendItem]): Self = this.set("customizeItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeItems: Self = this.set("customizeItems", js.undefined)
    
    @scala.inline
    def setCustomizeText(value: /* itemInfo */ ColorEnd => String): Self = this.set("customizeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeText: Self = this.set("customizeText", js.undefined)
    
    @scala.inline
    def setMarkerColor(value: String): Self = this.set("markerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerColor: Self = this.set("markerColor", js.undefined)
    
    @scala.inline
    def setMarkerShape(value: circle | square): Self = this.set("markerShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerShape: Self = this.set("markerShape", js.undefined)
    
    @scala.inline
    def setMarkerTemplateFunction2(
      value: (/* legendItem */ VectorMapLegendItem, /* element */ SVGGElement) => String | SVGElement | JQuery
    ): Self = this.set("markerTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMarkerTemplate(
      value: template | (js.Function2[
          /* legendItem */ VectorMapLegendItem, 
          /* element */ SVGGElement, 
          String | SVGElement | JQuery
        ])
    ): Self = this.set("markerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerTemplate: Self = this.set("markerTemplate", js.undefined)
    
    @scala.inline
    def setSource(value: Layer): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
