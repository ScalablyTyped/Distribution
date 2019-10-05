package typings.dojo.dojo.dnd.autoscroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/autoscroll._validNodes.html
  *
  *
  */
trait _validNodes extends js.Object {
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

object _validNodes {
  @scala.inline
  def apply(div: Double, p: Double, td: Double): _validNodes = {
    val __obj = js.Dynamic.literal(div = div, p = p, td = td)
  
    __obj.asInstanceOf[_validNodes]
  }
}

