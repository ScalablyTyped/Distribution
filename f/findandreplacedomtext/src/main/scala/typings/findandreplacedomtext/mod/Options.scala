package typings.findandreplacedomtext.mod

import typings.findandreplacedomtext.findandreplacedomtextStrings.first
import typings.findandreplacedomtext.findandreplacedomtextStrings.prose
import typings.findandreplacedomtext.findandreplacedomtextStrings.retain
import typings.std.HTMLElement
import typings.std.RegExp
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * A function to be called on every element encountered by findAndReplaceDOMText.
    * If the function returns false the element will be altogether ignored.
    */
  var filterElements: js.UndefOr[js.Function1[/* el */ HTMLElement, Boolean]] = js.native
  
  /**
    * Something to search for. A string will perform a global search by default (looking for all matches), but a RegExp will only do so if you include the global (/.../g) flag.
    */
  var find: RegExp | String = js.native
  
  /**
    * A boolean or a boolean-returning function that'll be called on every element to determine if it should be considered as its own matching context.
    * More info: https://github.com/padolsey/findAndReplaceDOMText#contexts
    */
  var forceContext: js.UndefOr[Boolean | (js.Function1[/* el */ HTMLElement, Boolean])] = js.native
  
  /**
    * Indicates whether to re-use existing node boundaries when replacing a match with text (i.e. the default, "retain"),
    * or whether to instead place the entire replacement in the first-found match portion's node.
    *
    * Most of the time you'll want the default.
    */
  var portionMode: js.UndefOr[retain | first] = js.native
  
  /**
    * Currently there's only one preset: prose. https://github.com/padolsey/findAndReplaceDOMText#presetprose
    */
  var preset: js.UndefOr[prose | String] = js.native
  
  /**
    * A String of text to replace matches with, or a Function which should return replacement Node or String. If you use a string, it can contain various tokens:
    *
    *  $n to represent the nth captured group of a regular expression (i.e. $1, $2, ...)
    *
    * $0 or $& to represent the entire match
    *
    * $` to represent everything to the left of the match.
    *
    * $' to represent everything to the right of the match.
    */
  var replace: js.UndefOr[
    String | (js.Function2[
      /* portion */ Portion, 
      /* match */ js.UndefOr[js.Any], 
      String | Double | HTMLElement | Text
    ])
  ] = js.native
  
  /**
    * A string representing the node-name of an element that will be wrapped around matches (e.g. span or em).
    *
    * Or a Node (i.e. a stencil node) that we will clone for each match portion.
    */
  var wrap: js.UndefOr[String | HTMLElement] = js.native
  
  /**
    * A string representing the class name to be assigned to the wrapping element (e.g. <span class="myClass">found text</span>).
    *
    * If the wrap option is not specified, then this option is ignored.
    */
  var wrapClass: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(find: RegExp | String): Options = {
    val __obj = js.Dynamic.literal(find = find.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setFind(value: RegExp | String): Self = this.set("find", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterElements(value: /* el */ HTMLElement => Boolean): Self = this.set("filterElements", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilterElements: Self = this.set("filterElements", js.undefined)
    
    @scala.inline
    def setForceContextFunction1(value: /* el */ HTMLElement => Boolean): Self = this.set("forceContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForceContext(value: Boolean | (js.Function1[/* el */ HTMLElement, Boolean])): Self = this.set("forceContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceContext: Self = this.set("forceContext", js.undefined)
    
    @scala.inline
    def setPortionMode(value: retain | first): Self = this.set("portionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortionMode: Self = this.set("portionMode", js.undefined)
    
    @scala.inline
    def setPreset(value: prose | String): Self = this.set("preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreset: Self = this.set("preset", js.undefined)
    
    @scala.inline
    def setReplaceFunction2(
      value: (/* portion */ Portion, /* match */ js.UndefOr[js.Any]) => String | Double | HTMLElement | Text
    ): Self = this.set("replace", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplace(
      value: String | (js.Function2[
          /* portion */ Portion, 
          /* match */ js.UndefOr[js.Any], 
          String | Double | HTMLElement | Text
        ])
    ): Self = this.set("replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
    
    @scala.inline
    def setWrap(value: String | HTMLElement): Self = this.set("wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
    
    @scala.inline
    def setWrapClass(value: String): Self = this.set("wrapClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapClass: Self = this.set("wrapClass", js.undefined)
  }
}
