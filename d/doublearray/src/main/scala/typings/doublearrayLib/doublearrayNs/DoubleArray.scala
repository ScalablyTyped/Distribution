package typings
package doublearrayLib.doublearrayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoubleArray extends js.Object {
  var bc: BaseAndCheck
  def calc(): doublearrayLib.Anon_All
  def commonPrefixSearch(key: java.lang.String): KeyValue
  def contain(key: java.lang.String): scala.Boolean
  def dump(): java.lang.String
  def lookup(key: java.lang.String): scala.Double
  def size(): scala.Double
  def traverse(parent: scala.Double, code: scala.Double): scala.Double
}

object DoubleArray {
  @scala.inline
  def apply(
    bc: BaseAndCheck,
    calc: () => doublearrayLib.Anon_All,
    commonPrefixSearch: java.lang.String => KeyValue,
    contain: java.lang.String => scala.Boolean,
    dump: () => java.lang.String,
    lookup: java.lang.String => scala.Double,
    size: () => scala.Double,
    traverse: (scala.Double, scala.Double) => scala.Double
  ): DoubleArray = {
    val __obj = js.Dynamic.literal(bc = bc, calc = js.Any.fromFunction0(calc), commonPrefixSearch = js.Any.fromFunction1(commonPrefixSearch), contain = js.Any.fromFunction1(contain), dump = js.Any.fromFunction0(dump), lookup = js.Any.fromFunction1(lookup), size = js.Any.fromFunction0(size), traverse = js.Any.fromFunction2(traverse))
  
    __obj.asInstanceOf[DoubleArray]
  }
}

