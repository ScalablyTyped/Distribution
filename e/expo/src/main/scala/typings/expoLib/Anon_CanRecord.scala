package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanRecord
  extends expoLib.expoMod.AudioNs.RecordingStatus {
  var canRecord: expoLib.expoLibNumbers.`false`
  var isDoneRecording: expoLib.expoLibNumbers.`false`
}

object Anon_CanRecord {
  @scala.inline
  def apply(canRecord: expoLib.expoLibNumbers.`false`, isDoneRecording: expoLib.expoLibNumbers.`false`): Anon_CanRecord = {
    val __obj = js.Dynamic.literal(canRecord = canRecord, isDoneRecording = isDoneRecording)
  
    __obj.asInstanceOf[Anon_CanRecord]
  }
}

