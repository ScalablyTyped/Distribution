package typings.expressValidator.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsISO8601Options extends StObject {
  
  var strict: Boolean
}
object IsISO8601Options {
  
  @scala.inline
  def apply(strict: Boolean): IsISO8601Options = {
    val __obj = js.Dynamic.literal(strict = strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsISO8601Options]
  }
  
  @scala.inline
  implicit class IsISO8601OptionsMutableBuilder[Self <: IsISO8601Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
  }
}
