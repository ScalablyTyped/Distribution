package typings.googleMarkerclustererplus

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngBounds
import typings.googlemaps.google.maps.Map
import typings.googlemaps.google.maps.Marker
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cluster extends js.Object {
  /**
    * Adds a marker to the cluster.
    *
    * @param marker The marker to be added.
    * @return True if the marker was added.
    * @ignore
    */
  def addMarker(marker: Marker): Boolean
  /**
    * Calculates the extended bounds of the cluster with the grid.
    */
  def calculateBounds_(): Unit
  /**
    * Returns the bounds of the cluster.
    *
    * @return the cluster bounds.
    * @ignore
    */
  def getBounds(): LatLngBounds
  /**
    * Returns the center of the cluster. You can call this from
    * a <code>click</code>, <code>mouseover</code>, or <code>mouseout</code> event handler
    * for the <code>MarkerClusterer</code> object.
    *
    * @return The center of the cluster.
    */
  def getCenter(): LatLng
  /**
    * Returns the map with which the cluster is associated.
    *
    * @return The map.
    * @ignore
    */
  def getMap(): Map[Element]
  /**
    * Returns the <code>MarkerClusterer</code> object with which the cluster is associated.
    *
    * @return The associated marker clusterer.
    * @ignore
    */
  def getMarkerClusterer(): MarkerClusterer
  /**
    * Returns the array of markers managed by the cluster. You can call this from
    * a <code>click</code>, <code>mouseover</code>, or <code>mouseout</code> event handler
    * for the <code>MarkerClusterer</code> object.
    *
    * @return The array of markers in the cluster.
    */
  def getMarkers(): js.Array[Marker]
  /**
    * Returns the number of markers managed by the cluster. You can call this from
    * a <code>click</code>, <code>mouseover</code>, or <code>mouseout</code> event handler
    * for the <code>MarkerClusterer</code> object.
    *
    * @return The number of markers in the cluster.
    */
  def getSize(): Double
  /**
    * Determines if a marker has already been added to the cluster.
    *
    * @param marker The marker to check.
    * @return True if the marker has already been added.
    */
  def isMarkerAlreadyAdded_(marker: Marker): Boolean
  /**
    * Determines if a marker lies within the cluster's bounds.
    *
    * @param marker The marker to check.
    * @return True if the marker lies in the bounds.
    * @ignore
    */
  def isMarkerInClusterBounds(marker: Marker): Boolean
  /**
    * Removes the cluster from the map.
    *
    * @ignore
    */
  def remove(): Unit
  /**
    * Updates the cluster icon.
    */
  def updateIcon_(): Unit
}

object Cluster {
  @scala.inline
  def apply(
    addMarker: Marker => Boolean,
    calculateBounds_ : () => Unit,
    getBounds: () => LatLngBounds,
    getCenter: () => LatLng,
    getMap: () => Map[Element],
    getMarkerClusterer: () => MarkerClusterer,
    getMarkers: () => js.Array[Marker],
    getSize: () => Double,
    isMarkerAlreadyAdded_ : Marker => Boolean,
    isMarkerInClusterBounds: Marker => Boolean,
    remove: () => Unit,
    updateIcon_ : () => Unit
  ): Cluster = {
    val __obj = js.Dynamic.literal(addMarker = js.Any.fromFunction1(addMarker), calculateBounds_ = js.Any.fromFunction0(calculateBounds_), getBounds = js.Any.fromFunction0(getBounds), getCenter = js.Any.fromFunction0(getCenter), getMap = js.Any.fromFunction0(getMap), getMarkerClusterer = js.Any.fromFunction0(getMarkerClusterer), getMarkers = js.Any.fromFunction0(getMarkers), getSize = js.Any.fromFunction0(getSize), isMarkerAlreadyAdded_ = js.Any.fromFunction1(isMarkerAlreadyAdded_), isMarkerInClusterBounds = js.Any.fromFunction1(isMarkerInClusterBounds), remove = js.Any.fromFunction0(remove), updateIcon_ = js.Any.fromFunction0(updateIcon_))
    __obj.asInstanceOf[Cluster]
  }
}

