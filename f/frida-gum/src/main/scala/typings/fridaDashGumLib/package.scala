package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fridaDashGumLib {
  type AnyFunction = js.Function1[/* repeated */ js.Any, js.Any]
  /* Rewritten from type alias, can be one of: 
    - Arm64Register
    - scala.Double
    - UInt64
    - Int64
    - NativePointerValue
  */
  type Arm64CallArgument = _Arm64CallArgument | scala.Double
  /* Rewritten from type alias, can be one of: 
    - ArmRegister
    - scala.Double
    - UInt64
    - Int64
    - NativePointerValue
  */
  type ArmCallArgument = _ArmCallArgument | scala.Double
  type ArmSystemRegister = fridaDashGumLib.fridaDashGumLibStrings.`apsr-nzcvq`
  type EnumerateAction = fridaDashGumLib.fridaDashGumLibStrings.stop
  type ExceptionHandlerCallback = js.Function1[/* exception */ ExceptionDetails, scala.Boolean | scala.Unit]
  /**
    * Opaque ID returned by `setImmediate()`. Pass it to `clearImmediate()` to cancel a pending `setImmediate()`.
    */
  type ImmediateId = scala.Double
  /**
    * Callback to invoke when an instruction is about to be executed.
    */
  type InstructionProbeCallback = js.ThisFunction1[/* this */ InvocationContext, /* args */ InvocationArguments, scala.Unit]
  /**
    * Opaque ID returned by `setInterval()`. Pass it to `clearInterval()` to cancel a pending `setInterval()`.
    */
  type IntervalId = scala.Double
  /**
    * Virtual array providing access to the argument list. Agnostic to the number of arguments and their types.
    */
  type InvocationArguments = js.Array[NativePointer]
  type MemoryPatchApplyCallback = js.Function1[/* code */ NativePointer, scala.Unit]
  type MessageCallback = js.Function2[/* message */ js.Any, /* data */ stdLib.ArrayBuffer | scala.Null, scala.Unit]
  /* Rewritten from type alias, can be one of: 
    - MipsRegister
    - scala.Double
    - UInt64
    - Int64
    - NativePointerValue
  */
  type MipsCallArgument = _MipsCallArgument | scala.Double
  type ModuleMapFilter = js.Function1[/* m */ Module, scala.Boolean]
  /* Rewritten from type alias, can be one of: 
    - NativePointerValue
    - UInt64
    - Int64
    - scala.Double
    - scala.Boolean
    - js.Array[js.Any]
  */
  type NativeArgumentValue = _NativeArgumentValue | js.Array[js.Any] | scala.Double | scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - NativePointer
    - UInt64
    - Int64
    - scala.Double
    - scala.Boolean
    - js.Array[js.Any]
  */
  type NativeReturnValue = _NativeReturnValue | js.Array[js.Any] | scala.Double | scala.Boolean
  type NativeType = java.lang.String | js.Array[js.Any]
  /**
    * Given as a string of the form: rwx, where rw- means “readable and writable”.
    */
  type PageProtection = java.lang.String
  type RpcExports = org.scalablytyped.runtime.StringDictionary[AnyFunction]
  type ScheduledCallback = js.Function1[/* repeated */ js.Any, scala.Unit]
  type StalkerArm64TransformCallback = js.Function1[/* iterator */ StalkerArm64Iterator, scala.Unit]
  type StalkerBlockEventBare = js.Tuple2[NativePointer | java.lang.String, NativePointer | java.lang.String]
  type StalkerBlockEventFull = js.Tuple3[
    fridaDashGumLib.fridaDashGumLibStrings.block, 
    NativePointer | java.lang.String, 
    NativePointer | java.lang.String
  ]
  type StalkerCallEventBare = js.Tuple3[NativePointer | java.lang.String, NativePointer | java.lang.String, scala.Double]
  type StalkerCallEventFull = js.Tuple4[
    fridaDashGumLib.fridaDashGumLibStrings.call, 
    NativePointer | java.lang.String, 
    NativePointer | java.lang.String, 
    scala.Double
  ]
  type StalkerCallProbeCallback = js.Function1[/* args */ InvocationArguments, scala.Unit]
  type StalkerCallProbeId = scala.Double
  type StalkerCallSummary = org.scalablytyped.runtime.StringDictionary[scala.Double]
  type StalkerCallout = js.Function1[/* context */ CpuContext, scala.Unit]
  type StalkerCompileEventBare = js.Tuple2[NativePointer | java.lang.String, NativePointer | java.lang.String]
  type StalkerCompileEventFull = js.Tuple3[
    fridaDashGumLib.fridaDashGumLibStrings.compile, 
    NativePointer | java.lang.String, 
    NativePointer | java.lang.String
  ]
  type StalkerEventBare = StalkerCallEventBare | StalkerRetEventBare | StalkerExecEventBare | StalkerBlockEventBare | StalkerCompileEventBare
  type StalkerEventFull = StalkerCallEventFull | StalkerRetEventFull | StalkerExecEventFull | StalkerBlockEventFull | StalkerCompileEventFull
  type StalkerExecEventBare = js.Array[NativePointer | java.lang.String]
  type StalkerExecEventFull = js.Tuple2[fridaDashGumLib.fridaDashGumLibStrings.exec, NativePointer | java.lang.String]
  type StalkerRetEventBare = js.Tuple3[NativePointer | java.lang.String, NativePointer | java.lang.String, scala.Double]
  type StalkerRetEventFull = js.Tuple4[
    fridaDashGumLib.fridaDashGumLibStrings.ret, 
    NativePointer | java.lang.String, 
    NativePointer | java.lang.String, 
    scala.Double
  ]
  type StalkerTransformCallback = StalkerX86TransformCallback | StalkerArm64TransformCallback
  type StalkerX86TransformCallback = js.Function1[/* iterator */ StalkerX86Iterator, scala.Unit]
  type ThreadId = scala.Double
  /**
    * Opaque ID returned by `setTimeout()`. Pass it to `clearTimeout()` to cancel a pending `setTimeout()`.
    */
  type TimeoutId = scala.Double
  type WeakRefCallback = js.Function0[scala.Unit]
  /**
    * Opaque ID returned by `WeakRef.bind()`. Pass it to `WeakRef.unbind()` to
    * stop monitoring the target value.
    */
  type WeakRefId = scala.Double
  /* Rewritten from type alias, can be one of: 
    - X86Register
    - scala.Double
    - UInt64
    - Int64
    - NativePointerValue
  */
  type X86CallArgument = _X86CallArgument | scala.Double
}
