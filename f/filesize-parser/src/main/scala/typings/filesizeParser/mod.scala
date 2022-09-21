package typings.filesizeParser

import typings.filesizeParser.filesizeParserNumbers.`10`
import typings.filesizeParser.filesizeParserNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(size: String): Double = ^.asInstanceOf[js.Dynamic].apply(size.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(size: String, options: Options): Double = (^.asInstanceOf[js.Dynamic].apply(size.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(size: Double): Double = ^.asInstanceOf[js.Dynamic].apply(size.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(size: Double, options: Options): Double = (^.asInstanceOf[js.Dynamic].apply(size.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("filesize-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var base: `2` | `10`
  }
  object Options {
    
    inline def apply(base: `2` | `10`): Options = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBase(value: `2` | `10`): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    }
  }
}
