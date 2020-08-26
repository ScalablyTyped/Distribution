package typings.errorStackParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackFrame extends js.Object {
  var args: js.UndefOr[js.Array[_]] = js.native
  var columnNumber: js.UndefOr[Double] = js.native
  var evalOrigin: js.UndefOr[StackFrame] = js.native
  var fileName: js.UndefOr[String] = js.native
  var functionName: js.UndefOr[String] = js.native
  var isConstructor: js.UndefOr[Boolean] = js.native
  var isEval: js.UndefOr[Boolean] = js.native
  var isNative: js.UndefOr[Boolean] = js.native
  var isTopLevel: js.UndefOr[Boolean] = js.native
  var lineNumber: js.UndefOr[Double] = js.native
  var source: js.UndefOr[String] = js.native
  def getArgs(): js.Array[_] = js.native
  def getColumnNumber(): Double = js.native
  def getEvalOrigin(): StackFrame = js.native
  def getFileName(): String = js.native
  def getFunctionName(): String = js.native
  def getIsConstructor(): Boolean = js.native
  def getIsEval(): Boolean = js.native
  def getIsNative(): Boolean = js.native
  def getIsTopLevel(): Boolean = js.native
  def getLineNumber(): Double = js.native
  def getSource(): String = js.native
  def setArgs(): Unit = js.native
  def setColumnNumber(): Unit = js.native
  def setEvalOrigin(): Unit = js.native
  def setFileName(): Unit = js.native
  def setFunctionName(): Unit = js.native
  def setIsConstructor(): Unit = js.native
  def setIsEval(): Unit = js.native
  def setIsNative(): Unit = js.native
  def setIsTopLevel(): Unit = js.native
  def setLineNumber(): Unit = js.native
  def setSource(): Unit = js.native
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
    setSource: () => Unit
  ): StackFrame = {
    val __obj = js.Dynamic.literal(getArgs = js.Any.fromFunction0(getArgs), getColumnNumber = js.Any.fromFunction0(getColumnNumber), getEvalOrigin = js.Any.fromFunction0(getEvalOrigin), getFileName = js.Any.fromFunction0(getFileName), getFunctionName = js.Any.fromFunction0(getFunctionName), getIsConstructor = js.Any.fromFunction0(getIsConstructor), getIsEval = js.Any.fromFunction0(getIsEval), getIsNative = js.Any.fromFunction0(getIsNative), getIsTopLevel = js.Any.fromFunction0(getIsTopLevel), getLineNumber = js.Any.fromFunction0(getLineNumber), getSource = js.Any.fromFunction0(getSource), setArgs = js.Any.fromFunction0(setArgs), setColumnNumber = js.Any.fromFunction0(setColumnNumber), setEvalOrigin = js.Any.fromFunction0(setEvalOrigin), setFileName = js.Any.fromFunction0(setFileName), setFunctionName = js.Any.fromFunction0(setFunctionName), setIsConstructor = js.Any.fromFunction0(setIsConstructor), setIsEval = js.Any.fromFunction0(setIsEval), setIsNative = js.Any.fromFunction0(setIsNative), setIsTopLevel = js.Any.fromFunction0(setIsTopLevel), setLineNumber = js.Any.fromFunction0(setLineNumber), setSource = js.Any.fromFunction0(setSource))
    __obj.asInstanceOf[StackFrame]
  }
  @scala.inline
  implicit class StackFrameOps[Self <: StackFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetArgs(value: () => js.Array[_]): Self = this.set("getArgs", js.Any.fromFunction0(value))
    @scala.inline
    def setGetColumnNumber(value: () => Double): Self = this.set("getColumnNumber", js.Any.fromFunction0(value))
    @scala.inline
    def setGetEvalOrigin(value: () => StackFrame): Self = this.set("getEvalOrigin", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFileName(value: () => String): Self = this.set("getFileName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFunctionName(value: () => String): Self = this.set("getFunctionName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIsConstructor(value: () => Boolean): Self = this.set("getIsConstructor", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIsEval(value: () => Boolean): Self = this.set("getIsEval", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIsNative(value: () => Boolean): Self = this.set("getIsNative", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIsTopLevel(value: () => Boolean): Self = this.set("getIsTopLevel", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLineNumber(value: () => Double): Self = this.set("getLineNumber", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSource(value: () => String): Self = this.set("getSource", js.Any.fromFunction0(value))
    @scala.inline
    def setSetArgs(value: () => Unit): Self = this.set("setArgs", js.Any.fromFunction0(value))
    @scala.inline
    def setSetColumnNumber(value: () => Unit): Self = this.set("setColumnNumber", js.Any.fromFunction0(value))
    @scala.inline
    def setSetEvalOrigin(value: () => Unit): Self = this.set("setEvalOrigin", js.Any.fromFunction0(value))
    @scala.inline
    def setSetFileName(value: () => Unit): Self = this.set("setFileName", js.Any.fromFunction0(value))
    @scala.inline
    def setSetFunctionName(value: () => Unit): Self = this.set("setFunctionName", js.Any.fromFunction0(value))
    @scala.inline
    def setSetIsConstructor(value: () => Unit): Self = this.set("setIsConstructor", js.Any.fromFunction0(value))
    @scala.inline
    def setSetIsEval(value: () => Unit): Self = this.set("setIsEval", js.Any.fromFunction0(value))
    @scala.inline
    def setSetIsNative(value: () => Unit): Self = this.set("setIsNative", js.Any.fromFunction0(value))
    @scala.inline
    def setSetIsTopLevel(value: () => Unit): Self = this.set("setIsTopLevel", js.Any.fromFunction0(value))
    @scala.inline
    def setSetLineNumber(value: () => Unit): Self = this.set("setLineNumber", js.Any.fromFunction0(value))
    @scala.inline
    def setSetSource(value: () => Unit): Self = this.set("setSource", js.Any.fromFunction0(value))
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[_]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setColumnNumber(value: Double): Self = this.set("columnNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnNumber: Self = this.set("columnNumber", js.undefined)
    @scala.inline
    def setEvalOrigin(value: StackFrame): Self = this.set("evalOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvalOrigin: Self = this.set("evalOrigin", js.undefined)
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    @scala.inline
    def setFunctionName(value: String): Self = this.set("functionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionName: Self = this.set("functionName", js.undefined)
    @scala.inline
    def setIsConstructor(value: Boolean): Self = this.set("isConstructor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsConstructor: Self = this.set("isConstructor", js.undefined)
    @scala.inline
    def setIsEval(value: Boolean): Self = this.set("isEval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEval: Self = this.set("isEval", js.undefined)
    @scala.inline
    def setIsNative(value: Boolean): Self = this.set("isNative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsNative: Self = this.set("isNative", js.undefined)
    @scala.inline
    def setIsTopLevel(value: Boolean): Self = this.set("isTopLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTopLevel: Self = this.set("isTopLevel", js.undefined)
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineNumber: Self = this.set("lineNumber", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

