package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericParams extends js.Object {
  var body: js.UndefOr[js.Any] = js.native
  var filterPath: js.UndefOr[String | js.Array[String]] = js.native
  var ignore: js.UndefOr[Double | js.Array[Double]] = js.native
  var maxRetries: js.UndefOr[Double] = js.native
  var method: js.UndefOr[String] = js.native
  var requestTimeout: js.UndefOr[Double] = js.native
}

object GenericParams {
  @scala.inline
  def apply(): GenericParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericParams]
  }
  @scala.inline
  implicit class GenericParamsOps[Self <: GenericParams] (val x: Self) extends AnyVal {
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
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setFilterPathVarargs(value: String*): Self = this.set("filterPath", js.Array(value :_*))
    @scala.inline
    def setFilterPath(value: String | js.Array[String]): Self = this.set("filterPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterPath: Self = this.set("filterPath", js.undefined)
    @scala.inline
    def setIgnoreVarargs(value: Double*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: Double | js.Array[Double]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setRequestTimeout(value: Double): Self = this.set("requestTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestTimeout: Self = this.set("requestTimeout", js.undefined)
  }
  
}

