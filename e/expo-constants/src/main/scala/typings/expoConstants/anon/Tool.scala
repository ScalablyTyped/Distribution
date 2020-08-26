package typings.expoConstants.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tool
  extends /* key */ StringDictionary[js.Any] {
  var tool: js.UndefOr[String] = js.native
}

object Tool {
  @scala.inline
  def apply(): Tool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tool]
  }
  @scala.inline
  implicit class ToolOps[Self <: Tool] (val x: Self) extends AnyVal {
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
    def setTool(value: String): Self = this.set("tool", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTool: Self = this.set("tool", js.undefined)
  }
  
}

