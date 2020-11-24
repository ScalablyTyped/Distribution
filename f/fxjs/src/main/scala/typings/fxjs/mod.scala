package typings.fxjs

import typings.std.Iterable
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fxjs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def add(a: js.Any, b: js.Any): js.Any = js.native
  
  def delay(time: Double, `val`: js.Any): js.Any = js.native
  
  def every(f: EverF, iter: Iterable[_]): Boolean = js.native
  def every(f: EverF, iter: Iterator[_, _, js.UndefOr[scala.Nothing]]): Boolean = js.native
  
  def filter(f: js.Function, iter: Iterable[_]): js.Any = js.native
  def filter(f: js.Function, iter: Iterator[_, _, js.UndefOr[scala.Nothing]]): js.Any = js.native
  
  def find(f: js.Function, iter: Iterable[_]): js.Any = js.native
  def find(f: js.Function, iter: Iterator[_, _, js.UndefOr[scala.Nothing]]): js.Any = js.native
  
  def flat(iter: Iterable[_]): js.Any = js.native
  def flat(iter: Iterable[_], dep: Double): js.Any = js.native
  
  def flatMap(f: js.Function, iter: Iterable[_]): js.Any = js.native
  def flatMap(f: js.Function, iter: Iterator[_, _, js.UndefOr[scala.Nothing]]): js.Any = js.native
  
  def go(_underscore: js.Any*): js.Array[_] = js.native
  
  def log(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param _ because its type any is not an array type */ _underscore: js.Any
  ): js.Any = js.native
  
  def map(f: js.Function, iter: Iterable[_]): js.Any = js.native
  def map(f: js.Function, iter: Iterator[_, _, js.UndefOr[scala.Nothing]]): js.Any = js.native
  
  def range(start: Double): js.Any = js.native
  def range(start: Double, stop: js.UndefOr[scala.Nothing], step: Double): js.Any = js.native
  def range(start: Double, stop: Double): js.Any = js.native
  def range(start: Double, stop: Double, step: Double): js.Any = js.native
  
  type EverF = js.Function1[/* _ */ js.Any, Boolean]
}
