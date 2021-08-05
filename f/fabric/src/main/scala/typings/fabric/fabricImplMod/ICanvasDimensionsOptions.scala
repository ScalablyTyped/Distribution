package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICanvasDimensionsOptions extends StObject {
  
  /**
    * Set the given dimensions only as canvas backstore dimensions
    */
  var backstoreOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the given dimensions only as css dimensions
    */
  var cssOnly: js.UndefOr[Boolean] = js.undefined
}
object ICanvasDimensionsOptions {
  
  inline def apply(): ICanvasDimensionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICanvasDimensionsOptions]
  }
  
  extension [Self <: ICanvasDimensionsOptions](x: Self) {
    
    inline def setBackstoreOnly(value: Boolean): Self = StObject.set(x, "backstoreOnly", value.asInstanceOf[js.Any])
    
    inline def setBackstoreOnlyUndefined: Self = StObject.set(x, "backstoreOnly", js.undefined)
    
    inline def setCssOnly(value: Boolean): Self = StObject.set(x, "cssOnly", value.asInstanceOf[js.Any])
    
    inline def setCssOnlyUndefined: Self = StObject.set(x, "cssOnly", js.undefined)
  }
}
