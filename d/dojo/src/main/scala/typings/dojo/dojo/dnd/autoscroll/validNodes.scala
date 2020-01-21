package typings.dojo.dojo.dnd.autoscroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/autoscroll._validNodes.html
  *
  *
  */
trait validNodes extends js.Object {
  /**
    *
    */
  var div: Double
  /**
    *
    */
  var p: Double
  /**
    *
    */
  var td: Double
}

object validNodes {
  @scala.inline
  def apply(div: Double, p: Double, td: Double): validNodes = {
    val __obj = js.Dynamic.literal(div = div.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], td = td.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[validNodes]
  }
}

