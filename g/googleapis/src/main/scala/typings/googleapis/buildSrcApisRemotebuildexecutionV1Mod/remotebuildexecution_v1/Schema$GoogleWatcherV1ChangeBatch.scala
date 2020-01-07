package typings.googleapis.buildSrcApisRemotebuildexecutionV1Mod.remotebuildexecution_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch of Change messages.
  */
@js.native
trait Schema$GoogleWatcherV1ChangeBatch extends js.Object {
  /**
    * A list of Change messages.
    */
  var changes: js.UndefOr[js.Array[Schema$GoogleWatcherV1Change]] = js.native
}

object Schema$GoogleWatcherV1ChangeBatch {
  @scala.inline
  def apply(changes: js.Array[Schema$GoogleWatcherV1Change] = null): Schema$GoogleWatcherV1ChangeBatch = {
    val __obj = js.Dynamic.literal()
    if (changes != null) __obj.updateDynamic("changes")(changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleWatcherV1ChangeBatch]
  }
}

