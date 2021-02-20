package typings.firebaseFirestoreTypes.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @JSImport("@firebase/firestore-types", "Timestamp.fromDate")
  @js.native
  def fromDate(date: Date): Timestamp = js.native
  
  @JSImport("@firebase/firestore-types", "Timestamp.fromMillis")
  @js.native
  def fromMillis(milliseconds: Double): Timestamp = js.native
  
  @JSImport("@firebase/firestore-types", "Timestamp.now")
  @js.native
  def now(): Timestamp = js.native
}
