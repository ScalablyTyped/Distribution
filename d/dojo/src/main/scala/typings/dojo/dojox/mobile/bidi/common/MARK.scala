package typings.dojo.dojox.mobile.bidi.common

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/bidi/common.MARK.html
  *
  *
  */
trait MARK extends js.Object {
  /**
    *
    */
  var LRE: String
  /**
    *
    */
  var PDF: String
  /**
    *
    */
  var RLE: String
}

object MARK {
  @scala.inline
  def apply(LRE: String, PDF: String, RLE: String): MARK = {
    val __obj = js.Dynamic.literal(LRE = LRE.asInstanceOf[js.Any], PDF = PDF.asInstanceOf[js.Any], RLE = RLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[MARK]
  }
}

