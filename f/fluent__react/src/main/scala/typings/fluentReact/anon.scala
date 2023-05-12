package typings.fluentReact

import typings.fluentBundle.esmBundleMod.FluentVariable
import typings.fluentReact.esmLocalizationMod.ReactLocalization
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attrs extends StObject {
    
    var attrs: js.UndefOr[Record[String, Boolean]] = js.undefined
    
    var elems: js.UndefOr[Record[String, ReactElement]] = js.undefined
    
    var vars: js.UndefOr[Record[String, FluentVariable]] = js.undefined
  }
  object Attrs {
    
    inline def apply(): Attrs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attrs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Attrs] (val x: Self) extends AnyVal {
      
      inline def setAttrs(value: Record[String, Boolean]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setElems(value: Record[String, ReactElement]): Self = StObject.set(x, "elems", value.asInstanceOf[js.Any])
      
      inline def setElemsUndefined: Self = StObject.set(x, "elems", js.undefined)
      
      inline def setVars(value: Record[String, FluentVariable]): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
      
      inline def setVarsUndefined: Self = StObject.set(x, "vars", js.undefined)
    }
  }
  
  trait Children extends StObject {
    
    var children: ReactNode
    
    var l10n: ReactLocalization
  }
  object Children {
    
    inline def apply(l10n: ReactLocalization): Children = {
      val __obj = js.Dynamic.literal(l10n = l10n.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setL10n(value: ReactLocalization): Self = StObject.set(x, "l10n", value.asInstanceOf[js.Any])
    }
  }
  
  trait L10n extends StObject {
    
    var l10n: ReactLocalization
  }
  object L10n {
    
    inline def apply(l10n: ReactLocalization): L10n = {
      val __obj = js.Dynamic.literal(l10n = l10n.asInstanceOf[js.Any])
      __obj.asInstanceOf[L10n]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: L10n] (val x: Self) extends AnyVal {
      
      inline def setL10n(value: ReactLocalization): Self = StObject.set(x, "l10n", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@fluent/react.@fluent/react/esm/with_localization.WithLocalizationProps> */
  trait PartialWithLocalizationPr extends StObject {
    
    var getString: js.UndefOr[
        js.Function3[
          /* id */ String, 
          /* args */ js.UndefOr[(Record[String, FluentVariable]) | Null], 
          /* fallback */ js.UndefOr[String], 
          String
        ]
      ] = js.undefined
  }
  object PartialWithLocalizationPr {
    
    inline def apply(): PartialWithLocalizationPr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialWithLocalizationPr]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialWithLocalizationPr] (val x: Self) extends AnyVal {
      
      inline def setGetString(
        value: (/* id */ String, /* args */ js.UndefOr[(Record[String, FluentVariable]) | Null], /* fallback */ js.UndefOr[String]) => String
      ): Self = StObject.set(x, "getString", js.Any.fromFunction3(value))
      
      inline def setGetStringUndefined: Self = StObject.set(x, "getString", js.undefined)
    }
  }
}
