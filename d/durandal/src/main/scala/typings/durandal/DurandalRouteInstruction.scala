package typings.durandal

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurandalRouteInstruction extends js.Object {
  var config: DurandalRouteConfiguration
  var fragment: String
  var params: js.Array[_]
  var queryParams: StringDictionary[js.Any]
  var queryString: String
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
}

