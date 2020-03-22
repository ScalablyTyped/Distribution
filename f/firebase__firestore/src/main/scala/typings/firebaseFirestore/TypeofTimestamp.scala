package typings.firebaseFirestore

import org.scalablytyped.runtime.Instantiable2
import typings.firebaseFirestoreTypes.mod.Timestamp
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofTimestamp extends Instantiable2[/* seconds */ Double, /* nanoseconds */ Double, Timestamp] {
  def fromDate(date: Date): Timestamp = js.native
  def fromMillis(milliseconds: Double): Timestamp = js.native
  def now(): Timestamp = js.native
}

