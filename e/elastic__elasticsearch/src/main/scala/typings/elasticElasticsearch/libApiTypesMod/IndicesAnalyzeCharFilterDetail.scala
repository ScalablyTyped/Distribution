package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesAnalyzeCharFilterDetail extends StObject {
  
  var filtered_text: js.Array[String]
  
  var name: String
}
object IndicesAnalyzeCharFilterDetail {
  
  inline def apply(filtered_text: js.Array[String], name: String): IndicesAnalyzeCharFilterDetail = {
    val __obj = js.Dynamic.literal(filtered_text = filtered_text.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesAnalyzeCharFilterDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesAnalyzeCharFilterDetail] (val x: Self) extends AnyVal {
    
    inline def setFiltered_text(value: js.Array[String]): Self = StObject.set(x, "filtered_text", value.asInstanceOf[js.Any])
    
    inline def setFiltered_textVarargs(value: String*): Self = StObject.set(x, "filtered_text", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
