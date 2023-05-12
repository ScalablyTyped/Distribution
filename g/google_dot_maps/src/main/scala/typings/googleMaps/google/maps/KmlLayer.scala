package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KmlLayer
  extends StObject
     with MVCObject {
  
  /**
    * Get the default viewport for the layer being displayed.
    */
  def getDefaultViewport(): LatLngBounds | Null = js.native
  
  /**
    * Get the map on which the KML Layer is being rendered.
    */
  def getMap(): Map | Null = js.native
  
  /**
    * Get the metadata associated with this layer, as specified in the layer
    * markup.
    */
  def getMetadata(): KmlLayerMetadata | Null = js.native
  
  /**
    * Get the status of the layer, set once the requested document has loaded.
    */
  def getStatus(): KmlLayerStatus = js.native
  
  /**
    * Gets the URL of the KML file being displayed.
    */
  def getUrl(): String = js.native
  
  /**
    * Gets the z-index of the KML Layer.
    */
  def getZIndex(): Double = js.native
  
  /**
    * Renders the KML Layer on the specified map. If map is set to
    * <code>null</code>, the layer is removed.
    */
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  
  def setOptions(): Unit = js.native
  def setOptions(options: KmlLayerOptions): Unit = js.native
  
  /**
    * Sets the URL of the KML file to display.
    */
  def setUrl(url: String): Unit = js.native
  
  /**
    * Sets the z-index of the KML Layer.
    * @param zIndex The z-index to set.
    */
  def setZIndex(zIndex: Double): Unit = js.native
}
