package typings.fluentuiReactStylesheets

import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStylesheetProviderDottypesMod {
  
  trait StylesheetProviderProps extends StObject {
    
    /**
      * Optional callback for overriding the default render function for rendering stylesheets.
      */
    var renderStyles: js.UndefOr[js.Function2[/* stylesheets */ js.Array[String], /* context */ this.type, Unit]] = js.undefined
    
    /**
      * Target document to render styles to. Defaults to the `document` global object.
      */
    var target: js.UndefOr[Document] = js.undefined
  }
  object StylesheetProviderProps {
    
    inline def apply(): StylesheetProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StylesheetProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StylesheetProviderProps] (val x: Self) extends AnyVal {
      
      inline def setRenderStyles(value: (/* stylesheets */ js.Array[String], StylesheetProviderProps) => Unit): Self = StObject.set(x, "renderStyles", js.Any.fromFunction2(value))
      
      inline def setRenderStylesUndefined: Self = StObject.set(x, "renderStyles", js.undefined)
      
      inline def setTarget(value: Document): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
