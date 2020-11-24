package typings.globPromise

import org.scalablytyped.runtime.Instantiable1
import typings.glob.mod.Glob_
import typings.glob.mod.IGlob
import typings.glob.mod.IGlobStatic
import typings.glob.mod.IGlobSyncStatic
import typings.glob.mod.IOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Call extends js.Object {
    
    def apply(pattern: String, cb: js.Function2[/* err */ Error | Null, /* matches */ js.Array[String], Unit]): IGlob = js.native
    def apply(
      pattern: String,
      options: IOptions,
      cb: js.Function2[/* err */ Error | Null, /* matches */ js.Array[String], Unit]
    ): IGlob = js.native
    
    var Glob: (Instantiable1[/* pattern */ String, Glob_]) with IGlobStatic = js.native
    
    var GlobSync: (Instantiable1[/* pattern */ String, typings.glob.mod.GlobSync]) with IGlobSyncStatic = js.native
    
    var glob: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof G */ js.Any = js.native
    
    def hasMagic(pattern: String): Boolean = js.native
    def hasMagic(pattern: String, options: IOptions): Boolean = js.native
    
    def sync(pattern: String): js.Array[String] = js.native
    def sync(pattern: String, options: IOptions): js.Array[String] = js.native
  }
  
  @js.native
  trait FnCall extends js.Object {
    
    def apply(pattern: String): Boolean = js.native
    def apply(pattern: String, options: IOptions): Boolean = js.native
  }
  
  @js.native
  trait FnCallPatternOptions extends js.Object {
    
    def apply(pattern: String): js.Array[String] = js.native
    def apply(pattern: String, options: IOptions): js.Array[String] = js.native
  }
}
