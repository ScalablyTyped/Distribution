package typings.ethereumjsCommon.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hardfork extends js.Object {
  var block: Double | Null = js.native
  var consensus: String = js.native
  var finality: js.Any = js.native
  var name: String = js.native
}

object Hardfork {
  @scala.inline
  def apply(consensus: String, finality: js.Any, name: String): Hardfork = {
    val __obj = js.Dynamic.literal(consensus = consensus.asInstanceOf[js.Any], finality = finality.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hardfork]
  }
  @scala.inline
  implicit class HardforkOps[Self <: Hardfork] (val x: Self) extends AnyVal {
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
    def setConsensus(value: String): Self = this.set("consensus", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinality(value: js.Any): Self = this.set("finality", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlock(value: Double): Self = this.set("block", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlockNull: Self = this.set("block", null)
  }
  
}

