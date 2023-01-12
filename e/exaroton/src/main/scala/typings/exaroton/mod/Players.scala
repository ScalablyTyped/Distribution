package typings.exaroton.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Players extends StObject {
  
  /**
    * Current amount of players
    */
  var count: Double
  
  /**
    * List of player names
    */
  var list: js.Array[String]
  
  /**
    * Max amount of players / slots
    */
  var max: Double
}
object Players {
  
  inline def apply(count: Double, list: js.Array[String], max: Double): Players = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[Players]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Players] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setList(value: js.Array[String]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListVarargs(value: String*): Self = StObject.set(x, "list", js.Array(value*))
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
  }
}
