package typings.elasticlunr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvertedIndexNode
  extends StObject
     with InvertedIndexCharNode {
  
  var df: Double
  
  var docs: InvertedIndexDocs
}
object InvertedIndexNode {
  
  inline def apply(df: Double, docs: InvertedIndexDocs): InvertedIndexNode = {
    val __obj = js.Dynamic.literal(df = df.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvertedIndexNode]
  }
  
  extension [Self <: InvertedIndexNode](x: Self) {
    
    inline def setDf(value: Double): Self = StObject.set(x, "df", value.asInstanceOf[js.Any])
    
    inline def setDocs(value: InvertedIndexDocs): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
  }
}
