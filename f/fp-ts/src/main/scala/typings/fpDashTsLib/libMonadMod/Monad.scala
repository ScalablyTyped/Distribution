package typings
package fpDashTsLib.libMonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Monad[F]
  extends fpDashTsLib.libApplicativeMod.Applicative[F]
     with fpDashTsLib.libChainMod.Chain[F]

