package typings.enigmaJs

import typings.enigmaJs.enigmaJS.IGeneratedAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApi extends js.Object {
  var api: IGeneratedAPI
  var config: js.Any
}

object AnonApi {
  @scala.inline
  def apply(api: IGeneratedAPI, config: js.Any): AnonApi = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApi]
  }
}

