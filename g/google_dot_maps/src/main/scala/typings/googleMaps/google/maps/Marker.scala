package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Marker
  extends StObject
     with MVCObject {
  
  /**
    * Get the currently running animation.
    */
  def getAnimation(): js.UndefOr[Animation | Null] = js.native
  
  /**
    * Get the clickable status of the {@link google.maps.Marker}.
    */
  def getClickable(): Boolean = js.native
  
  /**
    * Get the mouse cursor type shown on hover.
    */
  def getCursor(): js.UndefOr[String | Null] = js.native
  
  /**
    * Get the draggable status of the {@link google.maps.Marker}.
    */
  def getDraggable(): Boolean = js.native
  
  /**
    * Get the icon of the {@link google.maps.Marker}. See {@link
    * google.maps.MarkerOptions.icon}.
    */
  def getIcon(): js.UndefOr[String | Icon | Null | Symbol] = js.native
  
  /**
    * Get the label of the {@link google.maps.Marker}. See {@link
    * google.maps.MarkerOptions.label}.
    */
  def getLabel(): js.UndefOr[MarkerLabel | Null | String] = js.native
  
  /**
    * Get the map or panaroama the {@link google.maps.Marker} is rendered on.
    */
  def getMap(): Map | Null | StreetViewPanorama = js.native
  
  /**
    * Get the opacity of the {@link google.maps.Marker}.
    */
  def getOpacity(): js.UndefOr[Double | Null] = js.native
  
  /**
    * Get the position of the {@link google.maps.Marker}.
    */
  def getPosition(): js.UndefOr[LatLng | Null] = js.native
  
  /**
    * Get the shape of the {@link google.maps.Marker} used for interaction.
    * See {@link google.maps.MarkerOptions.shape} and {@link
    * google.maps.MarkerShape}.
    */
  def getShape(): js.UndefOr[MarkerShape | Null] = js.native
  
  /**
    * Get the title of the {@link google.maps.Marker} tooltip. See {@link
    * google.maps.MarkerOptions.title}.
    */
  def getTitle(): js.UndefOr[String | Null] = js.native
  
  /**
    * Get the visibility of the {@link google.maps.Marker}.
    */
  def getVisible(): Boolean = js.native
  
  /**
    * Get the zIndex of the {@link google.maps.Marker}. See {@link
    * google.maps.MarkerOptions.zIndex}.
    */
  def getZIndex(): js.UndefOr[Double | Null] = js.native
  
  /**
    * Start an animation. Any ongoing animation will be cancelled. Currently
    * supported animations are: {@link google.maps.Animation.BOUNCE}, {@link
    * google.maps.Animation.DROP}. Passing in <code>null</code> will cause any
    * animation to stop.
    * @param animation The animation to play.
    */
  def setAnimation(): Unit = js.native
  def setAnimation(animation: Animation): Unit = js.native
  
  /**
    * Set if the {@link google.maps.Marker} is clickable.
    * @param flag If <code>true</code>, the Marker can be clicked.
    */
  def setClickable(flag: Boolean): Unit = js.native
  
  /**
    * Set the mouse cursor type shown on hover.
    * @param cursor Mouse cursor type.
    */
  def setCursor(): Unit = js.native
  def setCursor(cursor: String): Unit = js.native
  
  /**
    * Set if the {@link google.maps.Marker} is draggable.
    * @param flag If <code>true</code>, the Marker can be dragged.
    */
  def setDraggable(): Unit = js.native
  def setDraggable(flag: Boolean): Unit = js.native
  
  /**
    * Set the icon for the {@link google.maps.Marker}. See {@link
    * google.maps.MarkerOptions.icon}.
    */
  def setIcon(): Unit = js.native
  def setIcon(icon: String): Unit = js.native
  def setIcon(icon: Icon): Unit = js.native
  def setIcon(icon: Symbol): Unit = js.native
  
  /**
    * Set the label for the {@link google.maps.Marker}. See {@link
    * google.maps.MarkerOptions.label}.
    * @param label The label can either be a character string or a {@link
    *     google.maps.MarkerLabel} object.
    */
  def setLabel(): Unit = js.native
  def setLabel(label: String): Unit = js.native
  def setLabel(label: MarkerLabel): Unit = js.native
  
  /**
    * Renders the {@link google.maps.Marker} on the specified map or panorama.
    * If map is set to <code>null</code>, the marker will be removed.
    */
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  def setMap(map: StreetViewPanorama): Unit = js.native
  
  /**
    * Set the opacity of the {@link google.maps.Marker}.
    * @param opacity A number between 0.0, transparent, and 1.0, opaque.
    */
  def setOpacity(): Unit = js.native
  def setOpacity(opacity: Double): Unit = js.native
  
  /**
    * Set the options for the {@link google.maps.Marker}.
    */
  def setOptions(): Unit = js.native
  def setOptions(options: MarkerOptions): Unit = js.native
  
  /**
    * Set the postition for the {@link google.maps.Marker}.
    * @param latlng The new position.
    */
  def setPosition(): Unit = js.native
  def setPosition(latlng: LatLng): Unit = js.native
  def setPosition(latlng: LatLngLiteral): Unit = js.native
  
  /**
    * Set the shape of the {@link google.maps.Marker} used for interaction.
    * See {@link google.maps.MarkerOptions.shape} and {@link
    * google.maps.MarkerShape}.
    */
  def setShape(): Unit = js.native
  def setShape(shape: MarkerShape): Unit = js.native
  
  /**
    * Set the title of the {@link google.maps.Marker} tooltip. See {@link
    * google.maps.MarkerOptions.title}.
    */
  def setTitle(): Unit = js.native
  def setTitle(title: String): Unit = js.native
  
  /**
    * Set if the {@link google.maps.Marker} is visible.
    * @param visible If <code>true</code>, the Marker is visible
    */
  def setVisible(visible: Boolean): Unit = js.native
  
  /**
    * Set the zIndex of the {@link google.maps.Marker}. See {@link
    * google.maps.MarkerOptions.zIndex}.
    */
  def setZIndex(): Unit = js.native
  def setZIndex(zIndex: Double): Unit = js.native
}
