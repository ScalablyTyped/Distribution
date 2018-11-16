package typings
package flowdocLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Shape extends Node {
  var connections: js.UndefOr[js.Array[flowdocLib.FlowNs.Connection]] = js.undefined
  var position: flowdocLib.FlowNs.Point
  var size: flowdocLib.FlowNs.Size
}

