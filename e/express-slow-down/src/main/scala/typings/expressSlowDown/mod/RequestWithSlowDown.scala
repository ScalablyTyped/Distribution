package typings.expressSlowDown.mod

import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Express Request with the added `slowDown` property
  */
@js.native
trait RequestWithSlowDown
  extends Request[ParamsDictionary, js.Any, js.Any, Query] {
  
  var slowDown: SlowDownRequestAugmentation = js.native
}
