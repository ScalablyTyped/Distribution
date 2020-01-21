package typings.dojo.dojox.gfx.vmlAttach

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/vml_attach.text_alignment.html
  *
  *
  */
trait textAlignment extends js.Object {
  /**
    *
    */
  var end: String
  /**
    *
    */
  var middle: String
  /**
    *
    */
  var start: String
}

object textAlignment {
  @scala.inline
  def apply(end: String, middle: String, start: String): textAlignment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], middle = middle.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[textAlignment]
  }
}

