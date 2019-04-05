package typings
package elasticDashApmDashNodeLib.elasticDashApmDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Span extends GenericSpan {
  var name: java.lang.String = js.native
  // The following properties and methods are currently not documented as their API isn't considered official:
  // customStackTrace(), setDbContext()
  var transaction: Transaction = js.native
  def end(): scala.Unit = js.native
  def end(endTime: scala.Double): scala.Unit = js.native
}

