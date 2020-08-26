package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings.green
import typings.elasticsearch.elasticsearchStrings.red
import typings.elasticsearch.elasticsearchStrings.yellow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatIndicesParams extends CatCommonParams {
  var bytes: js.UndefOr[CatBytes] = js.native
  var health: js.UndefOr[green | yellow | red] = js.native
  var index: js.UndefOr[NameList] = js.native
  var pri: js.UndefOr[Boolean] = js.native
}

object CatIndicesParams {
  @scala.inline
  def apply(format: String): CatIndicesParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatIndicesParams]
  }
  @scala.inline
  implicit class CatIndicesParamsOps[Self <: CatIndicesParams] (val x: Self) extends AnyVal {
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
    def setBytes(value: CatBytes): Self = this.set("bytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytes: Self = this.set("bytes", js.undefined)
    @scala.inline
    def setHealth(value: green | yellow | red): Self = this.set("health", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealth: Self = this.set("health", js.undefined)
    @scala.inline
    def setIndexVarargs(value: String*): Self = this.set("index", js.Array(value :_*))
    @scala.inline
    def setIndex(value: NameList): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setPri(value: Boolean): Self = this.set("pri", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePri: Self = this.set("pri", js.undefined)
  }
  
}

