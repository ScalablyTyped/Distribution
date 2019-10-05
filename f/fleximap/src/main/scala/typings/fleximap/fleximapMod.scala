package typings.fleximap

import typings.fleximap.fleximapMod.KeyChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fleximap", JSImport.Namespace)
@js.native
object fleximapMod extends js.Object {
  @js.native
  class FlexiMap () extends js.Object {
    def this(`object`: js.Array[_]) = this()
    def this(`object`: js.Object) = this()
    def add(keyChain: KeyChain, value: js.Any): Double = js.native
    def concat(keyChain: KeyChain, value: js.Any): js.Any = js.native
    def count(keyChain: KeyChain): Double = js.native
    def get(keyChain: KeyChain): js.Any = js.native
    def getAll(): js.Array[_] | js.Object = js.native
    def getRange(keyChain: KeyChain, fromIndex: Double, toIndex: Double): js.Any = js.native
    def getRaw(keyChain: KeyChain): js.Any = js.native
    def hasImmediateKey(key: String): Boolean = js.native
    def hasKey(keyChain: KeyChain): Boolean = js.native
    def hasObject(keyChain: KeyChain, `object`: js.Object): Boolean = js.native
    def hasType(keyChain: KeyChain, `type`: js.Any): Boolean = js.native
    def hasValue(keyChain: KeyChain, value: js.Any): Boolean = js.native
    def pop(keyChain: KeyChain): js.Array[_] = js.native
    def remove(keyChain: KeyChain): js.Any = js.native
    def removeAll(): Unit = js.native
    def removeRange(keyChain: KeyChain, fromIndex: Double, toIndex: Double): js.Array[_] = js.native
    def set(keyChain: KeyChain, value: js.Any): js.Any = js.native
    def splice(keyChain: KeyChain, index: Double, count: Double, items: js.Any*): js.Array[_] = js.native
  }
  
  type KeyChain = js.Any
}

