package typings.diff.mod

import org.scalablytyped.runtime.StObject
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
  implicit class WordsOptionsMutableBuilder[Self <: WordsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreWhitespace(value: Boolean): Self = StObject.set(x, "ignoreWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreWhitespaceUndefined: Self = StObject.set(x, "ignoreWhitespace", js.undefined)
  }
}
