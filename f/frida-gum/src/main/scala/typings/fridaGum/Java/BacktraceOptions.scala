package typings.fridaGum.Java

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options that may be passed to `Java.backtrace()`.
  */
trait BacktraceOptions extends StObject {
  
  /**
    * Limit how many frames up the stack to walk. Defaults to 16.
    */
  var limit: js.UndefOr[Double] = js.undefined
}
object BacktraceOptions {
  
  inline def apply(): BacktraceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BacktraceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BacktraceOptions] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
