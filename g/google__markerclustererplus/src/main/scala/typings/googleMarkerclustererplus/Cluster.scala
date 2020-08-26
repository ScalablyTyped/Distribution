package typings.googleMarkerclustererplus

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngBounds
import typings.googlemaps.google.maps.Map
import typings.googlemaps.google.maps.Marker
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster extends js.Object {
  /**
    * Adds a marker to the cluster.
    *
    * @param marker The marker to be added.
    * @return True if the marker was added.
    * @ignore
    */
  def addMarker(marker: Marker): Boolean = js.native
  /**
    * Calculates the extended bounds of the cluster with the grid.
    */
  def calculateBounds_(): Unit = js.native
  /**
    * Returns the bounds of the cluster.
    *
    * @return the cluster bounds.
    * @ignore
    */
  def getBounds(): LatLngBounds = js.native
  /**
    * Returns the center of the cluster. You can call this from
    * a <code>click</code>, <code>mouseover</code>, or <code>mouseout</code> event handler
    * for the <code>MarkerClusterer</code> object.
    *
    * @return The center of the cluster.
    */
  def getCenter(): LatLng = js.native
  /**
    * Returns the map with which the cluster is associated.
    *
    * @return The map.
    * @ignore
    */
  def getMap(): Map[Element] = js.native
  /**
    * Returns the <code>MarkerClusterer</code> object with which the cluster is associated.
    *
    * @return The associated marker clusterer.
    * @ignore
    */
  def getMarkerClusterer(): MarkerClusterer = js.native
  /**
    * Returns the array of markers managed by the cluster. You can call this from
    * a <code>click</code>, <code>mouseover</code>, or <code>mouseout</code> event handler
    * for the <code>MarkerClusterer</code> object.
    *
    * @return The array of markers in the cluster.
    */
  def getMarkers(): js.Array[Marker] = js.native
  /**
    * Returns the number of markers managed by the cluster. You can call this from
    * a <code>click</code>, <code>mouseover</code>, or <code>mouseout</code> event handler
    * for the <code>MarkerClusterer</code> object.
    *
    * @return The number of markers in the cluster.
    */
  def getSize(): Double = js.native
  /**
    * Determines if a marker has already been added to the cluster.
    *
    * @param marker The marker to check.
    * @return True if the marker has already been added.
    */
  def isMarkerAlreadyAdded_(marker: Marker): Boolean = js.native
  /**
    * Determines if a marker lies within the cluster's bounds.
    *
    * @param marker The marker to check.
    * @return True if the marker lies in the bounds.
    * @ignore
    */
  def isMarkerInClusterBounds(marker: Marker): Boolean = js.native
  /**
    * Removes the cluster from the map.
    *
    * @ignore
    */
  def remove(): Unit = js.native
  /**
    * Updates the cluster icon.
    */
  def updateIcon_(): Unit = js.native
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
  @scala.inline
  implicit class ClusterOps[Self <: Cluster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddMarker(value: Marker => Boolean): Self = this.set("addMarker", js.Any.fromFunction1(value))
    @scala.inline
    def setCalculateBounds_(value: () => Unit): Self = this.set("calculateBounds_", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBounds(value: () => LatLngBounds): Self = this.set("getBounds", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCenter(value: () => LatLng): Self = this.set("getCenter", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMap(value: () => Map[Element]): Self = this.set("getMap", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMarkerClusterer(value: () => MarkerClusterer): Self = this.set("getMarkerClusterer", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMarkers(value: () => js.Array[Marker]): Self = this.set("getMarkers", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSize(value: () => Double): Self = this.set("getSize", js.Any.fromFunction0(value))
    @scala.inline
    def setIsMarkerAlreadyAdded_(value: Marker => Boolean): Self = this.set("isMarkerAlreadyAdded_", js.Any.fromFunction1(value))
    @scala.inline
    def setIsMarkerInClusterBounds(value: Marker => Boolean): Self = this.set("isMarkerInClusterBounds", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdateIcon_(value: () => Unit): Self = this.set("updateIcon_", js.Any.fromFunction0(value))
  }
  
}

