package typings
package flowjsLib.flowjsMod.flowjsNs

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
    bootstrap: js.Function0[scala.Unit],
    cancel: js.Function0[scala.Unit],
    chunks: js.Array[_],
    currentSpeed: scala.Double,
    error: scala.Boolean,
    file: stdLib.File,
    flowObj: IFlow,
    getExtension: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    isComplete: js.Function0[scala.Boolean],
    isUploading: js.Function0[scala.Boolean],
    name: java.lang.String,
    pause: js.Function0[scala.Unit],
    paused: scala.Boolean,
    progress: js.Function1[scala.Boolean, scala.Double],
    relativePath: java.lang.String,
    resume: js.Function0[scala.Unit],
    retry: js.Function0[scala.Unit],
    size: scala.Double,
    sizeUploaded: js.Function0[scala.Double],
    timeRemaining: js.Function0[scala.Double],
    uniqueIdentifier: java.lang.String
  ): IFlowFile = {
    val __obj = js.Dynamic.literal(averageSpeed = averageSpeed, bootstrap = bootstrap, cancel = cancel, chunks = chunks, currentSpeed = currentSpeed, error = error, file = file, flowObj = flowObj, getExtension = getExtension, getType = getType, isComplete = isComplete, isUploading = isUploading, name = name, pause = pause, paused = paused, progress = progress, relativePath = relativePath, resume = resume, retry = retry, size = size, sizeUploaded = sizeUploaded, timeRemaining = timeRemaining, uniqueIdentifier = uniqueIdentifier)
  
    __obj.asInstanceOf[IFlowFile]
  }
}

