package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OCRReadPara extends js.Object {
  var AjaxFunctionUrl: java.lang.String
  var AryZone: js.Array[scala.Double]
  var FileNames: java.lang.String
  var FunctionName: java.lang.String
  var ImageIndex: scala.Double
  var JsonString: java.lang.String
  var STWAIN: WebTwain
  var Type: java.lang.String
  def OnFailure(): scala.Unit
  def OnSuccess(): scala.Unit
}

object OCRReadPara {
  @scala.inline
  def apply(
    AjaxFunctionUrl: java.lang.String,
    AryZone: js.Array[scala.Double],
    FileNames: java.lang.String,
    FunctionName: java.lang.String,
    ImageIndex: scala.Double,
    JsonString: java.lang.String,
    OnFailure: () => scala.Unit,
    OnSuccess: () => scala.Unit,
    STWAIN: WebTwain,
    Type: java.lang.String
  ): OCRReadPara = {
    val __obj = js.Dynamic.literal(AjaxFunctionUrl = AjaxFunctionUrl, AryZone = AryZone, FileNames = FileNames, FunctionName = FunctionName, ImageIndex = ImageIndex, JsonString = JsonString, OnFailure = js.Any.fromFunction0(OnFailure), OnSuccess = js.Any.fromFunction0(OnSuccess), STWAIN = STWAIN, Type = Type)
  
    __obj.asInstanceOf[OCRReadPara]
  }
}

