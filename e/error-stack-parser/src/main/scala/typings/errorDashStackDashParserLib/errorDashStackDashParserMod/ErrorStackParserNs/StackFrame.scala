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

object StackFrame {
  @scala.inline
  def apply(
    getArgs: js.Function0[js.Array[_]],
    getColumnNumber: js.Function0[scala.Double],
    getEvalOrigin: js.Function0[StackFrame],
    getFileName: js.Function0[java.lang.String],
    getFunctionName: js.Function0[java.lang.String],
    getIsConstructor: js.Function0[scala.Boolean],
    getIsEval: js.Function0[scala.Boolean],
    getIsNative: js.Function0[scala.Boolean],
    getIsTopLevel: js.Function0[scala.Boolean],
    getLineNumber: js.Function0[scala.Double],
    getSource: js.Function0[java.lang.String],
    setArgs: js.Function0[scala.Unit],
    setColumnNumber: js.Function0[scala.Unit],
    setEvalOrigin: js.Function0[scala.Unit],
    setFileName: js.Function0[scala.Unit],
    setFunctionName: js.Function0[scala.Unit],
    setIsConstructor: js.Function0[scala.Unit],
    setIsEval: js.Function0[scala.Unit],
    setIsNative: js.Function0[scala.Unit],
    setIsTopLevel: js.Function0[scala.Unit],
    setLineNumber: js.Function0[scala.Unit],
    setSource: js.Function0[scala.Unit],
    toString: js.Function0[java.lang.String],
    args: js.Array[_] = null,
    columnNumber: scala.Int | scala.Double = null,
    evalOrigin: StackFrame = null,
    fileName: java.lang.String = null,
    functionName: java.lang.String = null,
    isConstructor: js.UndefOr[scala.Boolean] = js.undefined,
    isEval: js.UndefOr[scala.Boolean] = js.undefined,
    isNative: js.UndefOr[scala.Boolean] = js.undefined,
    isTopLevel: js.UndefOr[scala.Boolean] = js.undefined,
    lineNumber: scala.Int | scala.Double = null,
    source: java.lang.String = null
  ): StackFrame = {
    val __obj = js.Dynamic.literal(getArgs = getArgs, getColumnNumber = getColumnNumber, getEvalOrigin = getEvalOrigin, getFileName = getFileName, getFunctionName = getFunctionName, getIsConstructor = getIsConstructor, getIsEval = getIsEval, getIsNative = getIsNative, getIsTopLevel = getIsTopLevel, getLineNumber = getLineNumber, getSource = getSource, setArgs = setArgs, setColumnNumber = setColumnNumber, setEvalOrigin = setEvalOrigin, setFileName = setFileName, setFunctionName = setFunctionName, setIsConstructor = setIsConstructor, setIsEval = setIsEval, setIsNative = setIsNative, setIsTopLevel = setIsTopLevel, setLineNumber = setLineNumber, setSource = setSource, toString = toString)
    if (args != null) __obj.updateDynamic("args")(args)
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (evalOrigin != null) __obj.updateDynamic("evalOrigin")(evalOrigin)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (functionName != null) __obj.updateDynamic("functionName")(functionName)
    if (!js.isUndefined(isConstructor)) __obj.updateDynamic("isConstructor")(isConstructor)
    if (!js.isUndefined(isEval)) __obj.updateDynamic("isEval")(isEval)
    if (!js.isUndefined(isNative)) __obj.updateDynamic("isNative")(isNative)
    if (!js.isUndefined(isTopLevel)) __obj.updateDynamic("isTopLevel")(isTopLevel)
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[StackFrame]
  }
}

