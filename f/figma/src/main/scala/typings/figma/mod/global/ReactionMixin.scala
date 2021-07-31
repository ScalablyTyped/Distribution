package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactionMixin extends StObject {
  
  val reactions: js.Array[Reaction]
}
object ReactionMixin {
  
  @scala.inline
  def apply(reactions: js.Array[Reaction]): ReactionMixin = {
    val __obj = js.Dynamic.literal(reactions = reactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionMixin]
  }
  
  @scala.inline
  implicit class ReactionMixinMutableBuilder[Self <: ReactionMixin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReactions(value: js.Array[Reaction]): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactionsVarargs(value: Reaction*): Self = StObject.set(x, "reactions", js.Array(value :_*))
  }
}
