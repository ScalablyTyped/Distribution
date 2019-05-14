package typings
package fpDashTsLib.es6HKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URI2HKT2[L, A] extends js.Object {
  var Const: fpDashTsLib.es6ConstMod.Const[L, A]
  var Either: fpDashTsLib.es6EitherMod.Either[L, A]
  var Free: fpDashTsLib.es6FreeMod.Free[L, A]
  var IOEither: fpDashTsLib.es6IOEitherMod.IOEither[L, A]
  var Map: stdLib.Map[L, A]
  var Reader: fpDashTsLib.es6ReaderMod.Reader[L, A]
  var State: fpDashTsLib.es6StateMod.State[L, A]
  var Store: fpDashTsLib.es6StoreMod.Store[L, A]
  var TaskEither: fpDashTsLib.es6TaskEitherMod.TaskEither[L, A]
  var These: fpDashTsLib.es6TheseMod.These[L, A]
  var Traced: fpDashTsLib.es6TracedMod.Traced[L, A]
  var Tuple: fpDashTsLib.es6TupleMod.Tuple[L, A]
  var Validation: fpDashTsLib.es6ValidationMod.Validation[L, A]
  var Writer: fpDashTsLib.es6WriterMod.Writer[L, A]
}

object URI2HKT2 {
  @scala.inline
  def apply[L, A](
    Const: fpDashTsLib.es6ConstMod.Const[L, A],
    Either: fpDashTsLib.es6EitherMod.Either[L, A],
    Free: fpDashTsLib.es6FreeMod.Free[L, A],
    IOEither: fpDashTsLib.es6IOEitherMod.IOEither[L, A],
    Map: stdLib.Map[L, A],
    Reader: fpDashTsLib.es6ReaderMod.Reader[L, A],
    State: fpDashTsLib.es6StateMod.State[L, A],
    Store: fpDashTsLib.es6StoreMod.Store[L, A],
    TaskEither: fpDashTsLib.es6TaskEitherMod.TaskEither[L, A],
    These: fpDashTsLib.es6TheseMod.These[L, A],
    Traced: fpDashTsLib.es6TracedMod.Traced[L, A],
    Tuple: fpDashTsLib.es6TupleMod.Tuple[L, A],
    Validation: fpDashTsLib.es6ValidationMod.Validation[L, A],
    Writer: fpDashTsLib.es6WriterMod.Writer[L, A]
  ): URI2HKT2[L, A] = {
    val __obj = js.Dynamic.literal(Const = Const, Either = Either, Free = Free.asInstanceOf[js.Any], IOEither = IOEither, Map = Map, Reader = Reader, State = State, Store = Store, TaskEither = TaskEither, These = These, Traced = Traced, Tuple = Tuple, Validation = Validation, Writer = Writer)
  
    __obj.asInstanceOf[URI2HKT2[L, A]]
  }
}

