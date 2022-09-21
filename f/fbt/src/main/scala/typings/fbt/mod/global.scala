package typings.fbt.mod

import typings.fbt.anon.Children
import typings.fbt.anon.PropsWithChildrenFbtEnumP
import typings.fbt.anon.PropsWithChildrenFbtNameP
import typings.fbt.anon.PropsWithChildrenFbtParam
import typings.fbt.anon.PropsWithChildrenFbtPlura
import typings.fbt.anon.PropsWithChildrenFbtProno
import typings.fbt.anon.PropsWithChildrenFbtProps
import typings.fbt.anon.PropsWithChildrenFbtSameP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object JSX {
    
    trait IntrinsicElements extends StObject {
      
      var fbt: PropsWithChildrenFbtProps
      
      @JSName("fbt:enum")
      var fbtColonenum: PropsWithChildrenFbtEnumP
      
      @JSName("fbt:name")
      var fbtColonname: PropsWithChildrenFbtNameP
      
      @JSName("fbt:param")
      var fbtColonparam: PropsWithChildrenFbtParam
      
      @JSName("fbt:plural")
      var fbtColonplural: PropsWithChildrenFbtPlura
      
      @JSName("fbt:pronoun")
      var fbtColonpronoun: PropsWithChildrenFbtProno
      
      @JSName("fbt:same-param")
      var `fbtColonsame-param`: PropsWithChildrenFbtSameP
    }
    object IntrinsicElements {
      
      inline def apply(
        fbt: PropsWithChildrenFbtProps,
        fbtColonenum: PropsWithChildrenFbtEnumP,
        fbtColonname: PropsWithChildrenFbtNameP,
        fbtColonparam: PropsWithChildrenFbtParam,
        fbtColonplural: PropsWithChildrenFbtPlura,
        fbtColonpronoun: PropsWithChildrenFbtProno,
        `fbtColonsame-param`: PropsWithChildrenFbtSameP
      ): IntrinsicElements = {
        val __obj = js.Dynamic.literal(fbt = fbt.asInstanceOf[js.Any])
        __obj.updateDynamic("fbt:enum")(fbtColonenum.asInstanceOf[js.Any])
        __obj.updateDynamic("fbt:name")(fbtColonname.asInstanceOf[js.Any])
        __obj.updateDynamic("fbt:param")(fbtColonparam.asInstanceOf[js.Any])
        __obj.updateDynamic("fbt:plural")(fbtColonplural.asInstanceOf[js.Any])
        __obj.updateDynamic("fbt:pronoun")(fbtColonpronoun.asInstanceOf[js.Any])
        __obj.updateDynamic("fbt:same-param")(`fbtColonsame-param`.asInstanceOf[js.Any])
        __obj.asInstanceOf[IntrinsicElements]
      }
      
      extension [Self <: IntrinsicElements](x: Self) {
        
        inline def setFbt(value: PropsWithChildrenFbtProps): Self = StObject.set(x, "fbt", value.asInstanceOf[js.Any])
        
        inline def setFbtColonenum(value: PropsWithChildrenFbtEnumP): Self = StObject.set(x, "fbt:enum", value.asInstanceOf[js.Any])
        
        inline def setFbtColonname(value: PropsWithChildrenFbtNameP): Self = StObject.set(x, "fbt:name", value.asInstanceOf[js.Any])
        
        inline def setFbtColonparam(value: PropsWithChildrenFbtParam): Self = StObject.set(x, "fbt:param", value.asInstanceOf[js.Any])
        
        inline def setFbtColonplural(value: PropsWithChildrenFbtPlura): Self = StObject.set(x, "fbt:plural", value.asInstanceOf[js.Any])
        
        inline def setFbtColonpronoun(value: PropsWithChildrenFbtProno): Self = StObject.set(x, "fbt:pronoun", value.asInstanceOf[js.Any])
        
        inline def `setFbtColonsame-param`(value: PropsWithChildrenFbtSameP): Self = StObject.set(x, "fbt:same-param", value.asInstanceOf[js.Any])
      }
    }
    
    type PropsWithChildren[P] = P & Children
  }
}
