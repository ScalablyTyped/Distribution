package typings.firebaseFirestore.indexDotnodeMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/lite/index.node", "Timestamp")
@js.native
class Timestamp protected ()
  extends typings.firebaseFirestore.timestampMod.Timestamp {
  def this(seconds: Double, nanoseconds: Double) = this()
}

/* static members */
@JSImport("@firebase/firestore/dist/packages/firestore/lite/index.node", "Timestamp")
@js.native
object Timestamp extends js.Object {
  def fromDate(date: Date): typings.firebaseFirestore.timestampMod.Timestamp = js.native
  def fromMillis(milliseconds: Double): typings.firebaseFirestore.timestampMod.Timestamp = js.native
  def now(): typings.firebaseFirestore.timestampMod.Timestamp = js.native
}

