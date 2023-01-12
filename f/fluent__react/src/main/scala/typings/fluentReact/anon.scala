package typings.fluentReact

import typings.fluentBundle.esmBundleMod.FluentVariable
import typings.fluentReact.esmLocalizationMod.ReactLocalization
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
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
