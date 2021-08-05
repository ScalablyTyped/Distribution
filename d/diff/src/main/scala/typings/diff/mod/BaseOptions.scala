package typings.diff.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseOptions extends StObject {
  
  /**
    * `true` to ignore casing difference.
    * @default false
    */
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
}
object BaseOptions {
  
  inline def apply(): BaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseOptions]
  }
  
  extension [Self <: BaseOptions](x: Self) {
    
    inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
  }
}
