package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A polygon (like a polyline) defines a series of connected coordinates in an
  * ordered sequence. Additionally, polygons form a closed loop and define a
  * filled region. See the samples in the developer&#39;s guide, starting with
  * a <a
  * href="https://developers.google.com/maps/documentation/javascript/examples/polygon-simple">simple
  * polygon</a>, a <a
  * href="https://developers.google.com/maps/documentation/javascript/examples/polygon-hole">polygon
  * with a hole</a>, and more. Note that you can also use the <a
  * href="#Data.Polygon">Data layer</a> to create a polygon. The Data layer
  * offers a simpler way of creating holes because it handles the order of the
  * inner and outer paths for you.
  */
@js.native
trait Polygon
  extends StObject
     with MVCObject {
  
  /**
    * Returns whether this shape can be dragged by the user.
    */
  def getDraggable(): Boolean = js.native
  
  /**
    * Returns whether this shape can be edited by the user.
    */
  def getEditable(): Boolean = js.native
  
  /**
    * Returns the map on which this shape is attached.
    */
  def getMap(): Map | Null = js.native
  
  /**
    * Retrieves the first path.
    */
  def getPath(): MVCArray[LatLng] = js.native
  
  /**
    * Retrieves the paths for this polygon.
    */
  def getPaths(): MVCArray[MVCArray[LatLng]] = js.native
  
  /**
    * Returns whether this poly is visible on the map.
    */
  def getVisible(): Boolean = js.native
  
  /**
    * If set to <code>true</code>, the user can drag this shape over the map.
    * The <code>geodesic</code> property defines the mode of dragging.
    */
  def setDraggable(draggable: Boolean): Unit = js.native
  
  /**
    * If set to <code>true</code>, the user can edit this shape by dragging the
    * control points shown at the vertices and on each segment.
    */
  def setEditable(editable: Boolean): Unit = js.native
  
  /**
    * Renders this shape on the specified map. If map is set to
    * <code>null</code>, the shape will be removed.
    */
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  
  def setOptions(): Unit = js.native
  def setOptions(options: PolygonOptions): Unit = js.native
  
  def setPath(path: js.Array[LatLng | LatLngLiteral]): Unit = js.native
  /**
    * Sets the first path. See <em><code><a
    * href="#PolygonOptions">PolygonOptions</a></code></em> for more details.
    */
  def setPath(path: MVCArray[LatLng]): Unit = js.native
  
  def setPaths(paths: js.Array[Any]): Unit = js.native
  /**
    * Sets the path for this polygon.
    */
  def setPaths(paths: MVCArray[Any]): Unit = js.native
  
  /**
    * Hides this poly if set to <code>false</code>.
    */
  def setVisible(visible: Boolean): Unit = js.native
}
