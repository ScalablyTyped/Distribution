package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CModuleOptions extends StObject {
  
  var toolchain: js.UndefOr[CModuleToolchain] = js.undefined
}
object CModuleOptions {
  
  inline def apply(): CModuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CModuleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CModuleOptions] (val x: Self) extends AnyVal {
    
    inline def setToolchain(value: CModuleToolchain): Self = StObject.set(x, "toolchain", value.asInstanceOf[js.Any])
    
    inline def setToolchainUndefined: Self = StObject.set(x, "toolchain", js.undefined)
  }
}
