package typings.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitResponse extends js.Object {
  /** The Cloud Spanner timestamp at which the transaction committed. */
  var commitTimestamp: js.UndefOr[String] = js.native
}

object CommitResponse {
  @scala.inline
  def apply(): CommitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitResponse]
  }
  @scala.inline
  implicit class CommitResponseOps[Self <: CommitResponse] (val x: Self) extends AnyVal {
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
    def setCommitTimestamp(value: String): Self = this.set("commitTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommitTimestamp: Self = this.set("commitTimestamp", js.undefined)
  }
  
}

