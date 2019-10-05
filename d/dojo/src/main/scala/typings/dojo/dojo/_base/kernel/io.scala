package typings.dojo.dojo._base.kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.io.html
  *
  *
  */
trait io extends js.Object {
  /**
    *
    */
  var iframe: js.Object
  /**
    * TODOC
    *
    */
  var script: js.Object
}

object io {
  @scala.inline
  def apply(iframe: js.Object, script: js.Object): io = {
    val __obj = js.Dynamic.literal(iframe = iframe, script = script)
  
    __obj.asInstanceOf[io]
  }
}

