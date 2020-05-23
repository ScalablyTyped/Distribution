package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fridaGum {
  type AnyFunction = js.Function1[/* repeated */ js.Any, js.Any]
  /* Rewritten from type alias, can be one of: 
    - typings.fridaGum.Arm64Register
    - scala.Double
    - typings.fridaGum.UInt64
    - typings.fridaGum.Int64
    - typings.fridaGum.NativePointerValue
  */
  type Arm64CallArgument = typings.fridaGum._Arm64CallArgument | scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.fridaGum.ArmRegister
    - scala.Double
    - typings.fridaGum.UInt64
    - typings.fridaGum.Int64
    - typings.fridaGum.NativePointerValue
  */
  type ArmCallArgument = typings.fridaGum._ArmCallArgument | scala.Double
  type ArmSystemRegister = typings.fridaGum.fridaGumStrings.`apsr-nzcvq`
  type CSymbols = org.scalablytyped.runtime.StringDictionary[typings.fridaGum.NativePointerValue]
  type EnumerateAction = typings.fridaGum.fridaGumStrings.stop
  type ExceptionHandlerCallback = js.Function1[/* exception */ typings.fridaGum.ExceptionDetails, scala.Boolean | scala.Unit]
  /**
    * Opaque ID returned by `setImmediate()`. Pass it to `clearImmediate()` to cancel a pending `setImmediate()`.
    */
  type ImmediateId = scala.Double
  /**
    * Callback to invoke when an instruction is about to be executed.
    */
  type InstructionProbeCallback = js.ThisFunction1[
    /* this */ typings.fridaGum.InvocationContext, 
    /* args */ typings.fridaGum.InvocationArguments, 
    scala.Unit
  ]
  /**
    * Opaque ID returned by `setInterval()`. Pass it to `clearInterval()` to cancel a pending `setInterval()`.
    */
  type IntervalId = scala.Double
  /**
    * Virtual array providing access to the argument list. Agnostic to the number of arguments and their types.
    */
  type InvocationArguments = js.Array[typings.fridaGum.NativePointer]
  type MemoryPatchApplyCallback = js.Function1[/* code */ typings.fridaGum.NativePointer, scala.Unit]
  type MessageCallback = js.Function2[
    /* message */ js.Any, 
    /* data */ typings.fridaGum.ArrayBuffer | scala.Null, 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.fridaGum.MipsRegister
    - scala.Double
    - typings.fridaGum.UInt64
    - typings.fridaGum.Int64
    - typings.fridaGum.NativePointerValue
  */
  type MipsCallArgument = typings.fridaGum._MipsCallArgument | scala.Double
  type ModuleMapFilter = js.Function1[/* m */ typings.fridaGum.Module, scala.Boolean]
  /* Rewritten from type alias, can be one of: 
    - typings.fridaGum.NativePointerValue
    - typings.fridaGum.UInt64
    - typings.fridaGum.Int64
    - scala.Double
    - scala.Boolean
    - js.Array[js.Any]
  */
  type NativeArgumentValue = typings.fridaGum._NativeArgumentValue | js.Array[js.Any] | scala.Double | scala.Boolean
  type NativeCallback = typings.fridaGum.NativePointer
  type NativeCallbackImplementation = js.ThisFunction1[
    /* this */ js.UndefOr[typings.fridaGum.InvocationContext], 
    /* repeated */ js.Any, 
    js.Any
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.fridaGum.NativePointer
    - typings.fridaGum.UInt64
    - typings.fridaGum.Int64
    - scala.Double
    - scala.Boolean
    - js.Array[js.Any]
  */
  type NativeReturnValue = typings.fridaGum._NativeReturnValue | js.Array[js.Any] | scala.Double | scala.Boolean
  type NativeType = java.lang.String | js.Array[js.Any]
  /**
    * Given as a string of the form: rwx, where rw- means “readable and writable”.
    */
  type PageProtection = java.lang.String
  type RpcExports = org.scalablytyped.runtime.StringDictionary[typings.fridaGum.AnyFunction]
  type ScheduledCallback = js.Function1[/* repeated */ js.Any, scala.Unit]
  type StalkerArm32TransformCallback = js.Function1[
    /* iterator */ typings.fridaGum.StalkerArmIterator | typings.fridaGum.StalkerThumbIterator, 
    scala.Unit
  ]
  type StalkerArm64TransformCallback = js.Function1[/* iterator */ typings.fridaGum.StalkerArm64Iterator, scala.Unit]
  type StalkerBlockEventBare = js.Tuple2[
    typings.fridaGum.NativePointer | java.lang.String, 
    typings.fridaGum.NativePointer | java.lang.String
  ]
  type StalkerBlockEventFull = js.Tuple3[
    typings.fridaGum.fridaGumStrings.block, 
    typings.fridaGum.NativePointer | java.lang.String, 
    typings.fridaGum.NativePointer | java.lang.String
  ]
  type StalkerCallEventBare = js.Tuple3[
    typings.fridaGum.NativePointer | java.lang.String, 
    typings.fridaGum.NativePointer | java.lang.String, 
    scala.Double
  ]
  type StalkerCallEventFull = js.Tuple4[
    typings.fridaGum.fridaGumStrings.call, 
    typings.fridaGum.NativePointer | java.lang.String, 
    typings.fridaGum.NativePointer | java.lang.String, 
    scala.Double
  ]
  type StalkerCallProbeCallback = typings.fridaGum.StalkerScriptCallProbeCallback | typings.fridaGum.StalkerNativeCallProbeCallback
  type StalkerCallProbeId = scala.Double
  type StalkerCallSummary = org.scalablytyped.runtime.StringDictionary[scala.Double]
  type StalkerCallout = typings.fridaGum.StalkerScriptCallout | typings.fridaGum.StalkerNativeCallout
  type StalkerCompileEventBare = js.Tuple2[
    typings.fridaGum.NativePointer | java.lang.String, 
    typings.fridaGum.NativePointer | java.lang.String
  ]
  type StalkerCompileEventFull = js.Tuple3[
    typings.fridaGum.fridaGumStrings.compile, 
    typings.fridaGum.NativePointer | java.lang.String, 
    typings.fridaGum.NativePointer | java.lang.String
  ]
  type StalkerEventBare = typings.fridaGum.StalkerCallEventBare | typings.fridaGum.StalkerRetEventBare | typings.fridaGum.StalkerExecEventBare | typings.fridaGum.StalkerBlockEventBare | typings.fridaGum.StalkerCompileEventBare
  type StalkerEventFull = typings.fridaGum.StalkerCallEventFull | typings.fridaGum.StalkerRetEventFull | typings.fridaGum.StalkerExecEventFull | typings.fridaGum.StalkerBlockEventFull | typings.fridaGum.StalkerCompileEventFull
  type StalkerExecEventBare = js.Array[typings.fridaGum.NativePointer | java.lang.String]
  type StalkerExecEventFull = js.Tuple2[
    typings.fridaGum.fridaGumStrings.exec, 
    typings.fridaGum.NativePointer | java.lang.String
  ]
  /**
    * Called synchronously when a call is made to the given address.
    *
    * Signature: `void onCall (GumCallSite * site, gpointer user_data)`
    */
  type StalkerNativeCallProbeCallback = typings.fridaGum.NativePointer
  /**
    * Signature: `void onAesEnc (GumCpuContext * cpu_context, gpointer user_data)`
    */
  type StalkerNativeCallout = typings.fridaGum.NativePointer
  /**
    * Signature: `void transform (GumStalkerIterator * iterator, GumStalkerOutput * output, gpointer user_data)`
    */
  type StalkerNativeTransformCallback = typings.fridaGum.NativePointer
  type StalkerRetEventBare = js.Tuple3[
    typings.fridaGum.NativePointer | java.lang.String, 
    typings.fridaGum.NativePointer | java.lang.String, 
    scala.Double
  ]
  type StalkerRetEventFull = js.Tuple4[
    typings.fridaGum.fridaGumStrings.ret, 
    typings.fridaGum.NativePointer | java.lang.String, 
    typings.fridaGum.NativePointer | java.lang.String, 
    scala.Double
  ]
  /**
    * Called synchronously when a call is made to the given address.
    */
  type StalkerScriptCallProbeCallback = js.Function1[/* args */ typings.fridaGum.InvocationArguments, scala.Unit]
  type StalkerScriptCallout = js.Function1[/* context */ typings.fridaGum.CpuContext, scala.Unit]
  type StalkerTransformCallback = typings.fridaGum.StalkerX86TransformCallback | typings.fridaGum.StalkerArm32TransformCallback | typings.fridaGum.StalkerArm64TransformCallback | typings.fridaGum.StalkerNativeTransformCallback
  type StalkerX86TransformCallback = js.Function1[/* iterator */ typings.fridaGum.StalkerX86Iterator, scala.Unit]
  type ThreadId = scala.Double
  /**
    * Opaque ID returned by `setTimeout()`. Pass it to `clearTimeout()` to cancel a pending `setTimeout()`.
    */
  type TimeoutId = scala.Double
  /**
    * Input stream backed by a file descriptor.
    *
    * Only available on UNIX-like OSes.
    */
  type UnixInputStream = typings.fridaGum.InputStream
  /**
    * Output stream backed by a file descriptor.
    *
    * Only available on UNIX-like OSes.
    */
  type UnixOutputStream = typings.fridaGum.OutputStream
  type WeakRefCallback = js.Function0[scala.Unit]
  /**
    * Opaque ID returned by `WeakRef.bind()`. Pass it to `WeakRef.unbind()` to
    * stop monitoring the target value.
    */
  type WeakRefId = scala.Double
  /**
    * Input stream backed by a Windows file handle.
    *
    * Only available on Windows.
    */
  type Win32InputStream = typings.fridaGum.InputStream
  /**
    * Output stream backed by a Windows file handle.
    *
    * Only available on Windows.
    */
  type Win32OutputStream = typings.fridaGum.OutputStream
  /* Rewritten from type alias, can be one of: 
    - typings.fridaGum.X86Register
    - scala.Double
    - typings.fridaGum.UInt64
    - typings.fridaGum.Int64
    - typings.fridaGum.NativePointerValue
  */
  type X86CallArgument = typings.fridaGum._X86CallArgument | scala.Double
}
