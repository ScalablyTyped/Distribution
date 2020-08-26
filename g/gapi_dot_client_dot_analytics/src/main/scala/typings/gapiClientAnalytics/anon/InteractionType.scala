package typings.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteractionType extends js.Object {
  /** Type of an interaction on conversion path. Such as CLICK, IMPRESSION etc. */
  var interactionType: js.UndefOr[String] = js.native
  /** Node value of an interaction on conversion path. Such as source, medium etc. */
  var nodeValue: js.UndefOr[String] = js.native
}

object InteractionType {
  @scala.inline
  def apply(): InteractionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InteractionType]
  }
  @scala.inline
  implicit class InteractionTypeOps[Self <: InteractionType] (val x: Self) extends AnyVal {
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
    def setInteractionType(value: String): Self = this.set("interactionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractionType: Self = this.set("interactionType", js.undefined)
    @scala.inline
    def setNodeValue(value: String): Self = this.set("nodeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeValue: Self = this.set("nodeValue", js.undefined)
  }
  
}

