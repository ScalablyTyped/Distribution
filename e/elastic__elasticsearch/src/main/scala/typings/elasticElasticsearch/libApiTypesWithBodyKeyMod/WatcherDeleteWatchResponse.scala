package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherDeleteWatchResponse extends StObject {
  
  var _id: Id
  
  var _version: VersionNumber
  
  var found: Boolean
}
object WatcherDeleteWatchResponse {
  
  inline def apply(_id: Id, _version: VersionNumber, found: Boolean): WatcherDeleteWatchResponse = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _version = _version.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherDeleteWatchResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherDeleteWatchResponse] (val x: Self) extends AnyVal {
    
    inline def setFound(value: Boolean): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    inline def set_id(value: Id): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_version(value: VersionNumber): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
  }
}
