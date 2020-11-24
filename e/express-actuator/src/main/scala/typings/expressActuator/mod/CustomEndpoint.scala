package typings.expressActuator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomEndpoint extends js.Object {
  
  /**
    * @summary Controller to be called when accessing this endpoint
    */
  def controller(): Unit = js.native
  def controller(req: js.UndefOr[scala.Nothing], res: js.Any): Unit = js.native
  def controller(req: js.Any): Unit = js.native
  def controller(req: js.Any, res: js.Any): Unit = js.native
  /**
    * @summary Controller to be called when accessing this endpoint
    */
  @JSName("controller")
  var controller_Original: CustomControllerMethod = js.native
  
  /**
    * @summary Used as endpoint `/id` or `${basePath}/id`
    */
  var id: String = js.native
}
