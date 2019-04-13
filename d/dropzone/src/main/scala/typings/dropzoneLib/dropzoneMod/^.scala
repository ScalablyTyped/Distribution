package typings
package dropzoneLib.dropzoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dropzone", JSImport.Namespace)
@js.native
class ^ protected () extends Dropzone {
  def this(container: dropzoneLib.dropzoneMod.Global.HTMLElement) = this()
  def this(container: java.lang.String) = this()
  def this(container: dropzoneLib.dropzoneMod.Global.HTMLElement, options: DropzoneOptions) = this()
  def this(container: java.lang.String, options: DropzoneOptions) = this()
}

@JSImport("dropzone", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var ACCEPTED: java.lang.String = js.native
  var ADDED: java.lang.String = js.native
  var CANCELED: java.lang.String = js.native
  var ERROR: java.lang.String = js.native
  var PROCESSING: java.lang.String = js.native
  var QUEUED: java.lang.String = js.native
  var SUCCESS: java.lang.String = js.native
  var UPLOADING: java.lang.String = js.native
  var autoDiscover: scala.Boolean = js.native
  var instances: js.Array[Dropzone] = js.native
  var options: js.Any = js.native
  def confirm(question: java.lang.String, accepted: js.Function0[scala.Unit]): scala.Unit = js.native
  def confirm(question: java.lang.String, accepted: js.Function0[scala.Unit], rejected: js.Function0[scala.Unit]): scala.Unit = js.native
  def createElement(string: java.lang.String): dropzoneLib.dropzoneMod.Global.HTMLElement = js.native
  def isBrowserSupported(): scala.Boolean = js.native
}

