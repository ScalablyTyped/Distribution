package typings
package fpDashTsLib.libMonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Monad3C[M /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L]
  extends fpDashTsLib.libApplicativeMod.Applicative3C[M, U, L]
     with fpDashTsLib.libChainMod.Chain3C[M, U, L]

