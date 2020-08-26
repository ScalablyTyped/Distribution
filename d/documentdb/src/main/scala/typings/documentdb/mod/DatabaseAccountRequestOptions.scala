package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseAccountRequestOptions extends RequestOptions {
  /** The endpoint url whose database account needs to be retrieved. If not present, current client's url will be used. */
  var urlConnection: js.UndefOr[String] = js.native
}

object DatabaseAccountRequestOptions {
  @scala.inline
  def apply(): DatabaseAccountRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseAccountRequestOptions]
  }
  @scala.inline
  implicit class DatabaseAccountRequestOptionsOps[Self <: DatabaseAccountRequestOptions] (val x: Self) extends AnyVal {
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
    def setUrlConnection(value: String): Self = this.set("urlConnection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlConnection: Self = this.set("urlConnection", js.undefined)
  }
  
}

