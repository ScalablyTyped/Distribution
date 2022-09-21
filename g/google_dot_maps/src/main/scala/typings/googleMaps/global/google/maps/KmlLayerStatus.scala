package typings.googleMaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The status returned by <code>KmlLayer</code> on the completion of loading a
  * document. Specify these by value, or by using the constant&#39;s name. For
  * example, <code>'OK'</code> or <code>google.maps.KmlLayerStatus.OK</code>.
  */
@JSGlobal("google.maps.KmlLayerStatus")
@js.native
object KmlLayerStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.googleMaps.google.maps.KmlLayerStatus & String] = js.native
  
  /* "DOCUMENT_NOT_FOUND" */ val DOCUMENT_NOT_FOUND: typings.googleMaps.google.maps.KmlLayerStatus.DOCUMENT_NOT_FOUND & String = js.native
  
  /* "DOCUMENT_TOO_LARGE" */ val DOCUMENT_TOO_LARGE: typings.googleMaps.google.maps.KmlLayerStatus.DOCUMENT_TOO_LARGE & String = js.native
  
  /* "FETCH_ERROR" */ val FETCH_ERROR: typings.googleMaps.google.maps.KmlLayerStatus.FETCH_ERROR & String = js.native
  
  /* "INVALID_DOCUMENT" */ val INVALID_DOCUMENT: typings.googleMaps.google.maps.KmlLayerStatus.INVALID_DOCUMENT & String = js.native
  
  /* "INVALID_REQUEST" */ val INVALID_REQUEST: typings.googleMaps.google.maps.KmlLayerStatus.INVALID_REQUEST & String = js.native
  
  /* "LIMITS_EXCEEDED" */ val LIMITS_EXCEEDED: typings.googleMaps.google.maps.KmlLayerStatus.LIMITS_EXCEEDED & String = js.native
  
  /* "OK" */ val OK: typings.googleMaps.google.maps.KmlLayerStatus.OK & String = js.native
  
  /* "TIMED_OUT" */ val TIMED_OUT: typings.googleMaps.google.maps.KmlLayerStatus.TIMED_OUT & String = js.native
  
  /* "UNKNOWN" */ val UNKNOWN: typings.googleMaps.google.maps.KmlLayerStatus.UNKNOWN & String = js.native
}
