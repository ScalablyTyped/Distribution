package typings
package flowjsLib.flowjsMod.flowjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFlow extends js.Object {
  var files: js.Array[IFlowFile] = js.native
  var opts: IFlowOptions = js.native
  var support: scala.Boolean = js.native
  var supportDirectory: scala.Boolean = js.native
  def addFile(file: stdLib.File): scala.Unit = js.native
  def assignBrowse(
    domNodes: js.Array[stdLib.HTMLElement],
    isDirectory: scala.Boolean,
    singleFile: scala.Boolean,
    attributes: js.Object
  ): scala.Unit = js.native
  def assignDrop(domNodes: js.Array[stdLib.HTMLElement]): scala.Unit = js.native
  def cancel(): scala.Unit = js.native
  def getFromUniqueIdentifier(uniqueIdentifier: java.lang.String): IFlowFile = js.native
  def getSize(): scala.Double = js.native
  def isUploading(): scala.Boolean = js.native
  def off(): scala.Unit = js.native
  def off(event: java.lang.String): scala.Unit = js.native
  def off(event: java.lang.String, callback: js.Function): scala.Unit = js.native
  def on(event: java.lang.String, callback: js.Function): scala.Unit = js.native
  def pause(): scala.Unit = js.native
  def progress(): scala.Double = js.native
  def removeFile(file: IFlowFile): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def sizeUploaded(): scala.Double = js.native
  def timeRemaining(): scala.Double = js.native
  def unAssignDrop(domNodes: js.Array[stdLib.HTMLElement]): scala.Unit = js.native
  def upload(): scala.Unit = js.native
}

