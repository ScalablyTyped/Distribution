package typings.ecefProjector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ecef-projector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def project(latitude: Double, longitude: Double, altitude: Double): js.Tuple3[/* x */ Double, /* y */ Double, /* z */ Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("project")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], altitude.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[/* x */ Double, /* y */ Double, /* z */ Double]]
  
  inline def unproject(x: Double, y: Double, z: Double): js.Tuple3[/* latitude */ Double, /* longitude */ Double, /* altitude */ Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("unproject")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[/* latitude */ Double, /* longitude */ Double, /* altitude */ Double]]
}
