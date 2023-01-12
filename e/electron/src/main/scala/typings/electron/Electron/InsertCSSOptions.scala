package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertCSSOptions extends StObject {
  
  /**
    * Can be either 'user' or 'author'. Sets the cascade origin of the inserted
    * stylesheet. Default is 'author'.
    */
  var cssOrigin: js.UndefOr[String] = js.undefined
}
object InsertCSSOptions {
  
  inline def apply(): InsertCSSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertCSSOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsertCSSOptions] (val x: Self) extends AnyVal {
    
    inline def setCssOrigin(value: String): Self = StObject.set(x, "cssOrigin", value.asInstanceOf[js.Any])
    
    inline def setCssOriginUndefined: Self = StObject.set(x, "cssOrigin", js.undefined)
  }
}
