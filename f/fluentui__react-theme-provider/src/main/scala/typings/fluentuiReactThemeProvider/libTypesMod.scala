package typings.fluentuiReactThemeProvider

import typings.react.mod.CSSProperties
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  trait StyleOptions[TProps] extends StObject {
    
    var slotProps: js.Array[js.Function1[/* props */ TProps, Record[String, js.Object]]]
  }
  object StyleOptions {
    
    inline def apply[TProps](slotProps: js.Array[js.Function1[/* props */ TProps, Record[String, js.Object]]]): StyleOptions[TProps] = {
      val __obj = js.Dynamic.literal(slotProps = slotProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleOptions[TProps]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyleOptions[?], TProps] (val x: Self & StyleOptions[TProps]) extends AnyVal {
      
      inline def setSlotProps(value: js.Array[js.Function1[/* props */ TProps, Record[String, js.Object]]]): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
      
      inline def setSlotPropsVarargs(value: (js.Function1[/* props */ TProps, Record[String, js.Object]])*): Self = StObject.set(x, "slotProps", js.Array(value*))
    }
  }
  
  trait StyleProps[TTokens /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColorTokenSet */ Any */] extends StObject {
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tokens: js.UndefOr[TTokens] = js.undefined
  }
  object StyleProps {
    
    inline def apply[TTokens /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColorTokenSet */ Any */](): StyleProps[TTokens] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleProps[TTokens]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyleProps[?], TTokens /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColorTokenSet */ Any */] (val x: Self & StyleProps[TTokens]) extends AnyVal {
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTokens(value: TTokens): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    }
  }
}
