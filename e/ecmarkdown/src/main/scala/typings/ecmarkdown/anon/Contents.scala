package typings.ecmarkdown.anon

import typings.ecmarkdown.ecmarkdownStrings.algorithm
import typings.ecmarkdown.nodeTypesMod.OrderedListNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contents extends js.Object {
  var contents: OrderedListNode
  var name: algorithm
}

object Contents {
  @scala.inline
  def apply(contents: OrderedListNode, name: algorithm): Contents = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contents]
  }
}

