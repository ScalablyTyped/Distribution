package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@fullcalendar/core/internal-common", "cJ")
@js.native
open class cJ_ protected ()
  extends StObject
     with NamedTimeZoneImpl {
  def this(timeZoneName: String) = this()
  
  /* CompleteClass */
  override def offsetForArray(a: js.Array[Double]): Double = js.native
  
  /* CompleteClass */
  var timeZoneName: String = js.native
  
  /* CompleteClass */
  override def timestampToArray(ms: Double): js.Array[Double] = js.native
}
