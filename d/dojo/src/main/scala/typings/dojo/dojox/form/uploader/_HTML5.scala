package typings.dojo.dojox.form.uploader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/uploader/_HTML5.html
  *
  * A mixin for dojox/form/Uploader that adds HTML5 multiple-file upload capabilities and
  * progress events.
  * Note that this does not add these capabilities to browsers that don't support them.
  * For IE8 or older browsers, _IFrame or _Flash mixins will be used.
  *
  */
@JSGlobal("dojox.form.uploader._HTML5")
@js.native
class _HTML5 () extends js.Object {
  /**
    *
    */
  var errMsg: String = js.native
  /**
    *
    */
  var uploadType: String = js.native
  /**
    * Add a dom node which will act as the drop target area so user
    * can drop files to this node.
    * If onlyConnectDrop is true, dragenter/dragover/dragleave events
    * won't be connected to dojo.stopEvent, and they need to be
    * canceled by user code to allow DnD files to happen.
    * This API is only available in HTML5 plugin (only HTML5 allows
    * DnD files).
    *
    * @param node
    * @param onlyConnectDrop               Optional
    */
  def addDropTarget(node: js.Any, onlyConnectDrop: Boolean): Unit = js.native
  /**
    *
    */
  def createXhr(): js.Any = js.native
  /**
    *
    */
  def postCreate(): Unit = js.native
  /**
    *
    */
  def postMixInProperties(): Unit = js.native
  /**
    * See: dojox.form.Uploader.upload
    *
    * @param formData               Optional
    */
  def upload(formData: js.Object): Unit = js.native
}

