package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Explanation extends StObject {
  
  var explanation: js.UndefOr[String] = js.undefined
}
object Explanation {
  
  @scala.inline
  def apply(): Explanation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Explanation]
  }
  
  @scala.inline
  implicit class ExplanationMutableBuilder[Self <: Explanation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplanationUndefined: Self = StObject.set(x, "explanation", js.undefined)
  }
}
