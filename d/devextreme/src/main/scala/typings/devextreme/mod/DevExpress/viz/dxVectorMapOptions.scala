package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.BorderColorColor
import typings.devextreme.anon.BorderWidth
import typings.devextreme.anon.ColorGroupingField
import typings.devextreme.anon.Margin
import typings.devextreme.mod.DevExpress.viz.dxVectorMap.CenterChangedEvent
import typings.devextreme.mod.DevExpress.viz.dxVectorMap.ClickEvent
import typings.devextreme.mod.DevExpress.viz.dxVectorMap.SelectionChangedEvent
import typings.devextreme.mod.DevExpress.viz.dxVectorMap.TooltipHiddenEvent
import typings.devextreme.mod.DevExpress.viz.dxVectorMap.TooltipShownEvent
import typings.devextreme.mod.DevExpress.viz.dxVectorMap.ZoomFactorChangedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxVectorMapOptions
  extends StObject
     with BaseWidgetOptions[dxVectorMap] {
  
  /**
    * Specifies the annotation collection.
    */
  var annotations: js.UndefOr[js.Array[dxVectorMapAnnotationConfig | Any]] = js.undefined
  
  /**
    * Specifies the properties for the map background.
    */
  var background: js.UndefOr[BorderColorColor] = js.undefined
  
  /**
    * Specifies the positioning of a map in geographical coordinates.
    */
  var bounds: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Specifies the geographical coordinates of the center for a map.
    */
  var center: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Specifies settings common for all annotations in the VectorMap.
    */
  var commonAnnotationSettings: js.UndefOr[dxVectorMapCommonAnnotationConfig] = js.undefined
  
  /**
    * Configures the control bar.
    */
  var controlBar: js.UndefOr[Margin] = js.undefined
  
  /**
    * Customizes an individual annotation.
    */
  var customizeAnnotation: js.UndefOr[
    js.Function1[/* annotation */ dxVectorMapAnnotationConfig | Any, dxVectorMapAnnotationConfig]
  ] = js.undefined
  
  /**
    * Specifies properties for VectorMap UI component layers.
    */
  var layers: js.UndefOr[js.Array[BorderWidth] | ColorGroupingField] = js.undefined
  
  /**
    * Configures map legends.
    */
  var legends: js.UndefOr[js.Array[dxVectorMapLegends]] = js.undefined
  
  /**
    * Specifies a map&apos;s maximum zoom factor.
    */
  var maxZoomFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * A function that is executed each time the center coordinates are changed.
    */
  var onCenterChanged: js.UndefOr[js.Function1[/* e */ CenterChangedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when any location on the map is clicked or tapped.
    */
  var onClick: js.UndefOr[(js.Function1[/* e */ ClickEvent, Unit]) | String] = js.undefined
  
  /**
    * A function that is executed when a layer element is selected or selection is canceled.
    */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ SelectionChangedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a tooltip becomes hidden.
    */
  var onTooltipHidden: js.UndefOr[js.Function1[/* e */ TooltipHiddenEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a tooltip appears.
    */
  var onTooltipShown: js.UndefOr[js.Function1[/* e */ TooltipShownEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed each time the zoom factor is changed.
    */
  var onZoomFactorChanged: js.UndefOr[js.Function1[/* e */ ZoomFactorChangedEvent, Unit]] = js.undefined
  
  /**
    * Disables the panning capability.
    */
  var panningEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the map projection.
    */
  var projection: js.UndefOr[VectorMapProjection | VectorMapProjectionConfig | String | Any] = js.undefined
  
  /**
    * Configures tooltips.
    */
  @JSName("tooltip")
  var tooltip_dxVectorMapOptions: js.UndefOr[dxVectorMapTooltip] = js.undefined
  
  /**
    * Specifies whether the map should respond to touch gestures.
    */
  var touchEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not the map should respond when a user rolls the mouse wheel.
    */
  var wheelEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a number that is used to zoom a map initially.
    */
  var zoomFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * Disables the zooming capability.
    */
  var zoomingEnabled: js.UndefOr[Boolean] = js.undefined
}
object dxVectorMapOptions {
  
  inline def apply(): dxVectorMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxVectorMapOptions]
  }
  
  extension [Self <: dxVectorMapOptions](x: Self) {
    
    inline def setAnnotations(value: js.Array[dxVectorMapAnnotationConfig | Any]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: (dxVectorMapAnnotationConfig | Any)*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setBackground(value: BorderColorColor): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBounds(value: js.Array[Double]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setBoundsVarargs(value: Double*): Self = StObject.set(x, "bounds", js.Array(value*))
    
    inline def setCenter(value: js.Array[Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value*))
    
    inline def setCommonAnnotationSettings(value: dxVectorMapCommonAnnotationConfig): Self = StObject.set(x, "commonAnnotationSettings", value.asInstanceOf[js.Any])
    
    inline def setCommonAnnotationSettingsUndefined: Self = StObject.set(x, "commonAnnotationSettings", js.undefined)
    
    inline def setControlBar(value: Margin): Self = StObject.set(x, "controlBar", value.asInstanceOf[js.Any])
    
    inline def setControlBarUndefined: Self = StObject.set(x, "controlBar", js.undefined)
    
    inline def setCustomizeAnnotation(value: /* annotation */ dxVectorMapAnnotationConfig | Any => dxVectorMapAnnotationConfig): Self = StObject.set(x, "customizeAnnotation", js.Any.fromFunction1(value))
    
    inline def setCustomizeAnnotationUndefined: Self = StObject.set(x, "customizeAnnotation", js.undefined)
    
    inline def setLayers(value: js.Array[BorderWidth] | ColorGroupingField): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: BorderWidth*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setLegends(value: js.Array[dxVectorMapLegends]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
    
    inline def setLegendsUndefined: Self = StObject.set(x, "legends", js.undefined)
    
    inline def setLegendsVarargs(value: dxVectorMapLegends*): Self = StObject.set(x, "legends", js.Array(value*))
    
    inline def setMaxZoomFactor(value: Double): Self = StObject.set(x, "maxZoomFactor", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomFactorUndefined: Self = StObject.set(x, "maxZoomFactor", js.undefined)
    
    inline def setOnCenterChanged(value: /* e */ CenterChangedEvent => Unit): Self = StObject.set(x, "onCenterChanged", js.Any.fromFunction1(value))
    
    inline def setOnCenterChangedUndefined: Self = StObject.set(x, "onCenterChanged", js.undefined)
    
    inline def setOnClick(value: (js.Function1[/* e */ ClickEvent, Unit]) | String): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickFunction1(value: /* e */ ClickEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnSelectionChanged(value: /* e */ SelectionChangedEvent => Unit): Self = StObject.set(x, "onSelectionChanged", js.Any.fromFunction1(value))
    
    inline def setOnSelectionChangedUndefined: Self = StObject.set(x, "onSelectionChanged", js.undefined)
    
    inline def setOnTooltipHidden(value: /* e */ TooltipHiddenEvent => Unit): Self = StObject.set(x, "onTooltipHidden", js.Any.fromFunction1(value))
    
    inline def setOnTooltipHiddenUndefined: Self = StObject.set(x, "onTooltipHidden", js.undefined)
    
    inline def setOnTooltipShown(value: /* e */ TooltipShownEvent => Unit): Self = StObject.set(x, "onTooltipShown", js.Any.fromFunction1(value))
    
    inline def setOnTooltipShownUndefined: Self = StObject.set(x, "onTooltipShown", js.undefined)
    
    inline def setOnZoomFactorChanged(value: /* e */ ZoomFactorChangedEvent => Unit): Self = StObject.set(x, "onZoomFactorChanged", js.Any.fromFunction1(value))
    
    inline def setOnZoomFactorChangedUndefined: Self = StObject.set(x, "onZoomFactorChanged", js.undefined)
    
    inline def setPanningEnabled(value: Boolean): Self = StObject.set(x, "panningEnabled", value.asInstanceOf[js.Any])
    
    inline def setPanningEnabledUndefined: Self = StObject.set(x, "panningEnabled", js.undefined)
    
    inline def setProjection(value: VectorMapProjection | VectorMapProjectionConfig | String | Any): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setTooltip(value: dxVectorMapTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setTouchEnabled(value: Boolean): Self = StObject.set(x, "touchEnabled", value.asInstanceOf[js.Any])
    
    inline def setTouchEnabledUndefined: Self = StObject.set(x, "touchEnabled", js.undefined)
    
    inline def setWheelEnabled(value: Boolean): Self = StObject.set(x, "wheelEnabled", value.asInstanceOf[js.Any])
    
    inline def setWheelEnabledUndefined: Self = StObject.set(x, "wheelEnabled", js.undefined)
    
    inline def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
    
    inline def setZoomFactorUndefined: Self = StObject.set(x, "zoomFactor", js.undefined)
    
    inline def setZoomingEnabled(value: Boolean): Self = StObject.set(x, "zoomingEnabled", value.asInstanceOf[js.Any])
    
    inline def setZoomingEnabledUndefined: Self = StObject.set(x, "zoomingEnabled", js.undefined)
  }
}
