package typings.dojo.dojox.form.uploader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/uploader/_IFrame.html
  *
  * A mixin for dojox/form/Uploader that adds Ajax upload capabilities via an iframe.
  * Only supported by IE, due to the specific iFrame hack used.  Progress events are not
  * supported.
  *
  *
  */
@JSGlobal("dojox.form.uploader._IFrame")
@js.native
class _IFrame () extends js.Object {
  /**
    *
    */
  def postMixInProperties(): Unit = js.native
  /**
    * Internal. You could use this, but you should use upload() or submit();
    * which can also handle the post data.
    *
    * @param data
    */
  def uploadIFrame(data: js.Any): Unit = js.native
}

