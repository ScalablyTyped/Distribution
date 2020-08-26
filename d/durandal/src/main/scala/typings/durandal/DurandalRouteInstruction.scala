package typings.durandal

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DurandalRouteInstruction extends js.Object {
  var config: DurandalRouteConfiguration = js.native
  var fragment: String = js.native
  var params: js.Array[_] = js.native
  var queryParams: StringDictionary[js.Any] = js.native
  var queryString: String = js.native
}

object DurandalRouteInstruction {
  @scala.inline
  def apply(
    config: DurandalRouteConfiguration,
    fragment: String,
    params: js.Array[_],
    queryParams: StringDictionary[js.Any],
    queryString: String
  ): DurandalRouteInstruction = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], queryParams = queryParams.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurandalRouteInstruction]
  }
  @scala.inline
  implicit class DurandalRouteInstructionOps[Self <: DurandalRouteInstruction] (val x: Self) extends AnyVal {
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
    def setConfig(value: DurandalRouteConfiguration): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setFragment(value: String): Self = this.set("fragment", value.asInstanceOf[js.Any])
    @scala.inline
    def setParamsVarargs(value: js.Any*): Self = this.set("params", js.Array(value :_*))
    @scala.inline
    def setParams(value: js.Array[_]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryParams(value: StringDictionary[js.Any]): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryString(value: String): Self = this.set("queryString", value.asInstanceOf[js.Any])
  }
  
}

