package typings.enquirer.mod

import typings.enquirer.enquirerStrings.confirm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.enquirer.mod.PromptOptions because Already inherited */ @js.native
trait BooleanPromptOptions extends BasePromptOptions {
  @JSName("initial")
  var initial_BooleanPromptOptions: js.UndefOr[Boolean] = js.native
  @JSName("type")
  var type_BooleanPromptOptions: confirm = js.native
}

object BooleanPromptOptions {
  @scala.inline
  def apply(
    message: String | (js.Function0[js.Promise[String] | String]),
    name: String | js.Function0[String],
    `type`: confirm
  ): BooleanPromptOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanPromptOptions]
  }
  @scala.inline
  implicit class BooleanPromptOptionsOps[Self <: BooleanPromptOptions] (val x: Self) extends AnyVal {
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
    def setType(value: confirm): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitial(value: Boolean): Self = this.set("initial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitial: Self = this.set("initial", js.undefined)
  }
  
}

