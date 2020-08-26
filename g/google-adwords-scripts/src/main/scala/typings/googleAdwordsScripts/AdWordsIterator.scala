package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdWordsIterator[E] extends js.Object {
  def hasNext(): Boolean = js.native
  def next(): E = js.native
  def totalNumEntities(): Double = js.native
}

object AdWordsIterator {
  @scala.inline
  def apply[E](hasNext: () => Boolean, next: () => E, totalNumEntities: () => Double): AdWordsIterator[E] = {
    val __obj = js.Dynamic.literal(hasNext = js.Any.fromFunction0(hasNext), next = js.Any.fromFunction0(next), totalNumEntities = js.Any.fromFunction0(totalNumEntities))
    __obj.asInstanceOf[AdWordsIterator[E]]
  }
  @scala.inline
  implicit class AdWordsIteratorOps[Self <: AdWordsIterator[_], E] (val x: Self with AdWordsIterator[E]) extends AnyVal {
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
    def setHasNext(value: () => Boolean): Self = this.set("hasNext", js.Any.fromFunction0(value))
    @scala.inline
    def setNext(value: () => E): Self = this.set("next", js.Any.fromFunction0(value))
    @scala.inline
    def setTotalNumEntities(value: () => Double): Self = this.set("totalNumEntities", js.Any.fromFunction0(value))
  }
  
}

