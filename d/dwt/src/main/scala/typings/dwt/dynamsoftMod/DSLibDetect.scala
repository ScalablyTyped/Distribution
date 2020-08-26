package typings.dwt.dynamsoftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DSLibDetect extends js.Object {
  val scriptLoaded: Boolean = js.native
  /**
    * Whether or not the site is secure (Https://).
    */
  val ssl: Boolean = js.native
}

object DSLibDetect {
  @scala.inline
  def apply(scriptLoaded: Boolean, ssl: Boolean): DSLibDetect = {
    val __obj = js.Dynamic.literal(scriptLoaded = scriptLoaded.asInstanceOf[js.Any], ssl = ssl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSLibDetect]
  }
  @scala.inline
  implicit class DSLibDetectOps[Self <: DSLibDetect] (val x: Self) extends AnyVal {
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
    def setScriptLoaded(value: Boolean): Self = this.set("scriptLoaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setSsl(value: Boolean): Self = this.set("ssl", value.asInstanceOf[js.Any])
  }
  
}

