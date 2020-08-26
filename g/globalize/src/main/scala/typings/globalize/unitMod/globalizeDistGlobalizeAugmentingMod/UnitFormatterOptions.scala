package typings.globalize.unitMod.globalizeDistGlobalizeAugmentingMod

import typings.globalize.globalizeStrings.long
import typings.globalize.globalizeStrings.narrow
import typings.globalize.globalizeStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnitFormatterOptions extends js.Object {
  /**
    * form: [String] eg. "long", "short" or "narrow".
    */
  var form: js.UndefOr[long | short | narrow] = js.native
  /**
    * numberFormatter: [Function] a number formatter function. Defaults to Globalize .numberFormatter() for the current locale using the default options.
    */
  var numberFormatter: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberFormatterOptions */ js.Any
  ] = js.native
}

object UnitFormatterOptions {
  @scala.inline
  def apply(): UnitFormatterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnitFormatterOptions]
  }
  @scala.inline
  implicit class UnitFormatterOptionsOps[Self <: UnitFormatterOptions] (val x: Self) extends AnyVal {
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
    def setForm(value: long | short | narrow): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    @scala.inline
    def setNumberFormatter(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberFormatterOptions */ js.Any
    ): Self = this.set("numberFormatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberFormatter: Self = this.set("numberFormatter", js.undefined)
  }
  
}

