package typings.filesizeParser

import typings.filesizeParser.filesizeParserNumbers.`10`
import typings.filesizeParser.filesizeParserNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("filesize-parser", JSImport.Namespace)
  @js.native
  def apply(size: String): Double = js.native
  @JSImport("filesize-parser", JSImport.Namespace)
  @js.native
  def apply(size: String, options: Options): Double = js.native
  
  @js.native
  trait Options extends StObject {
    
    var base: `2` | `10` = js.native
  }
  object Options {
    
    @scala.inline
    def apply(base: `2` | `10`): Options = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: `2` | `10`): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    }
  }
}
