package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  */
type FeatureStyleFunction = js.Function1[/* a */ FeatureStyleFunctionOptions, js.UndefOr[FeatureStyleOptions | Null]]

/**
  * Represents a request error from a web service (i.e. the equivalent of a 4xx
  * code in HTTP).
  */
type MapsRequestError = MapsNetworkError

/**
  * Represents a server-side error from a web service (i.e. the equivalent of a
  * 5xx code in HTTP).
  */
type MapsServerError = MapsNetworkError
