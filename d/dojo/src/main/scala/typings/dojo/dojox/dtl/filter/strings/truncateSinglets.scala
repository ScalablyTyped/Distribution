package typings.dojo.dojox.dtl.filter.strings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/filter/strings._truncate_singlets.html
  *
  *
  */
trait truncateSinglets extends js.Object {
  /**
    *
    */
  var area: Boolean
  /**
    *
    */
  var base: Boolean
  /**
    *
    */
  var br: Boolean
  /**
    *
    */
  var col: Boolean
  /**
    *
    */
  var hr: Boolean
  /**
    *
    */
  var img: Boolean
  /**
    *
    */
  var input: Boolean
  /**
    *
    */
  var link: Boolean
  /**
    *
    */
  var param: Boolean
}

object truncateSinglets {
  @scala.inline
  def apply(
    area: Boolean,
    base: Boolean,
    br: Boolean,
    col: Boolean,
    hr: Boolean,
    img: Boolean,
    input: Boolean,
    link: Boolean,
    param: Boolean
  ): truncateSinglets = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], hr = hr.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[truncateSinglets]
  }
}

