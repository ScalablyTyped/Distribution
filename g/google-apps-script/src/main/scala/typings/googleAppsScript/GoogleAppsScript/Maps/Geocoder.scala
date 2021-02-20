package typings.googleAppsScript.GoogleAppsScript.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows for the conversion between an address and geographical coordinates.
  * The example below shows how you can use this class find the top nine matches for the location
  * "Main St" in Colorado, add them to a map, and then embed it in a new Google Doc.
  *
  *     // Find the best matches for "Main St" in Colorado.
  *     var response = Maps.newGeocoder()
  *         // The latitudes and longitudes of southwest and northeast corners of Colorado, respectively.
  *         .setBounds(36.998166, -109.045486, 41.001666,-102.052002)
  *         .geocode('Main St');
  *
  *     // Create a Google Doc and map.
  *     var doc = DocumentApp.create('My Map');
  *     var map = Maps.newStaticMap();
  *
  *     // Add each result to the map and doc.
  *     for (var i = 0; i < response.results.length && i < 9; i++) {
  *       var result = response.results[i];
  *       map.setMarkerStyle(null, null, i + 1);
  *       map.addMarker(result.geometry.location.lat, result.geometry.location.lng);
  *       doc.appendListItem(result.formatted_address);
  *     }
  *
  *     // Add the finished map to the doc.
  *     doc.appendImage(Utilities.newBlob(map.getMapImage(), 'image/png'));
  *
  * See also
  *
  * Google Geocoding API
  */
@js.native
trait Geocoder extends StObject {
  
  def geocode(address: String): js.Any = js.native
  
  def reverseGeocode(latitude: Double, longitude: Double): js.Any = js.native
  def reverseGeocode(swLatitude: Double, swLongitude: Double, neLatitude: Double, neLongitude: Double): js.Any = js.native
  
  def setBounds(swLatitude: Double, swLongitude: Double, neLatitude: Double, neLongitude: Double): Geocoder = js.native
  
  def setLanguage(language: String): Geocoder = js.native
  
  def setRegion(region: String): Geocoder = js.native
}
