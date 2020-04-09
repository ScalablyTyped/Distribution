package typings.firebaseFirestore

import typings.firebaseFirestore.apiTimestampMod.Timestamp
import typings.firebaseFirestore.firestoreProtoApiMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/model/server_timestamps", JSImport.Namespace)
@js.native
object modelServerTimestampsMod extends js.Object {
  def getLocalWriteTime(value: Value): Timestamp = js.native
  def getPreviousValue(value: Value): Value | Null = js.native
  def isServerTimestamp(): Boolean = js.native
  def isServerTimestamp(value: Value): Boolean = js.native
  def serverTimestamp(localWriteTime: Timestamp): Value = js.native
  def serverTimestamp(localWriteTime: Timestamp, previousValue: Value): Value = js.native
}

