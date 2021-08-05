package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityVersion extends StObject {
  
  var Version: js.UndefOr[Double] = js.undefined
}
object ActivityVersion {
  
  inline def apply(): ActivityVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityVersion]
  }
  
  extension [Self <: ActivityVersion](x: Self) {
    
    inline def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
