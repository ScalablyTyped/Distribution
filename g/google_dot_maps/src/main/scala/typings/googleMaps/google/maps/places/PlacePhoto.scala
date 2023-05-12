package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacePhoto extends StObject {
  
  /**
    * Returns the image URL corresponding to the specified options.
    */
  def getUrl(): String = js.native
  def getUrl(opts: PhotoOptions): String = js.native
  
  /**
    * The height of the photo in pixels.
    */
  var height: Double = js.native
  
  /**
    * Attribution text to be displayed for this photo.
    */
  var html_attributions: js.Array[String] = js.native
  
  /**
    * The width of the photo in pixels.
    */
  var width: Double = js.native
}
