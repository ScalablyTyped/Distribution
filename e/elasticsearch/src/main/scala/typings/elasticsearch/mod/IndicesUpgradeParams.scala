package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicesUpgradeParams extends GenericParams {
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.native
  var ignoreUnavailable: js.UndefOr[Boolean] = js.native
  var index: NameList = js.native
  var onlyAncientSegments: js.UndefOr[Boolean] = js.native
  var waitForCompletion: js.UndefOr[Boolean] = js.native
}

object IndicesUpgradeParams {
  @scala.inline
  def apply(index: NameList): IndicesUpgradeParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesUpgradeParams]
  }
  @scala.inline
  implicit class IndicesUpgradeParamsOps[Self <: IndicesUpgradeParams] (val x: Self) extends AnyVal {
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
    def setIndexVarargs(value: String*): Self = this.set("index", js.Array(value :_*))
    @scala.inline
    def setIndex(value: NameList): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandWildcards(value: ExpandWildcards): Self = this.set("expandWildcards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandWildcards: Self = this.set("expandWildcards", js.undefined)
    @scala.inline
    def setIgnoreUnavailable(value: Boolean): Self = this.set("ignoreUnavailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreUnavailable: Self = this.set("ignoreUnavailable", js.undefined)
    @scala.inline
    def setOnlyAncientSegments(value: Boolean): Self = this.set("onlyAncientSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyAncientSegments: Self = this.set("onlyAncientSegments", js.undefined)
    @scala.inline
    def setWaitForCompletion(value: Boolean): Self = this.set("waitForCompletion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForCompletion: Self = this.set("waitForCompletion", js.undefined)
  }
  
}

