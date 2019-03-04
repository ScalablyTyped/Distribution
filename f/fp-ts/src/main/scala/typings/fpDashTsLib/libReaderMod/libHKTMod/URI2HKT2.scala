package typings
package fpDashTsLib.libReaderMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URI2HKT2[L, A] extends js.Object {
  var Reader: fpDashTsLib.libReaderMod.Reader[L, A]
}

object URI2HKT2 {
  @scala.inline
  def apply[L, A](Reader: fpDashTsLib.libReaderMod.Reader[L, A]): URI2HKT2[L, A] = {
    val __obj = js.Dynamic.literal(Reader = Reader)
  
    __obj.asInstanceOf[URI2HKT2[L, A]]
  }
}

