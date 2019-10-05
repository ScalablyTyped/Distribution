package typings.dojo.doh._browserRunner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/doh/_browserRunner._testTypes.html
  *
  *
  */
trait _testTypes extends js.Object {
  /**
    *
    * @param group
    * @param tObj
    * @param type
    */
  def perf(group: js.Any, tObj: js.Any, `type`: js.Any): Unit
}

object _testTypes {
  @scala.inline
  def apply(perf: (js.Any, js.Any, js.Any) => Unit): _testTypes = {
    val __obj = js.Dynamic.literal(perf = js.Any.fromFunction3(perf))
  
    __obj.asInstanceOf[_testTypes]
  }
}

