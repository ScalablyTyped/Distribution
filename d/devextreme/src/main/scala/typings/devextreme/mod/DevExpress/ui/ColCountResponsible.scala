package typings.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColCountResponsible extends StObject {
  
  /**
    * The count of columns for a large screen size.
    */
  var lg: js.UndefOr[Double] = js.undefined
  
  /**
    * The count of columns for a middle-sized screen.
    */
  var md: js.UndefOr[Double] = js.undefined
  
  /**
    * The count of columns for a small-sized screen.
    */
  var sm: js.UndefOr[Double] = js.undefined
  
  /**
    * The count of columns for an extra small-sized screen.
    */
  var xs: js.UndefOr[Double] = js.undefined
}
object ColCountResponsible {
  
  inline def apply(): ColCountResponsible = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColCountResponsible]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColCountResponsible] (val x: Self) extends AnyVal {
    
    inline def setLg(value: Double): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
    
    inline def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
    
    inline def setMd(value: Double): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    
    inline def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
    
    inline def setSm(value: Double): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
    
    inline def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
    
    inline def setXs(value: Double): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
    
    inline def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
  }
}
