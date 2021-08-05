package typings.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddLifecycleRuleOptions extends StObject {
  
  var append: js.UndefOr[Boolean] = js.undefined
}
object AddLifecycleRuleOptions {
  
  inline def apply(): AddLifecycleRuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddLifecycleRuleOptions]
  }
  
  extension [Self <: AddLifecycleRuleOptions](x: Self) {
    
    inline def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
    
    inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
  }
}
