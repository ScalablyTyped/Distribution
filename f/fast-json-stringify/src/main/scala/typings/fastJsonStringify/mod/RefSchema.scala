package typings.fastJsonStringify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefSchema
  extends StObject
     with Schema {
  
  /**
    * A json-pointer to a schema to use as a reference
    */
  @JSName("$ref")
  var $ref: String
}
object RefSchema {
  
  inline def apply($ref: String): RefSchema = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefSchema]
  }
  
  extension [Self <: RefSchema](x: Self) {
    
    inline def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
  }
}
