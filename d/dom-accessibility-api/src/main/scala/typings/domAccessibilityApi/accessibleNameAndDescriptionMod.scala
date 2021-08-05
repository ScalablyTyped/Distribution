package typings.domAccessibilityApi

import typings.domAccessibilityApi.domAccessibilityApiStrings.description
import typings.domAccessibilityApi.domAccessibilityApiStrings.name
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accessibleNameAndDescriptionMod {
  
  @JSImport("dom-accessibility-api/dist/accessible-name-and-description", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeTextAlternative(root: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeTextAlternative")(root.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def computeTextAlternative(root: Element, options: ComputeTextAlternativeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeTextAlternative")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait ComputeTextAlternativeOptions extends StObject {
    
    var compute: js.UndefOr[description | name] = js.undefined
    
    /**
      * Set to true if window.computedStyle supports the second argument.
      * This should be false in JSDOM. Otherwise JSDOM will log console errors.
      */
    var computedStyleSupportsPseudoElements: js.UndefOr[Boolean] = js.undefined
    
    var getComputedStyle: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.getComputedStyle */ js.Any
      ] = js.undefined
  }
  object ComputeTextAlternativeOptions {
    
    inline def apply(): ComputeTextAlternativeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComputeTextAlternativeOptions]
    }
    
    extension [Self <: ComputeTextAlternativeOptions](x: Self) {
      
      inline def setCompute(value: description | name): Self = StObject.set(x, "compute", value.asInstanceOf[js.Any])
      
      inline def setComputeUndefined: Self = StObject.set(x, "compute", js.undefined)
      
      inline def setComputedStyleSupportsPseudoElements(value: Boolean): Self = StObject.set(x, "computedStyleSupportsPseudoElements", value.asInstanceOf[js.Any])
      
      inline def setComputedStyleSupportsPseudoElementsUndefined: Self = StObject.set(x, "computedStyleSupportsPseudoElements", js.undefined)
      
      inline def setGetComputedStyle(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.getComputedStyle */ js.Any
      ): Self = StObject.set(x, "getComputedStyle", value.asInstanceOf[js.Any])
      
      inline def setGetComputedStyleUndefined: Self = StObject.set(x, "getComputedStyle", js.undefined)
    }
  }
}
