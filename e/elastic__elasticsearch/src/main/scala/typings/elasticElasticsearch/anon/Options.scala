package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var id: js.Any = js.native
  var options: TransportRequestOptions = js.native
  var params: TransportRequestParams = js.native
}

object Options {
  @scala.inline
  def apply(id: js.Any, options: TransportRequestOptions, params: TransportRequestParams): Options = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: TransportRequestOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: TransportRequestParams): Self = this.set("params", value.asInstanceOf[js.Any])
  }
  
}

