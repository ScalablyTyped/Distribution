package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OCRReadPara extends js.Object {
  var AjaxFunctionUrl: String
  var AryZone: js.Array[Double]
  var FileNames: String
  var FunctionName: String
  var ImageIndex: Double
  var JsonString: String
  var STWAIN: WebTwain
  var Type: String
  def OnFailure(): Unit
  def OnSuccess(): Unit
}

object OCRReadPara {
  @scala.inline
  def apply(
    AjaxFunctionUrl: String,
    AryZone: js.Array[Double],
    FileNames: String,
    FunctionName: String,
    ImageIndex: Double,
    JsonString: String,
    OnFailure: () => Unit,
    OnSuccess: () => Unit,
    STWAIN: WebTwain,
    Type: String
  ): OCRReadPara = {
    val __obj = js.Dynamic.literal(AjaxFunctionUrl = AjaxFunctionUrl, AryZone = AryZone, FileNames = FileNames, FunctionName = FunctionName, ImageIndex = ImageIndex, JsonString = JsonString, OnFailure = js.Any.fromFunction0(OnFailure), OnSuccess = js.Any.fromFunction0(OnSuccess), STWAIN = STWAIN, Type = Type)
  
    __obj.asInstanceOf[OCRReadPara]
  }
}

