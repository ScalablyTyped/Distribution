package typings.googleMaps.google.maps

import typings.googleMaps.anon.Typeofencoding
import typings.googleMaps.anon.Typeofpoly
import typings.googleMaps.anon.Typeofspherical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeometryLibrary extends StObject {
  
  var encoding: Typeofencoding
  
  var poly: Typeofpoly
  
  var spherical: Typeofspherical
}
object GeometryLibrary {
  
  inline def apply(encoding: Typeofencoding, poly: Typeofpoly, spherical: Typeofspherical): GeometryLibrary = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], poly = poly.asInstanceOf[js.Any], spherical = spherical.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryLibrary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeometryLibrary] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: Typeofencoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setPoly(value: Typeofpoly): Self = StObject.set(x, "poly", value.asInstanceOf[js.Any])
    
    inline def setSpherical(value: Typeofspherical): Self = StObject.set(x, "spherical", value.asInstanceOf[js.Any])
  }
}
