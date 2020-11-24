package typings.googleProtobuf.timestampPbMod

import typings.googleProtobuf.mod.Message
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/timestamp_pb", "Timestamp")
@js.native
class Timestamp_ () extends Message {
  
  def fromDate(date: Date): Unit = js.native
  
  def getNanos(): Double = js.native
  
  def getSeconds(): Double = js.native
  
  def setNanos(value: Double): Timestamp = js.native
  
  def setSeconds(value: Double): Timestamp = js.native
  
  def toDate(): Date = js.native
}
