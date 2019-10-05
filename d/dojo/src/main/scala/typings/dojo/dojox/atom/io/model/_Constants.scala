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
trait _Constants extends js.Object {
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

object _Constants {
  @scala.inline
  def apply(APP_NS: String, ATOM_NS: String, ATOM_URI: String, PURL_NS: String): _Constants = {
    val __obj = js.Dynamic.literal(APP_NS = APP_NS, ATOM_NS = ATOM_NS, ATOM_URI = ATOM_URI, PURL_NS = PURL_NS)
  
    __obj.asInstanceOf[_Constants]
  }
}

