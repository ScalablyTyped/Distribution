package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TermvectorsTermVector extends StObject {
  
  var field_statistics: TermvectorsFieldStatistics
  
  var terms: Record[String, TermvectorsTerm]
}
object TermvectorsTermVector {
  
  inline def apply(field_statistics: TermvectorsFieldStatistics, terms: Record[String, TermvectorsTerm]): TermvectorsTermVector = {
    val __obj = js.Dynamic.literal(field_statistics = field_statistics.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[TermvectorsTermVector]
  }
  
  extension [Self <: TermvectorsTermVector](x: Self) {
    
    inline def setField_statistics(value: TermvectorsFieldStatistics): Self = StObject.set(x, "field_statistics", value.asInstanceOf[js.Any])
    
    inline def setTerms(value: Record[String, TermvectorsTerm]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
  }
}
