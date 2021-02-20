package typings.forkTsCheckerWebpackPlugin

import typings.node.eventsMod.EventEmitter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getWatcherMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/hooks/getWatcher", "getWatcher")
  @js.native
  def getWatcher(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
  ): js.UndefOr[Watcher] = js.native
  
  @js.native
  trait Watcher extends EventEmitter {
    
    var mtimes: Record[String, Double] = js.native
  }
}
