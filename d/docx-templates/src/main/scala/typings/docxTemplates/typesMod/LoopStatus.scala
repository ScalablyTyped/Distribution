package typings.docxTemplates.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoopStatus extends js.Object {
  var idx: Double
  var isIf: js.UndefOr[Boolean] = js.undefined
  var loopOver: js.Array[VarValue]
  var refNode: Node
  var refNodeLevel: Double
  var varName: String
}

object LoopStatus {
  @scala.inline
  def apply(
    idx: Double,
    loopOver: js.Array[VarValue],
    refNode: Node,
    refNodeLevel: Double,
    varName: String,
    isIf: js.UndefOr[Boolean] = js.undefined
  ): LoopStatus = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], loopOver = loopOver.asInstanceOf[js.Any], refNode = refNode.asInstanceOf[js.Any], refNodeLevel = refNodeLevel.asInstanceOf[js.Any], varName = varName.asInstanceOf[js.Any])
    if (!js.isUndefined(isIf)) __obj.updateDynamic("isIf")(isIf.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoopStatus]
  }
}

