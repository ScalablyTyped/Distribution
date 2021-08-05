package typings.fsPromise.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadJsonOptions extends StObject {
  
  var encoding: String
  
  var flag: js.UndefOr[String] = js.undefined
  
  def reviver(key: js.Any, value: js.Any): js.Any
}
object ReadJsonOptions {
  
  inline def apply(encoding: String, reviver: (js.Any, js.Any) => js.Any): ReadJsonOptions = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], reviver = js.Any.fromFunction2(reviver))
    __obj.asInstanceOf[ReadJsonOptions]
  }
  
  extension [Self <: ReadJsonOptions](x: Self) {
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    
    inline def setReviver(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "reviver", js.Any.fromFunction2(value))
  }
}
