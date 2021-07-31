package typings.firebaseFirestoreTypes.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore-types", "Timestamp")
@js.native
class Timestamp protected () extends StObject {
  def this(seconds: Double, nanoseconds: Double) = this()
  
  def isEqual(other: Timestamp): Boolean = js.native
  
  val nanoseconds: Double = js.native
  
  val seconds: Double = js.native
  
  def toDate(): Date = js.native
  
  def toMillis(): Double = js.native
}
/* static members */
object Timestamp {
  
  @JSImport("@firebase/firestore-types", "Timestamp")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromDate(date: Date): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
  
  @scala.inline
  def fromMillis(milliseconds: Double): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
  
  @scala.inline
  def now(): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Timestamp]
}
