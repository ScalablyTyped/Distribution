package typings.evaporate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferStats extends js.Object {
  
  var fileSize: Double = js.native
  
  var loaded: Double = js.native
  
  var readableSpeed: String = js.native
  
  var remainingSize: Double = js.native
  
  var secondsLeft: Double = js.native
  
  var speed: Double = js.native
  
  var totalUploaded: Double = js.native
}
object TransferStats {
  
  @scala.inline
  def apply(
    fileSize: Double,
    loaded: Double,
    readableSpeed: String,
    remainingSize: Double,
    secondsLeft: Double,
    speed: Double,
    totalUploaded: Double
  ): TransferStats = {
    val __obj = js.Dynamic.literal(fileSize = fileSize.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], readableSpeed = readableSpeed.asInstanceOf[js.Any], remainingSize = remainingSize.asInstanceOf[js.Any], secondsLeft = secondsLeft.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], totalUploaded = totalUploaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferStats]
  }
  
  @scala.inline
  implicit class TransferStatsOps[Self <: TransferStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFileSize(value: Double): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaded(value: Double): Self = this.set("loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadableSpeed(value: String): Self = this.set("readableSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemainingSize(value: Double): Self = this.set("remainingSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondsLeft(value: Double): Self = this.set("secondsLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUploaded(value: Double): Self = this.set("totalUploaded", value.asInstanceOf[js.Any])
  }
}
