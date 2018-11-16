package typings
package fusionchartsLib.fusionchartsMod.FusionChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EventObject extends js.Object {
  var cancelled: scala.Boolean
  var detached: scala.Boolean
  var eventId: scala.Double
  var prevented: scala.Boolean
  var sender: FusionCharts
  var `type`: java.lang.String
  def detachHandler(): scala.Unit
  def preventDefault(): scala.Unit
  def stopPropagation(): scala.Unit
}

