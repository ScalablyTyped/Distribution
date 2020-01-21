package typings.fluentReact.mod

import typings.fluentReact.fluentReactNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var TEXT_NODE: `3`
  var localName: js.UndefOr[String] = js.undefined
  var nodeType: Double
  var textContext: String
}

object Node {
  @scala.inline
  def apply(TEXT_NODE: `3`, nodeType: Double, textContext: String, localName: String = null): Node = {
    val __obj = js.Dynamic.literal(TEXT_NODE = TEXT_NODE.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], textContext = textContext.asInstanceOf[js.Any])
    if (localName != null) __obj.updateDynamic("localName")(localName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

