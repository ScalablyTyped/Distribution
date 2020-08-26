package typings.doublearray.doublearray

import typings.doublearray.anon.All
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoubleArray extends js.Object {
  var bc: BaseAndCheck = js.native
  def calc(): All = js.native
  def commonPrefixSearch(key: String): KeyValue = js.native
  def contain(key: String): Boolean = js.native
  def dump(): String = js.native
  def lookup(key: String): Double = js.native
  def size(): Double = js.native
  def traverse(parent: Double, code: Double): Double = js.native
}

object DoubleArray {
  @scala.inline
  def apply(
    bc: BaseAndCheck,
    calc: () => All,
    commonPrefixSearch: String => KeyValue,
    contain: String => Boolean,
    dump: () => String,
    lookup: String => Double,
    size: () => Double,
    traverse: (Double, Double) => Double
  ): DoubleArray = {
    val __obj = js.Dynamic.literal(bc = bc.asInstanceOf[js.Any], calc = js.Any.fromFunction0(calc), commonPrefixSearch = js.Any.fromFunction1(commonPrefixSearch), contain = js.Any.fromFunction1(contain), dump = js.Any.fromFunction0(dump), lookup = js.Any.fromFunction1(lookup), size = js.Any.fromFunction0(size), traverse = js.Any.fromFunction2(traverse))
    __obj.asInstanceOf[DoubleArray]
  }
  @scala.inline
  implicit class DoubleArrayOps[Self <: DoubleArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBc(value: BaseAndCheck): Self = this.set("bc", value.asInstanceOf[js.Any])
    @scala.inline
    def setCalc(value: () => All): Self = this.set("calc", js.Any.fromFunction0(value))
    @scala.inline
    def setCommonPrefixSearch(value: String => KeyValue): Self = this.set("commonPrefixSearch", js.Any.fromFunction1(value))
    @scala.inline
    def setContain(value: String => Boolean): Self = this.set("contain", js.Any.fromFunction1(value))
    @scala.inline
    def setDump(value: () => String): Self = this.set("dump", js.Any.fromFunction0(value))
    @scala.inline
    def setLookup(value: String => Double): Self = this.set("lookup", js.Any.fromFunction1(value))
    @scala.inline
    def setSize(value: () => Double): Self = this.set("size", js.Any.fromFunction0(value))
    @scala.inline
    def setTraverse(value: (Double, Double) => Double): Self = this.set("traverse", js.Any.fromFunction2(value))
  }
  
}

