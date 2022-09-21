package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StreetViewSource extends StObject
/**
  * Identifiers to limit Street View searches to selected sources. These values
  * are specified as strings. For example, <code>'outdoor'</code>.
  */
@JSGlobal("google.maps.StreetViewSource")
@js.native
object StreetViewSource extends StObject {
  
  /**
    * Uses the default sources of Street View, searches will not be limited to
    * specific sources.
    */
  @js.native
  sealed trait DEFAULT
    extends StObject
       with StreetViewSource
  
  /**
    * Limits Street View searches to outdoor collections. Indoor collections
    * are not included in search results. Note also that the search only
    * returns panoramas where it&#39;s possible to determine whether
    * they&#39;re indoors or outdoors. For example, PhotoSpheres are not
    * returned because it&#39;s unknown whether they are indoors or outdoors.
    */
  @js.native
  sealed trait OUTDOOR
    extends StObject
       with StreetViewSource
}
