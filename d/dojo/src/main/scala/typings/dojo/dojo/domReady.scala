package typings.dojo.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/domReady.html
  *
  * Plugin to delay require()/define() callback from firing until the DOM has finished loading.
  *
  * @param callback
  */
@js.native
trait domReady extends js.Object {
  def apply(callback: js.Any): Unit = js.native
  /**
    *
    * @param id
    * @param req
    * @param load
    */
  def load(id: js.Any, req: js.Any, load: js.Any): Unit = js.native
}

