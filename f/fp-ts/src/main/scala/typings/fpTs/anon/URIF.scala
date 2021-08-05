package typings.fpTs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait URIF[F] extends StObject {
  
  val URI: F
}
object URIF {
  
  inline def apply[F](URI: F): URIF[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any])
    __obj.asInstanceOf[URIF[F]]
  }
  
  extension [Self <: URIF[?], F](x: Self & URIF[F]) {
    
    inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
  }
}
