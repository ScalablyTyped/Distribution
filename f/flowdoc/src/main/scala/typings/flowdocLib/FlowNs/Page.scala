package typings
package flowdocLib.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Page
  extends flowdocLib.Node {
  var backgroundColor: Color
  var children: js.Array[Screen | Image | Rectangle | Ellipse | Diamond]
  var startNodeID: js.UndefOr[java.lang.String] = js.undefined
  @JSName("type")
  var type_Page: flowdocLib.flowdocLibStrings.PAGE
}

