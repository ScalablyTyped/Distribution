package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A structure representing a Marker icon image.
  */
trait Icon extends StObject {
  
  /**
    * The position at which to anchor an image in correspondence to the
    * location of the marker on the map. By default, the anchor is located
    * along the center point of the bottom of the image.
    */
  var anchor: js.UndefOr[Point | Null] = js.undefined
  
  /**
    * The origin of the label relative to the top-left corner of the icon
    * image, if a label is supplied by the marker. By default, the origin is
    * located in the center point of the image.
    */
  var labelOrigin: js.UndefOr[Point | Null] = js.undefined
  
  /**
    * The position of the image within a sprite, if any. By default, the origin
    * is located at the top left corner of the image <code>(0, 0)</code>.
    */
  var origin: js.UndefOr[Point | Null] = js.undefined
  
  /**
    * The size of the entire image after scaling, if any. Use this property to
    * stretch/shrink an image or a sprite.
    */
  var scaledSize: js.UndefOr[Size | Null] = js.undefined
  
  /**
    * The display size of the sprite or image. When using sprites, you must
    * specify the sprite size. If the size is not provided, it will be set when
    * the image loads.
    */
  var size: js.UndefOr[Size | Null] = js.undefined
  
  /**
    * The URL of the image or sprite sheet.
    */
  var url: String
}
object Icon {
  
  inline def apply(url: String): Icon = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  
  extension [Self <: Icon](x: Self) {
    
    inline def setAnchor(value: Point): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorNull: Self = StObject.set(x, "anchor", null)
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setLabelOrigin(value: Point): Self = StObject.set(x, "labelOrigin", value.asInstanceOf[js.Any])
    
    inline def setLabelOriginNull: Self = StObject.set(x, "labelOrigin", null)
    
    inline def setLabelOriginUndefined: Self = StObject.set(x, "labelOrigin", js.undefined)
    
    inline def setOrigin(value: Point): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginNull: Self = StObject.set(x, "origin", null)
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setScaledSize(value: Size): Self = StObject.set(x, "scaledSize", value.asInstanceOf[js.Any])
    
    inline def setScaledSizeNull: Self = StObject.set(x, "scaledSize", null)
    
    inline def setScaledSizeUndefined: Self = StObject.set(x, "scaledSize", js.undefined)
    
    inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeNull: Self = StObject.set(x, "size", null)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
