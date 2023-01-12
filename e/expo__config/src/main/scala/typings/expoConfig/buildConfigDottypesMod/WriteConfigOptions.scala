package typings.expoConfig.buildConfigDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteConfigOptions extends StObject {
  
  var dryRun: js.UndefOr[Boolean] = js.undefined
}
object WriteConfigOptions {
  
  inline def apply(): WriteConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteConfigOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WriteConfigOptions] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
  }
}
