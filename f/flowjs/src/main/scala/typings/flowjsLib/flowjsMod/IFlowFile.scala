package typings
package flowjsLib.flowjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFlowFile extends js.Object {
  var averageSpeed: scala.Double
  var chunks: js.Array[_]
  var currentSpeed: scala.Double
  var error: scala.Boolean
  var file: stdLib.File
  var flowObj: IFlow
  var name: java.lang.String
  var paused: scala.Boolean
  var relativePath: java.lang.String
  var size: scala.Double
  var uniqueIdentifier: java.lang.String
  def bootstrap(): scala.Unit
  def cancel(): scala.Unit
  def getExtension(): java.lang.String
  def getType(): java.lang.String
  def isComplete(): scala.Boolean
  def isUploading(): scala.Boolean
  def pause(): scala.Unit
  def progress(relative: scala.Boolean): scala.Double
  def resume(): scala.Unit
  def retry(): scala.Unit
  def sizeUploaded(): scala.Double
  def timeRemaining(): scala.Double
}

object IFlowFile {
  @scala.inline
  def apply(
    averageSpeed: scala.Double,
    bootstrap: () => scala.Unit,
    cancel: () => scala.Unit,
    chunks: js.Array[_],
    currentSpeed: scala.Double,
    error: scala.Boolean,
    file: stdLib.File,
    flowObj: IFlow,
    getExtension: () => java.lang.String,
    getType: () => java.lang.String,
    isComplete: () => scala.Boolean,
    isUploading: () => scala.Boolean,
    name: java.lang.String,
    pause: () => scala.Unit,
    paused: scala.Boolean,
    progress: scala.Boolean => scala.Double,
    relativePath: java.lang.String,
    resume: () => scala.Unit,
    retry: () => scala.Unit,
    size: scala.Double,
    sizeUploaded: () => scala.Double,
    timeRemaining: () => scala.Double,
    uniqueIdentifier: java.lang.String
  ): IFlowFile = {
    val __obj = js.Dynamic.literal(averageSpeed = averageSpeed, bootstrap = js.Any.fromFunction0(bootstrap), cancel = js.Any.fromFunction0(cancel), chunks = chunks, currentSpeed = currentSpeed, error = error, file = file, flowObj = flowObj, getExtension = js.Any.fromFunction0(getExtension), getType = js.Any.fromFunction0(getType), isComplete = js.Any.fromFunction0(isComplete), isUploading = js.Any.fromFunction0(isUploading), name = name, pause = js.Any.fromFunction0(pause), paused = paused, progress = js.Any.fromFunction1(progress), relativePath = relativePath, resume = js.Any.fromFunction0(resume), retry = js.Any.fromFunction0(retry), size = size, sizeUploaded = js.Any.fromFunction0(sizeUploaded), timeRemaining = js.Any.fromFunction0(timeRemaining), uniqueIdentifier = uniqueIdentifier)
  
    __obj.asInstanceOf[IFlowFile]
  }
}

