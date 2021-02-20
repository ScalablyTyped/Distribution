package typings.expressValidator.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainsOptions extends StObject {
  
  var ignoreCase: js.UndefOr[Boolean] = js.native
}
object ContainsOptions {
  
  @scala.inline
  def apply(): ContainsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainsOptions]
  }
  
  @scala.inline
  implicit class ContainsOptionsMutableBuilder[Self <: ContainsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
  }
}
