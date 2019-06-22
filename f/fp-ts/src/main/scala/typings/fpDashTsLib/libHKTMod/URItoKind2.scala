package typings
package fpDashTsLib.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URItoKind2[L, A] extends URI2HKT2[L, A] {
  var Const: fpDashTsLib.libConstMod.Const[L, A]
  var Either: fpDashTsLib.libEitherMod.Either[L, A]
  var Free: fpDashTsLib.libFreeMod.Free[L, A]
  var IOEither: fpDashTsLib.libIOEitherMod.IOEither[L, A]
  var Map: stdLib.Map[L, A]
  var Reader: fpDashTsLib.libReaderMod.Reader[L, A]
  var State: fpDashTsLib.libStateMod.State[L, A]
  var Store: fpDashTsLib.libStoreMod.Store[L, A]
  var TaskEither: fpDashTsLib.libTaskEitherMod.TaskEither[L, A]
  var These: fpDashTsLib.libTheseMod.These[L, A]
  var Traced: fpDashTsLib.libTracedMod.Traced[L, A]
  var Tuple: fpDashTsLib.libTupleMod.Tuple[L, A]
  var Validation: fpDashTsLib.libValidationMod.Validation[L, A]
  var Writer: fpDashTsLib.libWriterMod.Writer[L, A]
}

object URItoKind2 {
  @scala.inline
  def apply[L, A](
    Const: fpDashTsLib.libConstMod.Const[L, A],
    Either: fpDashTsLib.libEitherMod.Either[L, A],
    Free: fpDashTsLib.libFreeMod.Free[L, A],
    IOEither: fpDashTsLib.libIOEitherMod.IOEither[L, A],
    Map: stdLib.Map[L, A],
    Reader: fpDashTsLib.libReaderMod.Reader[L, A],
    State: fpDashTsLib.libStateMod.State[L, A],
    Store: fpDashTsLib.libStoreMod.Store[L, A],
    TaskEither: fpDashTsLib.libTaskEitherMod.TaskEither[L, A],
    These: fpDashTsLib.libTheseMod.These[L, A],
    Traced: fpDashTsLib.libTracedMod.Traced[L, A],
    Tuple: fpDashTsLib.libTupleMod.Tuple[L, A],
    Validation: fpDashTsLib.libValidationMod.Validation[L, A],
    Writer: fpDashTsLib.libWriterMod.Writer[L, A]
  ): URItoKind2[L, A] = {
    val __obj = js.Dynamic.literal(Const = Const, Either = Either, Free = Free.asInstanceOf[js.Any], IOEither = IOEither, Map = Map, Reader = Reader, State = State, Store = Store, TaskEither = TaskEither, These = These, Traced = Traced, Tuple = Tuple, Validation = Validation, Writer = Writer)
  
    __obj.asInstanceOf[URItoKind2[L, A]]
  }
}

