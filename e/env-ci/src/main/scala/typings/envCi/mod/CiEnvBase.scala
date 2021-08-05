package typings.envCi.mod

import typings.envCi.envCiBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CiEnvBase extends StObject {
  
  var isCi: `true`
}
object CiEnvBase {
  
  inline def apply(): CiEnvBase = {
    val __obj = js.Dynamic.literal(isCi = true)
    __obj.asInstanceOf[CiEnvBase]
  }
  
  extension [Self <: CiEnvBase](x: Self) {
    
    inline def setIsCi(value: `true`): Self = StObject.set(x, "isCi", value.asInstanceOf[js.Any])
  }
}
