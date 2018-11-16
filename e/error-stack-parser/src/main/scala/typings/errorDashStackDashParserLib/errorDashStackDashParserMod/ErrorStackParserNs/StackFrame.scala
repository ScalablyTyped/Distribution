package typings
package errorDashStackDashParserLib.errorDashStackDashParserMod.ErrorStackParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StackFrame extends js.Object {
  var args: js.UndefOr[js.Array[_]] = js.undefined
  var columnNumber: js.UndefOr[scala.Double] = js.undefined
  var evalOrigin: js.UndefOr[StackFrame] = js.undefined
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  var functionName: js.UndefOr[java.lang.String] = js.undefined
  var isConstructor: js.UndefOr[scala.Boolean] = js.undefined
  var isEval: js.UndefOr[scala.Boolean] = js.undefined
  var isNative: js.UndefOr[scala.Boolean] = js.undefined
  var isTopLevel: js.UndefOr[scala.Boolean] = js.undefined
  var lineNumber: js.UndefOr[scala.Double] = js.undefined
  var source: js.UndefOr[java.lang.String] = js.undefined
  def getArgs(): js.Array[_]
  def getColumnNumber(): scala.Double
  def getEvalOrigin(): StackFrame
  def getFileName(): java.lang.String
  def getFunctionName(): java.lang.String
  def getIsConstructor(): scala.Boolean
  def getIsEval(): scala.Boolean
  def getIsNative(): scala.Boolean
  def getIsTopLevel(): scala.Boolean
  def getLineNumber(): scala.Double
  def getSource(): java.lang.String
  def setArgs(): scala.Unit
  def setColumnNumber(): scala.Unit
  def setEvalOrigin(): scala.Unit
  def setFileName(): scala.Unit
  def setFunctionName(): scala.Unit
  def setIsConstructor(): scala.Unit
  def setIsEval(): scala.Unit
  def setIsNative(): scala.Unit
  def setIsTopLevel(): scala.Unit
  def setLineNumber(): scala.Unit
  def setSource(): scala.Unit
}

