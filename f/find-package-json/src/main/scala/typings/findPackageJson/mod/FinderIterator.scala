package typings.findPackageJson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinderIterator extends js.Object {
  def next(): FindResult
}

object FinderIterator {
  @scala.inline
  def apply(next: () => FindResult): FinderIterator = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[FinderIterator]
  }
}

