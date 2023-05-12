package typings.googleMaps.google.maps

import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapType extends StObject {
  
  /**
    * Alt text to display when this MapType&#39;s button is hovered over in the
    * MapTypeControl. Optional.
    */
  var alt: String | Null = js.native
  
  def getTile(tileCoord: Null, zoom: Double): Element | Null = js.native
  def getTile(tileCoord: Null, zoom: Double, ownerDocument: Document): Element | Null = js.native
  /**
    * Returns a tile for the given tile coordinate (x, y) and zoom level. This
    * tile will be appended to the given ownerDocument. Not available for base
    * map types.
    * @param tileCoord Tile coordinates.
    * @param zoom Tile zoom.
    * @param ownerDocument The document which owns this tile.
    */
  def getTile(tileCoord: Point, zoom: Double): Element | Null = js.native
  def getTile(tileCoord: Point, zoom: Double, ownerDocument: Document): Element | Null = js.native
  
  /**
    * The maximum zoom level for the map when displaying this MapType. Required
    * for base MapTypes, ignored for overlay MapTypes.
    */
  var maxZoom: Double = js.native
  
  /**
    * The minimum zoom level for the map when displaying this MapType.
    * Optional; defaults to 0.
    */
  var minZoom: Double = js.native
  
  /**
    * Name to display in the MapTypeControl. Optional.
    */
  var name: String | Null = js.native
  
  /**
    * The Projection used to render this MapType. Optional; defaults to
    * Mercator.
    */
  var projection: Projection | Null = js.native
  
  /**
    * Radius of the planet for the map, in meters. Optional; defaults to
    * Earth&#39;s equatorial radius of 6378137 meters.
    */
  var radius: Double = js.native
  
  /**
    * Releases the given tile, performing any necessary cleanup. The provided
    * tile will have already been removed from the document. Optional.
    * @param tile Tile to release.
    */
  def releaseTile(): Unit = js.native
  def releaseTile(tile: Element): Unit = js.native
  
  /**
    * The dimensions of each tile. Required.
    */
  var tileSize: Size | Null = js.native
}
