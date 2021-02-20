package typings.elasticlunr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResults extends StObject {
  
  var ref: String = js.native
  
  var score: Double = js.native
}
object SearchResults {
  
  @scala.inline
  def apply(ref: String, score: Double): SearchResults = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResults]
  }
  
  @scala.inline
  implicit class SearchResultsMutableBuilder[Self <: SearchResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
  }
}
