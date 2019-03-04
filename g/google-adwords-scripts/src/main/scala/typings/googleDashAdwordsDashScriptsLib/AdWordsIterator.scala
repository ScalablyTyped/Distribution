package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsIterator[E] extends js.Object {
  def hasNext(): scala.Boolean
  def next(): E
  def totalNumEntities(): scala.Double
}

object AdWordsIterator {
  @scala.inline
  def apply[E](
    hasNext: js.Function0[scala.Boolean],
    next: js.Function0[E],
    totalNumEntities: js.Function0[scala.Double]
  ): AdWordsIterator[E] = {
    val __obj = js.Dynamic.literal(hasNext = hasNext, next = next, totalNumEntities = totalNumEntities)
  
    __obj.asInstanceOf[AdWordsIterator[E]]
  }
}

