package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanRecordDurationMillis
  extends expoLib.expoMod.AudioNs.RecordingStatus {
  var canRecord: expoLib.expoLibNumbers.`true`
  var durationMillis: scala.Double
  var isRecording: scala.Boolean
}

object Anon_CanRecordDurationMillis {
  @scala.inline
  def apply(canRecord: expoLib.expoLibNumbers.`true`, durationMillis: scala.Double, isRecording: scala.Boolean): Anon_CanRecordDurationMillis = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canRecord")(canRecord)
    __obj.updateDynamic("durationMillis")(durationMillis)
    __obj.updateDynamic("isRecording")(isRecording)
    __obj.asInstanceOf[Anon_CanRecordDurationMillis]
  }
}

