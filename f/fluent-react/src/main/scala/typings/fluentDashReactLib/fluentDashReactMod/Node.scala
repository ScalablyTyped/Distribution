package typings
package fluentDashReactLib.fluentDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var TEXT_NODE: fluentDashReactLib.fluentDashReactLibNumbers.`3`
  var localName: js.UndefOr[java.lang.String] = js.undefined
  var nodeType: scala.Double
  var textContext: java.lang.String
}

object Node {
  @scala.inline
  def apply(
    TEXT_NODE: fluentDashReactLib.fluentDashReactLibNumbers.`3`,
    nodeType: scala.Double,
    textContext: java.lang.String,
    localName: java.lang.String = null
  ): Node = {
    val __obj = js.Dynamic.literal(TEXT_NODE = TEXT_NODE, nodeType = nodeType, textContext = textContext)
    if (localName != null) __obj.updateDynamic("localName")(localName)
    __obj.asInstanceOf[Node]
  }
}

