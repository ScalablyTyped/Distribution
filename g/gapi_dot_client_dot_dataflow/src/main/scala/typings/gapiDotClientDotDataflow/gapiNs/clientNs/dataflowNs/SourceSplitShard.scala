package typings.gapiDotClientDotDataflow.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceSplitShard extends js.Object {
  /** DEPRECATED */
  var derivationMode: js.UndefOr[String] = js.undefined
  /** DEPRECATED */
  var source: js.UndefOr[Source] = js.undefined
}

object SourceSplitShard {
  @scala.inline
  def apply(derivationMode: String = null, source: Source = null): SourceSplitShard = {
    val __obj = js.Dynamic.literal()
    if (derivationMode != null) __obj.updateDynamic("derivationMode")(derivationMode)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[SourceSplitShard]
  }
}

