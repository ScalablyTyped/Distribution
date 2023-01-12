package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Catalog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlQueryRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Catalog] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
}
object SqlQueryRequest {
  
  inline def apply(): SqlQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlQueryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SqlQueryRequest] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Catalog): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
