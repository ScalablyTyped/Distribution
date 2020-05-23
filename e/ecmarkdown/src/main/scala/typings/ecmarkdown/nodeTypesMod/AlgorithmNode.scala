package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.algorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlgorithmNode extends Node {
  var contents: OrderedListNode
  var location: js.UndefOr[LocationRange] = js.undefined
  var name: algorithm
}

object AlgorithmNode {
  @scala.inline
  def apply(contents: OrderedListNode, name: algorithm, location: LocationRange = null): AlgorithmNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgorithmNode]
  }
}

