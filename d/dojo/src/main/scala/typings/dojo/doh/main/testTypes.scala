package typings.dojo.doh.main

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/doh/main._testTypes.html
  *
  *
  */
trait testTypes extends js.Object {
  /**
    *
    * @param group
    * @param tObj
    * @param type
    */
  def perf(group: js.Any, tObj: js.Any, `type`: js.Any): Unit
}

object testTypes {
  @scala.inline
  def apply(perf: (js.Any, js.Any, js.Any) => Unit): testTypes = {
    val __obj = js.Dynamic.literal(perf = js.Any.fromFunction3(perf))
  
    __obj.asInstanceOf[testTypes]
  }
}

