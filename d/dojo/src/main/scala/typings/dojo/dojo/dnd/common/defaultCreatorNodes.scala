package typings.dojo.dojo.dnd.common

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/common._defaultCreatorNodes.html
  *
  *
  */
trait defaultCreatorNodes extends js.Object {
  /**
    *
    */
  var div: String
  /**
    *
    */
  var ol: String
  /**
    *
    */
  var p: String
  /**
    *
    */
  var ul: String
}

object defaultCreatorNodes {
  @scala.inline
  def apply(div: String, ol: String, p: String, ul: String): defaultCreatorNodes = {
    val __obj = js.Dynamic.literal(div = div.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], ul = ul.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultCreatorNodes]
  }
}

