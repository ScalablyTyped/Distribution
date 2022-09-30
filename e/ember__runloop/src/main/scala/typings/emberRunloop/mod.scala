package typings.emberRunloop

import typings.emberRunloop.privateTypesMod.EmberRunQueues
import typings.emberRunloop.typesMod.EmberRunTimer
import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ember/runloop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def begin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("begin")().asInstanceOf[Unit]
  
  inline def bind[T, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethod<T> */ Any */](target: T, method: M, args: Any*): js.Function1[
    /* repeated */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethodReturn<T, M> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")((scala.List(target.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Function1[
    /* repeated */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethodReturn<T, M> */ Any
  ]]
  
  inline def cancel(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")().asInstanceOf[Boolean]
  inline def cancel(timer: EmberRunTimer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(timer.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def debounce(
    method: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFn */ Any,
    wait: Double
  ): EmberRunTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(method.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[EmberRunTimer]
  inline def debounce(
    method: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFn */ Any,
    wait: Double,
    immediate: Boolean
  ): EmberRunTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(method.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[EmberRunTimer]
  inline def debounce[Target, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethod<Target> */ Any */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [target: Target, method: M, args: ...EmberMethodParams<Target, M>, wait: number, immediate: boolean | undefined] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethodParams<Target, M> * / any */ /* args */ js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethodParams<Target, M> */ Any
    ]
  ): EmberRunTimer = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(args.asInstanceOf[js.Any]).asInstanceOf[EmberRunTimer]
  
  inline def end(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("end")().asInstanceOf[Unit]
  
  inline def join[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFn */ Any */](
    method: M,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<M> is not an array type */ args: Parameters[M]
  ): js.UndefOr[ReturnType[M]] = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(method.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ReturnType[M]]]
  inline def join[T, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethod<T> */ Any */](
    target: T,
    method: M,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EmberMethodParams<T, M> is not an array type */ args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethodParams<T, M> */ Any
  ): js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethodReturn<T, M> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(target.asInstanceOf[js.Any], method.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethodReturn<T, M> */ Any
  ]]
  
  inline def later(
    method: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFn */ Any,
    wait: Double
  ): EmberRunTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("later")(method.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[EmberRunTimer]
  inline def later[T, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethod<T> */ Any */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [target: T, method: M, args: ...EmberMethodParams<T, M>, wait: number] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethodParams<T, M> * / any */ /* args */ js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethodParams<T, M> */ Any
    ]
  ): EmberRunTimer = ^.asInstanceOf[js.Dynamic].applyDynamic("later")(args.asInstanceOf[js.Any]).asInstanceOf[EmberRunTimer]
  
  inline def next[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFn */ Any */](
    method: M,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<M> is not an array type */ args: Parameters[M]
  ): EmberRunTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("next")(method.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[EmberRunTimer]
  inline def next[T, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethod<T> */ Any */](
    target: T,
    method: M,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EmberMethodParams<T, M> is not an array type */ args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethodParams<T, M> */ Any
  ): EmberRunTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("next")(target.asInstanceOf[js.Any], method.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[EmberRunTimer]
  
  inline def once[T, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethod<T> */ Any */](
    target: T,
    method: M,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EmberMethodParams<T, M> is not an array type */ args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethodParams<T, M> */ Any
  ): EmberRunTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(target.asInstanceOf[js.Any], method.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[EmberRunTimer]
  
  inline def run[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFn */ Any */](method: M): ReturnType[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(method.asInstanceOf[js.Any]).asInstanceOf[ReturnType[M]]
  inline def run[T, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethod<T> */ Any */](
    target: T,
    method: M,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EmberMethodParams<T, M> is not an array type */ args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethodParams<T, M> */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(target.asInstanceOf[js.Any], method.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def schedule[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFn */ Any */](
    queue: EmberRunQueues,
    method: M,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<M> is not an array type */ args: Parameters[M]
  ): EmberRunTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(queue.asInstanceOf[js.Any], method.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[EmberRunTimer]
  inline def schedule[T, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethod<T> */ Any */](
    queue: EmberRunQueues,
    target: T,
    method: M,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EmberMethodParams<T, M> is not an array type */ args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethodParams<T, M> */ Any
  ): EmberRunTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(queue.asInstanceOf[js.Any], target.asInstanceOf[js.Any], method.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[EmberRunTimer]
  
  inline def scheduleOnce[T, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethod<T> */ Any */](
    queue: EmberRunQueues,
    target: T,
    method: M,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EmberMethodParams<T, M> is not an array type */ args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethodParams<T, M> */ Any
  ): EmberRunTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleOnce")(queue.asInstanceOf[js.Any], target.asInstanceOf[js.Any], method.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[EmberRunTimer]
  
  inline def throttle(
    method: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFn */ Any,
    spacing: Double
  ): EmberRunTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(method.asInstanceOf[js.Any], spacing.asInstanceOf[js.Any])).asInstanceOf[EmberRunTimer]
  inline def throttle(
    method: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFn */ Any,
    spacing: Double,
    immediate: Boolean
  ): EmberRunTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(method.asInstanceOf[js.Any], spacing.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[EmberRunTimer]
  inline def throttle[T, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethod<T> */ Any */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [target: T, method: M, methodArgs: ...EmberMethodParams<T, M>, spacing: number, immediate: boolean | undefined] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethodParams<T, M> * / any */ /* methodArgs */ js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethodParams<T, M> */ Any
    ]
  ): EmberRunTimer = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(args.asInstanceOf[js.Any]).asInstanceOf[EmberRunTimer]
}
