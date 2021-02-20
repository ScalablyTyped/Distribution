package typings.findandreplacedomtext

import typings.findandreplacedomtext.findandreplacedomtextStrings.first
import typings.findandreplacedomtext.findandreplacedomtextStrings.prose
import typings.findandreplacedomtext.findandreplacedomtextStrings.retain
import typings.std.HTMLElement
import typings.std.RegExp
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * findAndReplaceDOMText searches for regular expression matches in a given DOM node and replaces or wraps each match with a node or piece of text that you can specify.
    */
  @JSImport("findandreplacedomtext", JSImport.Namespace)
  @js.native
  def apply(node: HTMLElement, options: Options): Return = js.native
  
  @js.native
  trait Options extends StObject {
    
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
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilterElements(value: /* el */ HTMLElement => Boolean): Self = StObject.set(x, "filterElements", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterElementsUndefined: Self = StObject.set(x, "filterElements", js.undefined)
      
      @scala.inline
      def setFind(value: RegExp | String): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceContext(value: Boolean | (js.Function1[/* el */ HTMLElement, Boolean])): Self = StObject.set(x, "forceContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceContextFunction1(value: /* el */ HTMLElement => Boolean): Self = StObject.set(x, "forceContext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForceContextUndefined: Self = StObject.set(x, "forceContext", js.undefined)
      
      @scala.inline
      def setPortionMode(value: retain | first): Self = StObject.set(x, "portionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortionModeUndefined: Self = StObject.set(x, "portionMode", js.undefined)
      
      @scala.inline
      def setPreset(value: prose | String): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
      
      @scala.inline
      def setReplace(
        value: String | (js.Function2[
              /* portion */ Portion, 
              /* match */ js.UndefOr[js.Any], 
              String | Double | HTMLElement | Text
            ])
      ): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceFunction2(
        value: (/* portion */ Portion, /* match */ js.UndefOr[js.Any]) => String | Double | HTMLElement | Text
      ): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      @scala.inline
      def setWrap(value: String | HTMLElement): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapClass(value: String): Self = StObject.set(x, "wrapClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapClassUndefined: Self = StObject.set(x, "wrapClass", js.undefined)
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  @js.native
  trait Portion extends StObject {
    
    var endIndexInNode: Double = js.native
    
    var index: Double = js.native
    
    var indexInMatch: Double = js.native
    
    var indexInNode: Double = js.native
    
    var isEnd: Boolean = js.native
    
    var node: HTMLElement = js.native
    
    var text: String = js.native
  }
  object Portion {
    
    @scala.inline
    def apply(
      endIndexInNode: Double,
      index: Double,
      indexInMatch: Double,
      indexInNode: Double,
      isEnd: Boolean,
      node: HTMLElement,
      text: String
    ): Portion = {
      val __obj = js.Dynamic.literal(endIndexInNode = endIndexInNode.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], indexInMatch = indexInMatch.asInstanceOf[js.Any], indexInNode = indexInNode.asInstanceOf[js.Any], isEnd = isEnd.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Portion]
    }
    
    @scala.inline
    implicit class PortionMutableBuilder[Self <: Portion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndIndexInNode(value: Double): Self = StObject.set(x, "endIndexInNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexInMatch(value: Double): Self = StObject.set(x, "indexInMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexInNode(value: Double): Self = StObject.set(x, "indexInNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEnd(value: Boolean): Self = StObject.set(x, "isEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Return extends StObject {
    
    /**
      * Reversion occurs backwards so as to avoid nodes subsequently replaced during the matching phase.
      */
    def revert(): Return = js.native
  }
  object Return {
    
    @scala.inline
    def apply(revert: () => Return): Return = {
      val __obj = js.Dynamic.literal(revert = js.Any.fromFunction0(revert))
      __obj.asInstanceOf[Return]
    }
    
    @scala.inline
    implicit class ReturnMutableBuilder[Self <: Return] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRevert(value: () => Return): Self = StObject.set(x, "revert", js.Any.fromFunction0(value))
    }
  }
}
