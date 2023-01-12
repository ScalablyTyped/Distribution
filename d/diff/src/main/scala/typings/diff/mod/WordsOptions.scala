package typings.diff.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WordsOptions
  extends StObject
     with BaseOptions {
  
  /**
    * `true` to ignore leading and trailing whitespace. This is the same as `diffWords()`.
    */
  var ignoreWhitespace: js.UndefOr[Boolean] = js.undefined
}
object WordsOptions {
  
  inline def apply(): WordsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WordsOptions] (val x: Self) extends AnyVal {
    
    inline def setIgnoreWhitespace(value: Boolean): Self = StObject.set(x, "ignoreWhitespace", value.asInstanceOf[js.Any])
    
    inline def setIgnoreWhitespaceUndefined: Self = StObject.set(x, "ignoreWhitespace", js.undefined)
  }
}
