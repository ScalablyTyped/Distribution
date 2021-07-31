package typings.findDown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(filename: String): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Null]]
  @scala.inline
  def apply(filename: String, options: Options): js.Promise[String | Null] = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Null]]
  @scala.inline
  def apply(filename: js.Array[String]): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Null]]
  @scala.inline
  def apply(filename: js.Array[String], options: Options): js.Promise[String | Null] = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Null]]
  
  @JSImport("find-down", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /** Directory to end with. Default: `process.cwd()` */
    var cwd: js.UndefOr[String] = js.undefined
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
