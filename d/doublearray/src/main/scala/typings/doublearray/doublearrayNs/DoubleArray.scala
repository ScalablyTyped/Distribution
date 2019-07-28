package typings.doublearray.doublearrayNs

import typings.doublearray.Anon_All
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoubleArray extends js.Object {
  var bc: BaseAndCheck
  def calc(): Anon_All
  def commonPrefixSearch(key: String): KeyValue
  def contain(key: String): Boolean
  def dump(): String
  def lookup(key: String): Double
  def size(): Double
  def traverse(parent: Double, code: Double): Double
}

object DoubleArray {
  @scala.inline
  def apply(
    bc: BaseAndCheck,
    calc: () => Anon_All,
    commonPrefixSearch: String => KeyValue,
    contain: String => Boolean,
    dump: () => String,
    lookup: String => Double,
    size: () => Double,
    traverse: (Double, Double) => Double
  ): DoubleArray = {
    val __obj = js.Dynamic.literal(bc = bc, calc = js.Any.fromFunction0(calc), commonPrefixSearch = js.Any.fromFunction1(commonPrefixSearch), contain = js.Any.fromFunction1(contain), dump = js.Any.fromFunction0(dump), lookup = js.Any.fromFunction1(lookup), size = js.Any.fromFunction0(size), traverse = js.Any.fromFunction2(traverse))
  
    __obj.asInstanceOf[DoubleArray]
  }
}

