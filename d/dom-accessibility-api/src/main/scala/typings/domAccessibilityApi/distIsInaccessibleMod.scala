package typings.domAccessibilityApi

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIsInaccessibleMod {
  
  @JSImport("dom-accessibility-api/dist/is-inaccessible", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isInaccessible(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInaccessible")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isInaccessible(element: Element, options: IsInaccessibleOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInaccessible")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSubtreeInaccessible(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSubtreeInaccessible")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isSubtreeInaccessible(element: Element, options: IsSubtreeInaccessibleOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSubtreeInaccessible")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait IsInaccessibleOptions extends StObject {
    
    var getComputedStyle: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.getComputedStyle */ Any
      ] = js.undefined
    
    /**
      * Can be used to return cached results from previous isSubtreeInaccessible calls.
      */
    var isSubtreeInaccessible: js.UndefOr[js.Function1[/* element */ Element, Boolean]] = js.undefined
  }
  object IsInaccessibleOptions {
    
    inline def apply(): IsInaccessibleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsInaccessibleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsInaccessibleOptions] (val x: Self) extends AnyVal {
      
      inline def setGetComputedStyle(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.getComputedStyle */ Any
      ): Self = StObject.set(x, "getComputedStyle", value.asInstanceOf[js.Any])
      
      inline def setGetComputedStyleUndefined: Self = StObject.set(x, "getComputedStyle", js.undefined)
      
      inline def setIsSubtreeInaccessible(value: /* element */ Element => Boolean): Self = StObject.set(x, "isSubtreeInaccessible", js.Any.fromFunction1(value))
      
      inline def setIsSubtreeInaccessibleUndefined: Self = StObject.set(x, "isSubtreeInaccessible", js.undefined)
    }
  }
  
  trait IsSubtreeInaccessibleOptions extends StObject {
    
    var getComputedStyle: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.getComputedStyle */ Any
      ] = js.undefined
  }
  object IsSubtreeInaccessibleOptions {
    
    inline def apply(): IsSubtreeInaccessibleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsSubtreeInaccessibleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsSubtreeInaccessibleOptions] (val x: Self) extends AnyVal {
      
      inline def setGetComputedStyle(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.getComputedStyle */ Any
      ): Self = StObject.set(x, "getComputedStyle", value.asInstanceOf[js.Any])
      
      inline def setGetComputedStyleUndefined: Self = StObject.set(x, "getComputedStyle", js.undefined)
    }
  }
}
