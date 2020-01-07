package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic metadata about a counter.
  */
@js.native
trait Schema$NameAndKind extends js.Object {
  /**
    * Counter aggregation kind.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of the counter.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$NameAndKind {
  @scala.inline
  def apply(kind: String = null, name: String = null): Schema$NameAndKind = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NameAndKind]
  }
}

