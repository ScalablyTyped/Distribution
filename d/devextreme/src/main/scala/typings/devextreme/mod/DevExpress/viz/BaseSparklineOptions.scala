package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.`15`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseSparklineOptions[T] extends BaseWidgetOptions[T] {
  /** @name BaseSparkline.Options.onTooltipHidden */
  var onTooltipHidden: js.UndefOr[js.Function1[/* e */ `15`[T], _]] = js.native
  /** @name BaseSparkline.Options.onTooltipShown */
  var onTooltipShown: js.UndefOr[js.Function1[/* e */ `15`[T], _]] = js.native
  /** @name BaseSparkline.Options.tooltip */
  @JSName("tooltip")
  var tooltip_BaseSparklineOptions: js.UndefOr[BaseSparklineTooltip] = js.native
}

object BaseSparklineOptions {
  @scala.inline
  def apply[T](): BaseSparklineOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseSparklineOptions[T]]
  }
  @scala.inline
  implicit class BaseSparklineOptionsOps[Self <: BaseSparklineOptions[_], T] (val x: Self with BaseSparklineOptions[T]) extends AnyVal {
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
    def setOnTooltipHidden(value: /* e */ `15`[T] => _): Self = this.set("onTooltipHidden", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTooltipHidden: Self = this.set("onTooltipHidden", js.undefined)
    @scala.inline
    def setOnTooltipShown(value: /* e */ `15`[T] => _): Self = this.set("onTooltipShown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTooltipShown: Self = this.set("onTooltipShown", js.undefined)
    @scala.inline
    def setTooltip(value: BaseSparklineTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
  
}

