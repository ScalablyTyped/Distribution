package typings.furiganaMarkdownIt

import typings.markdownIt.libMod.PluginSimple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A markdown-it plugin which adds furigana support.
    */
  inline def apply(): PluginSimple = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[PluginSimple]
  inline def apply(options: Options): PluginSimple = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[PluginSimple]
  
  @JSImport("furigana-markdown-it", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Options can be provided during initialization of the plugin
    */
  trait Options extends StObject {
    
    /**
      * combinators are characters that allow you to indicate a kanji boundary
      * without actually splitting the furigana between these kanji (read the usage section).
      *
      * Default combinators are + and ＋.
      * If you need additional combinator characters, provide them with this option.
      */
    var extraCombinators: js.UndefOr[String] = js.undefined
    
    /**
      * separators are characters that allow you to split furigana between individual kanji (read the usage section).
      * Any kind of space is a separator, as well as these characters: `.．。・|｜/／`.
      *
      * If you want additional characters to act as separators, provide them with this option.
      */
    var extraSeparators: js.UndefOr[String] = js.undefined
    
    /**
      * fallback parentheses to use in contexts where <ruby> tags are unavailable.
      * By default the plugin uses 【】 for fallback,
      * so [漢字]{かんじ} becomes 漢字【かんじ】 on a rare browser without <ruby> support.
      *
      * This option takes a string with the opening bracket followed by the closing bracket.
      */
    var fallbackParens: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExtraCombinators(value: String): Self = StObject.set(x, "extraCombinators", value.asInstanceOf[js.Any])
      
      inline def setExtraCombinatorsUndefined: Self = StObject.set(x, "extraCombinators", js.undefined)
      
      inline def setExtraSeparators(value: String): Self = StObject.set(x, "extraSeparators", value.asInstanceOf[js.Any])
      
      inline def setExtraSeparatorsUndefined: Self = StObject.set(x, "extraSeparators", js.undefined)
      
      inline def setFallbackParens(value: String): Self = StObject.set(x, "fallbackParens", value.asInstanceOf[js.Any])
      
      inline def setFallbackParensUndefined: Self = StObject.set(x, "fallbackParens", js.undefined)
    }
  }
}
