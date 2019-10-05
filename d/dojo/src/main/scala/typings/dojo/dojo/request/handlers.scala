package typings.dojo.dojo.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/request/handlers.html
  *
  *
  * @param response
  */
@js.native
trait handlers extends js.Object {
  def apply(response: js.Any): Unit = js.native
  /**
    *
    * @param name
    * @param handler
    */
  def register(name: js.Any, handler: js.Any): Unit = js.native
}

