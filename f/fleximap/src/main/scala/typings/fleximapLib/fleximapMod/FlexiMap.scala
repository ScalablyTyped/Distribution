package typings
package fleximapLib.fleximapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fleximap", "FlexiMap")
@js.native
class FlexiMap () extends js.Object {
  def this(`object`: js.Array[_]) = this()
  def this(`object`: js.Object) = this()
  def add(keyChain: KeyChain, value: js.Any): scala.Double = js.native
  def concat(keyChain: KeyChain, value: js.Any): js.Any = js.native
  def count(keyChain: KeyChain): scala.Double = js.native
  def get(keyChain: KeyChain): js.Any = js.native
  def getAll(): js.Array[_] | js.Object = js.native
  def getRange(keyChain: KeyChain, fromIndex: scala.Double, toIndex: scala.Double): js.Any = js.native
  def getRaw(keyChain: KeyChain): js.Any = js.native
  def hasImmediateKey(key: java.lang.String): scala.Boolean = js.native
  def hasKey(keyChain: KeyChain): scala.Boolean = js.native
  def hasObject(keyChain: KeyChain, `object`: js.Object): scala.Boolean = js.native
  def hasType(keyChain: KeyChain, `type`: js.Any): scala.Boolean = js.native
  def hasValue(keyChain: KeyChain, value: js.Any): scala.Boolean = js.native
  def pop(keyChain: KeyChain): js.Array[_] = js.native
  def remove(keyChain: KeyChain): js.Any = js.native
  def removeAll(): scala.Unit = js.native
  def removeRange(keyChain: KeyChain, fromIndex: scala.Double, toIndex: scala.Double): js.Array[_] = js.native
  def set(keyChain: KeyChain, value: js.Any): js.Any = js.native
  def splice(keyChain: KeyChain, index: scala.Double, count: scala.Double, items: js.Any*): js.Array[_] = js.native
}

