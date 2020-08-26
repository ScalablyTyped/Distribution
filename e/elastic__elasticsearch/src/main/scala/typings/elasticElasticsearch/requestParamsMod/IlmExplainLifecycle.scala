package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IlmExplainLifecycle extends Generic {
  var index: String = js.native
  var only_errors: js.UndefOr[Boolean] = js.native
  var only_managed: js.UndefOr[Boolean] = js.native
}

object IlmExplainLifecycle {
  @scala.inline
  def apply(index: String): IlmExplainLifecycle = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IlmExplainLifecycle]
  }
  @scala.inline
  implicit class IlmExplainLifecycleOps[Self <: IlmExplainLifecycle] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setOnly_errors(value: Boolean): Self = this.set("only_errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnly_errors: Self = this.set("only_errors", js.undefined)
    @scala.inline
    def setOnly_managed(value: Boolean): Self = this.set("only_managed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnly_managed: Self = this.set("only_managed", js.undefined)
  }
  
}

