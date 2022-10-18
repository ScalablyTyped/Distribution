package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Fetchsize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlTranslateRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Fetchsize] = js.undefined
}
object SqlTranslateRequest {
  
  inline def apply(): SqlTranslateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlTranslateRequest]
  }
  
  extension [Self <: SqlTranslateRequest](x: Self) {
    
    inline def setBody(value: Fetchsize): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
