package typings.dojo.dojo.main

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/main.cldr.html
  *
  *
  */
trait cldr extends js.Object {
  /**
    * TODOC
    *
    */
  var monetary: js.Object
  /**
    * TODOC
    *
    */
  var supplemental: js.Object
}

object cldr {
  @scala.inline
  def apply(monetary: js.Object, supplemental: js.Object): cldr = {
    val __obj = js.Dynamic.literal(monetary = monetary.asInstanceOf[js.Any], supplemental = supplemental.asInstanceOf[js.Any])
    __obj.asInstanceOf[cldr]
  }
}

