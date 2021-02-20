package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Explanation extends StObject {
  
  var description: String = js.native
  
  var details: js.Array[Explanation] = js.native
  
  var value: Double = js.native
}
object Explanation {
  
  @scala.inline
  def apply(description: String, details: js.Array[Explanation], value: Double): Explanation = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Explanation]
  }
  
  @scala.inline
  implicit class ExplanationMutableBuilder[Self <: Explanation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: js.Array[Explanation]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsVarargs(value: Explanation*): Self = StObject.set(x, "details", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
