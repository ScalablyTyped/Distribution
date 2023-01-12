package typings.dynmap.mod

import typings.dynmap.dynmapBooleans.`false`
import typings.dynmap.dynmapBooleans.`true`
import typings.dynmap.dynmapStrings._empty
import typings.leaflet.mod.DivIconOptions
import typings.leaflet.mod.DivIcon_
import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.MarkerOptions
import typings.leaflet.mod.Marker_
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletAugmentingMod {
  
  @JSImport("leaflet", "CustomIcon")
  @js.native
  open class CustomIcon () extends DivIcon_ {
    def this(options: CustomIconOptions) = this()
    
    def initialize(options: DivIconOptions): js.Object = js.native
    
    @JSName("options")
    var options_CustomIcon: CustomIconOptions = js.native
  }
  
  @JSImport("leaflet", "CustomMarker")
  @js.native
  open class CustomMarker protected () extends Marker_[CustomMarkerOptions] {
    def this(latlng: LatLngExpression) = this()
    def this(latlng: LatLngExpression, options: CustomMarkerOptions) = this()
    
    @JSName("options")
    var options_CustomMarker: CustomMarkerOptions = js.native
  }
  
  trait CustomIconOptions
    extends StObject
       with DivIconOptions {
    
    @JSName("className")
    var className_CustomIconOptions: _empty
    
    def elementCreator(): HTMLDivElement
    
    def shadowCreator(): Unit
  }
  object CustomIconOptions {
    
    inline def apply(elementCreator: () => HTMLDivElement, shadowCreator: () => Unit): CustomIconOptions = {
      val __obj = js.Dynamic.literal(className = "", elementCreator = js.Any.fromFunction0(elementCreator), shadowCreator = js.Any.fromFunction0(shadowCreator))
      __obj.asInstanceOf[CustomIconOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomIconOptions] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: _empty): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setElementCreator(value: () => HTMLDivElement): Self = StObject.set(x, "elementCreator", js.Any.fromFunction0(value))
      
      inline def setShadowCreator(value: () => Unit): Self = StObject.set(x, "shadowCreator", js.Any.fromFunction0(value))
    }
  }
  
  trait CustomMarkerOptions
    extends StObject
       with MarkerOptions {
    
    var clickable: `true`
    
    @JSName("draggable")
    var draggable_CustomMarkerOptions: `false`
    
    var elementCreator: Unit
    
    @JSName("icon")
    var icon_CustomMarkerOptions: CustomIcon
    
    var shadowCreator: Unit
  }
  object CustomMarkerOptions {
    
    inline def apply(elementCreator: Unit, icon: CustomIcon, shadowCreator: Unit): CustomMarkerOptions = {
      val __obj = js.Dynamic.literal(clickable = true, draggable = false, elementCreator = elementCreator.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], shadowCreator = shadowCreator.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomMarkerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomMarkerOptions] (val x: Self) extends AnyVal {
      
      inline def setClickable(value: `true`): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setDraggable(value: `false`): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setElementCreator(value: Unit): Self = StObject.set(x, "elementCreator", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: CustomIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setShadowCreator(value: Unit): Self = StObject.set(x, "shadowCreator", value.asInstanceOf[js.Any])
    }
  }
}
