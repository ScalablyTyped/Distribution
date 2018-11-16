package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Model extends js.Object {
  /** Fires, on clicking the map.
               */
  var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, scala.Unit]] = js.undefined
  /** Specifies the background color for map
               * @Default {transparent}
               */
  var background: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the index of the map to determine the shape layer to be displayed
               * @Default {0}
               */
  var baseMapIndex: js.UndefOr[scala.Double] = js.undefined
  /** Triggered while rendering the each bubbles in maps.
               */
  var bubbleRendering: js.UndefOr[js.Function1[/* e */ BubbleRenderingEventArgs, scala.Unit]] = js.undefined
  /** Specify the center position where map should be displayed
               * @Default {[0,0]}
               */
  var centerPosition: js.UndefOr[js.Any] = js.undefined
  /** Fires before rendering the data labels. This event is triggered for each data label in the layers. You can use this event to add custom text in data labels.
               */
  var displayTextRendering: js.UndefOr[js.Function1[/* e */ DisplayTextRenderingEventArgs, scala.Unit]] = js.undefined
  /** Fires, on double clicking the map.
               */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, scala.Unit]] = js.undefined
  /** Controls the selection through dragging
               * @Default {false}
               */
  var draggingOnSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or Disables the map animation
               * @Default {false}
               */
  var enableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or Disables the animation for layer change in map
               * @Default {false}
               */
  var enableLayerChangeAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or Disables the map panning
               * @Default {true}
               */
  var enablePan: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or Disables right to left(RTL) support for maps.
               * @Default {false}
               */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Determines whether map need to resize when container is resized
               * @Default {true}
               */
  var enableResize: js.UndefOr[scala.Boolean] = js.undefined
  /** Determines whether map need to resize when container is resized
               * @Default {true}
               */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Layer for holding the map shapes
               */
  var layers: js.UndefOr[js.Array[Layer]] = js.undefined
  /** Fires on clicking the legend item.
               */
  var legendItemClick: js.UndefOr[js.Function1[/* e */ LegendItemClickEventArgs, scala.Unit]] = js.undefined
  /** Triggered while rendering the each legend in maps.
               */
  var legendItemRendering: js.UndefOr[js.Function1[/* e */ LegendItemRenderingEventArgs, scala.Unit]] = js.undefined
  /** Name of the culture based on which map should be localized. Labels are localized with respect to the culture name.String type properties like template text are not localized
               * automatically. Provide localized text as value to string type properties.
               * @Default {en-US}
               */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Triggers while entering the hovered marker shape.
               */
  var markerEnter: js.UndefOr[js.Function1[/* e */ MarkerEnterEventArgs, scala.Unit]] = js.undefined
  /** Triggers while leaving the hovered marker shape.
               */
  var markerLeave: js.UndefOr[js.Function1[/* e */ MarkerLeaveEventArgs, scala.Unit]] = js.undefined
  /** Triggered on selecting the map markers.
               */
  var markerSelected: js.UndefOr[js.Function1[/* e */ MarkerSelectedEventArgs, scala.Unit]] = js.undefined
  /** Triggers while leaving the hovered map shape
               */
  var mouseleave: js.UndefOr[js.Function1[/* e */ MouseleaveEventArgs, scala.Unit]] = js.undefined
  /** Triggers while hovering the map shape.
               */
  var mouseover: js.UndefOr[js.Function1[/* e */ MouseoverEventArgs, scala.Unit]] = js.undefined
  /** Enables or Disables the navigation control for map to perform zooming and panning on map shapes.
               */
  var navigationControl: js.UndefOr[NavigationControl] = js.undefined
  /** Fires before loading the map.
               */
  var onLoad: js.UndefOr[js.Function1[/* e */ OnLoadEventArgs, scala.Unit]] = js.undefined
  /** Triggers once map render completed.
               */
  var onRenderComplete: js.UndefOr[js.Function1[/* e */ OnRenderCompleteEventArgs, scala.Unit]] = js.undefined
  /** Triggers when map panning ends.
               */
  var panned: js.UndefOr[js.Function1[/* e */ PannedEventArgs, scala.Unit]] = js.undefined
  /** Triggers after refreshing the map items.
               */
  var refreshed: js.UndefOr[js.Function1[/* e */ RefreshedEventArgs, scala.Unit]] = js.undefined
  /** Fires, on right clicking the map.
               */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, scala.Unit]] = js.undefined
  /** Triggered while rendering the each shapes in maps.
               */
  var shapeRendering: js.UndefOr[js.Function1[/* e */ ShapeRenderingEventArgs, scala.Unit]] = js.undefined
  /** Triggered on selecting the map shapes.
               */
  var shapeSelected: js.UndefOr[js.Function1[/* e */ ShapeSelectedEventArgs, scala.Unit]] = js.undefined
  /** Enables or Disables the Zooming for map.
               */
  var zoomSettings: js.UndefOr[ZoomSettings] = js.undefined
  /** Triggered when map is zoomed-in.
               */
  var zoomedIn: js.UndefOr[js.Function1[/* e */ ZoomedInEventArgs, scala.Unit]] = js.undefined
  /** Triggers when map is zoomed out.
               */
  var zoomedOut: js.UndefOr[js.Function1[/* e */ ZoomedOutEventArgs, scala.Unit]] = js.undefined
}

