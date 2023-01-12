package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Actionmodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherExecuteWatchRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Actionmodes] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[Id] = js.undefined
}
object WatcherExecuteWatchRequest {
  
  inline def apply(): WatcherExecuteWatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherExecuteWatchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherExecuteWatchRequest] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Actionmodes): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
