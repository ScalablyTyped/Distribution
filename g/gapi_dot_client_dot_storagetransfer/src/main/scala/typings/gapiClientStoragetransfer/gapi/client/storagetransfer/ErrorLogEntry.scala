package typings.gapiClientStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorLogEntry extends js.Object {
  /** A list of messages that carry the error details. */
  var errorDetails: js.UndefOr[js.Array[String]] = js.native
  /**
    * A URL that refers to the target (a data source, a data sink,
    * or an object) with which the error is associated.
    * Required.
    */
  var url: js.UndefOr[String] = js.native
}

object ErrorLogEntry {
  @scala.inline
  def apply(): ErrorLogEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorLogEntry]
  }
  @scala.inline
  implicit class ErrorLogEntryOps[Self <: ErrorLogEntry] (val x: Self) extends AnyVal {
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
    def setErrorDetailsVarargs(value: String*): Self = this.set("errorDetails", js.Array(value :_*))
    @scala.inline
    def setErrorDetails(value: js.Array[String]): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

