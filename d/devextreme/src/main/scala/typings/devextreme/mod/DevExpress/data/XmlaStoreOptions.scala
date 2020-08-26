package typings.devextreme.mod.DevExpress.data

import typings.devextreme.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlaStoreOptions extends js.Object {
  /** @name XmlaStore.Options.beforeSend */
  var beforeSend: js.UndefOr[js.Function1[/* options */ Data, _]] = js.native
  /** @name XmlaStore.Options.catalog */
  var catalog: js.UndefOr[String] = js.native
  /** @name XmlaStore.Options.cube */
  var cube: js.UndefOr[String] = js.native
  /** @name XmlaStore.Options.url */
  var url: js.UndefOr[String] = js.native
}

object XmlaStoreOptions {
  @scala.inline
  def apply(): XmlaStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlaStoreOptions]
  }
  @scala.inline
  implicit class XmlaStoreOptionsOps[Self <: XmlaStoreOptions] (val x: Self) extends AnyVal {
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
    def setBeforeSend(value: /* options */ Data => _): Self = this.set("beforeSend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeSend: Self = this.set("beforeSend", js.undefined)
    @scala.inline
    def setCatalog(value: String): Self = this.set("catalog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalog: Self = this.set("catalog", js.undefined)
    @scala.inline
    def setCube(value: String): Self = this.set("cube", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCube: Self = this.set("cube", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

