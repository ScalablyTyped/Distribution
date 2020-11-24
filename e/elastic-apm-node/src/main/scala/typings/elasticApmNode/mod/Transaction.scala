package typings.elasticApmNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transaction
  extends GenericSpan
     with StartSpanFn {
  
  def end(): Unit = js.native
  def end(result: js.UndefOr[scala.Nothing], endTime: Double): Unit = js.native
  def end(result: String): Unit = js.native
  def end(result: String, endTime: Double): Unit = js.native
  def end(result: Double): Unit = js.native
  def end(result: Double, endTime: Double): Unit = js.native
  def end(result: Null, endTime: Double): Unit = js.native
  
  def ensureParentId(): String = js.native
  
  // The following properties and methods are currently not documented as their API isn't considered official:
  // setUserContext(), setCustomContext(), toJSON(), setDefaultName(), setDefaultNameFromRequest()
  var name: String = js.native
  
  var result: String | Double = js.native
}
