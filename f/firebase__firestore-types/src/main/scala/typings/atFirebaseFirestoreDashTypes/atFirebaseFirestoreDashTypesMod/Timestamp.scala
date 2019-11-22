package typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore-types", "Timestamp")
@js.native
class Timestamp protected () extends js.Object {
  def this(seconds: Double, nanoseconds: Double) = this()
  val nanoseconds: Double = js.native
  val seconds: Double = js.native
  def isEqual(other: Timestamp): Boolean = js.native
  def toDate(): Date = js.native
  def toMillis(): Double = js.native
}

/* static members */
@JSImport("@firebase/firestore-types", "Timestamp")
@js.native
object Timestamp extends js.Object {
  def fromDate(date: Date): Timestamp = js.native
  def fromMillis(milliseconds: Double): Timestamp = js.native
  def now(): Timestamp = js.native
}

