package typings.devextreme.anon

import typings.devextreme.devextremeStrings.bold
import typings.devextreme.devextremeStrings.italic
import typings.devextreme.devextremeStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size extends StObject {
  
  /**
    * 
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * 
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * 
    */
  var style: js.UndefOr[normal | bold | italic] = js.undefined
}
object Size {
  
  inline def apply(): Size = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Size]
  }
  
  extension [Self <: Size](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStyle(value: normal | bold | italic): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
