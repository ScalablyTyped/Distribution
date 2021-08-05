package typings.geolib

import typings.geolib.anon.Longitude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wktToPolygonMod {
  
  @JSImport("geolib/es/wktToPolygon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(wkt: String): js.Array[Longitude] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(wkt.asInstanceOf[js.Any]).asInstanceOf[js.Array[Longitude]]
}
