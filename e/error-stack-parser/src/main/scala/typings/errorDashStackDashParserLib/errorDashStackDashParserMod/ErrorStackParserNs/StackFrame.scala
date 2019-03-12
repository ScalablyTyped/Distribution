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
    getArgs: () => js.Array[_],
    getColumnNumber: () => scala.Double,
    getEvalOrigin: () => StackFrame,
    getFileName: () => java.lang.String,
    getFunctionName: () => java.lang.String,
    getIsConstructor: () => scala.Boolean,
    getIsEval: () => scala.Boolean,
    getIsNative: () => scala.Boolean,
    getIsTopLevel: () => scala.Boolean,
    getLineNumber: () => scala.Double,
    getSource: () => java.lang.String,
    setArgs: () => scala.Unit,
    setColumnNumber: () => scala.Unit,
    setEvalOrigin: () => scala.Unit,
    setFileName: () => scala.Unit,
    setFunctionName: () => scala.Unit,
    setIsConstructor: () => scala.Unit,
    setIsEval: () => scala.Unit,
    setIsNative: () => scala.Unit,
    setIsTopLevel: () => scala.Unit,
    setLineNumber: () => scala.Unit,
    setSource: () => scala.Unit,
    toString: () => java.lang.String,
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
    val __obj = js.Dynamic.literal(getArgs = js.Any.fromFunction0(getArgs), getColumnNumber = js.Any.fromFunction0(getColumnNumber), getEvalOrigin = js.Any.fromFunction0(getEvalOrigin), getFileName = js.Any.fromFunction0(getFileName), getFunctionName = js.Any.fromFunction0(getFunctionName), getIsConstructor = js.Any.fromFunction0(getIsConstructor), getIsEval = js.Any.fromFunction0(getIsEval), getIsNative = js.Any.fromFunction0(getIsNative), getIsTopLevel = js.Any.fromFunction0(getIsTopLevel), getLineNumber = js.Any.fromFunction0(getLineNumber), getSource = js.Any.fromFunction0(getSource), setArgs = js.Any.fromFunction0(setArgs), setColumnNumber = js.Any.fromFunction0(setColumnNumber), setEvalOrigin = js.Any.fromFunction0(setEvalOrigin), setFileName = js.Any.fromFunction0(setFileName), setFunctionName = js.Any.fromFunction0(setFunctionName), setIsConstructor = js.Any.fromFunction0(setIsConstructor), setIsEval = js.Any.fromFunction0(setIsEval), setIsNative = js.Any.fromFunction0(setIsNative), setIsTopLevel = js.Any.fromFunction0(setIsTopLevel), setLineNumber = js.Any.fromFunction0(setLineNumber), setSource = js.Any.fromFunction0(setSource), toString = js.Any.fromFunction0(toString))
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

