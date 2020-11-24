package typings.epilogue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("epilogue", "BaseController")
@js.native
class BaseController protected () extends js.Object {
  def this(options: BaseContollerOptions) = this()
  
  var endpoint: Endpoint = js.native
  
  var model: js.Any = js.native
}
