package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Photo extends StObject {
  
  /**
    * Attribution text to be displayed for this photo.
    */
  var attributions: js.Array[PhotoAttribution] = js.native
  
  /**
    * Returns the image URL corresponding to the specified options.
    */
  def getURI(): String = js.native
  def getURI(options: PhotoOptions): String = js.native
  
  /**
    * The height of the photo in pixels.
    */
  var heightPx: Double = js.native
  
  /**
    * The width of the photo in pixels.
    */
  var widthPx: Double = js.native
}
