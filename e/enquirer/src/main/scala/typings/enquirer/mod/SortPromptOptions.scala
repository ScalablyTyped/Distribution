package typings.enquirer.mod

import typings.enquirer.enquirerStrings.sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.enquirer.mod.PromptOptions because Already inherited */ @js.native
trait SortPromptOptions extends BasePromptOptions {
  var drag: js.UndefOr[Boolean] = js.native
  var hint: js.UndefOr[String] = js.native
  var numbered: js.UndefOr[Boolean] = js.native
  @JSName("type")
  var type_SortPromptOptions: sort = js.native
}

object SortPromptOptions {
  @scala.inline
  def apply(
    message: String | (js.Function0[js.Promise[String] | String]),
    name: String | js.Function0[String],
    `type`: sort
  ): SortPromptOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortPromptOptions]
  }
  @scala.inline
  implicit class SortPromptOptionsOps[Self <: SortPromptOptions] (val x: Self) extends AnyVal {
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
    def setType(value: sort): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrag(value: Boolean): Self = this.set("drag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    @scala.inline
    def setHint(value: String): Self = this.set("hint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    @scala.inline
    def setNumbered(value: Boolean): Self = this.set("numbered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumbered: Self = this.set("numbered", js.undefined)
  }
  
}

