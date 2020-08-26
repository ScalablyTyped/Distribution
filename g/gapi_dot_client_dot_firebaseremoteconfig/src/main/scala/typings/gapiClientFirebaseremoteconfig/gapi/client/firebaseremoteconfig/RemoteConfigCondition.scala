package typings.gapiClientFirebaseremoteconfig.gapi.client.firebaseremoteconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteConfigCondition extends js.Object {
  /** Required. */
  var expression: js.UndefOr[String] = js.native
  /**
    * Required.
    * A non empty and unique name of this condition.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional.
    * The display (tag) color of this condition. This serves as part of a tag
    * (in the future, we may add tag text as well as tag color, but that is not
    * yet implemented in the UI).
    * This value has no affect on the semantics of the delivered config and it
    * is ignored by the backend, except for passing it through write/read
    * requests.
    * Not having this value or having the "CONDITION_DISPLAY_COLOR_UNSPECIFIED"
    * value (0) have the same meaning:  Let the UI choose any valid color when
    * displaying the condition.
    */
  var tagColor: js.UndefOr[String] = js.native
}

object RemoteConfigCondition {
  @scala.inline
  def apply(): RemoteConfigCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteConfigCondition]
  }
  @scala.inline
  implicit class RemoteConfigConditionOps[Self <: RemoteConfigCondition] (val x: Self) extends AnyVal {
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
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTagColor(value: String): Self = this.set("tagColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagColor: Self = this.set("tagColor", js.undefined)
  }
  
}

