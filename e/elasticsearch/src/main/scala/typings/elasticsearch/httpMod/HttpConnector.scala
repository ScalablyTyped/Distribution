package typings.elasticsearch.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpConnector extends js.Object {
  // onStatusSet(handler: (status: any) => void): void;
  def createAgent(config: js.Any): js.Any = js.native
  def makeAgentConfig(config: js.Any): js.Any = js.native
  def makeReqParams(params: js.Any): js.Any = js.native
  def request(
    params: js.Any,
    callback: js.Function4[
      /* error */ js.Any, 
      /* response */ js.Any, 
      /* status */ js.Any, 
      /* headers */ js.Any, 
      Unit
    ]
  ): Unit = js.native
}

object HttpConnector {
  @scala.inline
  def apply(
    createAgent: js.Any => js.Any,
    makeAgentConfig: js.Any => js.Any,
    makeReqParams: js.Any => js.Any,
    request: (js.Any, js.Function4[
      /* error */ js.Any, 
      /* response */ js.Any, 
      /* status */ js.Any, 
      /* headers */ js.Any, 
      Unit
    ]) => Unit
  ): HttpConnector = {
    val __obj = js.Dynamic.literal(createAgent = js.Any.fromFunction1(createAgent), makeAgentConfig = js.Any.fromFunction1(makeAgentConfig), makeReqParams = js.Any.fromFunction1(makeReqParams), request = js.Any.fromFunction2(request))
    __obj.asInstanceOf[HttpConnector]
  }
  @scala.inline
  implicit class HttpConnectorOps[Self <: HttpConnector] (val x: Self) extends AnyVal {
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
    def setCreateAgent(value: js.Any => js.Any): Self = this.set("createAgent", js.Any.fromFunction1(value))
    @scala.inline
    def setMakeAgentConfig(value: js.Any => js.Any): Self = this.set("makeAgentConfig", js.Any.fromFunction1(value))
    @scala.inline
    def setMakeReqParams(value: js.Any => js.Any): Self = this.set("makeReqParams", js.Any.fromFunction1(value))
    @scala.inline
    def setRequest(
      value: (js.Any, js.Function4[
          /* error */ js.Any, 
          /* response */ js.Any, 
          /* status */ js.Any, 
          /* headers */ js.Any, 
          Unit
        ]) => Unit
    ): Self = this.set("request", js.Any.fromFunction2(value))
  }
  
}

