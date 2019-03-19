package typings
package eloDashRankLib.eloDashRankMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elo-rank", JSImport.Namespace)
@js.native
class namespaced () extends EloRank {
  def this(kFactor: scala.Double) = this()
  /* CompleteClass */
  override def getExpected(a: scala.Double, b: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def getKFactor(): scala.Double = js.native
  /* CompleteClass */
  override def setKFactor(kFactor: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def updateRating(expected: scala.Double, actual: scala.Double, current: scala.Double): scala.Double = js.native
}

