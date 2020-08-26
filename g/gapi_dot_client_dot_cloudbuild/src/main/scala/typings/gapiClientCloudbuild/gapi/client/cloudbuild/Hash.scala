package typings.gapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hash extends js.Object {
  /** The type of hash that was performed. */
  var `type`: js.UndefOr[String] = js.native
  /** The hash value. */
  var value: js.UndefOr[String] = js.native
}

object Hash {
  @scala.inline
  def apply(): Hash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hash]
  }
  @scala.inline
  implicit class HashOps[Self <: Hash] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

