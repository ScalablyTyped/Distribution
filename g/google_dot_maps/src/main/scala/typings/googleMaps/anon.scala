package typings.googleMaps

import typings.googleMaps.google.maps.localContext.PlaceChooserLayoutMode
import typings.googleMaps.google.maps.localContext.PlaceChooserPosition
import typings.googleMaps.google.maps.localContext.PlaceDetailsLayoutMode
import typings.googleMaps.google.maps.localContext.PlaceDetailsPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DefaultLayoutMode extends StObject {
    
    var defaultLayoutMode: PlaceChooserLayoutMode
    
    var defaultPosition: PlaceChooserPosition | Null
  }
  object DefaultLayoutMode {
    
    inline def apply(defaultLayoutMode: PlaceChooserLayoutMode): DefaultLayoutMode = {
      val __obj = js.Dynamic.literal(defaultLayoutMode = defaultLayoutMode.asInstanceOf[js.Any], defaultPosition = null)
      __obj.asInstanceOf[DefaultLayoutMode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultLayoutMode] (val x: Self) extends AnyVal {
      
      inline def setDefaultLayoutMode(value: PlaceChooserLayoutMode): Self = StObject.set(x, "defaultLayoutMode", value.asInstanceOf[js.Any])
      
      inline def setDefaultPosition(value: PlaceChooserPosition): Self = StObject.set(x, "defaultPosition", value.asInstanceOf[js.Any])
      
      inline def setDefaultPositionNull: Self = StObject.set(x, "defaultPosition", null)
    }
  }
  
  trait DefaultPosition extends StObject {
    
    var defaultLayoutMode: PlaceDetailsLayoutMode
    
    var defaultPosition: PlaceDetailsPosition | Null
  }
  object DefaultPosition {
    
    inline def apply(defaultLayoutMode: PlaceDetailsLayoutMode): DefaultPosition = {
      val __obj = js.Dynamic.literal(defaultLayoutMode = defaultLayoutMode.asInstanceOf[js.Any], defaultPosition = null)
      __obj.asInstanceOf[DefaultPosition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultPosition] (val x: Self) extends AnyVal {
      
      inline def setDefaultLayoutMode(value: PlaceDetailsLayoutMode): Self = StObject.set(x, "defaultLayoutMode", value.asInstanceOf[js.Any])
      
      inline def setDefaultPosition(value: PlaceDetailsPosition): Self = StObject.set(x, "defaultPosition", value.asInstanceOf[js.Any])
      
      inline def setDefaultPositionNull: Self = StObject.set(x, "defaultPosition", null)
    }
  }
  
  trait IsHighlighted extends StObject {
    
    var isHighlighted: Boolean
    
    var isSelected: Boolean
  }
  object IsHighlighted {
    
    inline def apply(isHighlighted: Boolean, isSelected: Boolean): IsHighlighted = {
      val __obj = js.Dynamic.literal(isHighlighted = isHighlighted.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsHighlighted]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsHighlighted] (val x: Self) extends AnyVal {
      
      inline def setIsHighlighted(value: Boolean): Self = StObject.set(x, "isHighlighted", value.asInstanceOf[js.Any])
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    }
  }
}
