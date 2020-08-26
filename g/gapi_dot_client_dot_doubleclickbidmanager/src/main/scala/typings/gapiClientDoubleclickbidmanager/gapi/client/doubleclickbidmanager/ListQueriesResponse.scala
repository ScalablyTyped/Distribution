package typings.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQueriesResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "doubleclickbidmanager#listQueriesResponse". */
  var kind: js.UndefOr[String] = js.native
  /** Retrieved queries. */
  var queries: js.UndefOr[js.Array[Query]] = js.native
}

object ListQueriesResponse {
  @scala.inline
  def apply(): ListQueriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueriesResponse]
  }
  @scala.inline
  implicit class ListQueriesResponseOps[Self <: ListQueriesResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setQueriesVarargs(value: Query*): Self = this.set("queries", js.Array(value :_*))
    @scala.inline
    def setQueries(value: js.Array[Query]): Self = this.set("queries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueries: Self = this.set("queries", js.undefined)
  }
  
}

