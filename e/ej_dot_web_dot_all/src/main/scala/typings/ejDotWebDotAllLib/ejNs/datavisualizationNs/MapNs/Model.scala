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

object Model {
  @scala.inline
  def apply(
    Click: js.Function1[/* e */ ClickEventArgs, scala.Unit] = null,
    background: java.lang.String = null,
    baseMapIndex: scala.Int | scala.Double = null,
    bubbleRendering: js.Function1[/* e */ BubbleRenderingEventArgs, scala.Unit] = null,
    centerPosition: js.Any = null,
    displayTextRendering: js.Function1[/* e */ DisplayTextRenderingEventArgs, scala.Unit] = null,
    doubleClick: js.Function1[/* e */ DoubleClickEventArgs, scala.Unit] = null,
    draggingOnSelection: js.UndefOr[scala.Boolean] = js.undefined,
    enableAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    enableLayerChangeAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    enablePan: js.UndefOr[scala.Boolean] = js.undefined,
    enableRTL: js.UndefOr[scala.Boolean] = js.undefined,
    enableResize: js.UndefOr[scala.Boolean] = js.undefined,
    isResponsive: js.UndefOr[scala.Boolean] = js.undefined,
    layers: js.Array[Layer] = null,
    legendItemClick: js.Function1[/* e */ LegendItemClickEventArgs, scala.Unit] = null,
    legendItemRendering: js.Function1[/* e */ LegendItemRenderingEventArgs, scala.Unit] = null,
    locale: java.lang.String = null,
    markerEnter: js.Function1[/* e */ MarkerEnterEventArgs, scala.Unit] = null,
    markerLeave: js.Function1[/* e */ MarkerLeaveEventArgs, scala.Unit] = null,
    markerSelected: js.Function1[/* e */ MarkerSelectedEventArgs, scala.Unit] = null,
    mouseleave: js.Function1[/* e */ MouseleaveEventArgs, scala.Unit] = null,
    mouseover: js.Function1[/* e */ MouseoverEventArgs, scala.Unit] = null,
    navigationControl: NavigationControl = null,
    onLoad: js.Function1[/* e */ OnLoadEventArgs, scala.Unit] = null,
    onRenderComplete: js.Function1[/* e */ OnRenderCompleteEventArgs, scala.Unit] = null,
    panned: js.Function1[/* e */ PannedEventArgs, scala.Unit] = null,
    refreshed: js.Function1[/* e */ RefreshedEventArgs, scala.Unit] = null,
    rightClick: js.Function1[/* e */ RightClickEventArgs, scala.Unit] = null,
    shapeRendering: js.Function1[/* e */ ShapeRenderingEventArgs, scala.Unit] = null,
    shapeSelected: js.Function1[/* e */ ShapeSelectedEventArgs, scala.Unit] = null,
    zoomSettings: ZoomSettings = null,
    zoomedIn: js.Function1[/* e */ ZoomedInEventArgs, scala.Unit] = null,
    zoomedOut: js.Function1[/* e */ ZoomedOutEventArgs, scala.Unit] = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (Click != null) __obj.updateDynamic("Click")(Click)
    if (background != null) __obj.updateDynamic("background")(background)
    if (baseMapIndex != null) __obj.updateDynamic("baseMapIndex")(baseMapIndex.asInstanceOf[js.Any])
    if (bubbleRendering != null) __obj.updateDynamic("bubbleRendering")(bubbleRendering)
    if (centerPosition != null) __obj.updateDynamic("centerPosition")(centerPosition)
    if (displayTextRendering != null) __obj.updateDynamic("displayTextRendering")(displayTextRendering)
    if (doubleClick != null) __obj.updateDynamic("doubleClick")(doubleClick)
    if (!js.isUndefined(draggingOnSelection)) __obj.updateDynamic("draggingOnSelection")(draggingOnSelection)
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation)
    if (!js.isUndefined(enableLayerChangeAnimation)) __obj.updateDynamic("enableLayerChangeAnimation")(enableLayerChangeAnimation)
    if (!js.isUndefined(enablePan)) __obj.updateDynamic("enablePan")(enablePan)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enableResize)) __obj.updateDynamic("enableResize")(enableResize)
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (layers != null) __obj.updateDynamic("layers")(layers)
    if (legendItemClick != null) __obj.updateDynamic("legendItemClick")(legendItemClick)
    if (legendItemRendering != null) __obj.updateDynamic("legendItemRendering")(legendItemRendering)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (markerEnter != null) __obj.updateDynamic("markerEnter")(markerEnter)
    if (markerLeave != null) __obj.updateDynamic("markerLeave")(markerLeave)
    if (markerSelected != null) __obj.updateDynamic("markerSelected")(markerSelected)
    if (mouseleave != null) __obj.updateDynamic("mouseleave")(mouseleave)
    if (mouseover != null) __obj.updateDynamic("mouseover")(mouseover)
    if (navigationControl != null) __obj.updateDynamic("navigationControl")(navigationControl)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    if (onRenderComplete != null) __obj.updateDynamic("onRenderComplete")(onRenderComplete)
    if (panned != null) __obj.updateDynamic("panned")(panned)
    if (refreshed != null) __obj.updateDynamic("refreshed")(refreshed)
    if (rightClick != null) __obj.updateDynamic("rightClick")(rightClick)
    if (shapeRendering != null) __obj.updateDynamic("shapeRendering")(shapeRendering)
    if (shapeSelected != null) __obj.updateDynamic("shapeSelected")(shapeSelected)
    if (zoomSettings != null) __obj.updateDynamic("zoomSettings")(zoomSettings)
    if (zoomedIn != null) __obj.updateDynamic("zoomedIn")(zoomedIn)
    if (zoomedOut != null) __obj.updateDynamic("zoomedOut")(zoomedOut)
    __obj.asInstanceOf[Model]
  }
}

