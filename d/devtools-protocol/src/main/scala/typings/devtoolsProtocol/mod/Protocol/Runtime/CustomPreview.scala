package typings.devtoolsProtocol.mod.Protocol.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPreview extends js.Object {
  /**
    * If formatter returns true as a result of formatter.hasBody call then bodyGetterId will
    * contain RemoteObjectId for the function that returns result of formatter.body(object, config) call.
    * The result value is json ML array.
    */
  var bodyGetterId: js.UndefOr[RemoteObjectId] = js.native
  /**
    * The JSON-stringified result of formatter.header(object, config) call.
    * It contains json ML array that represents RemoteObject.
    */
  var header: String = js.native
}

object CustomPreview {
  @scala.inline
  def apply(header: String): CustomPreview = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPreview]
  }
  @scala.inline
  implicit class CustomPreviewOps[Self <: CustomPreview] (val x: Self) extends AnyVal {
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
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyGetterId(value: RemoteObjectId): Self = this.set("bodyGetterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyGetterId: Self = this.set("bodyGetterId", js.undefined)
  }
  
}

