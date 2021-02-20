package typings.elasticlunr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerialisedInvertedIndex extends StObject {
  
  var root: InvertedIndexNode = js.native
}
object SerialisedInvertedIndex {
  
  @scala.inline
  def apply(root: InvertedIndexNode): SerialisedInvertedIndex = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialisedInvertedIndex]
  }
  
  @scala.inline
  implicit class SerialisedInvertedIndexMutableBuilder[Self <: SerialisedInvertedIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: InvertedIndexNode): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
