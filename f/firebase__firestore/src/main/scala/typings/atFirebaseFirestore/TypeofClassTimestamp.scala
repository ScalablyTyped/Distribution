package typings.atFirebaseFirestore

import org.scalablytyped.runtime.Instantiable2
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.Timestamp
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassTimestamp extends Instantiable2[/* seconds */ Double, /* nanoseconds */ Double, Timestamp] {
  def fromDate(date: Date): Timestamp = js.native
  def fromMillis(milliseconds: Double): Timestamp = js.native
  def now(): Timestamp = js.native
}

