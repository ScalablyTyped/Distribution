package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The answer field is true if the current context size is between the minSize and maxSize values that are specified in the object, and false otherwise.
  */
@js.native
trait ContextSizeResponse extends StObject {
  
  var answer: Boolean = js.native
  
  var maxSize: js.UndefOr[Double] = js.native
  
  var minSize: js.UndefOr[Double] = js.native
}
object ContextSizeResponse {
  
  @scala.inline
  def apply(answer: Boolean): ContextSizeResponse = {
    val __obj = js.Dynamic.literal(answer = answer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextSizeResponse]
  }
  
  @scala.inline
  implicit class ContextSizeResponseMutableBuilder[Self <: ContextSizeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnswer(value: Boolean): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
  }
}
