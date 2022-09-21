package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "NamedTimeZoneImpl")
@js.native
abstract class NamedTimeZoneImpl protected () extends StObject {
  def this(timeZoneName: String) = this()
  
  def offsetForArray(a: js.Array[Double]): Double = js.native
  
  var timeZoneName: String = js.native
  
  def timestampToArray(ms: Double): js.Array[Double] = js.native
}
