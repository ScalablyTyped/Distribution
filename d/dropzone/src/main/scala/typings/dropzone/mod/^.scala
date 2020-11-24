package typings.dropzone.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dropzone.dropzoneBooleans.`false`
import typings.dropzone.mod.global.HTMLElement
import typings.std.Blob
import typings.std.File
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  var blacklistedBrowsers: js.Array[RegExp] = js.native
  
  def confirm(question: String, accepted: js.Function0[Unit]): Unit = js.native
  def confirm(question: String, accepted: js.Function0[Unit], rejected: js.Function0[Unit]): Unit = js.native
  
  def createElement(string: String): HTMLElement = js.native
  
  def dataURItoBlob(dataURI: String): Blob = js.native
  
  def discover(): js.Array[Dropzone] = js.native
  
  def elementInside(element: HTMLElement, container: HTMLElement): Boolean = js.native
  
  def forElement(element: String): Dropzone = js.native
  def forElement(element: HTMLElement): Dropzone = js.native
  
  def getElement(element: String): HTMLElement = js.native
  def getElement(element: String, name: String): HTMLElement = js.native
  def getElement(element: HTMLElement): HTMLElement = js.native
  def getElement(element: HTMLElement, name: String): HTMLElement = js.native
  
  def getElements(elements: String): js.Array[HTMLElement] = js.native
  def getElements(elements: js.Array[String | HTMLElement]): js.Array[HTMLElement] = js.native
  def getElements(elements: HTMLElement): js.Array[HTMLElement] = js.native
  
  var instances: js.Array[Dropzone] = js.native
  
  def isBrowserSupported(): Boolean = js.native
  
  def isValidFile(file: File, acceptedFiles: String): Boolean = js.native
  
  var options: StringDictionary[DropzoneOptions | `false`] = js.native
  
  def optionsForElement(element: HTMLElement): js.UndefOr[DropzoneOptions] = js.native
  
  var version: String = js.native
}
