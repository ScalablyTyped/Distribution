package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fridaDashGum {
  import org.scalablytyped.runtime.StringDictionary
  import typings.fridaDashGum.fridaDashGumStrings.`apsr-nzcvq`
  import typings.fridaDashGum.fridaDashGumStrings.block
  import typings.fridaDashGum.fridaDashGumStrings.call
  import typings.fridaDashGum.fridaDashGumStrings.compile
  import typings.fridaDashGum.fridaDashGumStrings.exec
  import typings.fridaDashGum.fridaDashGumStrings.ret
  import typings.fridaDashGum.fridaDashGumStrings.stop
  import typings.std.ArrayBuffer

  type AnyFunction = js.Function1[/* repeated */ js.Any, js.Any]
  /* Rewritten from type alias, can be one of: 
    - typings.fridaDashGum.Arm64Register
    - scala.Double
    - typings.fridaDashGum.UInt64
    - typings.fridaDashGum.Int64
    - typings.fridaDashGum.NativePointerValue
  */
  type Arm64CallArgument = _Arm64CallArgument | Double
  /* Rewritten from type alias, can be one of: 
    - typings.fridaDashGum.ArmRegister
    - scala.Double
    - typings.fridaDashGum.UInt64
    - typings.fridaDashGum.Int64
    - typings.fridaDashGum.NativePointerValue
  */
  type ArmCallArgument = _ArmCallArgument | Double
  type ArmSystemRegister = `apsr-nzcvq`
  type CSymbols = StringDictionary[NativePointerValue]
  type EnumerateAction = stop
  type ExceptionHandlerCallback = js.Function1[/* exception */ ExceptionDetails, Boolean | Unit]
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
  type MemoryPatchApplyCallback = js.Function1[/* code */ NativePointer, Unit]
  type MessageCallback = js.Function2[/* message */ js.Any, /* data */ ArrayBuffer | Null, Unit]
  /* Rewritten from type alias, can be one of: 
    - typings.fridaDashGum.MipsRegister
    - scala.Double
    - typings.fridaDashGum.UInt64
    - typings.fridaDashGum.Int64
    - typings.fridaDashGum.NativePointerValue
  */
  type MipsCallArgument = _MipsCallArgument | Double
  type ModuleMapFilter = js.Function1[/* m */ Module, Boolean]
  /* Rewritten from type alias, can be one of: 
    - typings.fridaDashGum.NativePointerValue
    - typings.fridaDashGum.UInt64
    - typings.fridaDashGum.Int64
    - scala.Double
    - scala.Boolean
    - js.Array[js.Any]
  */
  type NativeArgumentValue = _NativeArgumentValue | js.Array[js.Any] | Double | Boolean
  type NativeCallbackImplementation = js.ThisFunction1[/* this */ js.UndefOr[InvocationContext], /* repeated */ js.Any, js.Any]
  /* Rewritten from type alias, can be one of: 
    - typings.fridaDashGum.NativePointer
    - typings.fridaDashGum.UInt64
    - typings.fridaDashGum.Int64
    - scala.Double
    - scala.Boolean
    - js.Array[js.Any]
  */
  type NativeReturnValue = _NativeReturnValue | js.Array[js.Any] | Double | Boolean
  type NativeType = String | js.Array[js.Any]
  /**
    * Given as a string of the form: rwx, where rw- means “readable and writable”.
    */
  type PageProtection = String
  type RpcExports = StringDictionary[AnyFunction]
  type ScheduledCallback = js.Function1[/* repeated */ js.Any, Unit]
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
    * Signature: `void transform (GumStalkerIterator * iterator, GumStalkerWriter * output, gpointer user_data)`
    */
  type StalkerNativeTransformCallback = NativePointer
  type StalkerRetEventBare = js.Tuple3[NativePointer | String, NativePointer | String, Double]
  type StalkerRetEventFull = js.Tuple4[ret, NativePointer | String, NativePointer | String, Double]
  /**
    * Called synchronously when a call is made to the given address.
    */
  type StalkerScriptCallProbeCallback = js.Function1[/* args */ InvocationArguments, Unit]
  type StalkerScriptCallout = js.Function1[/* context */ CpuContext, Unit]
  type StalkerTransformCallback = StalkerX86TransformCallback | StalkerArm64TransformCallback | StalkerNativeTransformCallback
  type StalkerX86TransformCallback = js.Function1[/* iterator */ StalkerX86Iterator, Unit]
  type ThreadId = Double
  /**
    * Opaque ID returned by `setTimeout()`. Pass it to `clearTimeout()` to cancel a pending `setTimeout()`.
    */
  type TimeoutId = Double
  type WeakRefCallback = js.Function0[Unit]
  /**
    * Opaque ID returned by `WeakRef.bind()`. Pass it to `WeakRef.unbind()` to
    * stop monitoring the target value.
    */
  type WeakRefId = Double
  /* Rewritten from type alias, can be one of: 
    - typings.fridaDashGum.X86Register
    - scala.Double
    - typings.fridaDashGum.UInt64
    - typings.fridaDashGum.Int64
    - typings.fridaDashGum.NativePointerValue
  */
  type X86CallArgument = _X86CallArgument | Double
}
