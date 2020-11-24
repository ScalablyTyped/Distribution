package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Meter")
@js.native
class Meter protected () extends js.Object {
  def this(registrar: js.Any, `object`: js.Any) = this()
  
  def base(): Unit = js.native
  
  def getType(): js.Any = js.native
  
  def getUri(): js.Any = js.native
}
/* static members */
@JSImport("gitana", "Meter")
@js.native
object Meter extends js.Object {
  
  var FIELD_BILLABLE_BYTE_COUNT: String = js.native
  
  var FIELD_BILLABLE_BYTE_COUNT_PERCENTAGE: String = js.native
  
  var FIELD_BILLABLE_OBJECT_COUNT: String = js.native
  
  var FIELD_BILLABLE_OBJECT_COUNT_PERCENTAGE: String = js.native
  
  var FIELD_MAX_BYTE_COUNT: String = js.native
  
  var FIELD_MAX_OBJECT_COUNT: String = js.native
  
  var FIELD_METER_END: String = js.native
  
  var FIELD_METER_START: String = js.native
  
  var FIELD_METER_TYPE: String = js.native
  
  var FIELD_RAW_BYTE_COUNT: String = js.native
  
  var FIELD_RAW_BYTE_COUNT_PERCENTAGE: String = js.native
  
  var FIELD_RAW_OBJECT_COUNT: String = js.native
  
  var FIELD_RAW_OBJECT_COUNT_PERCENTAGE: String = js.native
  
  var FIELD_TENANT_ID: String = js.native
  
  var FIELD_UNPROCESSED_BYTE_COUNT: String = js.native
  
  var FIELD_UNPROCESSED_OBJECT_COUNT: String = js.native
  
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  def implement(args: js.Any*): js.Any = js.native
  
  def valueOf(`type`: js.Any): js.Any = js.native
}
