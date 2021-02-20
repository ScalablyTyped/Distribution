package typings.expressValidator.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsEmptyOptions extends StObject {
  
  var ignore_whitespace: Boolean = js.native
}
object IsEmptyOptions {
  
  @scala.inline
  def apply(ignore_whitespace: Boolean): IsEmptyOptions = {
    val __obj = js.Dynamic.literal(ignore_whitespace = ignore_whitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsEmptyOptions]
  }
  
  @scala.inline
  implicit class IsEmptyOptionsMutableBuilder[Self <: IsEmptyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnore_whitespace(value: Boolean): Self = StObject.set(x, "ignore_whitespace", value.asInstanceOf[js.Any])
  }
}
