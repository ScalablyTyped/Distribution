package typings.elasticElasticsearch.poolMod

import typings.elasticElasticsearch.connectionMod.default
import typings.elasticElasticsearch.transportMod.nodeFilterFn
import typings.elasticElasticsearch.transportMod.nodeSelectorFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait getConnectionOptions extends js.Object {
  var filter: js.UndefOr[nodeFilterFn] = js.native
  var name: js.UndefOr[String] = js.native
  var now: js.UndefOr[Double] = js.native
  var requestId: js.UndefOr[String | Double] = js.native
  var selector: js.UndefOr[nodeSelectorFn] = js.native
}

object getConnectionOptions {
  @scala.inline
  def apply(): getConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[getConnectionOptions]
  }
  @scala.inline
  implicit class getConnectionOptionsOps[Self <: getConnectionOptions] (val x: Self) extends AnyVal {
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
    def setFilter(value: /* connection */ default => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNow(value: Double): Self = this.set("now", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNow: Self = this.set("now", js.undefined)
    @scala.inline
    def setRequestId(value: String | Double): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
    @scala.inline
    def setSelector(value: /* connections */ js.Array[default] => default): Self = this.set("selector", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
  
}

