package typings.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WordsOptions extends BaseOptions {
  
  /**
    * `true` to ignore leading and trailing whitespace. This is the same as `diffWords()`.
    */
  var ignoreWhitespace: js.UndefOr[Boolean] = js.native
}
object WordsOptions {
  
  @scala.inline
  def apply(): WordsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordsOptions]
  }
  
  @scala.inline
  implicit class WordsOptionsOps[Self <: WordsOptions] (val x: Self) extends AnyVal {
    
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
    def setIgnoreWhitespace(value: Boolean): Self = this.set("ignoreWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreWhitespace: Self = this.set("ignoreWhitespace", js.undefined)
  }
}
