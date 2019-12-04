package typings.dojo.dojox.charting.scaler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/scaler/common.html
  *
  *
  */
trait common extends js.Object {
  /**
    *
    * @param moduleName
    * @param ifloaded
    * @param ifnotloaded
    */
  def doIfLoaded(moduleName: js.Any, ifloaded: js.Any, ifnotloaded: js.Any): js.Any
  /**
    *
    * @param number
    * @param precision
    * @param kwArgs
    */
  def getNumericLabel(number: Double, precision: Double, kwArgs: js.Object): js.Any
}

object common {
  @scala.inline
  def apply(
    doIfLoaded: (js.Any, js.Any, js.Any) => js.Any,
    getNumericLabel: (Double, Double, js.Object) => js.Any
  ): common = {
    val __obj = js.Dynamic.literal(doIfLoaded = js.Any.fromFunction3(doIfLoaded), getNumericLabel = js.Any.fromFunction3(getNumericLabel))
  
    __obj.asInstanceOf[common]
  }
}

