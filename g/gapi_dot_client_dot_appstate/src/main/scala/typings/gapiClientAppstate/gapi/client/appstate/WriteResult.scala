package typings.gapiClientAppstate.gapi.client.appstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteResult extends js.Object {
  /** The version of the data for this key on the server. */
  var currentStateVersion: js.UndefOr[String] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string appstate#writeResult. */
  var kind: js.UndefOr[String] = js.native
  /** The written key. */
  var stateKey: js.UndefOr[Double] = js.native
}

object WriteResult {
  @scala.inline
  def apply(): WriteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteResult]
  }
  @scala.inline
  implicit class WriteResultOps[Self <: WriteResult] (val x: Self) extends AnyVal {
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
    def setCurrentStateVersion(value: String): Self = this.set("currentStateVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentStateVersion: Self = this.set("currentStateVersion", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setStateKey(value: Double): Self = this.set("stateKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateKey: Self = this.set("stateKey", js.undefined)
  }
  
}

