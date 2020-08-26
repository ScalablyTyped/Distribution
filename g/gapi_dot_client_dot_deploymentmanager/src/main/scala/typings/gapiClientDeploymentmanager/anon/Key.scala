package typings.gapiClientDeploymentmanager.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Key extends js.Object {
  /**
    * [Output Only] A key that provides more detail on the warning being returned. For example, for warnings where there are no results in a list request for
    * a particular zone, this key might be scope and the key value might be the zone name. Other examples might be a key indicating a deprecated resource and
    * a suggested replacement, or a warning about invalid network settings (for example, if an instance attempts to perform IP forwarding but is not enabled
    * for IP forwarding).
    */
  var key: js.UndefOr[String] = js.native
  /** [Output Only] A warning data value corresponding to the key. */
  var value: js.UndefOr[String] = js.native
}

object Key {
  @scala.inline
  def apply(): Key = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Key]
  }
  @scala.inline
  implicit class KeyOps[Self <: Key] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

