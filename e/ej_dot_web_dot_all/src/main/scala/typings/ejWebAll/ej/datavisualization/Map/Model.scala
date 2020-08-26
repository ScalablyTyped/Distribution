package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Fires, on clicking the map.
    */
  var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
  /** Specifies the background color for map
    * @Default {transparent}
    */
  var background: js.UndefOr[String] = js.native
  /** Specifies the index of the map to determine the shape layer to be displayed
    * @Default {0}
    */
  var baseMapIndex: js.UndefOr[Double] = js.native
  /** Triggered while rendering the each bubbles in maps.
    */
  var bubbleRendering: js.UndefOr[js.Function1[/* e */ BubbleRenderingEventArgs, Unit]] = js.native
  /** Specify the center position where map should be displayed
    * @Default {[0,0]}
    */
  var centerPosition: js.UndefOr[js.Any] = js.native
  /** Fires before rendering the data labels. This event is triggered for each data label in the layers. You can use this event to add custom text in data labels.
    */
  var displayTextRendering: js.UndefOr[js.Function1[/* e */ DisplayTextRenderingEventArgs, Unit]] = js.native
  /** Fires, on double clicking the map.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.native
  /** Controls the selection through dragging
    * @Default {false}
    */
  var draggingOnSelection: js.UndefOr[Boolean] = js.native
  /** Enables or Disables the map animation
    * @Default {false}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  /** Enables or Disables the animation for layer change in map
    * @Default {false}
    */
  var enableLayerChangeAnimation: js.UndefOr[Boolean] = js.native
  /** Enables or Disables the map panning
    * @Default {true}
    */
  var enablePan: js.UndefOr[Boolean] = js.native
  /** Enables or Disables right to left(RTL) support for maps.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Determines whether map need to resize when container is resized
    * @Default {true}
    */
  var enableResize: js.UndefOr[Boolean] = js.native
  /** Determines whether map need to resize when container is resized
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Layer for holding the map shapes
    */
  var layers: js.UndefOr[js.Array[Layer]] = js.native
  /** Fires on clicking the legend item.
    */
  var legendItemClick: js.UndefOr[js.Function1[/* e */ LegendItemClickEventArgs, Unit]] = js.native
  /** Triggered while rendering the each legend in maps.
    */
  var legendItemRendering: js.UndefOr[js.Function1[/* e */ LegendItemRenderingEventArgs, Unit]] = js.native
  /** Name of the culture based on which map should be localized. Labels are localized with respect to the culture name.String type properties like template text are not localized
    * automatically. Provide localized text as value to string type properties.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Triggers while entering the hovered marker shape.
    */
  var markerEnter: js.UndefOr[js.Function1[/* e */ MarkerEnterEventArgs, Unit]] = js.native
  /** Triggers while leaving the hovered marker shape.
    */
  var markerLeave: js.UndefOr[js.Function1[/* e */ MarkerLeaveEventArgs, Unit]] = js.native
  /** Triggered on selecting the map markers.
    */
  var markerSelected: js.UndefOr[js.Function1[/* e */ MarkerSelectedEventArgs, Unit]] = js.native
  /** Triggers while leaving the hovered map shape
    */
  var mouseleave: js.UndefOr[js.Function1[/* e */ MouseleaveEventArgs, Unit]] = js.native
  /** Triggers while hovering the map shape.
    */
  var mouseover: js.UndefOr[js.Function1[/* e */ MouseoverEventArgs, Unit]] = js.native
  /** Enables or Disables the navigation control for map to perform zooming and panning on map shapes.
    */
  var navigationControl: js.UndefOr[NavigationControl] = js.native
  /** Fires before loading the map.
    */
  var onLoad: js.UndefOr[js.Function1[/* e */ OnLoadEventArgs, Unit]] = js.native
  /** Triggers once map render completed.
    */
  var onRenderComplete: js.UndefOr[js.Function1[/* e */ OnRenderCompleteEventArgs, Unit]] = js.native
  /** Triggers when map panning ends.
    */
  var panned: js.UndefOr[js.Function1[/* e */ PannedEventArgs, Unit]] = js.native
  /** Triggers after refreshing the map items.
    */
  var refreshed: js.UndefOr[js.Function1[/* e */ RefreshedEventArgs, Unit]] = js.native
  /** Fires, on right clicking the map.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.native
  /** Triggered while rendering the each shapes in maps.
    */
  var shapeRendering: js.UndefOr[js.Function1[/* e */ ShapeRenderingEventArgs, Unit]] = js.native
  /** Triggered on selecting the map shapes.
    */
  var shapeSelected: js.UndefOr[js.Function1[/* e */ ShapeSelectedEventArgs, Unit]] = js.native
  /** Enables or Disables the Zooming for map.
    */
  var zoomSettings: js.UndefOr[ZoomSettings] = js.native
  /** Triggered when map is zoomed-in.
    */
  var zoomedIn: js.UndefOr[js.Function1[/* e */ ZoomedInEventArgs, Unit]] = js.native
  /** Triggers when map is zoomed out.
    */
  var zoomedOut: js.UndefOr[js.Function1[/* e */ ZoomedOutEventArgs, Unit]] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
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
    def setClick(value: /* e */ ClickEventArgs => Unit): Self = this.set("Click", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClick: Self = this.set("Click", js.undefined)
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBaseMapIndex(value: Double): Self = this.set("baseMapIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseMapIndex: Self = this.set("baseMapIndex", js.undefined)
    @scala.inline
    def setBubbleRendering(value: /* e */ BubbleRenderingEventArgs => Unit): Self = this.set("bubbleRendering", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBubbleRendering: Self = this.set("bubbleRendering", js.undefined)
    @scala.inline
    def setCenterPosition(value: js.Any): Self = this.set("centerPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterPosition: Self = this.set("centerPosition", js.undefined)
    @scala.inline
    def setDisplayTextRendering(value: /* e */ DisplayTextRenderingEventArgs => Unit): Self = this.set("displayTextRendering", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDisplayTextRendering: Self = this.set("displayTextRendering", js.undefined)
    @scala.inline
    def setDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = this.set("doubleClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDoubleClick: Self = this.set("doubleClick", js.undefined)
    @scala.inline
    def setDraggingOnSelection(value: Boolean): Self = this.set("draggingOnSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggingOnSelection: Self = this.set("draggingOnSelection", js.undefined)
    @scala.inline
    def setEnableAnimation(value: Boolean): Self = this.set("enableAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAnimation: Self = this.set("enableAnimation", js.undefined)
    @scala.inline
    def setEnableLayerChangeAnimation(value: Boolean): Self = this.set("enableLayerChangeAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableLayerChangeAnimation: Self = this.set("enableLayerChangeAnimation", js.undefined)
    @scala.inline
    def setEnablePan(value: Boolean): Self = this.set("enablePan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePan: Self = this.set("enablePan", js.undefined)
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    @scala.inline
    def setEnableResize(value: Boolean): Self = this.set("enableResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableResize: Self = this.set("enableResize", js.undefined)
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    @scala.inline
    def setLayersVarargs(value: Layer*): Self = this.set("layers", js.Array(value :_*))
    @scala.inline
    def setLayers(value: js.Array[Layer]): Self = this.set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    @scala.inline
    def setLegendItemClick(value: /* e */ LegendItemClickEventArgs => Unit): Self = this.set("legendItemClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLegendItemClick: Self = this.set("legendItemClick", js.undefined)
    @scala.inline
    def setLegendItemRendering(value: /* e */ LegendItemRenderingEventArgs => Unit): Self = this.set("legendItemRendering", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLegendItemRendering: Self = this.set("legendItemRendering", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMarkerEnter(value: /* e */ MarkerEnterEventArgs => Unit): Self = this.set("markerEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMarkerEnter: Self = this.set("markerEnter", js.undefined)
    @scala.inline
    def setMarkerLeave(value: /* e */ MarkerLeaveEventArgs => Unit): Self = this.set("markerLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMarkerLeave: Self = this.set("markerLeave", js.undefined)
    @scala.inline
    def setMarkerSelected(value: /* e */ MarkerSelectedEventArgs => Unit): Self = this.set("markerSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMarkerSelected: Self = this.set("markerSelected", js.undefined)
    @scala.inline
    def setMouseleave(value: /* e */ MouseleaveEventArgs => Unit): Self = this.set("mouseleave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMouseleave: Self = this.set("mouseleave", js.undefined)
    @scala.inline
    def setMouseover(value: /* e */ MouseoverEventArgs => Unit): Self = this.set("mouseover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMouseover: Self = this.set("mouseover", js.undefined)
    @scala.inline
    def setNavigationControl(value: NavigationControl): Self = this.set("navigationControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationControl: Self = this.set("navigationControl", js.undefined)
    @scala.inline
    def setOnLoad(value: /* e */ OnLoadEventArgs => Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    @scala.inline
    def setOnRenderComplete(value: /* e */ OnRenderCompleteEventArgs => Unit): Self = this.set("onRenderComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRenderComplete: Self = this.set("onRenderComplete", js.undefined)
    @scala.inline
    def setPanned(value: /* e */ PannedEventArgs => Unit): Self = this.set("panned", js.Any.fromFunction1(value))
    @scala.inline
    def deletePanned: Self = this.set("panned", js.undefined)
    @scala.inline
    def setRefreshed(value: /* e */ RefreshedEventArgs => Unit): Self = this.set("refreshed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRefreshed: Self = this.set("refreshed", js.undefined)
    @scala.inline
    def setRightClick(value: /* e */ RightClickEventArgs => Unit): Self = this.set("rightClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRightClick: Self = this.set("rightClick", js.undefined)
    @scala.inline
    def setShapeRendering(value: /* e */ ShapeRenderingEventArgs => Unit): Self = this.set("shapeRendering", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShapeRendering: Self = this.set("shapeRendering", js.undefined)
    @scala.inline
    def setShapeSelected(value: /* e */ ShapeSelectedEventArgs => Unit): Self = this.set("shapeSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShapeSelected: Self = this.set("shapeSelected", js.undefined)
    @scala.inline
    def setZoomSettings(value: ZoomSettings): Self = this.set("zoomSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomSettings: Self = this.set("zoomSettings", js.undefined)
    @scala.inline
    def setZoomedIn(value: /* e */ ZoomedInEventArgs => Unit): Self = this.set("zoomedIn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteZoomedIn: Self = this.set("zoomedIn", js.undefined)
    @scala.inline
    def setZoomedOut(value: /* e */ ZoomedOutEventArgs => Unit): Self = this.set("zoomedOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteZoomedOut: Self = this.set("zoomedOut", js.undefined)
  }
  
}

