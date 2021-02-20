package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatcherPutWatch[T] extends Generic {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var body: js.UndefOr[T] = js.native
  
  var id: String = js.native
  
  var if_primary_term: js.UndefOr[Double] = js.native
  
  var if_seq_no: js.UndefOr[Double] = js.native
  
  var version: js.UndefOr[Double] = js.native
}
object WatcherPutWatch {
  
  @scala.inline
  def apply[T](id: String): WatcherPutWatch[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherPutWatch[T]]
  }
  
  @scala.inline
  implicit class WatcherPutWatchMutableBuilder[Self <: WatcherPutWatch[_], T] (val x: Self with WatcherPutWatch[T]) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIf_primary_term(value: Double): Self = StObject.set(x, "if_primary_term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIf_primary_termUndefined: Self = StObject.set(x, "if_primary_term", js.undefined)
    
    @scala.inline
    def setIf_seq_no(value: Double): Self = StObject.set(x, "if_seq_no", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIf_seq_noUndefined: Self = StObject.set(x, "if_seq_no", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
