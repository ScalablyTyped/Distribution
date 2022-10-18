package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlClearCursorResponse extends StObject {
  
  var succeeded: Boolean
}
object SqlClearCursorResponse {
  
  inline def apply(succeeded: Boolean): SqlClearCursorResponse = {
    val __obj = js.Dynamic.literal(succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlClearCursorResponse]
  }
  
  extension [Self <: SqlClearCursorResponse](x: Self) {
    
    inline def setSucceeded(value: Boolean): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
  }
}
