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

