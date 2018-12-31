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

