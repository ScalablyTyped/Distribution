package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TermvectorsFieldStatistics extends StObject {
  
  var doc_count: integer
  
  var sum_doc_freq: long
  
  var sum_ttf: long
}
object TermvectorsFieldStatistics {
  
  inline def apply(doc_count: integer, sum_doc_freq: long, sum_ttf: long): TermvectorsFieldStatistics = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], sum_doc_freq = sum_doc_freq.asInstanceOf[js.Any], sum_ttf = sum_ttf.asInstanceOf[js.Any])
    __obj.asInstanceOf[TermvectorsFieldStatistics]
  }
  
  extension [Self <: TermvectorsFieldStatistics](x: Self) {
    
    inline def setDoc_count(value: integer): Self = StObject.set(x, "doc_count", value.asInstanceOf[js.Any])
    
    inline def setSum_doc_freq(value: long): Self = StObject.set(x, "sum_doc_freq", value.asInstanceOf[js.Any])
    
    inline def setSum_ttf(value: long): Self = StObject.set(x, "sum_ttf", value.asInstanceOf[js.Any])
  }
}
