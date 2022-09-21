package typings.elasticlunrjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerialisedInvertedIndex extends StObject {
  
  var root: InvertedIndexNode
}
object SerialisedInvertedIndex {
  
  inline def apply(root: InvertedIndexNode): SerialisedInvertedIndex = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialisedInvertedIndex]
  }
  
  extension [Self <: SerialisedInvertedIndex](x: Self) {
    
    inline def setRoot(value: InvertedIndexNode): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
