package typings.errorDashStackDashParser.errorDashStackDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrame extends js.Object {
  var args: js.UndefOr[js.Array[_]] = js.undefined
  var columnNumber: js.UndefOr[Double] = js.undefined
  var evalOrigin: js.UndefOr[StackFrame] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var functionName: js.UndefOr[String] = js.undefined
  var isConstructor: js.UndefOr[Boolean] = js.undefined
  var isEval: js.UndefOr[Boolean] = js.undefined
  var isNative: js.UndefOr[Boolean] = js.undefined
  var isTopLevel: js.UndefOr[Boolean] = js.undefined
  var lineNumber: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  def getArgs(): js.Array[_]
  def getColumnNumber(): Double
  def getEvalOrigin(): StackFrame
  def getFileName(): String
  def getFunctionName(): String
  def getIsConstructor(): Boolean
  def getIsEval(): Boolean
  def getIsNative(): Boolean
  def getIsTopLevel(): Boolean
  def getLineNumber(): Double
  def getSource(): String
  def setArgs(): Unit
  def setColumnNumber(): Unit
  def setEvalOrigin(): Unit
  def setFileName(): Unit
  def setFunctionName(): Unit
  def setIsConstructor(): Unit
  def setIsEval(): Unit
  def setIsNative(): Unit
  def setIsTopLevel(): Unit
  def setLineNumber(): Unit
  def setSource(): Unit
}

object StackFrame {
  @scala.inline
  def apply(
    getArgs: () => js.Array[_],
    getColumnNumber: () => Double,
    getEvalOrigin: () => StackFrame,
    getFileName: () => String,
    getFunctionName: () => String,
    getIsConstructor: () => Boolean,
    getIsEval: () => Boolean,
    getIsNative: () => Boolean,
    getIsTopLevel: () => Boolean,
    getLineNumber: () => Double,
    getSource: () => String,
    setArgs: () => Unit,
    setColumnNumber: () => Unit,
    setEvalOrigin: () => Unit,
    setFileName: () => Unit,
    setFunctionName: () => Unit,
    setIsConstructor: () => Unit,
    setIsEval: () => Unit,
    setIsNative: () => Unit,
    setIsTopLevel: () => Unit,
    setLineNumber: () => Unit,
    setSource: () => Unit,
    toString: () => String,
    args: js.Array[_] = null,
    columnNumber: Int | Double = null,
    evalOrigin: StackFrame = null,
    fileName: String = null,
    functionName: String = null,
    isConstructor: js.UndefOr[Boolean] = js.undefined,
    isEval: js.UndefOr[Boolean] = js.undefined,
    isNative: js.UndefOr[Boolean] = js.undefined,
    isTopLevel: js.UndefOr[Boolean] = js.undefined,
    lineNumber: Int | Double = null,
    source: String = null
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

