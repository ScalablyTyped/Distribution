package typings.dojo.dijit.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_base/manager.html
  *
  * Deprecated.  Shim to methods on registry, plus a few other declarations.
  * New code should access dijit/registry directly when possible.
  * 
  */
trait manager extends js.Object {
  /**
    * The default fx.animation speed (in ms) to use for all Dijit
    * transitional fx.animations, unless otherwise specified
    * on a per-instance basis. Defaults to 200, overrided by
    * djConfig.defaultDuration
    * 
    */
  var defaultDuration: Double
}

object manager {
  @scala.inline
  def apply(defaultDuration: Double): manager = {
    val __obj = js.Dynamic.literal(defaultDuration = defaultDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[manager]
  }
}

