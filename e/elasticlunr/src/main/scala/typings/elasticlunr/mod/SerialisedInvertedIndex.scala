package typings.elasticlunr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerialisedInvertedIndex extends js.Object {
  var root: InvertedIndexNode = js.native
}

object SerialisedInvertedIndex {
  @scala.inline
  def apply(root: InvertedIndexNode): SerialisedInvertedIndex = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialisedInvertedIndex]
  }
  @scala.inline
  implicit class SerialisedInvertedIndexOps[Self <: SerialisedInvertedIndex] (val x: Self) extends AnyVal {
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
    def setRoot(value: InvertedIndexNode): Self = this.set("root", value.asInstanceOf[js.Any])
  }
  
}

