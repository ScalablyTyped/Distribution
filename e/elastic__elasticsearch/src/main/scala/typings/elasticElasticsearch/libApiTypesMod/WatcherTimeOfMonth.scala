package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherTimeOfMonth extends StObject {
  
  var at: js.Array[String]
  
  var on: js.Array[integer]
}
object WatcherTimeOfMonth {
  
  inline def apply(at: js.Array[String], on: js.Array[integer]): WatcherTimeOfMonth = {
    val __obj = js.Dynamic.literal(at = at.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherTimeOfMonth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherTimeOfMonth] (val x: Self) extends AnyVal {
    
    inline def setAt(value: js.Array[String]): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setAtVarargs(value: String*): Self = StObject.set(x, "at", js.Array(value*))
    
    inline def setOn(value: js.Array[integer]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setOnVarargs(value: integer*): Self = StObject.set(x, "on", js.Array(value*))
  }
}
