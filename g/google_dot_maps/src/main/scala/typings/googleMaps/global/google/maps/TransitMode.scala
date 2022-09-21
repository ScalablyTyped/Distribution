package typings.googleMaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The valid transit mode e.g. bus that can be specified in a <i><code><a
  * href="#TransitOptions">TransitOptions</a></code></i>. Specify these by
  * value, or by using the constant&#39;s name. For example, <code>'BUS'</code>
  * or <code>google.maps.TransitMode.BUS</code>.
  */
@JSGlobal("google.maps.TransitMode")
@js.native
object TransitMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.googleMaps.google.maps.TransitMode & String] = js.native
  
  /* "BUS" */ val BUS: typings.googleMaps.google.maps.TransitMode.BUS & String = js.native
  
  /* "RAIL" */ val RAIL: typings.googleMaps.google.maps.TransitMode.RAIL & String = js.native
  
  /* "SUBWAY" */ val SUBWAY: typings.googleMaps.google.maps.TransitMode.SUBWAY & String = js.native
  
  /* "TRAIN" */ val TRAIN: typings.googleMaps.google.maps.TransitMode.TRAIN & String = js.native
  
  /* "TRAM" */ val TRAM: typings.googleMaps.google.maps.TransitMode.TRAM & String = js.native
}
