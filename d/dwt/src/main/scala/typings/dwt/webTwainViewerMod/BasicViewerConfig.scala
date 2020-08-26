package typings.dwt.webTwainViewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicViewerConfig extends js.Object {
  /**
    * Specify the size of the viewer.
    */
  var Height: Double | String = js.native
  var Width: Double | String = js.native
  /**
    * Set up the content view.
    */
  var view: ContentView = js.native
}

object BasicViewerConfig {
  @scala.inline
  def apply(Height: Double | String, Width: Double | String, view: ContentView): BasicViewerConfig = {
    val __obj = js.Dynamic.literal(Height = Height.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicViewerConfig]
  }
  @scala.inline
  implicit class BasicViewerConfigOps[Self <: BasicViewerConfig] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double | String): Self = this.set("Height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("Width", value.asInstanceOf[js.Any])
    @scala.inline
    def setView(value: ContentView): Self = this.set("view", value.asInstanceOf[js.Any])
  }
  
}

