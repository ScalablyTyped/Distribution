package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KmlLayerStatus extends StObject
/**
  * The status returned by <code>KmlLayer</code> on the completion of loading a
  * document. Specify these by value, or by using the constant&#39;s name. For
  * example, <code>'OK'</code> or <code>google.maps.KmlLayerStatus.OK</code>.
  */
@JSGlobal("google.maps.KmlLayerStatus")
@js.native
object KmlLayerStatus extends StObject {
  
  /**
    * The document could not be found. Most likely it is an invalid URL, or the
    * document is not publicly available.
    */
  @js.native
  sealed trait DOCUMENT_NOT_FOUND
    extends StObject
       with KmlLayerStatus
  
  /**
    * The document exceeds the file size limits of KmlLayer.
    */
  @js.native
  sealed trait DOCUMENT_TOO_LARGE
    extends StObject
       with KmlLayerStatus
  
  /**
    * The document could not be fetched.
    */
  @js.native
  sealed trait FETCH_ERROR
    extends StObject
       with KmlLayerStatus
  
  /**
    * The document is not a valid KML, KMZ or GeoRSS document.
    */
  @js.native
  sealed trait INVALID_DOCUMENT
    extends StObject
       with KmlLayerStatus
  
  /**
    * The <code>KmlLayer</code> is invalid.
    */
  @js.native
  sealed trait INVALID_REQUEST
    extends StObject
       with KmlLayerStatus
  
  /**
    * The document exceeds the feature limits of KmlLayer.
    */
  @js.native
  sealed trait LIMITS_EXCEEDED
    extends StObject
       with KmlLayerStatus
  
  /**
    * The layer loaded successfully.
    */
  @js.native
  sealed trait OK
    extends StObject
       with KmlLayerStatus
  
  /**
    * The document could not be loaded within a reasonable amount of time.
    */
  @js.native
  sealed trait TIMED_OUT
    extends StObject
       with KmlLayerStatus
  
  /**
    * The document failed to load for an unknown reason.
    */
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with KmlLayerStatus
}
