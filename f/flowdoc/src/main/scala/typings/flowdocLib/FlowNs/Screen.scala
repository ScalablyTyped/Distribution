package typings
package flowdocLib.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Screen
  extends flowdocLib.Graphic {
  var children: js.Array[Layer]
  var connections: js.UndefOr[js.Array[Connection]] = js.undefined
  @JSName("type")
  var type_Screen: flowdocLib.flowdocLibStrings.SCREEN
}

