package typings.dropzone.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dropzone.dropzoneBooleans.`false`
import typings.dropzone.mod.global.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dropzone", JSImport.Namespace)
@js.native
class ^ protected () extends Dropzone {
  def this(container: String) = this()
  def this(container: HTMLElement) = this()
  def this(container: String, options: DropzoneOptions) = this()
  def this(container: HTMLElement, options: DropzoneOptions) = this()
}

@JSImport("dropzone", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var ACCEPTED: String = js.native
  var ADDED: String = js.native
  var CANCELED: String = js.native
  var ERROR: String = js.native
  var PROCESSING: String = js.native
  var QUEUED: String = js.native
  var SUCCESS: String = js.native
  var UPLOADING: String = js.native
  var autoDiscover: Boolean = js.native
  var instances: js.Array[Dropzone] = js.native
  var options: StringDictionary[DropzoneOptions | `false`] = js.native
  def confirm(question: String, accepted: js.Function0[Unit]): Unit = js.native
  def confirm(question: String, accepted: js.Function0[Unit], rejected: js.Function0[Unit]): Unit = js.native
  def createElement(string: String): HTMLElement = js.native
  def isBrowserSupported(): Boolean = js.native
}

