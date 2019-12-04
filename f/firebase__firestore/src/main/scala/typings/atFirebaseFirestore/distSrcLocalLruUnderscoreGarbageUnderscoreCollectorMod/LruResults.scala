package typings.atFirebaseFirestore.distSrcLocalLruUnderscoreGarbageUnderscoreCollectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LruResults extends js.Object {
  val didRun: Boolean
  val documentsRemoved: Double
  val sequenceNumbersCollected: Double
  val targetsRemoved: Double
}

object LruResults {
  @scala.inline
  def apply(
    didRun: Boolean,
    documentsRemoved: Double,
    sequenceNumbersCollected: Double,
    targetsRemoved: Double
  ): LruResults = {
    val __obj = js.Dynamic.literal(didRun = didRun.asInstanceOf[js.Any], documentsRemoved = documentsRemoved.asInstanceOf[js.Any], sequenceNumbersCollected = sequenceNumbersCollected.asInstanceOf[js.Any], targetsRemoved = targetsRemoved.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LruResults]
  }
}

