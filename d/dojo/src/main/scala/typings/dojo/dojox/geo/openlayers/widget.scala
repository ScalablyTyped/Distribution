package typings.dojo.dojox.geo.openlayers

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit._Widget
import typings.dojo.dojoStrings.baseLayerType
import typings.dojo.dojoStrings.initialLocation
import typings.dojo.dojoStrings.map
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.touchHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.geo.openlayers.widget")
@js.native
object widget extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/widget/Map.html
    *
    * A widget version of the dojox.geo.openlayers.Map component.
    * The dojox.geo.openlayers.widget.Map widget is the widget
    * version of the dojox.geo.openlayers.Map component.
    * With this widget, user can specify some attributes in the markup such as
    *
    * baseLayerType: The type of the base layer. Permitted values are
    * initialLocation: The initial location as for the dojox.geo.openlayers.Map.fitTo method
    * touchHandler: Tells if we attach touch handler or not.
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  @js.native
  class Map () extends _Widget {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      * Base layer type as defined in dojox.geo.openlayer.BaseLayerType. Can be one of:
      *
      * OSM
      * WMS
      * Google
      * VirtualEarth
      * Yahoo
      * ArcGIS
      *
      */
    var baseLayerType: String = js.native
    /**
      * The part of the map shown at startup time. It is the string description of the location shown at
      * startup time. Format is the same as for the dojox.geo.openlayers.widget.Map.fitTo
      * method.
      *
      * {
      *     bounds: [ulx, uly, lrx, lry]
      * }
      * The map is fit on the specified bounds expressed as decimal degrees latitude and longitude.
      *
      * The bounds are defined with their upper left and lower right corners coordinates.
      *
      * {
      *     position: [longitude, latitude],
      *     extent: degrees
      * }
      * The map is fit on the specified position showing the extent <extent> around
      *
      * the specified center position.
      *
      */
    var initialLocation: String = js.native
    /**
      * The underlying dojox/geo/openlayers/Map object.
      *
      */
    var map: js.Object = js.native
    /**
      * HTML style attributes as cssText string or name/value hash
      *
      */
    @JSName("style")
    var style_Map: String = js.native
    /**
      * Tells if the touch handler should be attached to the map or not.
      * Touch handler handles touch events so that the widget can be used
      * on mobile applications.
      *
      */
    var touchHandler: Boolean = js.native
    @JSName("get")
    def get_baseLayerType(property: baseLayerType): String = js.native
    @JSName("get")
    def get_initialLocation(property: initialLocation): String = js.native
    @JSName("get")
    def get_map(property: map): js.Object = js.native
    @JSName("get")
    def get_touchHandler(property: touchHandler): Boolean = js.native
    /**
      * Resize the widget.
      * Resize the domNode and the widget to the dimensions of a box of the following form:
      * { l: 50, t: 200, w: 300: h: 150 }
      *
      * @param b               OptionalIf passed, denotes the new size of the widget.Can be either nothing (widget adapts to the div),an Object describing a box, or a Number representing the width.
      * @param h               OptionalThe new height. Requires that a width has been specified in the first parameter.
      */
    def resize(b: js.Object, h: Double): Unit = js.native
    /**
      * Resize the widget.
      * Resize the domNode and the widget to the dimensions of a box of the following form:
      * { l: 50, t: 200, w: 300: h: 150 }
      *
      * @param b               OptionalIf passed, denotes the new size of the widget.Can be either nothing (widget adapts to the div),an Object describing a box, or a Number representing the width.
      * @param h               OptionalThe new height. Requires that a width has been specified in the first parameter.
      */
    def resize(b: Double, h: Double): Unit = js.native
    @JSName("set")
    def set_baseLayerType(property: baseLayerType, value: String): Unit = js.native
    @JSName("set")
    def set_initialLocation(property: initialLocation, value: String): Unit = js.native
    @JSName("set")
    def set_map(property: map, value: js.Object): Unit = js.native
    @JSName("set")
    def set_style(property: style, value: String): Unit = js.native
    @JSName("set")
    def set_touchHandler(property: touchHandler, value: Boolean): Unit = js.native
    @JSName("watch")
    def watch_baseLayerType(
      property: baseLayerType,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[String], 
          /* newValue */ js.UndefOr[String], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_initialLocation(
      property: initialLocation,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[String], 
          /* newValue */ js.UndefOr[String], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_map(
      property: map,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[js.Object], 
          /* newValue */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_touchHandler(
      property: touchHandler,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Boolean], 
          /* newValue */ js.UndefOr[Boolean], 
          Unit
        ]
    ): Anon_Unwatch = js.native
  }
  
}

