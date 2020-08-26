package typings.enquirer.mod

import typings.enquirer.enquirerStrings.numeral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.enquirer.mod.PromptOptions because Already inherited */ @js.native
trait NumberPromptOptions extends BasePromptOptions {
  var delay: js.UndefOr[Double] = js.native
  var float: js.UndefOr[Boolean] = js.native
  @JSName("initial")
  var initial_NumberPromptOptions: js.UndefOr[Double] = js.native
  var major: js.UndefOr[Double] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var minor: js.UndefOr[Double] = js.native
  var round: js.UndefOr[Boolean] = js.native
  @JSName("type")
  var type_NumberPromptOptions: numeral = js.native
}

object NumberPromptOptions {
  @scala.inline
  def apply(
    message: String | (js.Function0[js.Promise[String] | String]),
    name: String | js.Function0[String],
    `type`: numeral
  ): NumberPromptOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberPromptOptions]
  }
  @scala.inline
  implicit class NumberPromptOptionsOps[Self <: NumberPromptOptions] (val x: Self) extends AnyVal {
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
    def setType(value: numeral): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setFloat(value: Boolean): Self = this.set("float", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloat: Self = this.set("float", js.undefined)
    @scala.inline
    def setInitial(value: Double): Self = this.set("initial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitial: Self = this.set("initial", js.undefined)
    @scala.inline
    def setMajor(value: Double): Self = this.set("major", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajor: Self = this.set("major", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMinor(value: Double): Self = this.set("minor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinor: Self = this.set("minor", js.undefined)
    @scala.inline
    def setRound(value: Boolean): Self = this.set("round", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
  }
  
}

