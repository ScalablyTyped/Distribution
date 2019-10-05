package typings.dojo.dojox.geo.charting

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyNumber
import typings.dojo.dijit._Widget
import typings.dojo.dojoStrings.adjustMapCenterOnResize
import typings.dojo.dojoStrings.adjustMapScaleOnResize
import typings.dojo.dojoStrings.animateOnResize
import typings.dojo.dojoStrings.colorAnimationDuration
import typings.dojo.dojoStrings.dataBindingAttribute
import typings.dojo.dojoStrings.dataBindingValueFunction
import typings.dojo.dojoStrings.dataStore
import typings.dojo.dojoStrings.enableFeatureZoom
import typings.dojo.dojoStrings.enableKeyboardSupport
import typings.dojo.dojoStrings.enableMousePan
import typings.dojo.dojoStrings.enableMouseSupport
import typings.dojo.dojoStrings.enableMouseZoom
import typings.dojo.dojoStrings.enableTouchSupport
import typings.dojo.dojoStrings.horizontal
import typings.dojo.dojoStrings.legendBody
import typings.dojo.dojoStrings.map
import typings.dojo.dojoStrings.markerData
import typings.dojo.dojoStrings.mouseClickThreshold
import typings.dojo.dojoStrings.onFeatureClick
import typings.dojo.dojoStrings.onFeatureOver
import typings.dojo.dojoStrings.series
import typings.dojo.dojoStrings.shapeData
import typings.dojo.dojoStrings.showTooltips
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.swatchSize
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.geo.charting.widget")
@js.native
object widget extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/charting/widget/Legend.html
    *
    * A legend widget displaying association between colors and Feature value ranges.
    * This widget basically is a table comprising (icon,string) pairs, describing the color scheme
    * used for the map and its associated text descriptions.
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  @js.native
  class Legend () extends _Widget {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      *
      */
    var horizontal: Boolean = js.native
    /**
      *
      */
    var legendBody: js.Object = js.native
    /**
      *
      */
    var map: js.Object = js.native
    /**
      * HTML style attributes as cssText string or name/value hash
      *
      */
    @JSName("style")
    var style_Legend: String = js.native
    /**
      *
      */
    var swatchSize: Double = js.native
    @JSName("get")
    def get_horizontal(property: horizontal): Boolean = js.native
    @JSName("get")
    def get_legendBody(property: legendBody): js.Object = js.native
    @JSName("get")
    def get_map(property: map): js.Object = js.native
    @JSName("get")
    def get_swatchSize(property: swatchSize): Double = js.native
    /**
      * Refreshes this legend contents when Map series has changed.
      *
      */
    def refresh(): Unit = js.native
    @JSName("set")
    def set_horizontal(property: horizontal, value: Boolean): Unit = js.native
    @JSName("set")
    def set_legendBody(property: legendBody, value: js.Object): Unit = js.native
    @JSName("set")
    def set_map(property: map, value: js.Object): Unit = js.native
    @JSName("set")
    def set_style(property: style, value: String): Unit = js.native
    @JSName("set")
    def set_swatchSize(property: swatchSize, value: Double): Unit = js.native
    @JSName("watch")
    def watch_horizontal(property: horizontal, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_legendBody(property: legendBody, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_map(property: map, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_swatchSize(property: swatchSize, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/charting/widget/Map.html
    *
    * A map viewer widget based on the dojox.geo.charting.Map component
    * The dojox.geo.charting.widget.Map widget combines map display together with charting capabilities.
    * It encapsulates  an dojox.geo.charting.Map object on which most operations are delegated.
    * Parameters can be passed as argument at construction time to specify map data file (json shape format)
    * as well as charting data.
    *
    * The parameters are:
    *
    * shapeData: The json object containing map data or the name of the file containing map data.
    * dataStore: the dataStore to fetch the charting data from
    * dataBindingAttribute: property name of the dataStore items to use as value for charting
    * markerData: tooltips to display for map features, handled as json style.
    * adjustMapCenterOnResize: if true, the center of the map remains the same when resizing the widget
    * adjustMapScaleOnResize: if true, the map scale is adjusted to leave the visible portion of the map identical as much as possible
    *
    * @param options
    * @param div
    */
  @js.native
  class Map protected () extends _Widget {
    def this(options: js.Object, div: HTMLElement) = this()
    /**
      *
      */
    var adjustMapCenterOnResize: js.Object = js.native
    /**
      *
      */
    var adjustMapScaleOnResize: js.Object = js.native
    /**
      *
      */
    var animateOnResize: js.Object = js.native
    /**
      *
      */
    var colorAnimationDuration: Double = js.native
    /**
      *
      */
    var dataBindingAttribute: String = js.native
    /**
      *
      */
    var dataBindingValueFunction: js.Object = js.native
    /**
      *
      */
    var dataStore: js.Object = js.native
    /**
      *
      */
    var enableFeatureZoom: js.Object = js.native
    /**
      *
      */
    var enableKeyboardSupport: Boolean = js.native
    /**
      *
      */
    var enableMousePan: js.Object = js.native
    /**
      *
      */
    var enableMouseSupport: js.Object = js.native
    /**
      *
      */
    var enableMouseZoom: js.Object = js.native
    /**
      *
      */
    var enableTouchSupport: js.Object = js.native
    /**
      *
      */
    var markerData: String = js.native
    /**
      *
      */
    var mouseClickThreshold: Double = js.native
    /**
      *
      */
    var onFeatureClick: js.Object = js.native
    /**
      *
      */
    var onFeatureOver: js.Object = js.native
    /**
      *
      */
    var series: String = js.native
    /**
      *
      */
    var shapeData: String = js.native
    /**
      *
      */
    var showTooltips: Boolean = js.native
    /**
      * HTML style attributes as cssText string or name/value hash
      *
      */
    @JSName("style")
    var style_Map: String = js.native
    /**
      *
      * @param params               Optional
      * @param srcNodeRef               Optional
      */
    def create(params: js.Object, srcNodeRef: String): Unit = js.native
    /**
      *
      * @param params               Optional
      * @param srcNodeRef               Optional
      */
    def create(params: js.Object, srcNodeRef: HTMLElement): Unit = js.native
    /**
      *
      */
    def getInnerMap(): js.Any = js.native
    @JSName("get")
    def get_adjustMapCenterOnResize(property: adjustMapCenterOnResize): js.Object = js.native
    @JSName("get")
    def get_adjustMapScaleOnResize(property: adjustMapScaleOnResize): js.Object = js.native
    @JSName("get")
    def get_animateOnResize(property: animateOnResize): js.Object = js.native
    @JSName("get")
    def get_colorAnimationDuration(property: colorAnimationDuration): Double = js.native
    @JSName("get")
    def get_dataBindingAttribute(property: dataBindingAttribute): String = js.native
    @JSName("get")
    def get_dataBindingValueFunction(property: dataBindingValueFunction): js.Object = js.native
    @JSName("get")
    def get_dataStore(property: dataStore): js.Object = js.native
    @JSName("get")
    def get_enableFeatureZoom(property: enableFeatureZoom): js.Object = js.native
    @JSName("get")
    def get_enableKeyboardSupport(property: enableKeyboardSupport): Boolean = js.native
    @JSName("get")
    def get_enableMousePan(property: enableMousePan): js.Object = js.native
    @JSName("get")
    def get_enableMouseSupport(property: enableMouseSupport): js.Object = js.native
    @JSName("get")
    def get_enableMouseZoom(property: enableMouseZoom): js.Object = js.native
    @JSName("get")
    def get_enableTouchSupport(property: enableTouchSupport): js.Object = js.native
    @JSName("get")
    def get_markerData(property: markerData): String = js.native
    @JSName("get")
    def get_mouseClickThreshold(property: mouseClickThreshold): Double = js.native
    @JSName("get")
    def get_onFeatureClick(property: onFeatureClick): js.Object = js.native
    @JSName("get")
    def get_onFeatureOver(property: onFeatureOver): js.Object = js.native
    @JSName("get")
    def get_series(property: series): String = js.native
    @JSName("get")
    def get_shapeData(property: shapeData): String = js.native
    @JSName("get")
    def get_showTooltips(property: showTooltips): Boolean = js.native
    /**
      * Resize the widget.
      * Resize the domNode and the widget to the dimensions of a box of the following form:
      * { l: 50, t: 200, w: 300: h: 150 }
      *
      * @param b               OptionalAn hash with optional "l", "t", "w", and "h" properties for "left", "right", "width", and "height"respectively; or a number representing the new width.
      * @param height               OptionalA number representing the new height.
      */
    def resize(b: js.Object, height: Double): Unit = js.native
    /**
      * Resize the widget.
      * Resize the domNode and the widget to the dimensions of a box of the following form:
      * { l: 50, t: 200, w: 300: h: 150 }
      *
      * @param b               OptionalAn hash with optional "l", "t", "w", and "h" properties for "left", "right", "width", and "height"respectively; or a number representing the new width.
      * @param height               OptionalA number representing the new height.
      */
    def resize(b: Double, height: Double): Unit = js.native
    @JSName("set")
    def set_adjustMapCenterOnResize(property: adjustMapCenterOnResize, value: js.Object): Unit = js.native
    @JSName("set")
    def set_adjustMapScaleOnResize(property: adjustMapScaleOnResize, value: js.Object): Unit = js.native
    @JSName("set")
    def set_animateOnResize(property: animateOnResize, value: js.Object): Unit = js.native
    @JSName("set")
    def set_colorAnimationDuration(property: colorAnimationDuration, value: Double): Unit = js.native
    @JSName("set")
    def set_dataBindingAttribute(property: dataBindingAttribute, value: String): Unit = js.native
    @JSName("set")
    def set_dataBindingValueFunction(property: dataBindingValueFunction, value: js.Object): Unit = js.native
    @JSName("set")
    def set_dataStore(property: dataStore, value: js.Object): Unit = js.native
    @JSName("set")
    def set_enableFeatureZoom(property: enableFeatureZoom, value: js.Object): Unit = js.native
    @JSName("set")
    def set_enableKeyboardSupport(property: enableKeyboardSupport, value: Boolean): Unit = js.native
    @JSName("set")
    def set_enableMousePan(property: enableMousePan, value: js.Object): Unit = js.native
    @JSName("set")
    def set_enableMouseSupport(property: enableMouseSupport, value: js.Object): Unit = js.native
    @JSName("set")
    def set_enableMouseZoom(property: enableMouseZoom, value: js.Object): Unit = js.native
    @JSName("set")
    def set_enableTouchSupport(property: enableTouchSupport, value: js.Object): Unit = js.native
    @JSName("set")
    def set_markerData(property: markerData, value: String): Unit = js.native
    @JSName("set")
    def set_mouseClickThreshold(property: mouseClickThreshold, value: Double): Unit = js.native
    @JSName("set")
    def set_onFeatureClick(property: onFeatureClick, value: js.Object): Unit = js.native
    @JSName("set")
    def set_onFeatureOver(property: onFeatureOver, value: js.Object): Unit = js.native
    @JSName("set")
    def set_series(property: series, value: String): Unit = js.native
    @JSName("set")
    def set_shapeData(property: shapeData, value: String): Unit = js.native
    @JSName("set")
    def set_showTooltips(property: showTooltips, value: Boolean): Unit = js.native
    @JSName("set")
    def set_style(property: style, value: String): Unit = js.native
    @JSName("watch")
    def watch_adjustMapCenterOnResize(property: adjustMapCenterOnResize, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_adjustMapScaleOnResize(property: adjustMapScaleOnResize, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_animateOnResize(property: animateOnResize, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_colorAnimationDuration(property: colorAnimationDuration, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_dataBindingAttribute(property: dataBindingAttribute, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_dataBindingValueFunction(property: dataBindingValueFunction, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_dataStore(property: dataStore, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_enableFeatureZoom(property: enableFeatureZoom, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_enableKeyboardSupport(property: enableKeyboardSupport, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_enableMousePan(property: enableMousePan, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_enableMouseSupport(property: enableMouseSupport, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_enableMouseZoom(property: enableMouseZoom, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_enableTouchSupport(property: enableTouchSupport, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_markerData(property: markerData, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_mouseClickThreshold(property: mouseClickThreshold, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_onFeatureClick(property: onFeatureClick, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_onFeatureOver(property: onFeatureOver, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_series(property: series, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_shapeData(property: shapeData, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_showTooltips(property: showTooltips, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  }
  
}

