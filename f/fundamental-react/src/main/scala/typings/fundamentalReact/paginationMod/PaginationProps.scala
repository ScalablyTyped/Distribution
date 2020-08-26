package typings.fundamentalReact.paginationMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.Next
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.native
  var disableStyles: js.UndefOr[Boolean] = js.native
  var displayTotal: js.UndefOr[Boolean] = js.native
  var displayTotalProps: js.UndefOr[js.Any] = js.native
  var initialPage: js.UndefOr[Double] = js.native
  var itemsPerPage: js.UndefOr[Double] = js.native
  var itemsTotal: Double = js.native
  var linkProps: js.UndefOr[js.Any] = js.native
  var localizedText: js.UndefOr[Next] = js.native
  var nextProps: js.UndefOr[js.Any] = js.native
  var prevProps: js.UndefOr[js.Any] = js.native
  var totalText: js.UndefOr[String] = js.native
  var visiblePageTotal: js.UndefOr[Double] = js.native
  def onClick(args: js.Any*): js.Any = js.native
}

object PaginationProps {
  @scala.inline
  def apply(itemsTotal: Double, onClick: /* repeated */ js.Any => js.Any): PaginationProps = {
    val __obj = js.Dynamic.literal(itemsTotal = itemsTotal.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[PaginationProps]
  }
  @scala.inline
  implicit class PaginationPropsOps[Self <: PaginationProps] (val x: Self) extends AnyVal {
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
    def setItemsTotal(value: Double): Self = this.set("itemsTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClick(value: /* repeated */ js.Any => js.Any): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisableStyles(value: Boolean): Self = this.set("disableStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableStyles: Self = this.set("disableStyles", js.undefined)
    @scala.inline
    def setDisplayTotal(value: Boolean): Self = this.set("displayTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayTotal: Self = this.set("displayTotal", js.undefined)
    @scala.inline
    def setDisplayTotalProps(value: js.Any): Self = this.set("displayTotalProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayTotalProps: Self = this.set("displayTotalProps", js.undefined)
    @scala.inline
    def setInitialPage(value: Double): Self = this.set("initialPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialPage: Self = this.set("initialPage", js.undefined)
    @scala.inline
    def setItemsPerPage(value: Double): Self = this.set("itemsPerPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemsPerPage: Self = this.set("itemsPerPage", js.undefined)
    @scala.inline
    def setLinkProps(value: js.Any): Self = this.set("linkProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkProps: Self = this.set("linkProps", js.undefined)
    @scala.inline
    def setLocalizedText(value: Next): Self = this.set("localizedText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalizedText: Self = this.set("localizedText", js.undefined)
    @scala.inline
    def setNextProps(value: js.Any): Self = this.set("nextProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextProps: Self = this.set("nextProps", js.undefined)
    @scala.inline
    def setPrevProps(value: js.Any): Self = this.set("prevProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevProps: Self = this.set("prevProps", js.undefined)
    @scala.inline
    def setTotalText(value: String): Self = this.set("totalText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalText: Self = this.set("totalText", js.undefined)
    @scala.inline
    def setVisiblePageTotal(value: Double): Self = this.set("visiblePageTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisiblePageTotal: Self = this.set("visiblePageTotal", js.undefined)
  }
  
}

