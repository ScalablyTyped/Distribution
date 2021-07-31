package typings.giphyApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseOptions extends StObject {
  
  var fmt: js.UndefOr[Format] = js.undefined
  
  var rating: Rating
}
object BaseOptions {
  
  @scala.inline
  def apply(rating: Rating): BaseOptions = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
  
  @scala.inline
  implicit class BaseOptionsMutableBuilder[Self <: BaseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFmt(value: Format): Self = StObject.set(x, "fmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFmtUndefined: Self = StObject.set(x, "fmt", js.undefined)
    
    @scala.inline
    def setRating(value: Rating): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
  }
}
