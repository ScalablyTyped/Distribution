package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsIterator[E] extends js.Object {
  def hasNext(): Boolean
  def next(): E
  def totalNumEntities(): Double
}

object AdWordsIterator {
  @scala.inline
  def apply[E](hasNext: () => Boolean, next: () => E, totalNumEntities: () => Double): AdWordsIterator[E] = {
    val __obj = js.Dynamic.literal(hasNext = js.Any.fromFunction0(hasNext), next = js.Any.fromFunction0(next), totalNumEntities = js.Any.fromFunction0(totalNumEntities))
    __obj.asInstanceOf[AdWordsIterator[E]]
  }
}

