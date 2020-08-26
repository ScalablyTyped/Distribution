package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IlmRetry extends Generic {
  var index: String = js.native
}

object IlmRetry {
  @scala.inline
  def apply(index: String): IlmRetry = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IlmRetry]
  }
  @scala.inline
  implicit class IlmRetryOps[Self <: IlmRetry] (val x: Self) extends AnyVal {
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
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
  }
  
}

