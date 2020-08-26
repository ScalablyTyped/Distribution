package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAdministratorWebTokenSpecStoreBuilder extends js.Object {
  /**
    * Whether the Organize apps page is displayed. Default is true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object SchemaAdministratorWebTokenSpecStoreBuilder {
  @scala.inline
  def apply(): SchemaAdministratorWebTokenSpecStoreBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdministratorWebTokenSpecStoreBuilder]
  }
  @scala.inline
  implicit class SchemaAdministratorWebTokenSpecStoreBuilderOps[Self <: SchemaAdministratorWebTokenSpecStoreBuilder] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
  
}

