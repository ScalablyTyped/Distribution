package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherTimeOfYear extends StObject {
  
  var at: js.Array[String]
  
  var int: js.Array[WatcherMonth]
  
  var on: js.Array[integer]
}
object WatcherTimeOfYear {
  
  inline def apply(at: js.Array[String], int: js.Array[WatcherMonth], on: js.Array[integer]): WatcherTimeOfYear = {
    val __obj = js.Dynamic.literal(at = at.asInstanceOf[js.Any], int = int.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherTimeOfYear]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherTimeOfYear] (val x: Self) extends AnyVal {
    
    inline def setAt(value: js.Array[String]): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setAtVarargs(value: String*): Self = StObject.set(x, "at", js.Array(value*))
    
    inline def setInt(value: js.Array[WatcherMonth]): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
    
    inline def setIntVarargs(value: WatcherMonth*): Self = StObject.set(x, "int", js.Array(value*))
    
    inline def setOn(value: js.Array[integer]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setOnVarargs(value: integer*): Self = StObject.set(x, "on", js.Array(value*))
  }
}
