package typings.furiganaMarkdownIt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options can be provided during initialization of the plugin
  */
@js.native
trait Options extends js.Object {
  
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
    def setExtraCombinators(value: String): Self = this.set("extraCombinators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraCombinators: Self = this.set("extraCombinators", js.undefined)
    
    @scala.inline
    def setExtraSeparators(value: String): Self = this.set("extraSeparators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraSeparators: Self = this.set("extraSeparators", js.undefined)
    
    @scala.inline
    def setFallbackParens(value: String): Self = this.set("fallbackParens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackParens: Self = this.set("fallbackParens", js.undefined)
  }
}
