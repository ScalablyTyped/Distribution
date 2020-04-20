package typings.divaJs.interfacesMod

import typings.divaJs.AnonD
import typings.divaJs.AnonH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page extends js.Object {
  var api: Double
  var canvas: String
  var d: AnonH
  var f: String
  var facingPages: Boolean
  var il: String
  var l: String
  var m: Double
  var otherImages: AnonD
  var paged: Boolean
  var url: String
  var xoffset: Double
  var yoffset: Double
}

object Page {
  @scala.inline
  def apply(
    api: Double,
    canvas: String,
    d: AnonH,
    f: String,
    facingPages: Boolean,
    il: String,
    l: String,
    m: Double,
    otherImages: AnonD,
    paged: Boolean,
    url: String,
    xoffset: Double,
    yoffset: Double
  ): Page = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], facingPages = facingPages.asInstanceOf[js.Any], il = il.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], otherImages = otherImages.asInstanceOf[js.Any], paged = paged.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xoffset = xoffset.asInstanceOf[js.Any], yoffset = yoffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
}

