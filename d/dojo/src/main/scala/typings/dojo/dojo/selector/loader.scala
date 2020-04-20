package typings.dojo.dojo.selector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/selector/_loader.html
  *
  * This module handles loading the appropriate selector engine for the given browser
  *
  */
trait loader extends js.Object {
  /**
    *
    * @param id
    * @param parentRequire
    * @param loaded
    * @param config
    */
  def load(id: js.Any, parentRequire: js.Any, loaded: js.Any, config: js.Any): js.Any
}

object loader {
  @scala.inline
  def apply(load: (js.Any, js.Any, js.Any, js.Any) => js.Any): loader = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction4(load))
    __obj.asInstanceOf[loader]
  }
}

