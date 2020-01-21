package typings.googleProtobuf.timestampPbMod

import typings.googleProtobuf.mod.Message
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/timestamp_pb", "Timestamp")
@js.native
class Timestamp_ () extends Message {
  def fromDate(date: Date): Unit = js.native
  def getNanos(): Double = js.native
  def getSeconds(): Double = js.native
  def setNanos(value: Double): Unit = js.native
  def setSeconds(value: Double): Unit = js.native
  def toDate(): Date = js.native
}

