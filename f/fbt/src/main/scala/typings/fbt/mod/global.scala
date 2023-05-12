package typings.fbt.mod

import typings.fbt.anon.Children
import typings.fbt.anon.PropsWithChildrenFbtNameP
import typings.fbt.anon.PropsWithChildrenFbtParam
import typings.fbt.anon.PropsWithChildrenFbtPlura
import typings.fbt.anon.PropsWithChildrenFbtProps
import typings.fbt.anon.PropsWithStringChildFbtNa
import typings.fbt.anon.PropsWithStringChildFbtPa
import typings.fbt.anon.PropsWithStringChildFbtPl
import typings.fbt.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object JSX {
    
    trait IntrinsicElements extends StObject {
      
      var fbs: PropsWithChildrenFbtProps
      
      @JSName("fbs:enum")
      var fbsColonenum: FbtEnumProps
      
      @JSName("fbs:name")
      var fbsColonname: PropsWithStringChildFbtNa
      
      @JSName("fbs:param")
      var fbsColonparam: PropsWithStringChildFbtPa
      
      @JSName("fbs:plural")
      var fbsColonplural: PropsWithStringChildFbtPl
      
      @JSName("fbs:pronoun")
      var fbsColonpronoun: FbtPronounProps
      
      @JSName("fbs:same-param")
      var `fbsColonsame-param`: FbtSameParamProps
      
      var fbt: PropsWithChildrenFbtProps
      
      @JSName("fbt:enum")
      var fbtColonenum: FbtEnumProps
      
      @JSName("fbt:name")
      var fbtColonname: PropsWithChildrenFbtNameP
      
      @JSName("fbt:param")
      var fbtColonparam: PropsWithChildrenFbtParam
      
      @JSName("fbt:plural")
      var fbtColonplural: PropsWithChildrenFbtPlura
      
      @JSName("fbt:pronoun")
      var fbtColonpronoun: FbtPronounProps
      
      @JSName("fbt:same-param")
      var `fbtColonsame-param`: FbtSameParamProps
    }
    object IntrinsicElements {
      
      inline def apply(
        fbs: PropsWithChildrenFbtProps,
        fbsColonenum: FbtEnumProps,
        fbsColonname: PropsWithStringChildFbtNa,
        fbsColonparam: PropsWithStringChildFbtPa,
        fbsColonplural: PropsWithStringChildFbtPl,
        fbsColonpronoun: FbtPronounProps,
        `fbsColonsame-param`: FbtSameParamProps,
        fbt: PropsWithChildrenFbtProps,
        fbtColonenum: FbtEnumProps,
        fbtColonname: PropsWithChildrenFbtNameP,
        fbtColonparam: PropsWithChildrenFbtParam,
        fbtColonplural: PropsWithChildrenFbtPlura,
        fbtColonpronoun: FbtPronounProps,
        `fbtColonsame-param`: FbtSameParamProps
      ): IntrinsicElements = {
        val __obj = js.Dynamic.literal(fbs = fbs.asInstanceOf[js.Any], fbt = fbt.asInstanceOf[js.Any])
        __obj.updateDynamic("fbs:enum")(fbsColonenum.asInstanceOf[js.Any])
        __obj.updateDynamic("fbs:name")(fbsColonname.asInstanceOf[js.Any])
        __obj.updateDynamic("fbs:param")(fbsColonparam.asInstanceOf[js.Any])
        __obj.updateDynamic("fbs:plural")(fbsColonplural.asInstanceOf[js.Any])
        __obj.updateDynamic("fbs:pronoun")(fbsColonpronoun.asInstanceOf[js.Any])
        __obj.updateDynamic("fbs:same-param")(`fbsColonsame-param`.asInstanceOf[js.Any])
        __obj.updateDynamic("fbt:enum")(fbtColonenum.asInstanceOf[js.Any])
        __obj.updateDynamic("fbt:name")(fbtColonname.asInstanceOf[js.Any])
        __obj.updateDynamic("fbt:param")(fbtColonparam.asInstanceOf[js.Any])
        __obj.updateDynamic("fbt:plural")(fbtColonplural.asInstanceOf[js.Any])
        __obj.updateDynamic("fbt:pronoun")(fbtColonpronoun.asInstanceOf[js.Any])
        __obj.updateDynamic("fbt:same-param")(`fbtColonsame-param`.asInstanceOf[js.Any])
        __obj.asInstanceOf[IntrinsicElements]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IntrinsicElements] (val x: Self) extends AnyVal {
        
        inline def setFbs(value: PropsWithChildrenFbtProps): Self = StObject.set(x, "fbs", value.asInstanceOf[js.Any])
        
        inline def setFbsColonenum(value: FbtEnumProps): Self = StObject.set(x, "fbs:enum", value.asInstanceOf[js.Any])
        
        inline def setFbsColonname(value: PropsWithStringChildFbtNa): Self = StObject.set(x, "fbs:name", value.asInstanceOf[js.Any])
        
        inline def setFbsColonparam(value: PropsWithStringChildFbtPa): Self = StObject.set(x, "fbs:param", value.asInstanceOf[js.Any])
        
        inline def setFbsColonplural(value: PropsWithStringChildFbtPl): Self = StObject.set(x, "fbs:plural", value.asInstanceOf[js.Any])
        
        inline def setFbsColonpronoun(value: FbtPronounProps): Self = StObject.set(x, "fbs:pronoun", value.asInstanceOf[js.Any])
        
        inline def `setFbsColonsame-param`(value: FbtSameParamProps): Self = StObject.set(x, "fbs:same-param", value.asInstanceOf[js.Any])
        
        inline def setFbt(value: PropsWithChildrenFbtProps): Self = StObject.set(x, "fbt", value.asInstanceOf[js.Any])
        
        inline def setFbtColonenum(value: FbtEnumProps): Self = StObject.set(x, "fbt:enum", value.asInstanceOf[js.Any])
        
        inline def setFbtColonname(value: PropsWithChildrenFbtNameP): Self = StObject.set(x, "fbt:name", value.asInstanceOf[js.Any])
        
        inline def setFbtColonparam(value: PropsWithChildrenFbtParam): Self = StObject.set(x, "fbt:param", value.asInstanceOf[js.Any])
        
        inline def setFbtColonplural(value: PropsWithChildrenFbtPlura): Self = StObject.set(x, "fbt:plural", value.asInstanceOf[js.Any])
        
        inline def setFbtColonpronoun(value: FbtPronounProps): Self = StObject.set(x, "fbt:pronoun", value.asInstanceOf[js.Any])
        
        inline def `setFbtColonsame-param`(value: FbtSameParamProps): Self = StObject.set(x, "fbt:same-param", value.asInstanceOf[js.Any])
      }
    }
    
    type PropsWithChildren[P] = P & Children
    
    type PropsWithStringChild[P] = P & `0`
  }
}
