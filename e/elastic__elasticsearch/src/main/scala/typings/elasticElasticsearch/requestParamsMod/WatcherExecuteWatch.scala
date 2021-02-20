package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatcherExecuteWatch[T] extends Generic {
  
  var body: js.UndefOr[T] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
}
object WatcherExecuteWatch {
  
  @scala.inline
  def apply[T](): WatcherExecuteWatch[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherExecuteWatch[T]]
  }
  
  @scala.inline
  implicit class WatcherExecuteWatchMutableBuilder[Self <: WatcherExecuteWatch[_], T] (val x: Self with WatcherExecuteWatch[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
