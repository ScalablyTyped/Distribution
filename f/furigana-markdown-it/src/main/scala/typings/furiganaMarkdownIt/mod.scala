package typings.furiganaMarkdownIt

import typings.markdownIt.libMod.PluginSimple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A markdown-it plugin which adds furigana support.
    */
  @JSImport("furigana-markdown-it", JSImport.Namespace)
  @js.native
  def apply(): PluginSimple = js.native
  @JSImport("furigana-markdown-it", JSImport.Namespace)
  @js.native
  def apply(options: Options): PluginSimple = js.native
  
  /**
    * Options can be provided during initialization of the plugin
    */
  @js.native
  trait Options extends StObject {
    
    /**
      * combinators are characters that allow you to indicate a kanji boundary
      * without actually splitting the furigana between these kanji (read the usage section).
      *
      * Default combinators are + and ＋.
      * If you need additional combinator characters, provide them with this option.
      */
    var extraCombinators: js.UndefOr[String] = js.native
    
    /**
      * separators are characters that allow you to split furigana between individual kanji (read the usage section).
      * Any kind of space is a separator, as well as these characters: `.．。・|｜/／`.
      *
      * If you want additional characters to act as separators, provide them with this option.
      */
    var extraSeparators: js.UndefOr[String] = js.native
    
    /**
      * fallback parentheses to use in contexts where <ruby> tags are unavailable.
      * By default the plugin uses 【】 for fallback,
      * so [漢字]{かんじ} becomes 漢字【かんじ】 on a rare browser without <ruby> support.
      *
      * This option takes a string with the opening bracket followed by the closing bracket.
      */
    var fallbackParens: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtraCombinators(value: String): Self = StObject.set(x, "extraCombinators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraCombinatorsUndefined: Self = StObject.set(x, "extraCombinators", js.undefined)
      
      @scala.inline
      def setExtraSeparators(value: String): Self = StObject.set(x, "extraSeparators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraSeparatorsUndefined: Self = StObject.set(x, "extraSeparators", js.undefined)
      
      @scala.inline
      def setFallbackParens(value: String): Self = StObject.set(x, "fallbackParens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackParensUndefined: Self = StObject.set(x, "fallbackParens", js.undefined)
    }
  }
}
