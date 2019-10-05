package typings.dojo.dojo.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/request/registry.html
  *
  *
  * @param url
  * @param options
  */
@js.native
trait registry extends js.Object {
  def apply(url: js.Any, options: js.Any): Unit = js.native
  /**
    *
    * @param id
    * @param parentRequire
    * @param loaded
    * @param config
    */
  def load(id: js.Any, parentRequire: js.Any, loaded: js.Any, config: js.Any): Unit = js.native
  /**
    *
    * @param url
    * @param provider
    * @param first
    */
  def register(url: js.Any, provider: js.Any, first: js.Any): Unit = js.native
}

