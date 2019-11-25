package typings.dojo.dojox.charting.plot2d.common

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/plot2d/common.defaultStats.html
  *
  *
  */
trait defaultStats extends js.Object {
  /**
    *
    */
  var hmax: js.Object
  /**
    *
    */
  var hmin: js.Object
  /**
    *
    */
  var vmax: js.Object
  /**
    *
    */
  var vmin: js.Object
}

object defaultStats {
  @scala.inline
  def apply(hmax: js.Object, hmin: js.Object, vmax: js.Object, vmin: js.Object): defaultStats = {
    val __obj = js.Dynamic.literal(hmax = hmax.asInstanceOf[js.Any], hmin = hmin.asInstanceOf[js.Any], vmax = vmax.asInstanceOf[js.Any], vmin = vmin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[defaultStats]
  }
}

