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
    OnFailure: js.Function0[scala.Unit],
    OnSuccess: js.Function0[scala.Unit],
    STWAIN: WebTwain,
    Type: java.lang.String
  ): OCRReadPara = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AjaxFunctionUrl")(AjaxFunctionUrl)
    __obj.updateDynamic("AryZone")(AryZone)
    __obj.updateDynamic("FileNames")(FileNames)
    __obj.updateDynamic("FunctionName")(FunctionName)
    __obj.updateDynamic("ImageIndex")(ImageIndex)
    __obj.updateDynamic("JsonString")(JsonString)
    __obj.updateDynamic("OnFailure")(OnFailure)
    __obj.updateDynamic("OnSuccess")(OnSuccess)
    __obj.updateDynamic("STWAIN")(STWAIN)
    __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[OCRReadPara]
  }
}

