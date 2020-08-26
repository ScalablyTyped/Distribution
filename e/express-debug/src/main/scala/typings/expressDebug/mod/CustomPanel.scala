package typings.expressDebug.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPanel extends js.Object {
  @JSName("finalize")
  var finalize_FCustomPanel: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], Unit]] = js.native
  var initialize: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], Unit]] = js.native
  var name: String = js.native
  var options: js.UndefOr[js.Any] = js.native
  var post_render: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], Unit]] = js.native
  var pre_render: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], Unit]] = js.native
  var standalone: js.UndefOr[Boolean] = js.native
  var template: String = js.native
  def process(locals: js.Any): js.Any = js.native
}

object CustomPanel {
  @scala.inline
  def apply(name: String, process: js.Any => js.Any, template: String): CustomPanel = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], process = js.Any.fromFunction1(process), template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPanel]
  }
  @scala.inline
  implicit class CustomPanelOps[Self <: CustomPanel] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcess(value: js.Any => js.Any): Self = this.set("process", js.Any.fromFunction1(value))
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinalize(value: /* req */ Request_[ParamsDictionary, _, _, Query] => Unit): Self = this.set("finalize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFinalize: Self = this.set("finalize", js.undefined)
    @scala.inline
    def setInitialize(value: /* req */ Request_[ParamsDictionary, _, _, Query] => Unit): Self = this.set("initialize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInitialize: Self = this.set("initialize", js.undefined)
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPost_render(value: /* req */ Request_[ParamsDictionary, _, _, Query] => Unit): Self = this.set("post_render", js.Any.fromFunction1(value))
    @scala.inline
    def deletePost_render: Self = this.set("post_render", js.undefined)
    @scala.inline
    def setPre_render(value: /* req */ Request_[ParamsDictionary, _, _, Query] => Unit): Self = this.set("pre_render", js.Any.fromFunction1(value))
    @scala.inline
    def deletePre_render: Self = this.set("pre_render", js.undefined)
    @scala.inline
    def setStandalone(value: Boolean): Self = this.set("standalone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandalone: Self = this.set("standalone", js.undefined)
  }
  
}

