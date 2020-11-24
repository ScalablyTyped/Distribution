package typings.gaze.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * The current working directory to base file patterns from. Default is `process.cwd()`.
    */
  var cwd: js.UndefOr[String] = js.native
  
  /**
    * Delay for events called in succession for the same file/event in milliseconds.
    */
  var debounceDelay: js.UndefOr[Double] = js.native
  
  /**
    * Interval to pass to fs.watchFile.
    */
  var interval: js.UndefOr[Double] = js.native
  
  /**
    * Force the watch mode. Either 'auto' (default),
    * 'watch' (force native events), or 'poll' (force stat polling).
    */
  var mode: js.UndefOr[Mode] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setDebounceDelay(value: Double): Self = this.set("debounceDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebounceDelay: Self = this.set("debounceDelay", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setMode(value: Mode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
}
