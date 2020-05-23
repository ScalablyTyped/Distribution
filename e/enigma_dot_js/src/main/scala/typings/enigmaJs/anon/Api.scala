package typings.enigmaJs.anon

import typings.enigmaJs.enigmaJS.IGeneratedAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Api extends js.Object {
  var api: IGeneratedAPI
  var config: js.Any
}

object Api {
  @scala.inline
  def apply(api: IGeneratedAPI, config: js.Any): Api = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[Api]
  }
}

