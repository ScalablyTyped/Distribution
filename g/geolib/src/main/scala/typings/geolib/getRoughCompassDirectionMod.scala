package typings.geolib

import typings.geolib.geolibStrings.E
import typings.geolib.geolibStrings.N
import typings.geolib.geolibStrings.S
import typings.geolib.geolibStrings.W
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRoughCompassDirectionMod {
  
  @JSImport("geolib/es/getRoughCompassDirection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(exact: String): js.UndefOr[S | W | E | N] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(exact.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[S | W | E | N]]
}
