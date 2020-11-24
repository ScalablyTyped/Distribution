package typings.eventemitter2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaitForOptions extends js.Object {
  
  /**
    * @default Promise
    */
  var Promise: js.Function = js.native
  
  /**
    * @default null
    */
  def filter(values: js.Any*): Boolean = js.native
  /**
    * @default null
    */
  @JSName("filter")
  var filter_Original: WaitForFilter = js.native
  
  /**
    * @default false
    */
  var handleError: Boolean = js.native
  
  /**
    * @default false
    */
  var overload: Boolean = js.native
  
  /**
    * @default 0
    */
  var timeout: Double = js.native
}
