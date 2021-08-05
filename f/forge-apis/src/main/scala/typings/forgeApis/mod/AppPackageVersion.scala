package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppPackageVersion extends StObject {
  
  var version: js.UndefOr[Double] = js.undefined
}
object AppPackageVersion {
  
  inline def apply(): AppPackageVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppPackageVersion]
  }
  
  extension [Self <: AppPackageVersion](x: Self) {
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
