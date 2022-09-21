package typings.fxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fxjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(a: Any, b: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def delay(time: Double, `val`: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(time.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def every(f: EverF, iter: js.Iterable[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(f.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def every(f: EverF, iter: js.Iterator[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(f.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def filter(f: js.Function, iter: js.Iterable[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(f.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def filter(f: js.Function, iter: js.Iterator[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(f.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def find(f: js.Function, iter: js.Iterable[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(f.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def find(f: js.Function, iter: js.Iterator[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(f.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def flat(iter: js.Iterable[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")(iter.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def flat(iter: js.Iterable[Any], dep: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("flat")(iter.asInstanceOf[js.Any], dep.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def flatMap(f: js.Function, iter: js.Iterable[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(f.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def flatMap(f: js.Function, iter: js.Iterator[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(f.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def go(_underscore: Any*): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("go")(_underscore.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[Any]]
  
  inline def log(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param _ because its type any is not an array type */ _underscore: Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(_underscore.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def map(f: js.Function, iter: js.Iterable[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def map(f: js.Function, iter: js.Iterator[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def range(start: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def range(start: Double, stop: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def range(start: Double, stop: Double, step: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def range(start: Double, stop: Unit, step: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  type EverF = js.Function1[/* _ */ Any, Boolean]
}
