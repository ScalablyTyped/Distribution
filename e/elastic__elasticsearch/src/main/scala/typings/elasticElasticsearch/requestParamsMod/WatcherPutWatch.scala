package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherPutWatch[T]
  extends StObject
     with Generic {
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var body: js.UndefOr[T] = js.undefined
  
  var id: String
  
  var if_primary_term: js.UndefOr[Double] = js.undefined
  
  var if_seq_no: js.UndefOr[Double] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object WatcherPutWatch {
  
  inline def apply[T](id: String): WatcherPutWatch[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherPutWatch[T]]
  }
  
  extension [Self <: WatcherPutWatch[?], T](x: Self & WatcherPutWatch[T]) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIf_primary_term(value: Double): Self = StObject.set(x, "if_primary_term", value.asInstanceOf[js.Any])
    
    inline def setIf_primary_termUndefined: Self = StObject.set(x, "if_primary_term", js.undefined)
    
    inline def setIf_seq_no(value: Double): Self = StObject.set(x, "if_seq_no", value.asInstanceOf[js.Any])
    
    inline def setIf_seq_noUndefined: Self = StObject.set(x, "if_seq_no", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
