package typings
package easyDashXDashHeadersLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Global extends js.Object {
  var ArrayBuffer: stdLib.ArrayBufferConstructor = js.native
  @JSName("Array")
  var Array_Original: stdLib.ArrayConstructor = js.native
  @JSName("Boolean")
  var Boolean_Original: stdLib.BooleanConstructor = js.native
  var Buffer: easyDashXDashHeadersLib.Anon_IsEncoding = js.native
  var DataView: stdLib.DataViewConstructor = js.native
  @JSName("Date")
  var Date_Original: stdLib.DateConstructor = js.native
  @JSName("Error")
  var Error_Original: stdLib.ErrorConstructor = js.native
  @JSName("EvalError")
  var EvalError_Original: stdLib.EvalErrorConstructor = js.native
  var Float32Array: stdLib.Float32ArrayConstructor = js.native
  var Float64Array: stdLib.Float64ArrayConstructor = js.native
  @JSName("Function")
  var Function_Original: stdLib.FunctionConstructor = js.native
  var GLOBAL: Global = js.native
  var Infinity: scala.Double = js.native
  var Int16Array: stdLib.Int16ArrayConstructor = js.native
  var Int32Array: stdLib.Int32ArrayConstructor = js.native
  var Int8Array: stdLib.Int8ArrayConstructor = js.native
  var Intl: easyDashXDashHeadersLib.Anon_Collator = js.native
  var JSON: stdLib.JSON = js.native
  var Map: stdLib.MapConstructor = js.native
  var Math: stdLib.Math = js.native
  var NaN: scala.Double = js.native
  @JSName("Number")
  var Number_Original: stdLib.NumberConstructor = js.native
  @JSName("Object")
  var Object_Original: stdLib.ObjectConstructor = js.native
  var Promise: js.Function = js.native
  @JSName("RangeError")
  var RangeError_Original: stdLib.RangeErrorConstructor = js.native
  @JSName("ReferenceError")
  var ReferenceError_Original: stdLib.ReferenceErrorConstructor = js.native
  @JSName("RegExp")
  var RegExp_Original: stdLib.RegExpConstructor = js.native
  var Set: stdLib.SetConstructor = js.native
  @JSName("String")
  var String_Original: stdLib.StringConstructor = js.native
  var Symbol: js.Function = js.native
  @JSName("SyntaxError")
  var SyntaxError_Original: stdLib.SyntaxErrorConstructor = js.native
  @JSName("TypeError")
  var TypeError_Original: stdLib.TypeErrorConstructor = js.native
  @JSName("URIError")
  var URIError_Original: stdLib.URIErrorConstructor = js.native
  var Uint16Array: stdLib.Uint16ArrayConstructor = js.native
  var Uint32Array: stdLib.Uint32ArrayConstructor = js.native
  var Uint8Array: stdLib.Uint8ArrayConstructor = js.native
  var Uint8ClampedArray: js.Function = js.native
  var WeakMap: stdLib.WeakMapConstructor = js.native
  var WeakSet: js.Function = js.native
  var console: nodeLib.Console = js.native
  @JSName("decodeURIComponent")
  var decodeURIComponent_Original: js.Function1[/* encodedURIComponent */ java.lang.String, java.lang.String] = js.native
  @JSName("decodeURI")
  var decodeURI_Original: js.Function1[/* encodedURI */ java.lang.String, java.lang.String] = js.native
  @JSName("encodeURIComponent")
  var encodeURIComponent_Original: js.Function1[/* uriComponent */ java.lang.String, java.lang.String] = js.native
  @JSName("encodeURI")
  var encodeURI_Original: js.Function1[/* uri */ java.lang.String, java.lang.String] = js.native
  @JSName("eval")
  var eval_Original: js.Function1[/* x */ java.lang.String, _] = js.native
  var global: Global = js.native
  @JSName("isFinite")
  var isFinite_Original: js.Function1[/* number */ scala.Double, scala.Boolean] = js.native
  @JSName("isNaN")
  var isNaN_Original: js.Function1[/* number */ scala.Double, scala.Boolean] = js.native
  @JSName("parseFloat")
  var parseFloat_Original: js.Function1[/* string */ java.lang.String, scala.Double] = js.native
  @JSName("parseInt")
  var parseInt_Original: js.Function2[/* s */ java.lang.String, /* radix */ scala.Double, scala.Double] = js.native
  var process: Process = js.native
  var root: Global = js.native
  var undefined: js.UndefOr[scala.Nothing] = js.native
  def Array(): js.Array[_] = js.native
  def Array(arrayLength: scala.Double): js.Array[_] = js.native
  def Array[T](items: T*): js.Array[T] = js.native
  @JSName("Array")
  def Array_T[T](arrayLength: scala.Double): js.Array[T] = js.native
  def Boolean(): scala.Boolean = js.native
  def Boolean(value: js.Any): scala.Boolean = js.native
  def Date(): java.lang.String = js.native
  def Error(): stdLib.Error = js.native
  def Error(message: java.lang.String): stdLib.Error = js.native
  def EvalError(): stdLib.EvalError = js.native
  def EvalError(message: java.lang.String): stdLib.EvalError = js.native
  def Function(args: java.lang.String*): js.Function = js.native
  def Number(): scala.Double = js.native
  def Number(value: js.Any): scala.Double = js.native
  def Object(): js.Any = js.native
  def Object(value: js.Any): js.Any = js.native
  def RangeError(): stdLib.RangeError = js.native
  def RangeError(message: java.lang.String): stdLib.RangeError = js.native
  def ReferenceError(): stdLib.ReferenceError = js.native
  def ReferenceError(message: java.lang.String): stdLib.ReferenceError = js.native
  def RegExp(pattern: java.lang.String): stdLib.RegExp = js.native
  def RegExp(pattern: java.lang.String, flags: java.lang.String): stdLib.RegExp = js.native
  def RegExp(pattern: stdLib.RegExp): stdLib.RegExp = js.native
  def RegExp(pattern: stdLib.RegExp, flags: java.lang.String): stdLib.RegExp = js.native
  def String(): java.lang.String = js.native
  def String(value: js.Any): java.lang.String = js.native
  def SyntaxError(): stdLib.SyntaxError = js.native
  def SyntaxError(message: java.lang.String): stdLib.SyntaxError = js.native
  def TypeError(): stdLib.TypeError = js.native
  def TypeError(message: java.lang.String): stdLib.TypeError = js.native
  def URIError(): stdLib.URIError = js.native
  def URIError(message: java.lang.String): stdLib.URIError = js.native
  def clearImmediate(immediateId: js.Any): scala.Unit = js.native
  def clearInterval(intervalId: Timer): scala.Unit = js.native
  def clearTimeout(timeoutId: Timer): scala.Unit = js.native
  def decodeURI(encodedURI: java.lang.String): java.lang.String = js.native
  def decodeURIComponent(encodedURIComponent: java.lang.String): java.lang.String = js.native
  def encodeURI(uri: java.lang.String): java.lang.String = js.native
  def encodeURIComponent(uriComponent: java.lang.String): java.lang.String = js.native
  def escape(str: java.lang.String): java.lang.String = js.native
  def eval(x: java.lang.String): js.Any = js.native
  def gc(): scala.Unit = js.native
  def isFinite(number: scala.Double): scala.Boolean = js.native
  def isNaN(number: scala.Double): scala.Boolean = js.native
  def parseFloat(string: java.lang.String): scala.Double = js.native
  def parseInt(s: java.lang.String, radix: scala.Double): scala.Double = js.native
  def setImmediate(callback: js.Function1[/* repeated */js.Any, scala.Unit], args: js.Any*): js.Any = js.native
  def setInterval(callback: js.Function1[/* repeated */js.Any, scala.Unit], ms: scala.Double, args: js.Any*): Timer = js.native
  def setTimeout(callback: js.Function1[/* repeated */js.Any, scala.Unit], ms: scala.Double, args: js.Any*): Timer = js.native
  def unescape(str: java.lang.String): java.lang.String = js.native
}

