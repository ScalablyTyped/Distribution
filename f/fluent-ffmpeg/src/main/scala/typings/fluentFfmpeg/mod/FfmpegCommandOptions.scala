package typings.fluentFfmpeg.mod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FfmpegCommandOptions extends js.Object {
  
  var cwd: js.UndefOr[String] = js.native
  
  var logger: js.UndefOr[FfmpegCommandLogger] = js.native
  
  var niceness: js.UndefOr[Double] = js.native
  
  var preset: js.UndefOr[String] = js.native
  
  var presets: js.UndefOr[String] = js.native
  
  var priority: js.UndefOr[Double] = js.native
  
  var source: js.UndefOr[String | Readable] = js.native
  
  var stdoutLines: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object FfmpegCommandOptions {
  
  @scala.inline
  def apply(): FfmpegCommandOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FfmpegCommandOptions]
  }
  
  @scala.inline
  implicit class FfmpegCommandOptionsOps[Self <: FfmpegCommandOptions] (val x: Self) extends AnyVal {
    
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
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    
    @scala.inline
    def setLogger(value: FfmpegCommandLogger): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setNiceness(value: Double): Self = this.set("niceness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNiceness: Self = this.set("niceness", js.undefined)
    
    @scala.inline
    def setPreset(value: String): Self = this.set("preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreset: Self = this.set("preset", js.undefined)
    
    @scala.inline
    def setPresets(value: String): Self = this.set("presets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePresets: Self = this.set("presets", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setSource(value: String | Readable): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setStdoutLines(value: Double): Self = this.set("stdoutLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdoutLines: Self = this.set("stdoutLines", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
