package typings.ethereumjsBlockchain

import typings.lruCache.mod.Options
import typings.lruCache.mod.^
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereumjs-blockchain/dist/cache", JSImport.Namespace)
@js.native
object cacheMod extends js.Object {
  
  @js.native
  trait Cache[V] extends js.Object {
    
    var _cache: ^[String, V] = js.native
    
    def del(key: String): Unit = js.native
    def del(key: Buffer): Unit = js.native
    
    def get(key: String): js.UndefOr[V] = js.native
    def get(key: Buffer): js.UndefOr[V] = js.native
    
    def set(key: String, value: V): Unit = js.native
    def set(key: Buffer, value: V): Unit = js.native
  }
  
  @js.native
  class default[V] protected () extends Cache[V] {
    def this(opts: Options[String, V]) = this()
  }
}
