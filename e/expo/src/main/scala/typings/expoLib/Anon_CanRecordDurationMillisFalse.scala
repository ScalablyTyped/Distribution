package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanRecordDurationMillisFalse
  extends expoLib.expoMod.AudioNs.RecordingStatus {
  var canRecord: expoLib.expoLibNumbers.`false`
  var durationMillis: scala.Double
  var isDoneRecording: expoLib.expoLibNumbers.`true`
}

object Anon_CanRecordDurationMillisFalse {
  @scala.inline
  def apply(
    canRecord: expoLib.expoLibNumbers.`false`,
    durationMillis: scala.Double,
    isDoneRecording: expoLib.expoLibNumbers.`true`
  ): Anon_CanRecordDurationMillisFalse = {
    val __obj = js.Dynamic.literal(canRecord = canRecord, durationMillis = durationMillis, isDoneRecording = isDoneRecording)
  
    __obj.asInstanceOf[Anon_CanRecordDurationMillisFalse]
  }
}

