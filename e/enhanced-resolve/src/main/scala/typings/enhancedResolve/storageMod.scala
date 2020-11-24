package typings.enhancedResolve

import typings.enhancedResolve.commonTypesMod.CommonFileSystemMethod
import typings.enhancedResolve.concordMod.Dictionary
import typings.enhancedResolve.enhancedResolveBooleans.`true`
import typings.node.NodeJS.ErrnoException
import typings.node.NodeJS.Timer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("enhanced-resolve/lib/Storage", JSImport.Namespace)
@js.native
object storageMod extends js.Object {
  
  @js.native
  trait Storage extends js.Object {
    
    def checkTicks(): Unit = js.native
    
    var count: Double = js.native
    
    var data: Dictionary[_] = js.native
    
    var duration: Double = js.native
    
    def ensureTick(): Unit = js.native
    
    def finished(name: String, err: Null, result: js.Any): Unit = js.native
    def finished(name: String, err: ErrnoException, result: js.Any): Unit = js.native
    
    def finishedSync(name: String): Unit = js.native
    def finishedSync(name: String, err: Null, result: js.Any): Unit = js.native
    def finishedSync(name: String, err: ErrnoException): Unit = js.native
    def finishedSync(name: String, err: ErrnoException, result: js.Any): Unit = js.native
    
    var interval: Timer | Null = js.native
    
    var levels: js.Array[js.Array[String]] = js.native
    
    var needTickCheck: Boolean = js.native
    
    var nextTick: Double | Null = js.native
    
    var passive: Boolean = js.native
    
    def provide(name: String, provider: CommonFileSystemMethod, callback: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def provideSync(name: String, provider: js.Function1[/* name */ String, _]): js.Any = js.native
    
    def purge(): Unit = js.native
    def purge(what: String): Unit = js.native
    def purge(what: js.Array[String]): Unit = js.native
    
    var running: Dictionary[js.Array[js.Function]] = js.native
    
    def tick(): js.UndefOr[`true`] = js.native
  }
  
  @js.native
  class default protected () extends Storage {
    def this(duration: Double) = this()
  }
}
