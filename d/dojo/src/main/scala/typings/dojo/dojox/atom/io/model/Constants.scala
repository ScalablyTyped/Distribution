package typings.dojo.dojox.atom.io.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/atom/io/model._Constants.html
  *
  * Container for general constants.
  *
  */
trait Constants extends js.Object {
  /**
    *
    */
  var APP_NS: String
  /**
    *
    */
  var ATOM_NS: String
  /**
    *
    */
  var ATOM_URI: String
  /**
    *
    */
  var PURL_NS: String
}

object Constants {
  @scala.inline
  def apply(APP_NS: String, ATOM_NS: String, ATOM_URI: String, PURL_NS: String): Constants = {
    val __obj = js.Dynamic.literal(APP_NS = APP_NS.asInstanceOf[js.Any], ATOM_NS = ATOM_NS.asInstanceOf[js.Any], ATOM_URI = ATOM_URI.asInstanceOf[js.Any], PURL_NS = PURL_NS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Constants]
  }
}

