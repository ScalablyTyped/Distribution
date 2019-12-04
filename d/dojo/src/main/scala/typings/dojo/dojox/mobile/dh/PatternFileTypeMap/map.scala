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
  var `.*.html`: String
  /**
    *
    */
  var `.*.json`: String
}

object map {
  @scala.inline
  def apply(`.*.html`: String, `.*.json`: String): map = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".*.html")(`.*.html`.asInstanceOf[js.Any])
    __obj.updateDynamic(".*.json")(`.*.json`.asInstanceOf[js.Any])
    __obj.asInstanceOf[map]
  }
}

