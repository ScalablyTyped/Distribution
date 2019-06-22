package typings
package fpDashTsLib.es6HKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URItoKind3[U, L, A] extends URI2HKT3[U, L, A] {
  var IxIO: fpDashTsLib.es6IxIOMod.IxIO[U, L, A]
  var ReaderTaskEither: fpDashTsLib.es6ReaderTaskEitherMod.ReaderTaskEither[U, L, A]
}

object URItoKind3 {
  @scala.inline
  def apply[U, L, A](
    IxIO: fpDashTsLib.es6IxIOMod.IxIO[U, L, A],
    ReaderTaskEither: fpDashTsLib.es6ReaderTaskEitherMod.ReaderTaskEither[U, L, A]
  ): URItoKind3[U, L, A] = {
    val __obj = js.Dynamic.literal(IxIO = IxIO, ReaderTaskEither = ReaderTaskEither)
  
    __obj.asInstanceOf[URItoKind3[U, L, A]]
  }
}

