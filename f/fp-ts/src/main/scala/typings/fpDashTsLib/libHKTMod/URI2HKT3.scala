package typings
package fpDashTsLib.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URI2HKT3[U, L, A] extends js.Object {
  var IxIO: fpDashTsLib.libIxIOMod.IxIO[U, L, A]
  var ReaderTaskEither: fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[U, L, A]
}

object URI2HKT3 {
  @scala.inline
  def apply[U, L, A](
    IxIO: fpDashTsLib.libIxIOMod.IxIO[U, L, A],
    ReaderTaskEither: fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[U, L, A]
  ): URI2HKT3[U, L, A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("IxIO")(IxIO)
    __obj.updateDynamic("ReaderTaskEither")(ReaderTaskEither)
    __obj.asInstanceOf[URI2HKT3[U, L, A]]
  }
}

