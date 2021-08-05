package typings.giphyApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseOptions extends StObject {
  
  var fmt: js.UndefOr[Format] = js.undefined
  
  var rating: Rating
}
object BaseOptions {
  
  inline def apply(rating: Rating): BaseOptions = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
  
  extension [Self <: BaseOptions](x: Self) {
    
    inline def setFmt(value: Format): Self = StObject.set(x, "fmt", value.asInstanceOf[js.Any])
    
    inline def setFmtUndefined: Self = StObject.set(x, "fmt", js.undefined)
    
    inline def setRating(value: Rating): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
  }
}
