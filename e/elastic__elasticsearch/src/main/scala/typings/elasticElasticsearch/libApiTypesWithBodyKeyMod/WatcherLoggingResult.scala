package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherLoggingResult extends StObject {
  
  var logged_text: String
}
object WatcherLoggingResult {
  
  inline def apply(logged_text: String): WatcherLoggingResult = {
    val __obj = js.Dynamic.literal(logged_text = logged_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherLoggingResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherLoggingResult] (val x: Self) extends AnyVal {
    
    inline def setLogged_text(value: String): Self = StObject.set(x, "logged_text", value.asInstanceOf[js.Any])
  }
}
