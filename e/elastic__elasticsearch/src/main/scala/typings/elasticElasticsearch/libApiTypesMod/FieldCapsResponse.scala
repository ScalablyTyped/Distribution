package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldCapsResponse extends StObject {
  
  var fields: Record[Field, Record[String, FieldCapsFieldCapability]]
  
  var indices: Indices
}
object FieldCapsResponse {
  
  inline def apply(fields: Record[Field, Record[String, FieldCapsFieldCapability]], indices: Indices): FieldCapsResponse = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldCapsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldCapsResponse] (val x: Self) extends AnyVal {
    
    inline def setFields(value: Record[Field, Record[String, FieldCapsFieldCapability]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setIndices(value: Indices): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: IndexName*): Self = StObject.set(x, "indices", js.Array(value*))
  }
}
