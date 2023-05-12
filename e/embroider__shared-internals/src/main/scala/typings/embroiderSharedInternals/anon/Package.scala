package typings.embroiderSharedInternals.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Package extends StObject {
  
  @JSName("package")
  var _package: String
  
  var semverRange: js.UndefOr[String] = js.undefined
}
object Package {
  
  inline def apply(_package: String): Package = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[Package]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Package] (val x: Self) extends AnyVal {
    
    inline def setSemverRange(value: String): Self = StObject.set(x, "semverRange", value.asInstanceOf[js.Any])
    
    inline def setSemverRangeUndefined: Self = StObject.set(x, "semverRange", js.undefined)
    
    inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
