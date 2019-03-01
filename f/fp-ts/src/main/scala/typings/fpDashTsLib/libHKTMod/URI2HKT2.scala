package typings
package fpDashTsLib.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URI2HKT2[L, A] extends js.Object {
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
  var Tuple: fpDashTsLib.libTupleMod.Tuple[L, A]
  var Validation: fpDashTsLib.libValidationMod.Validation[L, A]
  var Writer: fpDashTsLib.libWriterMod.Writer[L, A]
}

object URI2HKT2 {
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
    Tuple: fpDashTsLib.libTupleMod.Tuple[L, A],
    Validation: fpDashTsLib.libValidationMod.Validation[L, A],
    Writer: fpDashTsLib.libWriterMod.Writer[L, A]
  ): URI2HKT2[L, A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Const")(Const)
    __obj.updateDynamic("Either")(Either)
    __obj.updateDynamic("Free")(Free.asInstanceOf[js.Any])
    __obj.updateDynamic("IOEither")(IOEither)
    __obj.updateDynamic("Map")(Map)
    __obj.updateDynamic("Reader")(Reader)
    __obj.updateDynamic("State")(State)
    __obj.updateDynamic("Store")(Store)
    __obj.updateDynamic("TaskEither")(TaskEither)
    __obj.updateDynamic("These")(These)
    __obj.updateDynamic("Tuple")(Tuple)
    __obj.updateDynamic("Validation")(Validation)
    __obj.updateDynamic("Writer")(Writer)
    __obj.asInstanceOf[URI2HKT2[L, A]]
  }
}

