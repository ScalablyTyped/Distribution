package typings.googleMaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifiers to limit Street View searches to selected sources. These values
  * are specified as strings. For example, <code>'outdoor'</code>.
  */
@JSGlobal("google.maps.StreetViewSource")
@js.native
object StreetViewSource extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.googleMaps.google.maps.StreetViewSource & String] = js.native
  
  /* "default" */ val DEFAULT: typings.googleMaps.google.maps.StreetViewSource.DEFAULT & String = js.native
  
  /* "outdoor" */ val OUTDOOR: typings.googleMaps.google.maps.StreetViewSource.OUTDOOR & String = js.native
}
