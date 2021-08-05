package typings.extjs.Ext.layout

import typings.extjs.Ext.layout.container.IBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVBoxLayout
  extends StObject
     with IBox {
  
  /** [Config Option] (String) */
  var align: js.UndefOr[String] = js.undefined
  
  /** [Config Option] ("round"/"floor"/"ceil") */
  var alignRoundingMethod: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var constrainAlign: js.UndefOr[Boolean] = js.undefined
}
object IVBoxLayout {
  
  inline def apply(): IVBoxLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVBoxLayout]
  }
  
  extension [Self <: IVBoxLayout](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignRoundingMethod(value: js.Any): Self = StObject.set(x, "alignRoundingMethod", value.asInstanceOf[js.Any])
    
    inline def setAlignRoundingMethodUndefined: Self = StObject.set(x, "alignRoundingMethod", js.undefined)
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setConstrainAlign(value: Boolean): Self = StObject.set(x, "constrainAlign", value.asInstanceOf[js.Any])
    
    inline def setConstrainAlignUndefined: Self = StObject.set(x, "constrainAlign", js.undefined)
  }
}
