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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefSchema] (val x: Self) extends AnyVal {
    
    inline def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
  }
}
