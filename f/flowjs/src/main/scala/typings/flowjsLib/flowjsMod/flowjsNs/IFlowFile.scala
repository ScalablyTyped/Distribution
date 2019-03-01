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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("averageSpeed")(averageSpeed)
    __obj.updateDynamic("bootstrap")(bootstrap)
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("chunks")(chunks)
    __obj.updateDynamic("currentSpeed")(currentSpeed)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("file")(file)
    __obj.updateDynamic("flowObj")(flowObj)
    __obj.updateDynamic("getExtension")(getExtension)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("isComplete")(isComplete)
    __obj.updateDynamic("isUploading")(isUploading)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("pause")(pause)
    __obj.updateDynamic("paused")(paused)
    __obj.updateDynamic("progress")(progress)
    __obj.updateDynamic("relativePath")(relativePath)
    __obj.updateDynamic("resume")(resume)
    __obj.updateDynamic("retry")(retry)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("sizeUploaded")(sizeUploaded)
    __obj.updateDynamic("timeRemaining")(timeRemaining)
    __obj.updateDynamic("uniqueIdentifier")(uniqueIdentifier)
    __obj.asInstanceOf[IFlowFile]
  }
}

