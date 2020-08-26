package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptsPainlessExecute[T] extends Generic {
  var body: js.UndefOr[T] = js.native
}

object ScriptsPainlessExecute {
  @scala.inline
  def apply[T](): ScriptsPainlessExecute[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptsPainlessExecute[T]]
  }
  @scala.inline
  implicit class ScriptsPainlessExecuteOps[Self <: ScriptsPainlessExecute[_], T] (val x: Self with ScriptsPainlessExecute[T]) extends AnyVal {
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
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
  }
  
}

