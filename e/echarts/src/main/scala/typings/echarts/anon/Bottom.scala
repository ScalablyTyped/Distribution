package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bottom extends StObject {
  
  /**
    * Distance between asdf component and the bottom side of the
    * container.
    *
    * `bottom` value can be instant pixel value like `20`; it can
    * also be percentage value relative to container width like
    * `'20%'`.
    *
    * Adaptive by default.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.bottom
    */
  var bottom: js.UndefOr[Double | String] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis
    */
  var emphasis: js.UndefOr[`27`] = js.undefined
  
  /**
    * When is no content in breadcrumb, this minimal width need
    * to be set up.
    *
    *
    * @default
    * 25
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emptyItemWidth
    */
  var emptyItemWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * The height of breadcrumb.
    *
    *
    * @default
    * 22
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.height
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Graphic style of , `emphasis` is the style when it is highlighted,
    * like being hovered by mouse, or highlighted via legend connect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.itemStyle
    */
  var itemStyle: js.UndefOr[TextStyle] = js.undefined
  
  /**
    * Distance between asdf component and the left side of the
    * container.
    *
    * `left` value can be instant pixel value like `20`; it can
    * also be percentage value relative to container width like
    * `'20%'`; and it can also be `'left'`, `'center'`, or `'right'`.
    *
    * If the `left` value is set to be `'left'`, `'center'`, or
    * `'right'`, then the component will be aligned automatically
    * based on position.
    *
    *
    * @default
    * "center"
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.left
    */
  var left: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Distance between asdf component and the right side of the
    * container.
    *
    * `right` value can be instant pixel value like `20`; it can
    * also be percentage value relative to container width like
    * `'20%'`.
    *
    * Adaptive by default.
    *
    *
    * @default
    * "auto"
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.right
    */
  var right: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Whether to show the breadcrumb.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.show
    */
  var show: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Distance between asdf component and the top side of the container.
    *
    * `top` value can be instant pixel value like `20`; it can
    * also be percentage value relative to container width like
    * `'20%'`; and it can also be `'top'`, `'middle'`, or `'bottom'`.
    *
    * If the `left` value is set to be `'top'`, `'middle'`, or
    * `'bottom'`, then the component will be aligned automatically
    * based on position.
    *
    *
    * @default
    * "auto"
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.top
    */
  var top: js.UndefOr[Double | String] = js.undefined
}
object Bottom {
  
  inline def apply(): Bottom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bottom]
  }
  
  extension [Self <: Bottom](x: Self) {
    
    inline def setBottom(value: Double | String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setEmphasis(value: `27`): Self = StObject.set(x, "emphasis", value.asInstanceOf[js.Any])
    
    inline def setEmphasisUndefined: Self = StObject.set(x, "emphasis", js.undefined)
    
    inline def setEmptyItemWidth(value: Double): Self = StObject.set(x, "emptyItemWidth", value.asInstanceOf[js.Any])
    
    inline def setEmptyItemWidthUndefined: Self = StObject.set(x, "emptyItemWidth", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setItemStyle(value: TextStyle): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    inline def setLeft(value: Double | String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: Double | String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setTop(value: Double | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
