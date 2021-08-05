package typings.expressValidator.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DryRun extends StObject {
  
  var dryRun: js.UndefOr[Boolean] = js.undefined
}
object DryRun {
  
  inline def apply(): DryRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DryRun]
  }
  
  extension [Self <: DryRun](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
  }
}
