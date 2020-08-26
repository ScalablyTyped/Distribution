package typings.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceConfig extends js.Object {
  /** The name of this instance configuration as it appears in UIs. */
  var displayName: js.UndefOr[String] = js.native
  /**
    * A unique identifier for the instance configuration.  Values
    * are of the form
    * `projects/<project>/instanceConfigs/a-z&#42;`
    */
  var name: js.UndefOr[String] = js.native
}

object InstanceConfig {
  @scala.inline
  def apply(): InstanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceConfig]
  }
  @scala.inline
  implicit class InstanceConfigOps[Self <: InstanceConfig] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

