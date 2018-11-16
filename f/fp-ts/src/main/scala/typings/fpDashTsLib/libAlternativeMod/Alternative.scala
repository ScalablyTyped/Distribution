package typings
package fpDashTsLib.libAlternativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Alternative[F]
  extends fpDashTsLib.libApplicativeMod.Applicative[F]
     with fpDashTsLib.libPlusMod.Plus[F]

