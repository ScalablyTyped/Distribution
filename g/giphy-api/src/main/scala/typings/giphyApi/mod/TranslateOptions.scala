package typings.giphyApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslateOptions
  extends StObject
     with BaseOptions {
  
  var s: String
}
object TranslateOptions {
  
  @scala.inline
  def apply(rating: Rating, s: String): TranslateOptions = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateOptions]
  }
  
  @scala.inline
  implicit class TranslateOptionsMutableBuilder[Self <: TranslateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
  }
}
