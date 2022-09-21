package typings.fridaGum

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.fridaGum.fridaGumBooleans.`true`
import typings.fridaGum.fridaGumStrings.DotDotDot
import typings.fridaGum.fridaGumStrings.`apsr-nzcvq`
import typings.fridaGum.fridaGumStrings.block
import typings.fridaGum.fridaGumStrings.call
import typings.fridaGum.fridaGumStrings.compile
import typings.fridaGum.fridaGumStrings.exec
import typings.fridaGum.fridaGumStrings.ret
import typings.fridaGum.fridaGumStrings.stop
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.Arm64Register
  - scala.Double
  - typings.fridaGum.UInt64
  - typings.fridaGum.Int64
  - typings.fridaGum.NativePointerValue
*/
type Arm64CallArgument = _Arm64CallArgument | Double

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.ArmRegister
  - scala.Double
  - typings.fridaGum.UInt64
  - typings.fridaGum.Int64
  - typings.fridaGum.NativePointerValue
*/
type ArmCallArgument = _ArmCallArgument | Double

type ArmSystemRegister = `apsr-nzcvq`

/**
  * Preprocessor defines present when constructing a CModule from C source code.
  *
  * The mapping to GCC-style command-line arguments depends on the type of the value:
  * `string`: `-Dname=value`
  * `true`: `-Dname`
  */
type CModuleDefines = StringDictionary[String | `true`]

/**
  * C headers present when constructing a CModule from C source code.
  *
  * The `name` is a relative filesystem path, and the value is the contents of
  * the header.
  */
type CModuleHeaders = StringDictionary[String]

type CSymbols = StringDictionary[NativePointerValue]

type EnumerateAction = stop

type ExceptionHandlerCallback = js.Function1[/* exception */ ExceptionDetails, Boolean | Unit]

type GetNativeCallbackArgumentValue[T /* <: NativeCallbackArgumentType */] = GetValue[
NativeCallbackArgumentTypeMap, 
NativeCallbackArgumentValue, 
NativeCallbackArgumentType, 
T]

type GetNativeCallbackReturnValue[T /* <: NativeCallbackReturnType */] = GetValue[NativeCallbackReturnTypeMap, NativeCallbackReturnValue, NativeCallbackReturnType, T]

type GetNativeFunctionArgumentValue[T /* <: NativeFunctionArgumentType */] = GetValue[
NativeFunctionArgumentTypeMap, 
NativeFunctionArgumentValue, 
NativeFunctionArgumentType, 
T]

type GetNativeFunctionReturnValue[T /* <: NativeFunctionReturnType */] = GetValue[NativeFunctionReturnTypeMap, NativeFunctionReturnValue, NativeFunctionReturnType, T]

type GetValue[Map, Value, Type, T /* <: Type */] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]: T[P] extends Type? frida-gum.GetValue<Map, Value, Type, T[P]> : never}
  */ typings.fridaGum.fridaGumStrings.GetValue & TopLevel[Any]) | (/* import warning: importer.ImportType#apply Failed type conversion: Map[T] */ js.Any) | Value

/**
  * Opaque ID returned by `setImmediate()`. Pass it to `clearImmediate()` to cancel a pending `setImmediate()`.
  */
type ImmediateId = Double

/**
  * Callback to invoke when an instruction is about to be executed.
  */
type InstructionProbeCallback = js.ThisFunction1[/* this */ InvocationContext, /* args */ InvocationArguments, Unit]

/**
  * Opaque ID returned by `setInterval()`. Pass it to `clearInterval()` to cancel a pending `setInterval()`.
  */
type IntervalId = Double

/**
  * Virtual array providing access to the argument list. Agnostic to the number of arguments and their types.
  */
type InvocationArguments = js.Array[NativePointer]

type MemoryAllocOptions = (Record[Any, scala.Nothing]) | MemoryAllocNearOptions

type MemoryPatchApplyCallback = js.Function1[/* code */ NativePointer, Unit]

type MessageCallback = js.Function2[/* message */ Any, /* data */ ArrayBuffer | Null, Unit]

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.MipsRegister
  - scala.Double
  - typings.fridaGum.UInt64
  - typings.fridaGum.Int64
  - typings.fridaGum.NativePointerValue
*/
type MipsCallArgument = _MipsCallArgument | Double

type ModuleMapFilter = js.Function1[/* m */ Module, Boolean]

type NativeCallback[RetType /* <: NativeCallbackReturnType */, ArgTypes /* <: js.Array[Any | NativeCallbackArgumentType] */] = NativePointer

type NativeCallbackArgumentType = RecursiveKeysOf[NativeCallbackArgumentTypeMap]

type NativeCallbackArgumentValue = RecursiveValuesOf[NativeCallbackArgumentTypeMap]

type NativeCallbackImplementation[RetType /* <: NativeCallbackReturnValue */, ArgTypes /* <: js.Array[Any | NativeCallbackArgumentValue] */] = js.ThisFunction1[/* this */ CallbackContext | InvocationContext, /* args */ ArgTypes, RetType]

type NativeCallbackReturnType = RecursiveKeysOf[NativeCallbackReturnTypeMap]

type NativeCallbackReturnValue = RecursiveValuesOf[NativeCallbackReturnTypeMap]

type NativeFunctionArgumentType = RecursiveKeysOf[NativeFunctionArgumentTypeMap]

type NativeFunctionArgumentValue = RecursiveValuesOf[NativeFunctionArgumentTypeMap]

type NativeFunctionReturnType = RecursiveKeysOf[NativeFunctionReturnTypeMap]

type NativeFunctionReturnValue = RecursiveValuesOf[NativeFunctionReturnTypeMap]

/**
  * Given as a string of the form: rwx, where rw- means “readable and writable”.
  */
type PageProtection = String

type RecursiveKeysOf[T] = (/* keyof T */ String) | js.Array[Any]

type RecursiveValuesOf[T] = (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | js.Array[Any]

type ResolveVariadic[List /* <: js.Array[Any] */] = js.Array[Any] | (Array[
/* import warning: importer.ImportType#apply Failed type conversion: any[0] */ js.Any])

type RpcExports = StringDictionary[AnyFunction]

type StalkerArm32TransformCallback = js.Function1[/* iterator */ StalkerArmIterator | StalkerThumbIterator, Unit]

type StalkerArm64TransformCallback = js.Function1[/* iterator */ StalkerArm64Iterator, Unit]

type StalkerBlockEventBare = js.Tuple2[NativePointer | String, NativePointer | String]

type StalkerBlockEventFull = js.Tuple3[block, NativePointer | String, NativePointer | String]

type StalkerCallEventBare = js.Tuple3[NativePointer | String, NativePointer | String, Double]

type StalkerCallEventFull = js.Tuple4[call, NativePointer | String, NativePointer | String, Double]

type StalkerCallProbeCallback = StalkerScriptCallProbeCallback | StalkerNativeCallProbeCallback

type StalkerCallProbeId = Double

type StalkerCallSummary = StringDictionary[Double]

type StalkerCallout = StalkerScriptCallout | StalkerNativeCallout

type StalkerCompileEventBare = js.Tuple2[NativePointer | String, NativePointer | String]

type StalkerCompileEventFull = js.Tuple3[compile, NativePointer | String, NativePointer | String]

type StalkerEventBare = StalkerCallEventBare | StalkerRetEventBare | StalkerExecEventBare | StalkerBlockEventBare | StalkerCompileEventBare

type StalkerEventFull = StalkerCallEventFull | StalkerRetEventFull | StalkerExecEventFull | StalkerBlockEventFull | StalkerCompileEventFull

type StalkerExecEventBare = js.Array[NativePointer | String]

type StalkerExecEventFull = js.Tuple2[exec, NativePointer | String]

/**
  * Called synchronously when a call is made to the given address.
  *
  * Signature: `void onCall (GumCallSite * site, gpointer user_data)`
  */
type StalkerNativeCallProbeCallback = NativePointer

/**
  * Signature: `void onAesEnc (GumCpuContext * cpu_context, gpointer user_data)`
  */
type StalkerNativeCallout = NativePointer

/**
  * Signature: `void process (const GumEvent * event, GumCpuContext * cpu_context, gpointer user_data)`
  */
type StalkerNativeEventCallback = NativePointer

/**
  * Signature: `void transform (GumStalkerIterator * iterator, GumStalkerOutput * output, gpointer user_data)`
  */
type StalkerNativeTransformCallback = NativePointer

type StalkerRetEventBare = js.Tuple3[NativePointer | String, NativePointer | String, Double]

type StalkerRetEventFull = js.Tuple4[ret, NativePointer | String, NativePointer | String, Double]

/**
  * Called synchronously when a call is made to the given address.
  */
type StalkerScriptCallProbeCallback = js.Function1[/* args */ InvocationArguments, Unit]

type StalkerScriptCallout = js.Function1[/* context */ CpuContext, Unit]

type StalkerTransformCallback = StalkerX86TransformCallback | StalkerArm32TransformCallback | StalkerArm64TransformCallback | StalkerNativeTransformCallback

type StalkerX86TransformCallback = js.Function1[/* iterator */ StalkerX86Iterator, Unit]

type ThreadId = Double

/**
  * Opaque ID returned by `setTimeout()`. Pass it to `clearTimeout()` to cancel a pending `setTimeout()`.
  */
type TimeoutId = Double

/**
  * Input stream backed by a file descriptor.
  *
  * Only available on UNIX-like OSes.
  */
type UnixInputStream = InputStream

/**
  * Output stream backed by a file descriptor.
  *
  * Only available on UNIX-like OSes.
  */
type UnixOutputStream = OutputStream

type Variadic = DotDotDot

type WeakRefCallback = js.Function0[Unit]

/**
  * Opaque ID returned by `Script.bindWeak()`. Pass it to `Script.unbindWeak()`
  * to stop monitoring the target value.
  */
type WeakRefId = Double

/**
  * Input stream backed by a Windows file handle.
  *
  * Only available on Windows.
  */
type Win32InputStream = InputStream

/**
  * Output stream backed by a Windows file handle.
  *
  * Only available on Windows.
  */
type Win32OutputStream = OutputStream

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.X86Register
  - scala.Double
  - typings.fridaGum.UInt64
  - typings.fridaGum.Int64
  - typings.fridaGum.NativePointerValue
*/
type X86CallArgument = _X86CallArgument | Double
