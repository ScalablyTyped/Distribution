package typings.ethereumjsAccount

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ethereumjs-account", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Account {
    def this(data: Any) = this()
  }
  
  @js.native
  trait Account extends StObject {
    
    var balance: Buffer = js.native
    
    var codeHash: Buffer = js.native
    
    def getCode(trie: Trie, cb: TrieGetCb): Unit = js.native
    
    def getStorage(trie: Trie, key: String, cb: TrieGetCb): Unit = js.native
    def getStorage(trie: Trie, key: Buffer, cb: TrieGetCb): Unit = js.native
    
    def isContract(): Boolean = js.native
    
    def isEmpty(): Boolean = js.native
    
    var nonce: Buffer = js.native
    
    def serialize(): Buffer = js.native
    
    def setCode(trie: Trie, code: Buffer, cb: js.Function2[/* err */ Any, /* codeHash */ Buffer, Unit]): Unit = js.native
    
    def setStorage(trie: Trie, key: String, `val`: String, cb: js.Function0[Unit]): Unit = js.native
    def setStorage(trie: Trie, key: String, `val`: Buffer, cb: js.Function0[Unit]): Unit = js.native
    def setStorage(trie: Trie, key: Buffer, `val`: String, cb: js.Function0[Unit]): Unit = js.native
    def setStorage(trie: Trie, key: Buffer, `val`: Buffer, cb: js.Function0[Unit]): Unit = js.native
    
    var stateRoot: Buffer = js.native
  }
  
  @js.native
  trait Trie extends StObject {
    
    def copy(): Trie = js.native
    
    def get(key: String, cb: TrieGetCb): Unit = js.native
    def get(key: Buffer, cb: TrieGetCb): Unit = js.native
    
    def getRaw(key: Buffer, cb: TrieGetCb): Unit = js.native
    
    def put(key: String, value: String, cb: TriePutCb): Unit = js.native
    def put(key: String, value: Buffer, cb: TriePutCb): Unit = js.native
    def put(key: Buffer, value: String, cb: TriePutCb): Unit = js.native
    def put(key: Buffer, value: Buffer, cb: TriePutCb): Unit = js.native
    
    def putRaw(key: String, value: Buffer, cb: TriePutCb): Unit = js.native
    def putRaw(key: Buffer, value: Buffer, cb: TriePutCb): Unit = js.native
    
    var root: Buffer = js.native
  }
  
  type TrieGetCb = js.Function2[/* err */ Any, /* value */ Buffer | Null, Unit]
  
  type TriePutCb = js.Function1[/* err */ js.UndefOr[Any], Unit]
}
