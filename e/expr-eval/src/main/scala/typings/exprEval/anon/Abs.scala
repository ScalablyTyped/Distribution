package typings.exprEval.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Abs extends js.Object {
  var abs: js.UndefOr[Boolean] = js.native
  var acos: js.UndefOr[Boolean] = js.native
  var acosh: js.UndefOr[Boolean] = js.native
  var add: js.UndefOr[Boolean] = js.native
  var asin: js.UndefOr[Boolean] = js.native
  var asinh: js.UndefOr[Boolean] = js.native
  var assignment: js.UndefOr[Boolean] = js.native
  var atan: js.UndefOr[Boolean] = js.native
  var atanh: js.UndefOr[Boolean] = js.native
  var cbrt: js.UndefOr[Boolean] = js.native
  var ceil: js.UndefOr[Boolean] = js.native
  var comparison: js.UndefOr[Boolean] = js.native
  var concatenate: js.UndefOr[Boolean] = js.native
  var conditional: js.UndefOr[Boolean] = js.native
  var cos: js.UndefOr[Boolean] = js.native
  var cosh: js.UndefOr[Boolean] = js.native
  var divide: js.UndefOr[Boolean] = js.native
  var exp: js.UndefOr[Boolean] = js.native
  var expm1: js.UndefOr[Boolean] = js.native
  var factorial: js.UndefOr[Boolean] = js.native
  var floor: js.UndefOr[Boolean] = js.native
  var fndef: js.UndefOr[Boolean] = js.native
  var in: js.UndefOr[Boolean] = js.native
  var length: js.UndefOr[Boolean] = js.native
  var lg: js.UndefOr[Boolean] = js.native
  var ln: js.UndefOr[Boolean] = js.native
  var log: js.UndefOr[Boolean] = js.native
  var log10: js.UndefOr[Boolean] = js.native
  var log1p: js.UndefOr[Boolean] = js.native
  var log2: js.UndefOr[Boolean] = js.native
  var logical: js.UndefOr[Boolean] = js.native
  var max: js.UndefOr[Boolean] = js.native
  var min: js.UndefOr[Boolean] = js.native
  var multiply: js.UndefOr[Boolean] = js.native
  var power: js.UndefOr[Boolean] = js.native
  var random: js.UndefOr[Boolean] = js.native
  var remainder: js.UndefOr[Boolean] = js.native
  var round: js.UndefOr[Boolean] = js.native
  var sign: js.UndefOr[Boolean] = js.native
  var sin: js.UndefOr[Boolean] = js.native
  var sinh: js.UndefOr[Boolean] = js.native
  var sqrt: js.UndefOr[Boolean] = js.native
  var subtract: js.UndefOr[Boolean] = js.native
  var tan: js.UndefOr[Boolean] = js.native
  var tanh: js.UndefOr[Boolean] = js.native
  var trunc: js.UndefOr[Boolean] = js.native
}

object Abs {
  @scala.inline
  def apply(): Abs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Abs]
  }
  @scala.inline
  implicit class AbsOps[Self <: Abs] (val x: Self) extends AnyVal {
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
    def setAbs(value: Boolean): Self = this.set("abs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbs: Self = this.set("abs", js.undefined)
    @scala.inline
    def setAcos(value: Boolean): Self = this.set("acos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcos: Self = this.set("acos", js.undefined)
    @scala.inline
    def setAcosh(value: Boolean): Self = this.set("acosh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcosh: Self = this.set("acosh", js.undefined)
    @scala.inline
    def setAdd(value: Boolean): Self = this.set("add", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setAsin(value: Boolean): Self = this.set("asin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsin: Self = this.set("asin", js.undefined)
    @scala.inline
    def setAsinh(value: Boolean): Self = this.set("asinh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsinh: Self = this.set("asinh", js.undefined)
    @scala.inline
    def setAssignment(value: Boolean): Self = this.set("assignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignment: Self = this.set("assignment", js.undefined)
    @scala.inline
    def setAtan(value: Boolean): Self = this.set("atan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAtan: Self = this.set("atan", js.undefined)
    @scala.inline
    def setAtanh(value: Boolean): Self = this.set("atanh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAtanh: Self = this.set("atanh", js.undefined)
    @scala.inline
    def setCbrt(value: Boolean): Self = this.set("cbrt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCbrt: Self = this.set("cbrt", js.undefined)
    @scala.inline
    def setCeil(value: Boolean): Self = this.set("ceil", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCeil: Self = this.set("ceil", js.undefined)
    @scala.inline
    def setComparison(value: Boolean): Self = this.set("comparison", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparison: Self = this.set("comparison", js.undefined)
    @scala.inline
    def setConcatenate(value: Boolean): Self = this.set("concatenate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcatenate: Self = this.set("concatenate", js.undefined)
    @scala.inline
    def setConditional(value: Boolean): Self = this.set("conditional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditional: Self = this.set("conditional", js.undefined)
    @scala.inline
    def setCos(value: Boolean): Self = this.set("cos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCos: Self = this.set("cos", js.undefined)
    @scala.inline
    def setCosh(value: Boolean): Self = this.set("cosh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCosh: Self = this.set("cosh", js.undefined)
    @scala.inline
    def setDivide(value: Boolean): Self = this.set("divide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDivide: Self = this.set("divide", js.undefined)
    @scala.inline
    def setExp(value: Boolean): Self = this.set("exp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExp: Self = this.set("exp", js.undefined)
    @scala.inline
    def setExpm1(value: Boolean): Self = this.set("expm1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpm1: Self = this.set("expm1", js.undefined)
    @scala.inline
    def setFactorial(value: Boolean): Self = this.set("factorial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFactorial: Self = this.set("factorial", js.undefined)
    @scala.inline
    def setFloor(value: Boolean): Self = this.set("floor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloor: Self = this.set("floor", js.undefined)
    @scala.inline
    def setFndef(value: Boolean): Self = this.set("fndef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFndef: Self = this.set("fndef", js.undefined)
    @scala.inline
    def setIn(value: Boolean): Self = this.set("in", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIn: Self = this.set("in", js.undefined)
    @scala.inline
    def setLength(value: Boolean): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setLg(value: Boolean): Self = this.set("lg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLg: Self = this.set("lg", js.undefined)
    @scala.inline
    def setLn(value: Boolean): Self = this.set("ln", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLn: Self = this.set("ln", js.undefined)
    @scala.inline
    def setLog(value: Boolean): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setLog10(value: Boolean): Self = this.set("log10", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog10: Self = this.set("log10", js.undefined)
    @scala.inline
    def setLog1p(value: Boolean): Self = this.set("log1p", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog1p: Self = this.set("log1p", js.undefined)
    @scala.inline
    def setLog2(value: Boolean): Self = this.set("log2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog2: Self = this.set("log2", js.undefined)
    @scala.inline
    def setLogical(value: Boolean): Self = this.set("logical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogical: Self = this.set("logical", js.undefined)
    @scala.inline
    def setMax(value: Boolean): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Boolean): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMultiply(value: Boolean): Self = this.set("multiply", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiply: Self = this.set("multiply", js.undefined)
    @scala.inline
    def setPower(value: Boolean): Self = this.set("power", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePower: Self = this.set("power", js.undefined)
    @scala.inline
    def setRandom(value: Boolean): Self = this.set("random", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRandom: Self = this.set("random", js.undefined)
    @scala.inline
    def setRemainder(value: Boolean): Self = this.set("remainder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemainder: Self = this.set("remainder", js.undefined)
    @scala.inline
    def setRound(value: Boolean): Self = this.set("round", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    @scala.inline
    def setSign(value: Boolean): Self = this.set("sign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSign: Self = this.set("sign", js.undefined)
    @scala.inline
    def setSin(value: Boolean): Self = this.set("sin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSin: Self = this.set("sin", js.undefined)
    @scala.inline
    def setSinh(value: Boolean): Self = this.set("sinh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSinh: Self = this.set("sinh", js.undefined)
    @scala.inline
    def setSqrt(value: Boolean): Self = this.set("sqrt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSqrt: Self = this.set("sqrt", js.undefined)
    @scala.inline
    def setSubtract(value: Boolean): Self = this.set("subtract", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtract: Self = this.set("subtract", js.undefined)
    @scala.inline
    def setTan(value: Boolean): Self = this.set("tan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTan: Self = this.set("tan", js.undefined)
    @scala.inline
    def setTanh(value: Boolean): Self = this.set("tanh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTanh: Self = this.set("tanh", js.undefined)
    @scala.inline
    def setTrunc(value: Boolean): Self = this.set("trunc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrunc: Self = this.set("trunc", js.undefined)
  }
  
}

