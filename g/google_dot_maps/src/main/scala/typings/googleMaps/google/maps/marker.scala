package typings.googleMaps.google.maps

import typings.std.AddEventListenerOptions
import typings.std.Element
import typings.std.Event
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object marker {
  
  type AdvancedMarkerClickEvent = Event
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.googleMaps.google.maps.marker.AdvancedMarkerElementOptions because var conflicts: title. Inlined collisionBehavior, content, gmpDraggable, map, position, zIndex */ @js.native
  trait AdvancedMarkerElement
    extends StObject
       with HTMLElement {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /**
      * Adds the given listener function to the given event name in the Maps
      * Eventing system.
      * @param eventName Observed event.
      * @param handler Function to handle events.
      */
    def addListener(eventName: String, handler: js.Function): MapsEventListener = js.native
    
    /**
      * See {@link
      * google.maps.marker.AdvancedMarkerElementOptions.collisionBehavior}.
      */
    var collisionBehavior: js.UndefOr[CollisionBehavior | Null] = js.native
    
    /**
      * See {@link google.maps.marker.AdvancedMarkerElementOptions.content}.
      */
    var content: js.UndefOr[Element | Null] = js.native
    
    /**
      * This field is read-only. The DOM Element backing the view.
      */
    var element: HTMLElement = js.native
    
    /**
      * See {@link google.maps.marker.AdvancedMarkerElementOptions.gmpDraggable}.
      */
    var gmpDraggable: js.UndefOr[Boolean | Null] = js.native
    
    /**
      * See {@link google.maps.marker.AdvancedMarkerElementOptions.map}.
      */
    var map: js.UndefOr[Map | Null] = js.native
    
    /**
      * See {@link google.maps.marker.AdvancedMarkerElementOptions.position}.
      */
    var position: js.UndefOr[LatLng | LatLngAltitudeLiteral | LatLngLiteral | Null] = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    
    /**
      * See {@link google.maps.marker.AdvancedMarkerElementOptions.zIndex}.
      */
    var zIndex: js.UndefOr[Double | Null] = js.native
  }
  
  trait AdvancedMarkerElementOptions extends StObject {
    
    /**
      * An enumeration specifying how an <code>AdvancedMarkerElement</code>
      * should behave when it collides with another
      * <code>AdvancedMarkerElement</code> or with the basemap labels on a vector
      * map. <p><strong>Note</strong>: <code>AdvancedMarkerElement</code> to
      * <code>AdvancedMarkerElement</code> collision works on both raster and
      * vector maps, however, <code>AdvancedMarkerElement</code> to base
      * map&#39;s label collision only works on vector maps.
      */
    var collisionBehavior: js.UndefOr[Null | CollisionBehavior] = js.undefined
    
    /**
      * The DOM Element backing the visual of an
      * <code>AdvancedMarkerElement</code>. <p><strong>Note</strong>:
      * <code>AdvancedMarkerElement</code> does not clone the passed-in DOM
      * element. Once the DOM element is passed to an
      * <code>AdvancedMarkerElement</code>, passing the same DOM element to
      * another <code>AdvancedMarkerElement</code> will move the DOM element and
      * cause the previous <code>AdvancedMarkerElement</code> to look empty.
      * @defaultValue {@link google.maps.marker.PinElement.element}
      */
    var content: js.UndefOr[Null | Element] = js.undefined
    
    /**
      * If <code>true</code>, the <code>AdvancedMarkerElement</code> can be
      * dragged. <p><strong>Note</strong>: <code>AdvancedMarkerElement</code>
      * with altitude is not draggable.
      * @defaultValue <code>false</code>
      */
    var gmpDraggable: js.UndefOr[Null | Boolean] = js.undefined
    
    /**
      * Map on which to display the <code>AdvancedMarkerElement</code>. The map
      * is required to display the <code>AdvancedMarkerElement</code> and can be
      * provided by setting {@link google.maps.marker.AdvancedMarkerElement.map}
      * if not provided at the construction.
      */
    var map: js.UndefOr[Null | Map] = js.undefined
    
    /**
      * Sets the <code>AdvancedMarkerElement</code>&#39;s position. An
      * <code>AdvancedMarkerElement</code> may be constructed without a position,
      * but will not be displayed until its position is provided - for example,
      * by a user&#39;s actions or choices. An
      * <code>AdvancedMarkerElement</code>&#39;s position can be provided by
      * setting {@link google.maps.marker.AdvancedMarkerElement.position} if not
      * provided at the construction. <p><strong>Note</strong>:
      * <code>AdvancedMarkerElement</code> with altitude is only supported on
      * vector maps.
      */
    var position: js.UndefOr[Null | LatLng | LatLngLiteral] = js.undefined
    
    /**
      * Rollover text. If provided, an accessibility text (e.g. for use with
      * screen readers) will be added to the <code>AdvancedMarkerElement</code>
      * with the provided value.
      */
    var title: js.UndefOr[Null | String] = js.undefined
    
    /**
      * All <code>AdvancedMarkerElement</code>s are displayed on the map in order
      * of their zIndex, with higher values displaying in front of
      * <code>AdvancedMarkerElement</code>s with lower values. By default,
      * <code>AdvancedMarkerElement</code>s are displayed according to their
      * vertical position on screen, with lower
      * <code>AdvancedMarkerElement</code>s appearing in front of
      * <code>AdvancedMarkerElement</code>s farther up the screen. Note that
      * <code>zIndex</code> is also used to help determine relative priority
      * between {@link
      * google.maps.CollisionBehavior.OPTIONAL_AND_HIDES_LOWER_PRIORITY} Advanced
      * Markers. A higher <code>zIndex</code> value indicates higher priority.
      */
    var zIndex: js.UndefOr[Null | Double] = js.undefined
  }
  object AdvancedMarkerElementOptions {
    
    inline def apply(): AdvancedMarkerElementOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdvancedMarkerElementOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdvancedMarkerElementOptions] (val x: Self) extends AnyVal {
      
      inline def setCollisionBehavior(value: CollisionBehavior): Self = StObject.set(x, "collisionBehavior", value.asInstanceOf[js.Any])
      
      inline def setCollisionBehaviorNull: Self = StObject.set(x, "collisionBehavior", null)
      
      inline def setCollisionBehaviorUndefined: Self = StObject.set(x, "collisionBehavior", js.undefined)
      
      inline def setContent(value: Element): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setGmpDraggable(value: Boolean): Self = StObject.set(x, "gmpDraggable", value.asInstanceOf[js.Any])
      
      inline def setGmpDraggableNull: Self = StObject.set(x, "gmpDraggable", null)
      
      inline def setGmpDraggableUndefined: Self = StObject.set(x, "gmpDraggable", js.undefined)
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapNull: Self = StObject.set(x, "map", null)
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setPosition(value: LatLng | LatLngLiteral): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionNull: Self = StObject.set(x, "position", null)
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexNull: Self = StObject.set(x, "zIndex", null)
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait PinElement
    extends StObject
       with PinElementOptions {
    
    /**
      * Adds the given listener function to the given event name.
      */
    def addListener(eventName: String, handler: js.Function): MapsEventListener
    
    /**
      * This field is read-only. The DOM Element backing the view.
      */
    var element: HTMLElement
  }
  object PinElement {
    
    inline def apply(addListener: (String, js.Function) => MapsEventListener, element: HTMLElement): PinElement = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[PinElement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PinElement] (val x: Self) extends AnyVal {
      
      inline def setAddListener(value: (String, js.Function) => MapsEventListener): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    }
  }
  
  trait PinElementOptions extends StObject {
    
    /**
      * The background color of the pin shape. Supports any CSS <a
      * href="https://developer.mozilla.org/en-US/docs/Web/CSS/color_value">color
      * value</a>.
      */
    var background: js.UndefOr[Null | String] = js.undefined
    
    /**
      * The border color of the pin shape. Supports any CSS <a
      * href="https://developer.mozilla.org/en-US/docs/Web/CSS/color_value">color
      * value</a>.
      */
    var borderColor: js.UndefOr[Null | String] = js.undefined
    
    /**
      * The DOM element displayed in the pin.
      */
    var glyph: js.UndefOr[Null | String | Element | URL] = js.undefined
    
    /**
      * The color of the glyph. Supports any CSS <a
      * href="https://developer.mozilla.org/en-US/docs/Web/CSS/color_value">color
      * value</a>.
      */
    var glyphColor: js.UndefOr[Null | String] = js.undefined
    
    /**
      * The scale of the pin.
      * @defaultValue <code>1</code>
      */
    var scale: js.UndefOr[Null | Double] = js.undefined
  }
  object PinElementOptions {
    
    inline def apply(): PinElementOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PinElementOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PinElementOptions] (val x: Self) extends AnyVal {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundNull: Self = StObject.set(x, "background", null)
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorNull: Self = StObject.set(x, "borderColor", null)
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setGlyph(value: String | Element | URL): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
      
      inline def setGlyphColor(value: String): Self = StObject.set(x, "glyphColor", value.asInstanceOf[js.Any])
      
      inline def setGlyphColorNull: Self = StObject.set(x, "glyphColor", null)
      
      inline def setGlyphColorUndefined: Self = StObject.set(x, "glyphColor", js.undefined)
      
      inline def setGlyphNull: Self = StObject.set(x, "glyph", null)
      
      inline def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleNull: Self = StObject.set(x, "scale", null)
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    }
  }
}
