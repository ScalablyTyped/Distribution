package typings.googleFeeds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait findResult extends js.Object {
  var error: js.UndefOr[feedError] = js.native
  var findEntries: js.Array[findEntry] = js.native
  var xmlDocument: js.UndefOr[String] = js.native
}

object findResult {
  @scala.inline
  def apply(findEntries: js.Array[findEntry]): findResult = {
    val __obj = js.Dynamic.literal(findEntries = findEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[findResult]
  }
  @scala.inline
  implicit class findResultOps[Self <: findResult] (val x: Self) extends AnyVal {
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
    def setFindEntriesVarargs(value: findEntry*): Self = this.set("findEntries", js.Array(value :_*))
    @scala.inline
    def setFindEntries(value: js.Array[findEntry]): Self = this.set("findEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: feedError): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setXmlDocument(value: String): Self = this.set("xmlDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmlDocument: Self = this.set("xmlDocument", js.undefined)
  }
  
}

