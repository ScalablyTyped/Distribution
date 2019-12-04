package typings.dojo.dojox.gfx.vml_attach

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/vml_attach.text_alignment.html
  *
  *
  */
trait text_alignment extends js.Object {
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

object text_alignment {
  @scala.inline
  def apply(end: String, middle: String, start: String): text_alignment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], middle = middle.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[text_alignment]
  }
}

