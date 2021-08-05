package typings.fxjs

import typings.std.Iterable
import typings.std.Iterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fxjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(a: js.Any, b: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def delay(time: Double, `val`: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(time.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def every(f: EverF, iter: Iterable[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(f.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def every(f: EverF, iter: Iterator[js.Any, js.Any, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(f.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def filter(f: js.Function, iter: Iterable[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(f.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def filter(f: js.Function, iter: Iterator[js.Any, js.Any, Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(f.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def find(f: js.Function, iter: Iterable[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(f.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def find(f: js.Function, iter: Iterator[js.Any, js.Any, Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(f.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def flat(iter: Iterable[js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")(iter.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def flat(iter: Iterable[js.Any], dep: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("flat")(iter.asInstanceOf[js.Any], dep.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def flatMap(f: js.Function, iter: Iterable[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(f.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def flatMap(f: js.Function, iter: Iterator[js.Any, js.Any, Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(f.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def go(_underscore: js.Any*): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("go")(_underscore.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def log(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param _ because its type any is not an array type */ _underscore: js.Any
  ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(_underscore.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def map(f: js.Function, iter: Iterable[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def map(f: js.Function, iter: Iterator[js.Any, js.Any, Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def range(start: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def range(start: Double, stop: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def range(start: Double, stop: Double, step: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def range(start: Double, stop: Unit, step: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  type EverF = js.Function1[/* _ */ js.Any, Boolean]
}
