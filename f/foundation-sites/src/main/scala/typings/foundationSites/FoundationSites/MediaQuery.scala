package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaQuery extends js.Object {
  var current: String = js.native
  var queries: js.Array[String] = js.native
  def atLeast(size: String): Boolean = js.native
  def get(size: String): String = js.native
}

object MediaQuery {
  @scala.inline
  def apply(atLeast: String => Boolean, current: String, get: String => String, queries: js.Array[String]): MediaQuery = {
    val __obj = js.Dynamic.literal(atLeast = js.Any.fromFunction1(atLeast), current = current.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), queries = queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQuery]
  }
  @scala.inline
  implicit class MediaQueryOps[Self <: MediaQuery] (val x: Self) extends AnyVal {
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
    def setAtLeast(value: String => Boolean): Self = this.set("atLeast", js.Any.fromFunction1(value))
    @scala.inline
    def setCurrent(value: String): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: String => String): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setQueriesVarargs(value: String*): Self = this.set("queries", js.Array(value :_*))
    @scala.inline
    def setQueries(value: js.Array[String]): Self = this.set("queries", value.asInstanceOf[js.Any])
  }
  
}

