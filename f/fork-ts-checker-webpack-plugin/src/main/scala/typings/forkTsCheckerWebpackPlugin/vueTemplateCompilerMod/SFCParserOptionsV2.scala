package typings.forkTsCheckerWebpackPlugin.vueTemplateCompilerMod

import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginBooleans.`true`
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.line
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.space
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SFCParserOptionsV2 extends js.Object {
  var pad: js.UndefOr[`true` | line | space] = js.native
}

object SFCParserOptionsV2 {
  @scala.inline
  def apply(): SFCParserOptionsV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SFCParserOptionsV2]
  }
  @scala.inline
  implicit class SFCParserOptionsV2Ops[Self <: SFCParserOptionsV2] (val x: Self) extends AnyVal {
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
    def setPad(value: `true` | line | space): Self = this.set("pad", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePad: Self = this.set("pad", js.undefined)
  }
  
}

