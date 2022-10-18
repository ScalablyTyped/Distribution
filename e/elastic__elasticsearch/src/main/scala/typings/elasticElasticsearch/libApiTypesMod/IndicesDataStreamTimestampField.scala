package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesDataStreamTimestampField extends StObject {
  
  var name: Field
}
object IndicesDataStreamTimestampField {
  
  inline def apply(name: Field): IndicesDataStreamTimestampField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesDataStreamTimestampField]
  }
  
  extension [Self <: IndicesDataStreamTimestampField](x: Self) {
    
    inline def setName(value: Field): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
