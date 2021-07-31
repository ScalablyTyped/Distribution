package typings.filesizeParser

import typings.filesizeParser.filesizeParserNumbers.`10`
import typings.filesizeParser.filesizeParserNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(size: String): Double = ^.asInstanceOf[js.Dynamic].apply(size.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def apply(size: String, options: Options): Double = (^.asInstanceOf[js.Dynamic].apply(size.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("filesize-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var base: `2` | `10`
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
