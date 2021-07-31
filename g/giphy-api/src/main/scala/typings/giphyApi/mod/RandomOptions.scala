package typings.giphyApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RandomOptions
  extends StObject
     with BaseOptions {
  
  var tag: String
}
object RandomOptions {
  
  @scala.inline
  def apply(rating: Rating, tag: String): RandomOptions = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomOptions]
  }
  
  @scala.inline
  implicit class RandomOptionsMutableBuilder[Self <: RandomOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
