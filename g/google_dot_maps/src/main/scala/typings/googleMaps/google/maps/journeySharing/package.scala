package typings.googleMaps.google.maps.journeySharing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  */
type AuthTokenFetcher = js.Function1[/* a */ AuthTokenFetcherOptions, js.Promise[AuthToken]]

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  */
type MarkerSetup = MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions])

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  */
type PolylineSetup = PolylineSetupOptions | (js.Function1[/* a */ DefaultPolylineSetupOptions, PolylineSetupOptions])
