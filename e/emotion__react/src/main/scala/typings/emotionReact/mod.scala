package typings.emotionReact

import typings.emotionReact.emotionReactMod.Theme
import typings.emotionSerialize.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  trait Attributes extends StObject {
    
    var css: js.UndefOr[Interpolation[Theme]] = js.undefined
  }
  object Attributes {
    
    @scala.inline
    def apply(): Attributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attributes]
    }
    
    @scala.inline
    implicit class AttributesMutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCss(value: Interpolation[Theme]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssNull: Self = StObject.set(x, "css", null)
      
      @scala.inline
      def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    }
  }
}
