package typings.expressServeStaticCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Express extends Application {
  var request: Request[ParamsDictionary, _, _, Query] = js.native
  var response: Response[_] = js.native
}

