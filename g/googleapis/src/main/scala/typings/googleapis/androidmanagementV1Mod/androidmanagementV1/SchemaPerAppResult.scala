package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPerAppResult extends StObject {
  
  /**
    * The result of an attempt to clear the data of a single app.
    */
  var clearingResult: js.UndefOr[String | Null] = js.undefined
}
object SchemaPerAppResult {
  
  inline def apply(): SchemaPerAppResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerAppResult]
  }
  
  extension [Self <: SchemaPerAppResult](x: Self) {
    
    inline def setClearingResult(value: String): Self = StObject.set(x, "clearingResult", value.asInstanceOf[js.Any])
    
    inline def setClearingResultNull: Self = StObject.set(x, "clearingResult", null)
    
    inline def setClearingResultUndefined: Self = StObject.set(x, "clearingResult", js.undefined)
  }
}
