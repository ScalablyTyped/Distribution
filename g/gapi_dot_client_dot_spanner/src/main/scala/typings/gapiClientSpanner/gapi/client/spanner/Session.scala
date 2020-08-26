package typings.gapiClientSpanner.gapi.client.spanner

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Session extends js.Object {
  /**
    * Output only. The approximate timestamp when the session is last used. It is
    * typically earlier than the actual last use time.
    */
  var approximateLastUseTime: js.UndefOr[String] = js.native
  /** Output only. The timestamp when the session is created. */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The labels for the session.
    *
    * &#42; Label keys must be between 1 and 63 characters long and must conform to
    * the following regular expression: `[a-z]([-a-z0-9]&#42;[a-z0-9])?`.
    * &#42; Label values must be between 0 and 63 characters long and must conform
    * to the regular expression `([a-z]([-a-z0-9]&#42;[a-z0-9])?)?`.
    * &#42; No more than 20 labels can be associated with a given session.
    */
  var labels: js.UndefOr[Record[String, String]] = js.native
  /** The name of the session. */
  var name: js.UndefOr[String] = js.native
}

object Session {
  @scala.inline
  def apply(): Session = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Session]
  }
  @scala.inline
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
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
    def setApproximateLastUseTime(value: String): Self = this.set("approximateLastUseTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApproximateLastUseTime: Self = this.set("approximateLastUseTime", js.undefined)
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setLabels(value: Record[String, String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

