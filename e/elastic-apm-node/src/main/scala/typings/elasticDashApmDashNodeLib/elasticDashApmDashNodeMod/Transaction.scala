package typings
package elasticDashApmDashNodeLib.elasticDashApmDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction
  extends GenericSpan
     with StartSpanFn {
  // The following properties and methods are currently not documented as their API isn't considered official:
  // setUserContext(), setCustomContext(), toJSON(), setDefaultName(), setDefaultNameFromRequest()
  var name: java.lang.String = js.native
  var result: java.lang.String | scala.Double = js.native
  def end(): scala.Unit = js.native
  def end(result: java.lang.String): scala.Unit = js.native
  def end(result: java.lang.String, endTime: scala.Double): scala.Unit = js.native
  def end(result: scala.Double): scala.Unit = js.native
  def end(result: scala.Double, endTime: scala.Double): scala.Unit = js.native
  def end(result: scala.Null, endTime: scala.Double): scala.Unit = js.native
  def ensureParentId(): java.lang.String = js.native
}

