package typings.elasticlunr.elasticlunrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerialisedInvertedIndex extends js.Object {
  var root: InvertedIndexNode
}

object SerialisedInvertedIndex {
  @scala.inline
  def apply(root: InvertedIndexNode): SerialisedInvertedIndex = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SerialisedInvertedIndex]
  }
}

