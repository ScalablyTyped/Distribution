package typings.devextreme.mod.DevExpress

import typings.devextreme.mod.global.JQuery
import typings.std.Element
import typings.std.HTMLElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object core {
  
  type dxElement = HTMLElement with JQuery
  
  type dxSVGElement = SVGElement with JQuery
  
  @js.native
  trait dxTemplate extends StObject
  
  @js.native
  trait dxTemplateOptions extends StObject {
    
    /**
      * [descr:dxTemplate.Options.name]
      */
    var name: js.UndefOr[String] = js.native
  }
  object dxTemplateOptions {
    
    @scala.inline
    def apply(): dxTemplateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[dxTemplateOptions]
    }
    
    @scala.inline
    implicit class dxTemplateOptionsMutableBuilder[Self <: dxTemplateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  type template = String | js.Function | Element | JQuery
}
