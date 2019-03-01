package typings
package enigmaDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Api extends js.Object {
  var api: enigmaDotJsLib.enigmaJSNs.IGeneratedAPI
  var config: js.Any
}

object Anon_Api {
  @scala.inline
  def apply(api: enigmaDotJsLib.enigmaJSNs.IGeneratedAPI, config: js.Any): Anon_Api = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("api")(api)
    __obj.updateDynamic("config")(config)
    __obj.asInstanceOf[Anon_Api]
  }
}

