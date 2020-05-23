package typings.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionMixin extends js.Object {
  val reactions: js.Array[Reaction]
}

object ReactionMixin {
  @scala.inline
  def apply(reactions: js.Array[Reaction]): ReactionMixin = {
    val __obj = js.Dynamic.literal(reactions = reactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionMixin]
  }
}

