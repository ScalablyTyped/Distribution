package typings.findDown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("find-down", JSImport.Namespace)
  @js.native
  def apply(filename: String): js.Promise[String | Null] = js.native
  @JSImport("find-down", JSImport.Namespace)
  @js.native
  def apply(filename: String, options: Options): js.Promise[String | Null] = js.native
  @JSImport("find-down", JSImport.Namespace)
  @js.native
  def apply(filename: js.Array[String]): js.Promise[String | Null] = js.native
  @JSImport("find-down", JSImport.Namespace)
  @js.native
  def apply(filename: js.Array[String], options: Options): js.Promise[String | Null] = js.native
  
  @js.native
  trait Options extends StObject {
    
    /** Directory to end with. Default: `process.cwd()` */
    var cwd: js.UndefOr[String] = js.native
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
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    }
  }
}
