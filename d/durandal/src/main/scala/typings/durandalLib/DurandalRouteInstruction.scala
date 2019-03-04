package typings
package durandalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurandalRouteInstruction extends js.Object {
  var config: DurandalRouteConfiguration
  var fragment: java.lang.String
  var params: js.Array[_]
  var queryParams: org.scalablytyped.runtime.StringDictionary[js.Any]
  var queryString: java.lang.String
}

object DurandalRouteInstruction {
  @scala.inline
  def apply(
    config: DurandalRouteConfiguration,
    fragment: java.lang.String,
    params: js.Array[_],
    queryParams: org.scalablytyped.runtime.StringDictionary[js.Any],
    queryString: java.lang.String
  ): DurandalRouteInstruction = {
    val __obj = js.Dynamic.literal(config = config, fragment = fragment, params = params, queryParams = queryParams, queryString = queryString)
  
    __obj.asInstanceOf[DurandalRouteInstruction]
  }
}

