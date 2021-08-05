package typings.easyXHeaders

import typings.easyXHeaders.anon.Ares
import typings.easyXHeaders.anon.End
import typings.easyXHeaders.anon.FnCall
import typings.easyXHeaders.anon.FnCallSRadix
import typings.easyXHeaders.anon.HeapTotal
import typings.easyXHeaders.anon.Instantiable
import typings.easyXHeaders.anon.Targetdefaults
import typings.easyXHeaders.anon.Typeofconsole
import typings.node.Buffer
import typings.std.ArrayBufferConstructor
import typings.std.ArrayConstructor
import typings.std.BooleanConstructor
import typings.std.DataViewConstructor
import typings.std.DateConstructor
import typings.std.Error
import typings.std.ErrorConstructor
import typings.std.EvalError
import typings.std.EvalErrorConstructor
import typings.std.Float32ArrayConstructor
import typings.std.Float64ArrayConstructor
import typings.std.FunctionConstructor
import typings.std.Int16ArrayConstructor
import typings.std.Int32ArrayConstructor
import typings.std.Int8ArrayConstructor
import typings.std.JSON
import typings.std.MapConstructor
import typings.std.Math
import typings.std.NumberConstructor
import typings.std.ObjectConstructor
import typings.std.RangeErrorConstructor
import typings.std.ReferenceError
import typings.std.ReferenceErrorConstructor
import typings.std.RegExpConstructor
import typings.std.SetConstructor
import typings.std.StringConstructor
import typings.std.SyntaxErrorConstructor
import typings.std.TypeError
import typings.std.TypeErrorConstructor
import typings.std.URIError
import typings.std.URIErrorConstructor
import typings.std.Uint16ArrayConstructor
import typings.std.Uint32ArrayConstructor
import typings.std.Uint8ArrayConstructor
import typings.std.WeakMapConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/************************************************
*                                               *
*               GLOBAL INTERFACES               *
*                                               *
************************************************/
object NodeJS {
  
  trait ErrnoException
    extends StObject
       with Error {
    
    var code: js.UndefOr[String] = js.undefined
    
    var errno: js.UndefOr[Double] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var syscall: js.UndefOr[String] = js.undefined
  }
  object ErrnoException {
    
    inline def apply(message: String, name: String): ErrnoException = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrnoException]
    }
    
    extension [Self <: ErrnoException](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setErrno(value: Double): Self = StObject.set(x, "errno", value.asInstanceOf[js.Any])
      
      inline def setErrnoUndefined: Self = StObject.set(x, "errno", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSyscall(value: String): Self = StObject.set(x, "syscall", value.asInstanceOf[js.Any])
      
      inline def setSyscallUndefined: Self = StObject.set(x, "syscall", js.undefined)
    }
  }
  
  @js.native
  trait EventEmitter extends StObject {
    
    def addListener(event: String, listener: js.Function): EventEmitter = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    
    def listeners(event: String): js.Array[js.Function] = js.native
    
    def on(event: String, listener: js.Function): EventEmitter = js.native
    
    def once(event: String, listener: js.Function): EventEmitter = js.native
    
    def removeAllListeners(): EventEmitter = js.native
    def removeAllListeners(event: String): EventEmitter = js.native
    
    def removeListener(event: String, listener: js.Function): EventEmitter = js.native
    
    def setMaxListeners(n: Double): Unit = js.native
  }
  
  trait Global extends StObject {
    
    def Array(): js.Array[js.Any]
    def Array(arrayLength: Double): js.Array[js.Any]
    def Array[T](items: T*): js.Array[T]
    
    var ArrayBuffer: ArrayBufferConstructor
    
    @JSName("Array")
    var Array_Original: ArrayConstructor
    @JSName("Array")
    def Array_T[T](arrayLength: Double): js.Array[T]
    
    def Boolean[T](): scala.Boolean
    def Boolean[T](value: T): scala.Boolean
    @JSName("Boolean")
    var Boolean_Original: BooleanConstructor
    
    var Buffer: Instantiable
    
    var DataView: DataViewConstructor
    
    def Date(): String
    @JSName("Date")
    var Date_Original: DateConstructor
    
    def Error(): typings.std.Error
    def Error(message: String): typings.std.Error
    @JSName("Error")
    var Error_Original: ErrorConstructor
    
    def EvalError(): Error
    def EvalError(message: String): Error
    @JSName("EvalError")
    def EvalError_EvalError(): EvalError
    @JSName("EvalError")
    def EvalError_EvalError(message: String): EvalError
    @JSName("EvalError")
    var EvalError_Original: EvalErrorConstructor
    
    var Float32Array: Float32ArrayConstructor
    
    var Float64Array: Float64ArrayConstructor
    
    def Function(args: String*): js.Function
    @JSName("Function")
    var Function_Original: FunctionConstructor
    
    var GLOBAL: Global
    
    var Infinity: Double
    
    var Int16Array: Int16ArrayConstructor
    
    var Int32Array: Int32ArrayConstructor
    
    var Int8Array: Int8ArrayConstructor
    
    var Intl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Intl */ js.Any
    
    var JSON: typings.std.JSON
    
    var Map: MapConstructor
    
    var Math: typings.std.Math
    
    var NaN: Double
    
    def Number(): Double
    def Number(value: js.Any): Double
    @JSName("Number")
    var Number_Original: NumberConstructor
    
    def Object(): js.Any
    def Object(value: js.Any): js.Any
    @JSName("Object")
    var Object_Original: ObjectConstructor
    
    var Promise: js.Function
    
    def RangeError(): typings.std.RangeError
    def RangeError(message: String): typings.std.RangeError
    @JSName("RangeError")
    def RangeError_Error(): Error
    @JSName("RangeError")
    def RangeError_Error(message: String): Error
    @JSName("RangeError")
    var RangeError_Original: RangeErrorConstructor
    
    def ReferenceError(): Error
    def ReferenceError(message: String): Error
    @JSName("ReferenceError")
    var ReferenceError_Original: ReferenceErrorConstructor
    @JSName("ReferenceError")
    def ReferenceError_ReferenceError(): ReferenceError
    @JSName("ReferenceError")
    def ReferenceError_ReferenceError(message: String): ReferenceError
    
    def RegExp(pattern: String): typings.std.RegExp
    def RegExp(pattern: String, flags: String): typings.std.RegExp
    def RegExp(pattern: typings.std.RegExp): typings.std.RegExp
    def RegExp(pattern: typings.std.RegExp, flags: String): typings.std.RegExp
    @JSName("RegExp")
    var RegExp_Original: RegExpConstructor
    
    var Set: SetConstructor
    
    def String(): java.lang.String
    def String(value: js.Any): java.lang.String
    @JSName("String")
    var String_Original: StringConstructor
    
    var Symbol: js.Function
    
    def SyntaxError(): typings.std.SyntaxError
    def SyntaxError(message: String): typings.std.SyntaxError
    @JSName("SyntaxError")
    def SyntaxError_Error(): Error
    @JSName("SyntaxError")
    def SyntaxError_Error(message: String): Error
    @JSName("SyntaxError")
    var SyntaxError_Original: SyntaxErrorConstructor
    
    def TypeError(): Error
    def TypeError(message: String): Error
    @JSName("TypeError")
    var TypeError_Original: TypeErrorConstructor
    @JSName("TypeError")
    def TypeError_TypeError(): TypeError
    @JSName("TypeError")
    def TypeError_TypeError(message: String): TypeError
    
    def URIError(): Error
    def URIError(message: String): Error
    @JSName("URIError")
    var URIError_Original: URIErrorConstructor
    @JSName("URIError")
    def URIError_URIError(): URIError
    @JSName("URIError")
    def URIError_URIError(message: String): URIError
    
    var Uint16Array: Uint16ArrayConstructor
    
    var Uint32Array: Uint32ArrayConstructor
    
    var Uint8Array: Uint8ArrayConstructor
    
    var Uint8ClampedArray: js.Function
    
    var WeakMap: WeakMapConstructor
    
    var WeakSet: js.Function
    
    def clearImmediate(immediateId: js.Any): Unit
    
    def clearInterval(intervalId: Timer): Unit
    
    def clearTimeout(timeoutId: Timer): Unit
    
    var console: Typeofconsole
    
    def decodeURI(encodedURI: String): String
    
    def decodeURIComponent(encodedURIComponent: String): String
    @JSName("decodeURIComponent")
    var decodeURIComponent_Original: js.Function1[/* encodedURIComponent */ String, String]
    
    @JSName("decodeURI")
    var decodeURI_Original: js.Function1[/* encodedURI */ String, String]
    
    def encodeURI(uri: String): String
    
    def encodeURIComponent(uriComponent: String): String
    def encodeURIComponent(uriComponent: Boolean): String
    def encodeURIComponent(uriComponent: Double): String
    @JSName("encodeURIComponent")
    var encodeURIComponent_Original: FnCall
    
    @JSName("encodeURI")
    var encodeURI_Original: js.Function1[/* uri */ String, String]
    
    def escape(str: String): String
    
    def eval(x: String): js.Any
    @JSName("eval")
    var eval_Original: js.Function1[/* x */ String, js.Any]
    
    def gc(): Unit
    
    var global: Global
    
    def isFinite(number: Double): Boolean
    @JSName("isFinite")
    var isFinite_Original: js.Function1[/* number */ Double, Boolean]
    
    def isNaN(number: Double): Boolean
    @JSName("isNaN")
    var isNaN_Original: js.Function1[/* number */ Double, Boolean]
    
    def parseFloat(string: String): Double
    @JSName("parseFloat")
    var parseFloat_Original: js.Function1[/* string */ String, Double]
    
    def parseInt(s: String): Double
    def parseInt(s: String, radix: Double): Double
    @JSName("parseInt")
    var parseInt_Original: FnCallSRadix
    
    var process: Process
    
    var root: Global
    
    def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): js.Any
    
    def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timer
    
    def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timer
    
    var undefined: Unit
    
    def unescape(str: String): String
  }
  object Global {
    
    inline def apply(
      Array: ArrayConstructor,
      ArrayBuffer: ArrayBufferConstructor,
      Boolean: BooleanConstructor,
      Buffer: Instantiable,
      DataView: DataViewConstructor,
      Date: DateConstructor,
      Error: ErrorConstructor,
      EvalError: EvalErrorConstructor,
      Float32Array: Float32ArrayConstructor,
      Float64Array: Float64ArrayConstructor,
      Function: FunctionConstructor,
      GLOBAL: Global,
      Infinity: Double,
      Int16Array: Int16ArrayConstructor,
      Int32Array: Int32ArrayConstructor,
      Int8Array: Int8ArrayConstructor,
      Intl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Intl */ js.Any,
      JSON: JSON,
      Map: MapConstructor,
      Math: Math,
      NaN: Double,
      Number: NumberConstructor,
      Object: ObjectConstructor,
      Promise: js.Function,
      RangeError: RangeErrorConstructor,
      ReferenceError: ReferenceErrorConstructor,
      RegExp: RegExpConstructor,
      Set: SetConstructor,
      String: StringConstructor,
      Symbol: js.Function,
      SyntaxError: SyntaxErrorConstructor,
      TypeError: TypeErrorConstructor,
      URIError: URIErrorConstructor,
      Uint16Array: Uint16ArrayConstructor,
      Uint32Array: Uint32ArrayConstructor,
      Uint8Array: Uint8ArrayConstructor,
      Uint8ClampedArray: js.Function,
      WeakMap: WeakMapConstructor,
      WeakSet: js.Function,
      clearImmediate: js.Any => Unit,
      clearInterval: Timer => Unit,
      clearTimeout: Timer => Unit,
      console: Typeofconsole,
      decodeURI: /* encodedURI */ String => String,
      decodeURIComponent: /* encodedURIComponent */ String => String,
      encodeURI: /* uri */ String => String,
      encodeURIComponent: FnCall,
      escape: String => String,
      eval: /* x */ String => js.Any,
      gc: () => Unit,
      global: Global,
      isFinite: /* number */ Double => Boolean,
      isNaN: /* number */ Double => Boolean,
      parseFloat: /* string */ String => Double,
      parseInt: FnCallSRadix,
      process: Process,
      root: Global,
      setImmediate: (js.Function1[/* repeated */ js.Any, Unit], /* repeated */ js.Any) => js.Any,
      setInterval: (js.Function1[/* repeated */ js.Any, Unit], Double, /* repeated */ js.Any) => Timer,
      setTimeout: (js.Function1[/* repeated */ js.Any, Unit], Double, /* repeated */ js.Any) => Timer,
      undefined: Unit,
      unescape: String => String
    ): Global = {
      val __obj = js.Dynamic.literal(Array = Array.asInstanceOf[js.Any], ArrayBuffer = ArrayBuffer.asInstanceOf[js.Any], Boolean = Boolean.asInstanceOf[js.Any], Buffer = Buffer.asInstanceOf[js.Any], DataView = DataView.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any], EvalError = EvalError.asInstanceOf[js.Any], Float32Array = Float32Array.asInstanceOf[js.Any], Float64Array = Float64Array.asInstanceOf[js.Any], Function = Function.asInstanceOf[js.Any], GLOBAL = GLOBAL.asInstanceOf[js.Any], Infinity = Infinity.asInstanceOf[js.Any], Int16Array = Int16Array.asInstanceOf[js.Any], Int32Array = Int32Array.asInstanceOf[js.Any], Int8Array = Int8Array.asInstanceOf[js.Any], Intl = Intl.asInstanceOf[js.Any], JSON = JSON.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], Math = Math.asInstanceOf[js.Any], NaN = NaN.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], Object = Object.asInstanceOf[js.Any], Promise = Promise.asInstanceOf[js.Any], RangeError = RangeError.asInstanceOf[js.Any], ReferenceError = ReferenceError.asInstanceOf[js.Any], RegExp = RegExp.asInstanceOf[js.Any], Set = Set.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], Symbol = Symbol.asInstanceOf[js.Any], SyntaxError = SyntaxError.asInstanceOf[js.Any], TypeError = TypeError.asInstanceOf[js.Any], URIError = URIError.asInstanceOf[js.Any], Uint16Array = Uint16Array.asInstanceOf[js.Any], Uint32Array = Uint32Array.asInstanceOf[js.Any], Uint8Array = Uint8Array.asInstanceOf[js.Any], Uint8ClampedArray = Uint8ClampedArray.asInstanceOf[js.Any], WeakMap = WeakMap.asInstanceOf[js.Any], WeakSet = WeakSet.asInstanceOf[js.Any], clearImmediate = js.Any.fromFunction1(clearImmediate), clearInterval = js.Any.fromFunction1(clearInterval), clearTimeout = js.Any.fromFunction1(clearTimeout), console = console.asInstanceOf[js.Any], decodeURI = js.Any.fromFunction1(decodeURI), decodeURIComponent = js.Any.fromFunction1(decodeURIComponent), encodeURI = js.Any.fromFunction1(encodeURI), encodeURIComponent = encodeURIComponent.asInstanceOf[js.Any], escape = js.Any.fromFunction1(escape), eval = js.Any.fromFunction1(eval), gc = js.Any.fromFunction0(gc), global = global.asInstanceOf[js.Any], isFinite = js.Any.fromFunction1(isFinite), isNaN = js.Any.fromFunction1(isNaN), parseFloat = js.Any.fromFunction1(parseFloat), parseInt = parseInt.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], setImmediate = js.Any.fromFunction2(setImmediate), setInterval = js.Any.fromFunction3(setInterval), setTimeout = js.Any.fromFunction3(setTimeout), undefined = undefined.asInstanceOf[js.Any], unescape = js.Any.fromFunction1(unescape))
      __obj.asInstanceOf[Global]
    }
    
    extension [Self <: Global](x: Self) {
      
      inline def setArray(value: ArrayConstructor): Self = StObject.set(x, "Array", value.asInstanceOf[js.Any])
      
      inline def setArrayBuffer(value: ArrayBufferConstructor): Self = StObject.set(x, "ArrayBuffer", value.asInstanceOf[js.Any])
      
      inline def setBoolean(value: BooleanConstructor): Self = StObject.set(x, "Boolean", value.asInstanceOf[js.Any])
      
      inline def setBuffer(value: Instantiable): Self = StObject.set(x, "Buffer", value.asInstanceOf[js.Any])
      
      inline def setClearImmediate(value: js.Any => Unit): Self = StObject.set(x, "clearImmediate", js.Any.fromFunction1(value))
      
      inline def setClearInterval(value: Timer => Unit): Self = StObject.set(x, "clearInterval", js.Any.fromFunction1(value))
      
      inline def setClearTimeout(value: Timer => Unit): Self = StObject.set(x, "clearTimeout", js.Any.fromFunction1(value))
      
      inline def setConsole(value: Typeofconsole): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setDataView(value: DataViewConstructor): Self = StObject.set(x, "DataView", value.asInstanceOf[js.Any])
      
      inline def setDate(value: DateConstructor): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
      
      inline def setDecodeURI(value: /* encodedURI */ String => String): Self = StObject.set(x, "decodeURI", js.Any.fromFunction1(value))
      
      inline def setDecodeURIComponent(value: /* encodedURIComponent */ String => String): Self = StObject.set(x, "decodeURIComponent", js.Any.fromFunction1(value))
      
      inline def setEncodeURI(value: /* uri */ String => String): Self = StObject.set(x, "encodeURI", js.Any.fromFunction1(value))
      
      inline def setEncodeURIComponent(value: FnCall): Self = StObject.set(x, "encodeURIComponent", value.asInstanceOf[js.Any])
      
      inline def setError(value: ErrorConstructor): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
      
      inline def setEscape(value: String => String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
      
      inline def setEval(value: /* x */ String => js.Any): Self = StObject.set(x, "eval", js.Any.fromFunction1(value))
      
      inline def setEvalError(value: EvalErrorConstructor): Self = StObject.set(x, "EvalError", value.asInstanceOf[js.Any])
      
      inline def setFloat32Array(value: Float32ArrayConstructor): Self = StObject.set(x, "Float32Array", value.asInstanceOf[js.Any])
      
      inline def setFloat64Array(value: Float64ArrayConstructor): Self = StObject.set(x, "Float64Array", value.asInstanceOf[js.Any])
      
      inline def setFunction(value: FunctionConstructor): Self = StObject.set(x, "Function", value.asInstanceOf[js.Any])
      
      inline def setGLOBAL(value: Global): Self = StObject.set(x, "GLOBAL", value.asInstanceOf[js.Any])
      
      inline def setGc(value: () => Unit): Self = StObject.set(x, "gc", js.Any.fromFunction0(value))
      
      inline def setInfinity(value: Double): Self = StObject.set(x, "Infinity", value.asInstanceOf[js.Any])
      
      inline def setInt16Array(value: Int16ArrayConstructor): Self = StObject.set(x, "Int16Array", value.asInstanceOf[js.Any])
      
      inline def setInt32Array(value: Int32ArrayConstructor): Self = StObject.set(x, "Int32Array", value.asInstanceOf[js.Any])
      
      inline def setInt8Array(value: Int8ArrayConstructor): Self = StObject.set(x, "Int8Array", value.asInstanceOf[js.Any])
      
      inline def setIntl(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Intl */ js.Any): Self = StObject.set(x, "Intl", value.asInstanceOf[js.Any])
      
      inline def setIsFinite(value: /* number */ Double => Boolean): Self = StObject.set(x, "isFinite", js.Any.fromFunction1(value))
      
      inline def setIsNaN(value: /* number */ Double => Boolean): Self = StObject.set(x, "isNaN", js.Any.fromFunction1(value))
      
      inline def setJSON(value: JSON): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
      
      inline def setMap(value: MapConstructor): Self = StObject.set(x, "Map", value.asInstanceOf[js.Any])
      
      inline def setMath(value: Math): Self = StObject.set(x, "Math", value.asInstanceOf[js.Any])
      
      inline def setNaN(value: Double): Self = StObject.set(x, "NaN", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: NumberConstructor): Self = StObject.set(x, "Number", value.asInstanceOf[js.Any])
      
      inline def setObject(value: ObjectConstructor): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
      
      inline def setParseFloat(value: /* string */ String => Double): Self = StObject.set(x, "parseFloat", js.Any.fromFunction1(value))
      
      inline def setParseInt(value: FnCallSRadix): Self = StObject.set(x, "parseInt", value.asInstanceOf[js.Any])
      
      inline def setProcess(value: Process): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
      
      inline def setPromise(value: js.Function): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      inline def setRangeError(value: RangeErrorConstructor): Self = StObject.set(x, "RangeError", value.asInstanceOf[js.Any])
      
      inline def setReferenceError(value: ReferenceErrorConstructor): Self = StObject.set(x, "ReferenceError", value.asInstanceOf[js.Any])
      
      inline def setRegExp(value: RegExpConstructor): Self = StObject.set(x, "RegExp", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: Global): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSet(value: SetConstructor): Self = StObject.set(x, "Set", value.asInstanceOf[js.Any])
      
      inline def setSetImmediate(value: (js.Function1[/* repeated */ js.Any, Unit], /* repeated */ js.Any) => js.Any): Self = StObject.set(x, "setImmediate", js.Any.fromFunction2(value))
      
      inline def setSetInterval(value: (js.Function1[/* repeated */ js.Any, Unit], Double, /* repeated */ js.Any) => Timer): Self = StObject.set(x, "setInterval", js.Any.fromFunction3(value))
      
      inline def setSetTimeout(value: (js.Function1[/* repeated */ js.Any, Unit], Double, /* repeated */ js.Any) => Timer): Self = StObject.set(x, "setTimeout", js.Any.fromFunction3(value))
      
      inline def setString(value: StringConstructor): Self = StObject.set(x, "String", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: js.Function): Self = StObject.set(x, "Symbol", value.asInstanceOf[js.Any])
      
      inline def setSyntaxError(value: SyntaxErrorConstructor): Self = StObject.set(x, "SyntaxError", value.asInstanceOf[js.Any])
      
      inline def setTypeError(value: TypeErrorConstructor): Self = StObject.set(x, "TypeError", value.asInstanceOf[js.Any])
      
      inline def setURIError(value: URIErrorConstructor): Self = StObject.set(x, "URIError", value.asInstanceOf[js.Any])
      
      inline def setUint16Array(value: Uint16ArrayConstructor): Self = StObject.set(x, "Uint16Array", value.asInstanceOf[js.Any])
      
      inline def setUint32Array(value: Uint32ArrayConstructor): Self = StObject.set(x, "Uint32Array", value.asInstanceOf[js.Any])
      
      inline def setUint8Array(value: Uint8ArrayConstructor): Self = StObject.set(x, "Uint8Array", value.asInstanceOf[js.Any])
      
      inline def setUint8ClampedArray(value: js.Function): Self = StObject.set(x, "Uint8ClampedArray", value.asInstanceOf[js.Any])
      
      inline def setUndefined(value: Unit): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
      
      inline def setUnescape(value: String => String): Self = StObject.set(x, "unescape", js.Any.fromFunction1(value))
      
      inline def setWeakMap(value: WeakMapConstructor): Self = StObject.set(x, "WeakMap", value.asInstanceOf[js.Any])
      
      inline def setWeakSet(value: js.Function): Self = StObject.set(x, "WeakSet", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Process
    extends StObject
       with EventEmitter {
    
    def abort(): Unit = js.native
    
    var arch: String = js.native
    
    var argv: js.Array[String] = js.native
    
    def chdir(directory: String): Unit = js.native
    
    var config: Targetdefaults = js.native
    
    def cwd(): String = js.native
    
    var env: js.Any = js.native
    
    var execPath: String = js.native
    
    def exit(): Unit = js.native
    def exit(code: Double): Unit = js.native
    
    def getgid(): Double = js.native
    
    def getuid(): Double = js.native
    
    def hrtime(): js.Array[Double] = js.native
    def hrtime(time: js.Array[Double]): js.Array[Double] = js.native
    
    def kill(pid: Double): Unit = js.native
    def kill(pid: Double, signal: String): Unit = js.native
    
    def memoryUsage(): HeapTotal = js.native
    
    def nextTick(callback: js.Function): Unit = js.native
    
    var pid: Double = js.native
    
    var platform: String = js.native
    
    // Worker
    var send: js.UndefOr[js.Function2[/* message */ js.Any, /* sendHandle */ js.UndefOr[js.Any], Unit]] = js.native
    
    def setgid(id: String): Unit = js.native
    def setgid(id: Double): Unit = js.native
    
    def setuid(id: String): Unit = js.native
    def setuid(id: Double): Unit = js.native
    
    var stderr: WritableStream = js.native
    
    var stdin: ReadableStream = js.native
    
    var stdout: WritableStream = js.native
    
    var title: String = js.native
    
    def umask(): Double = js.native
    def umask(mask: Double): Double = js.native
    
    def uptime(): Double = js.native
    
    var version: String = js.native
    
    var versions: Ares = js.native
  }
  
  @js.native
  trait ReadWriteStream
    extends StObject
       with ReadableStream
       with WritableStream
  
  @js.native
  trait ReadableStream
    extends StObject
       with EventEmitter {
    
    def pause(): Unit = js.native
    
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    def read(): String | Buffer = js.native
    def read(size: Double): String | Buffer = js.native
    
    var readable: Boolean = js.native
    
    def resume(): Unit = js.native
    
    def setEncoding(encoding: String): Unit = js.native
    
    def unpipe[T /* <: WritableStream */](): Unit = js.native
    def unpipe[T /* <: WritableStream */](destination: T): Unit = js.native
    
    def unshift(chunk: String): Unit = js.native
    def unshift(chunk: Buffer): Unit = js.native
    
    def wrap(oldStream: ReadableStream): ReadableStream = js.native
  }
  
  trait Timer extends StObject {
    
    def ref(): Unit
    
    def unref(): Unit
  }
  object Timer {
    
    inline def apply(ref: () => Unit, unref: () => Unit): Timer = {
      val __obj = js.Dynamic.literal(ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
      __obj.asInstanceOf[Timer]
    }
    
    extension [Self <: Timer](x: Self) {
      
      inline def setRef(value: () => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction0(value))
      
      inline def setUnref(value: () => Unit): Self = StObject.set(x, "unref", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait WritableStream
    extends StObject
       with EventEmitter {
    
    def end(): Unit = js.native
    def end(buffer: Buffer): Unit = js.native
    def end(buffer: Buffer, cb: js.Function): Unit = js.native
    def end(str: String): Unit = js.native
    def end(str: String, cb: js.Function): Unit = js.native
    def end(str: String, encoding: String): Unit = js.native
    def end(str: String, encoding: String, cb: js.Function): Unit = js.native
    def end(str: String, encoding: Unit, cb: js.Function): Unit = js.native
    
    var writable: Boolean = js.native
    
    def write(buffer: Buffer): Boolean = js.native
    def write(buffer: Buffer, cb: js.Function): Boolean = js.native
    def write(str: String): Boolean = js.native
    def write(str: String, cb: js.Function): Boolean = js.native
    def write(str: String, encoding: String): Boolean = js.native
    def write(str: String, encoding: String, cb: js.Function): Boolean = js.native
    def write(str: String, encoding: Unit, cb: js.Function): Boolean = js.native
  }
}
