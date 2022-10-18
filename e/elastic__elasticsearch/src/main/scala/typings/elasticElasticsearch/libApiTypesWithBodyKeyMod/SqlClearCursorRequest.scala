package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Cursor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlClearCursorRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Cursor] = js.undefined
}
object SqlClearCursorRequest {
  
  inline def apply(): SqlClearCursorRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlClearCursorRequest]
  }
  
  extension [Self <: SqlClearCursorRequest](x: Self) {
    
    inline def setBody(value: Cursor): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
