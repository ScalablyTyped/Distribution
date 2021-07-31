package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintOptions extends StObject {
  
  var footer: js.UndefOr[String] = js.undefined
  
  var header: js.UndefOr[String] = js.undefined
}
object PrintOptions {
  
  @scala.inline
  def apply(): PrintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintOptions]
  }
  
  @scala.inline
  implicit class PrintOptionsMutableBuilder[Self <: PrintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
  }
}
