package typings.devextreme.mod.DevExpress.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalStoreOptions extends ArrayStoreOptions[LocalStore] {
  /** @name LocalStore.Options.flushInterval */
  var flushInterval: js.UndefOr[Double] = js.native
  /** @name LocalStore.Options.immediate */
  var immediate: js.UndefOr[Boolean] = js.native
  /** @name LocalStore.Options.name */
  var name: js.UndefOr[String] = js.native
}

object LocalStoreOptions {
  @scala.inline
  def apply(): LocalStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalStoreOptions]
  }
  @scala.inline
  implicit class LocalStoreOptionsOps[Self <: LocalStoreOptions] (val x: Self) extends AnyVal {
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
    def setFlushInterval(value: Double): Self = this.set("flushInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlushInterval: Self = this.set("flushInterval", js.undefined)
    @scala.inline
    def setImmediate(value: Boolean): Self = this.set("immediate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImmediate: Self = this.set("immediate", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

