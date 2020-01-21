package typings.dojo.dojox.gfx.svgAttach

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/svg_attach.xmlns.html
  *
  *
  */
trait xmlns extends js.Object {
  /**
    *
    */
  var svg: String
  /**
    *
    */
  var xlink: String
}

object xmlns {
  @scala.inline
  def apply(svg: String, xlink: String): xmlns = {
    val __obj = js.Dynamic.literal(svg = svg.asInstanceOf[js.Any], xlink = xlink.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[xmlns]
  }
}

