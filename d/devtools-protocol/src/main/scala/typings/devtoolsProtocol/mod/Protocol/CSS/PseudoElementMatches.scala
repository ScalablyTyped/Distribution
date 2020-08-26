package typings.devtoolsProtocol.mod.Protocol.CSS

import typings.devtoolsProtocol.mod.Protocol.DOM.PseudoType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PseudoElementMatches extends js.Object {
  /**
    * Matches of CSS rules applicable to the pseudo style.
    */
  var matches: js.Array[RuleMatch] = js.native
  /**
    * Pseudo element type.
    */
  var pseudoType: PseudoType = js.native
}

object PseudoElementMatches {
  @scala.inline
  def apply(matches: js.Array[RuleMatch], pseudoType: PseudoType): PseudoElementMatches = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any], pseudoType = pseudoType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoElementMatches]
  }
  @scala.inline
  implicit class PseudoElementMatchesOps[Self <: PseudoElementMatches] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMatchesVarargs(value: RuleMatch*): Self = this.set("matches", js.Array(value :_*))
    @scala.inline
    def setMatches(value: js.Array[RuleMatch]): Self = this.set("matches", value.asInstanceOf[js.Any])
    @scala.inline
    def setPseudoType(value: PseudoType): Self = this.set("pseudoType", value.asInstanceOf[js.Any])
  }
  
}

