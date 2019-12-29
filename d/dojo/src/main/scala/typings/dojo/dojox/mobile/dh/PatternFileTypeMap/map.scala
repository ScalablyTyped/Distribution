package typings.dojo.dojox.mobile.dh.PatternFileTypeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/dh/PatternFileTypeMap.map.html
  *
  *
  */
trait map extends js.Object {
  /**
    *
    */
  @JSName(".*.html")
  var DotAsteriskDothtml: String
  /**
    *
    */
  @JSName(".*.json")
  var DotAsteriskDotjson: String
}

object map {
  @scala.inline
  def apply(DotAsteriskDothtml: String, DotAsteriskDotjson: String): map = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".*.html")(DotAsteriskDothtml.asInstanceOf[js.Any])
    __obj.updateDynamic(".*.json")(DotAsteriskDotjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[map]
  }
}

