package typings.domAccessibilityApi.accessibleNameAndDescriptionMod

import typings.domAccessibilityApi.domAccessibilityApiStrings.description
import typings.domAccessibilityApi.domAccessibilityApiStrings.name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputeTextAlternativeOptions extends js.Object {
  
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
  implicit class ComputeTextAlternativeOptionsOps[Self <: ComputeTextAlternativeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompute(value: description | name): Self = this.set("compute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompute: Self = this.set("compute", js.undefined)
    
    @scala.inline
    def setComputedStyleSupportsPseudoElements(value: Boolean): Self = this.set("computedStyleSupportsPseudoElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputedStyleSupportsPseudoElements: Self = this.set("computedStyleSupportsPseudoElements", js.undefined)
    
    @scala.inline
    def setGetComputedStyle(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.getComputedStyle */ js.Any
    ): Self = this.set("getComputedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetComputedStyle: Self = this.set("getComputedStyle", js.undefined)
  }
}
