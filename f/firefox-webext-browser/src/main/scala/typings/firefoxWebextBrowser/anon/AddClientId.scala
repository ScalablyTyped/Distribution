package typings.firefoxWebextBrowser.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddClientId extends js.Object {
  /** True if the ping should contain the client id. */
  var addClientId: js.UndefOr[Boolean] = js.native
  /** True if the ping should contain the environment data. */
  var addEnvironment: js.UndefOr[Boolean] = js.native
  /** Set to override the environment data. */
  var overrideEnvironment: js.UndefOr[StringDictionary[js.Any]] = js.native
  /** If true, send the ping using the PingSender. */
  var usePingSender: js.UndefOr[Boolean] = js.native
}

object AddClientId {
  @scala.inline
  def apply(): AddClientId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddClientId]
  }
  @scala.inline
  implicit class AddClientIdOps[Self <: AddClientId] (val x: Self) extends AnyVal {
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
    def setAddClientId(value: Boolean): Self = this.set("addClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddClientId: Self = this.set("addClientId", js.undefined)
    @scala.inline
    def setAddEnvironment(value: Boolean): Self = this.set("addEnvironment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddEnvironment: Self = this.set("addEnvironment", js.undefined)
    @scala.inline
    def setOverrideEnvironment(value: StringDictionary[js.Any]): Self = this.set("overrideEnvironment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrideEnvironment: Self = this.set("overrideEnvironment", js.undefined)
    @scala.inline
    def setUsePingSender(value: Boolean): Self = this.set("usePingSender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsePingSender: Self = this.set("usePingSender", js.undefined)
  }
  
}

