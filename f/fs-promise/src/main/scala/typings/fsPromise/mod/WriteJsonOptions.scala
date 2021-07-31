package typings.fsPromise.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteJsonOptions
  extends StObject
     with WriteOptions {
  
  var replacer: js.UndefOr[JsonReplacer] = js.undefined
  
  var spaces: js.UndefOr[Double] = js.undefined
}
object WriteJsonOptions {
  
  @scala.inline
  def apply(): WriteJsonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteJsonOptions]
  }
  
  @scala.inline
  implicit class WriteJsonOptionsMutableBuilder[Self <: WriteJsonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplacer(value: JsonReplacer): Self = StObject.set(x, "replacer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacerFunction2(value: (/* key */ String, /* value */ js.Any) => js.Any): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
    
    @scala.inline
    def setReplacerVarargs(value: (Double | String)*): Self = StObject.set(x, "replacer", js.Array(value :_*))
    
    @scala.inline
    def setSpaces(value: Double): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
  }
}
