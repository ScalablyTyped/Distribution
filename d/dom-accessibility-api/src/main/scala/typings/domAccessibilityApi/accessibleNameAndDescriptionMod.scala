package typings.domAccessibilityApi

import typings.domAccessibilityApi.domAccessibilityApiStrings.description
import typings.domAccessibilityApi.domAccessibilityApiStrings.name
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accessibleNameAndDescriptionMod {
  
  @JSImport("dom-accessibility-api/dist/accessible-name-and-description", "computeTextAlternative")
  @js.native
  def computeTextAlternative(root: Element): String = js.native
  @JSImport("dom-accessibility-api/dist/accessible-name-and-description", "computeTextAlternative")
  @js.native
  def computeTextAlternative(root: Element, options: ComputeTextAlternativeOptions): String = js.native
  
  @js.native
  trait ComputeTextAlternativeOptions extends StObject {
    
    var compute: js.UndefOr[description | name] = js.native
    
    /**
      * Set to true if window.computedStyle supports the second argument.
      * This should be false in JSDOM. Otherwise JSDOM will log console errors.
      */
    var computedStyleSupportsPseudoElements: js.UndefOr[Boolean] = js.native
    
    var getComputedStyle: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.getComputedStyle */ js.Any
      ] = js.native
  }
  object ComputeTextAlternativeOptions {
    
    @scala.inline
    def apply(): ComputeTextAlternativeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComputeTextAlternativeOptions]
    }
    
    @scala.inline
    implicit class ComputeTextAlternativeOptionsMutableBuilder[Self <: ComputeTextAlternativeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompute(value: description | name): Self = StObject.set(x, "compute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputeUndefined: Self = StObject.set(x, "compute", js.undefined)
      
      @scala.inline
      def setComputedStyleSupportsPseudoElements(value: Boolean): Self = StObject.set(x, "computedStyleSupportsPseudoElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputedStyleSupportsPseudoElementsUndefined: Self = StObject.set(x, "computedStyleSupportsPseudoElements", js.undefined)
      
      @scala.inline
      def setGetComputedStyle(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.getComputedStyle */ js.Any
      ): Self = StObject.set(x, "getComputedStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetComputedStyleUndefined: Self = StObject.set(x, "getComputedStyle", js.undefined)
    }
  }
}
