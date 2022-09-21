package typings.findPackageJson.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  /**
    * Maps all file paths to the file paths specified in the array.
    */
  @JSName("*")
  var Asterisk: js.UndefOr[js.Array[String]] = js.undefined
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setAsterisk(value: js.Array[String]): Self = StObject.set(x, "*", value.asInstanceOf[js.Any])
    
    inline def setAsteriskUndefined: Self = StObject.set(x, "*", js.undefined)
    
    inline def setAsteriskVarargs(value: String*): Self = StObject.set(x, "*", js.Array(value*))
  }
}
