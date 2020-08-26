package typings.fluentReact.mod

import typings.fluentBundle.mod.FluentBundle
import typings.std.Iterable
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalizationProviderProps extends js.Object {
  var bundles: Iterable[FluentBundle] = js.native
  var parseMarkup: js.UndefOr[MarkupParser] = js.native
}

object LocalizationProviderProps {
  @scala.inline
  def apply(bundles: Iterable[FluentBundle]): LocalizationProviderProps = {
    val __obj = js.Dynamic.literal(bundles = bundles.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizationProviderProps]
  }
  @scala.inline
  implicit class LocalizationProviderPropsOps[Self <: LocalizationProviderProps] (val x: Self) extends AnyVal {
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
    def setBundles(value: Iterable[FluentBundle]): Self = this.set("bundles", value.asInstanceOf[js.Any])
    @scala.inline
    def setParseMarkup(value: /* str */ String => js.Array[Node]): Self = this.set("parseMarkup", js.Any.fromFunction1(value))
    @scala.inline
    def deleteParseMarkup: Self = this.set("parseMarkup", js.undefined)
  }
  
}

