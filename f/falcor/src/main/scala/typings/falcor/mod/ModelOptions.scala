package typings.falcor.mod

import typings.falcorJsonGraph.mod.JSONGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelOptions extends js.Object {
  var cache: js.UndefOr[JSONGraph] = js.native
  var collectRatio: js.UndefOr[Double] = js.native
  var comparator: js.UndefOr[ModelComparator] = js.native
  var errorSelector: js.UndefOr[ModelErrorSelector] = js.native
  var maxSize: js.UndefOr[Double] = js.native
  var onChange: js.UndefOr[ModelOnChange] = js.native
  var source: js.UndefOr[DataSource] = js.native
}

object ModelOptions {
  @scala.inline
  def apply(): ModelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelOptions]
  }
  @scala.inline
  implicit class ModelOptionsOps[Self <: ModelOptions] (val x: Self) extends AnyVal {
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
    def setCache(value: JSONGraph): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setCollectRatio(value: Double): Self = this.set("collectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectRatio: Self = this.set("collectRatio", js.undefined)
    @scala.inline
    def setComparator(value: (/* existingValue */ js.Any, /* newValue */ js.Any) => Boolean): Self = this.set("comparator", js.Any.fromFunction2(value))
    @scala.inline
    def deleteComparator: Self = this.set("comparator", js.undefined)
    @scala.inline
    def setErrorSelector(value: /* jsonGraphError */ js.Any => js.Any): Self = this.set("errorSelector", js.Any.fromFunction1(value))
    @scala.inline
    def deleteErrorSelector: Self = this.set("errorSelector", js.undefined)
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    @scala.inline
    def setOnChange(value: () => Unit): Self = this.set("onChange", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setSource(value: DataSource): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

