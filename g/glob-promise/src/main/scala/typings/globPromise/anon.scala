package typings.globPromise

import typings.glob.mod.IGlob
import typings.glob.mod.IOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Fn0 extends StObject {
    
    def apply(pattern: String): js.Array[String] = js.native
    def apply(pattern: String, options: IOptions): js.Array[String] = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(pattern: String, cb: js.Function2[/* err */ Error | Null, /* matches */ js.Array[String], Unit]): IGlob = js.native
    def apply(
      pattern: String,
      options: IOptions,
      cb: js.Function2[/* err */ Error | Null, /* matches */ js.Array[String], Unit]
    ): IGlob = js.native
  }
  
  @js.native
  trait FnCallPatternOptions extends StObject {
    
    def apply(pattern: String): Boolean = js.native
    def apply(pattern: String, options: IOptions): Boolean = js.native
  }
}
