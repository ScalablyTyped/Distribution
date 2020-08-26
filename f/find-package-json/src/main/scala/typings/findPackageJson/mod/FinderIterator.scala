package typings.findPackageJson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinderIterator extends js.Object {
  def next(): FindResult = js.native
}

object FinderIterator {
  @scala.inline
  def apply(next: () => FindResult): FinderIterator = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[FinderIterator]
  }
  @scala.inline
  implicit class FinderIteratorOps[Self <: FinderIterator] (val x: Self) extends AnyVal {
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
    def setNext(value: () => FindResult): Self = this.set("next", js.Any.fromFunction0(value))
  }
  
}

