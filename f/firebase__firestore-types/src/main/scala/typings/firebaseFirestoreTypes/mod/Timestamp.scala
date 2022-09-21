package typings.firebaseFirestoreTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore-types", "Timestamp")
@js.native
open class Timestamp protected () extends StObject {
  def this(seconds: Double, nanoseconds: Double) = this()
  
  def isEqual(other: Timestamp): Boolean = js.native
  
  val nanoseconds: Double = js.native
  
  val seconds: Double = js.native
  
  def toDate(): js.Date = js.native
  
  def toMillis(): Double = js.native
}
/* static members */
object Timestamp {
  
  @JSImport("@firebase/firestore-types", "Timestamp")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromDate(date: js.Date): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
  
  inline def fromMillis(milliseconds: Double): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
  
  inline def now(): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Timestamp]
}
