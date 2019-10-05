package typings.dojo.dojo._base.window

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/window.doc.html
  *
  * Alias for the current document. 'doc' can be modified
  * for temporary context shifting. See also withDoc().
  * Use this rather than referring to 'window.document' to ensure your code runs
  * correctly in managed contexts.
  *
  */
trait doc extends js.Object {
  /**
    *
    */
  var documentElement: js.Object
  /**
    *
    */
  var dojoClick: Boolean
}

object doc {
  @scala.inline
  def apply(documentElement: js.Object, dojoClick: Boolean): doc = {
    val __obj = js.Dynamic.literal(documentElement = documentElement, dojoClick = dojoClick)
  
    __obj.asInstanceOf[doc]
  }
}

