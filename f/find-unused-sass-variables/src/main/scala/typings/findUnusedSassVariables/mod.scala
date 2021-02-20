package typings.findUnusedSassVariables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("find-unused-sass-variables", "find")
  @js.native
  def find(dir: String): Results = js.native
  @JSImport("find-unused-sass-variables", "find")
  @js.native
  def find(dir: String, options: Options): Results = js.native
  
  @js.native
  trait Options extends StObject {
    
    /** Array of strings of the variables to ignore, e.g. `['$my-var', '$my-second-var']` */
    var ignore: js.UndefOr[js.Array[String]] = js.native
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
      def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Results extends StObject {
    
    /** he sum of all variables in the files (unused and used ones) */
    val total: Double = js.native
    
    /** the array of unused variables */
    val unused: js.Array[String] = js.native
  }
  object Results {
    
    @scala.inline
    def apply(total: Double, unused: js.Array[String]): Results = {
      val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any], unused = unused.asInstanceOf[js.Any])
      __obj.asInstanceOf[Results]
    }
    
    @scala.inline
    implicit class ResultsMutableBuilder[Self <: Results] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnused(value: js.Array[String]): Self = StObject.set(x, "unused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnusedVarargs(value: String*): Self = StObject.set(x, "unused", js.Array(value :_*))
    }
  }
}
