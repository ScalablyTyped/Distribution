package typings.gatsbyCli.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictid
  extends StObject
     with /** All remaining options */
/* argName */ StringDictionary[Any] {
  
  var context: Record[String, Any]
  
  var error: js.UndefOr[js.Error] = js.undefined
  
  var id: String
}
object Dictid {
  
  inline def apply(context: Record[String, Any], id: String): Dictid = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictid]
  }
  
  extension [Self <: Dictid](x: Self) {
    
    inline def setContext(value: Record[String, Any]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
