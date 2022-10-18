package typings.googleMaps.google.maps

import typings.std.Element
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object marker {
  
  /**
    * Available only in the v=beta channel: https://goo.gle/3oAthT3.
    * Creates an <code>AdvancedMarkerView</code> with the options specified. If a
    * map is specified, the <code>AdvancedMarkerView</code> is added to the map
    * upon construction. Note that the position must be set for the
    * <code>AdvancedMarkerView</code> to display.
    */
  trait AdvancedMarkerView
    extends StObject
       with AdvancedMarkerViewOptions {
    
    /**
      * Adds the given listener function to the given event name.
      */
    def addListener(eventName: String, handler: js.Function): MapsEventListener
  }
  object AdvancedMarkerView {
    
    inline def apply(addListener: (String, js.Function) => MapsEventListener): AdvancedMarkerView = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener))
      __obj.asInstanceOf[AdvancedMarkerView]
    }
    
    extension [Self <: AdvancedMarkerView](x: Self) {
      
      inline def setAddListener(value: (String, js.Function) => MapsEventListener): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * Available only in the v=beta channel: https://goo.gle/3oAthT3.
    * Options for constructing an {@link google.maps.marker.AdvancedMarkerView}.
    */
  trait AdvancedMarkerViewOptions extends StObject {
    
    /**
      * An enumeration specifying how an <code>AdvancedMarkerView</code> should
      * behave when it collides with another <code>AdvancedMarkerView</code> or
      * with the basemap labels on a vector map. <p><strong>Note</strong>:
      * <code>AdvancedMarkerView</code> to <code>AdvancedMarkerView</code>
      * collision works on both raster and vector maps, however,
      * <code>AdvancedMarkerView</code> to base map&#39;s label collision only
      * works on vector maps.
      */
    var collisionBehavior: js.UndefOr[CollisionBehavior | Null] = js.undefined
    
    /**
      * The DOM Element backing the visual of an <code>AdvancedMarkerView</code>.
      * <p><strong>Note</strong>: <code>AdvancedMarkerView</code> does not clone
      * the passed-in DOM element. Once the DOM element is passed to an
      * <code>AdvancedMarkerView</code>, passing the same DOM element to another
      * <code>AdvancedMarkerView</code> will move the DOM element and cause the
      * previous <code>AdvancedMarkerView</code> to look empty.
      * @defaultValue {@link google.maps.marker.PinView.element}
      */
    var content: js.UndefOr[Element | Null] = js.undefined
    
    /**
      * If <code>true</code>, the <code>AdvancedMarkerView</code> can be dragged.
      * <p><strong>Note</strong>: <code>AdvancedMarkerView</code> with altitude
      * is not draggable.
      * @defaultValue <code>false</code>
      */
    var draggable: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * This Field is read-only. The DOM Element backing the view.
      */
    var element: js.UndefOr[Null | Element] = js.undefined
    
    /**
      * Map on which to display the <code>AdvancedMarkerView</code>. The map is
      * required to display the <code>AdvancedMarkerView</code> and can be
      * provided by setting {@link google.maps.marker.AdvancedMarkerView.map} if
      * not provided at the construction.
      */
    var map: js.UndefOr[Map | Null] = js.undefined
    
    /**
      * Sets the <code>AdvancedMarkerView</code>&#39;s position. An
      * <code>AdvancedMarkerView</code> may be constructed without a position,
      * but will not be displayed until its position is provided - for example,
      * by a user&#39;s actions or choices. An
      * <code>AdvancedMarkerView</code>&#39;s position can be provided by
      * setting {@link google.maps.marker.AdvancedMarkerView.position} if not
      * provided at the construction. <p><strong>Note</strong>:
      * <code>AdvancedMarkerView</code> with altitude is only supported on vector
      * maps.
      */
    var position: js.UndefOr[LatLng | Null | LatLngLiteral | LatLngAltitude | LatLngAltitudeLiteral] = js.undefined
    
    /**
      * Rollover text. If provided, an accessibility text (e.g. for use with
      * screen readers) will be added to the <code>AdvancedMarkerView</code> with
      * the provided value.
      */
    var title: js.UndefOr[String | Null] = js.undefined
    
    /**
      * All <code>AdvancedMarkerView</code>s are displayed on the map in order of
      * their zIndex, with higher values displaying in front of
      * <code>AdvancedMarkerView</code>s with lower values. By default,
      * <code>AdvancedMarkerView</code>s are displayed according to their
      * vertical position on screen, with lower <code>AdvancedMarkerView</code>s
      * appearing in front of <code>AdvancedMarkerView</code>s farther up the
      * screen. Note that <code>zIndex</code> is also used to help determine
      * relative priority between {@link
      * google.maps.CollisionBehavior.OPTIONAL_AND_HIDES_LOWER_PRIORITY} Advanced
      * Markers. A higher <code>zIndex</code> value indicates higher priority.
      */
    var zIndex: js.UndefOr[Double | Null] = js.undefined
  }
  object AdvancedMarkerViewOptions {
    
    inline def apply(): AdvancedMarkerViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdvancedMarkerViewOptions]
    }
    
    extension [Self <: AdvancedMarkerViewOptions](x: Self) {
      
      inline def setCollisionBehavior(value: CollisionBehavior): Self = StObject.set(x, "collisionBehavior", value.asInstanceOf[js.Any])
      
      inline def setCollisionBehaviorNull: Self = StObject.set(x, "collisionBehavior", null)
      
      inline def setCollisionBehaviorUndefined: Self = StObject.set(x, "collisionBehavior", js.undefined)
      
      inline def setContent(value: Element): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableNull: Self = StObject.set(x, "draggable", null)
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapNull: Self = StObject.set(x, "map", null)
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setPosition(value: LatLng | LatLngLiteral | LatLngAltitude | LatLngAltitudeLiteral): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
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
  
  /**
    * Available only in the v=beta channel: https://goo.gle/3oAthT3.
    * A <code>PinView</code> represents a DOM element that consists of a shape
    * and a glyph. The shape has the same balloon style as seen in the
    * default {@link google.maps.marker.AdvancedMarkerView}. The glyph is an
    * optional DOM element displayed in the balloon shape. A <code>PinView</code>
    * may have a different aspect ratio depending on its {@link
    * google.maps.marker.PinView.scale}.
    */
  trait PinView
    extends StObject
       with PinViewOptions {
    
    /**
      * Adds the given listener function to the given event name.
      */
    def addListener(eventName: String, handler: js.Function): MapsEventListener
  }
  object PinView {
    
    inline def apply(addListener: (String, js.Function) => MapsEventListener): PinView = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener))
      __obj.asInstanceOf[PinView]
    }
    
    extension [Self <: PinView](x: Self) {
      
      inline def setAddListener(value: (String, js.Function) => MapsEventListener): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * Available only in the v=beta channel: https://goo.gle/3oAthT3.
    * Options for creating a {@link google.maps.marker.PinView}.
    */
  trait PinViewOptions extends StObject {
    
    /**
      * The background color of the pin shape. Supports any CSS <a
      * href="https://developer.mozilla.org/en-US/docs/Web/CSS/color_value">color
      * value</a>.
      */
    var background: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The border color of the pin shape. Supports any CSS <a
      * href="https://developer.mozilla.org/en-US/docs/Web/CSS/color_value">color
      * value</a>.
      */
    var borderColor: js.UndefOr[String | Null] = js.undefined
    
    /**
      * This Field is read-only. The DOM Element backing the view.
      */
    var element: js.UndefOr[Null | Element] = js.undefined
    
    /**
      * The DOM element displayed in the pin.
      */
    var glyph: js.UndefOr[String | Null | Element | URL] = js.undefined
    
    /**
      * The color of the glyph. Supports any CSS <a
      * href="https://developer.mozilla.org/en-US/docs/Web/CSS/color_value">color
      * value</a>.
      */
    var glyphColor: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The scale of the pin.
      * @defaultValue <code>1</code>
      */
    var scale: js.UndefOr[Double | Null] = js.undefined
  }
  object PinViewOptions {
    
    inline def apply(): PinViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PinViewOptions]
    }
    
    extension [Self <: PinViewOptions](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundNull: Self = StObject.set(x, "background", null)
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorNull: Self = StObject.set(x, "borderColor", null)
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
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
