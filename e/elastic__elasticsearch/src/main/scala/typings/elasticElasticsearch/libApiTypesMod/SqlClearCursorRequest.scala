package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlClearCursorRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var cursor: String
}
object SqlClearCursorRequest {
  
  inline def apply(cursor: String): SqlClearCursorRequest = {
    val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlClearCursorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SqlClearCursorRequest] (val x: Self) extends AnyVal {
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
  }
}
