package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLogConfigDataAccessOptions extends StObject {
  
  /**
    * This is deprecated and has no effect. Do not use.
    */
  var logMode: js.UndefOr[String | Null] = js.undefined
}
object SchemaLogConfigDataAccessOptions {
  
  inline def apply(): SchemaLogConfigDataAccessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogConfigDataAccessOptions]
  }
  
  extension [Self <: SchemaLogConfigDataAccessOptions](x: Self) {
    
    inline def setLogMode(value: String): Self = StObject.set(x, "logMode", value.asInstanceOf[js.Any])
    
    inline def setLogModeNull: Self = StObject.set(x, "logMode", null)
    
    inline def setLogModeUndefined: Self = StObject.set(x, "logMode", js.undefined)
  }
}
