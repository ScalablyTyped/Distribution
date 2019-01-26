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

