package typings.frctlFractal.mod.fractal.api.components

import org.scalablytyped.runtime.StringDictionary
import typings.frctlFractal.anon.Handle
import typings.frctlFractal.mod.fractal.core.StatusInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentConfig extends js.Object {
  var default: js.UndefOr[ComponentDefaultConfig] = js.native
  @JSName("default.collated")
  var defaultDotcollated: js.UndefOr[Boolean] = js.native
  @JSName("default.collator")
  var defaultDotcollator: js.UndefOr[Collator] = js.native
  @JSName("default.context")
  var defaultDotcontext: js.UndefOr[js.Any] = js.native
  @JSName("default.display")
  var defaultDotdisplay: js.UndefOr[js.Any] = js.native
  @JSName("default.prefix")
  var defaultDotprefix: js.UndefOr[String] = js.native
  @JSName("default.preview")
  var defaultDotpreview: js.UndefOr[String] = js.native
  @JSName("default.status")
  var defaultDotstatus: js.UndefOr[String] = js.native
  var ext: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var statuses: js.UndefOr[StringDictionary[StatusInfo]] = js.native
  var title: js.UndefOr[String] = js.native
  var `yield`: js.UndefOr[String] = js.native
}

object ComponentConfig {
  @scala.inline
  def apply(): ComponentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentConfig]
  }
  @scala.inline
  implicit class ComponentConfigOps[Self <: ComponentConfig] (val x: Self) extends AnyVal {
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
    def setDefault(value: ComponentDefaultConfig): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setDefaultDotcollated(value: Boolean): Self = this.set("default.collated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDotcollated: Self = this.set("default.collated", js.undefined)
    @scala.inline
    def setDefaultDotcollator(value: (/* markup */ String, /* item */ Handle) => String): Self = this.set("default.collator", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDefaultDotcollator: Self = this.set("default.collator", js.undefined)
    @scala.inline
    def setDefaultDotcontext(value: js.Any): Self = this.set("default.context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDotcontext: Self = this.set("default.context", js.undefined)
    @scala.inline
    def setDefaultDotdisplay(value: js.Any): Self = this.set("default.display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDotdisplay: Self = this.set("default.display", js.undefined)
    @scala.inline
    def setDefaultDotprefix(value: String): Self = this.set("default.prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDotprefix: Self = this.set("default.prefix", js.undefined)
    @scala.inline
    def setDefaultDotpreview(value: String): Self = this.set("default.preview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDotpreview: Self = this.set("default.preview", js.undefined)
    @scala.inline
    def setDefaultDotstatus(value: String): Self = this.set("default.status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDotstatus: Self = this.set("default.status", js.undefined)
    @scala.inline
    def setExt(value: String): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setStatuses(value: StringDictionary[StatusInfo]): Self = this.set("statuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatuses: Self = this.set("statuses", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setYield(value: String): Self = this.set("yield", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYield: Self = this.set("yield", js.undefined)
  }
  
}

