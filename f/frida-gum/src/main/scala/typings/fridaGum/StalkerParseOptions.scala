package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StalkerParseOptions extends StObject {
  
  /**
    * Whether to include the type of each event. Defaults to `true`.
    */
  var annotate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to format pointer values as strings instead of `NativePointer`
    * values, i.e. less overhead if you're just going to `send()` the result
    * and not actually parse the data agent-side.
    */
  var stringify: js.UndefOr[Boolean] = js.undefined
}
object StalkerParseOptions {
  
  inline def apply(): StalkerParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StalkerParseOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StalkerParseOptions] (val x: Self) extends AnyVal {
    
    inline def setAnnotate(value: Boolean): Self = StObject.set(x, "annotate", value.asInstanceOf[js.Any])
    
    inline def setAnnotateUndefined: Self = StObject.set(x, "annotate", js.undefined)
    
    inline def setStringify(value: Boolean): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
    
    inline def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
  }
}
