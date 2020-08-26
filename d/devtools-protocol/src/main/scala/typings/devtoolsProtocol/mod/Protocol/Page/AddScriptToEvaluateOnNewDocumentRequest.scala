package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddScriptToEvaluateOnNewDocumentRequest extends js.Object {
  var source: String = js.native
  /**
    * If specified, creates an isolated world with the given name and evaluates given script in it.
    * This world name will be used as the ExecutionContextDescription::name when the corresponding
    * event is emitted.
    */
  var worldName: js.UndefOr[String] = js.native
}

object AddScriptToEvaluateOnNewDocumentRequest {
  @scala.inline
  def apply(source: String): AddScriptToEvaluateOnNewDocumentRequest = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddScriptToEvaluateOnNewDocumentRequest]
  }
  @scala.inline
  implicit class AddScriptToEvaluateOnNewDocumentRequestOps[Self <: AddScriptToEvaluateOnNewDocumentRequest] (val x: Self) extends AnyVal {
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
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorldName(value: String): Self = this.set("worldName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorldName: Self = this.set("worldName", js.undefined)
  }
  
}

