package typings.fxjs

import typings.std.Iterable
import typings.std.Iterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fxjs", "add")
  @js.native
  def add(a: js.Any, b: js.Any): js.Any = js.native
  
  @JSImport("fxjs", "delay")
  @js.native
  def delay(time: Double, `val`: js.Any): js.Any = js.native
  
  @JSImport("fxjs", "every")
  @js.native
  def every(f: EverF, iter: Iterable[_]): Boolean = js.native
  @JSImport("fxjs", "every")
  @js.native
  def every(f: EverF, iter: Iterator[_, _, js.UndefOr[scala.Nothing]]): Boolean = js.native
  
  @JSImport("fxjs", "filter")
  @js.native
  def filter(f: js.Function, iter: Iterable[_]): js.Any = js.native
  @JSImport("fxjs", "filter")
  @js.native
  def filter(f: js.Function, iter: Iterator[_, _, js.UndefOr[scala.Nothing]]): js.Any = js.native
  
  @JSImport("fxjs", "find")
  @js.native
  def find(f: js.Function, iter: Iterable[_]): js.Any = js.native
  @JSImport("fxjs", "find")
  @js.native
  def find(f: js.Function, iter: Iterator[_, _, js.UndefOr[scala.Nothing]]): js.Any = js.native
  
  @JSImport("fxjs", "flat")
  @js.native
  def flat(iter: Iterable[_]): js.Any = js.native
  @JSImport("fxjs", "flat")
  @js.native
  def flat(iter: Iterable[_], dep: Double): js.Any = js.native
  
  @JSImport("fxjs", "flatMap")
  @js.native
  def flatMap(f: js.Function, iter: Iterable[_]): js.Any = js.native
  @JSImport("fxjs", "flatMap")
  @js.native
  def flatMap(f: js.Function, iter: Iterator[_, _, js.UndefOr[scala.Nothing]]): js.Any = js.native
  
  @JSImport("fxjs", "go")
  @js.native
  def go(_underscore: js.Any*): js.Array[_] = js.native
  
  @JSImport("fxjs", "log")
  @js.native
  def log(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param _ because its type any is not an array type */ _underscore: js.Any
  ): js.Any = js.native
  
  @JSImport("fxjs", "map")
  @js.native
  def map(f: js.Function, iter: Iterable[_]): js.Any = js.native
  @JSImport("fxjs", "map")
  @js.native
  def map(f: js.Function, iter: Iterator[_, _, js.UndefOr[scala.Nothing]]): js.Any = js.native
  
  @JSImport("fxjs", "range")
  @js.native
  def range(start: Double): js.Any = js.native
  @JSImport("fxjs", "range")
  @js.native
  def range(start: Double, stop: js.UndefOr[scala.Nothing], step: Double): js.Any = js.native
  @JSImport("fxjs", "range")
  @js.native
  def range(start: Double, stop: Double): js.Any = js.native
  @JSImport("fxjs", "range")
  @js.native
  def range(start: Double, stop: Double, step: Double): js.Any = js.native
  
  type EverF = js.Function1[/* _ */ js.Any, Boolean]
}
