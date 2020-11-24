package typings.expressServeStaticCore.mod

import typings.qs.mod.ParsedQs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Express extends Application {
  
  var request: Request[ParamsDictionary, _, _, ParsedQs] = js.native
  
  var response: Response[_, Double] = js.native
}
