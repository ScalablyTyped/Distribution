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
    calc: js.Function0[doublearrayLib.Anon_All],
    commonPrefixSearch: js.Function1[java.lang.String, KeyValue],
    contain: js.Function1[java.lang.String, scala.Boolean],
    dump: js.Function0[java.lang.String],
    lookup: js.Function1[java.lang.String, scala.Double],
    size: js.Function0[scala.Double],
    traverse: js.Function2[scala.Double, scala.Double, scala.Double]
  ): DoubleArray = {
    val __obj = js.Dynamic.literal(bc = bc, calc = calc, commonPrefixSearch = commonPrefixSearch, contain = contain, dump = dump, lookup = lookup, size = size, traverse = traverse)
  
    __obj.asInstanceOf[DoubleArray]
  }
}

