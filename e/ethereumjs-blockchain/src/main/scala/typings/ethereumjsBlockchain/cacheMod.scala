package typings.ethereumjsBlockchain

import typings.lruCache.mod.Options
import typings.lruCache.mod.^
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheMod {
  
  @JSImport("ethereumjs-blockchain/dist/cache", JSImport.Default)
  @js.native
  class default[V] protected () extends Cache[V] {
    def this(opts: Options[String, V]) = this()
  }
  
  @js.native
  trait Cache[V] extends StObject {
    
    var _cache: ^[String, V] = js.native
    
    def del(key: String): Unit = js.native
    def del(key: Buffer): Unit = js.native
    
    def get(key: String): js.UndefOr[V] = js.native
    def get(key: Buffer): js.UndefOr[V] = js.native
    
    def set(key: String, value: V): Unit = js.native
    def set(key: Buffer, value: V): Unit = js.native
  }
}
