package typings.dojo.dojo.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/request/default.html
  *
  *
  */
trait default extends js.Object {
  /**
    *
    */
  def getPlatformDefaultId(): Unit
  /**
    *
    * @param id
    * @param parentRequire
    * @param loaded
    * @param config
    */
  def load(id: js.Any, parentRequire: js.Any, loaded: js.Any, config: js.Any): Unit
}

object default {
  @scala.inline
  def apply(getPlatformDefaultId: () => Unit, load: (js.Any, js.Any, js.Any, js.Any) => Unit): default = {
    val __obj = js.Dynamic.literal(getPlatformDefaultId = js.Any.fromFunction0(getPlatformDefaultId), load = js.Any.fromFunction4(load))
    __obj.asInstanceOf[default]
  }
}

