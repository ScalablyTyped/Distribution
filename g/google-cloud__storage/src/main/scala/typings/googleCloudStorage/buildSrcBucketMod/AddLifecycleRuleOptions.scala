package typings.googleCloudStorage.buildSrcBucketMod

import typings.googleCloudStorage.buildSrcStorageMod.PreconditionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddLifecycleRuleOptions
  extends StObject
     with PreconditionOptions {
  
  var append: js.UndefOr[Boolean] = js.undefined
}
object AddLifecycleRuleOptions {
  
  inline def apply(): AddLifecycleRuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddLifecycleRuleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddLifecycleRuleOptions] (val x: Self) extends AnyVal {
    
    inline def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
    
    inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
  }
}
