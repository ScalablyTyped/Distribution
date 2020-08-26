package typings.fundamentalReact.tileMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.fundamentalReactNumbers.`2`
import typings.fundamentalReact.fundamentalReactNumbers.`3`
import typings.fundamentalReact.fundamentalReactNumbers.`4`
import typings.fundamentalReact.fundamentalReactNumbers.`5`
import typings.fundamentalReact.fundamentalReactNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileContentProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.native
  var headingLevel: js.UndefOr[`2` | `3` | `4` | `5` | `6`] = js.native
  var productTile: js.UndefOr[Boolean] = js.native
  var title: String = js.native
  var titleProps: js.UndefOr[js.Any] = js.native
}

object TileContentProps {
  @scala.inline
  def apply(title: String): TileContentProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileContentProps]
  }
  @scala.inline
  implicit class TileContentPropsOps[Self <: TileContentProps] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setHeadingLevel(value: `2` | `3` | `4` | `5` | `6`): Self = this.set("headingLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadingLevel: Self = this.set("headingLevel", js.undefined)
    @scala.inline
    def setProductTile(value: Boolean): Self = this.set("productTile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductTile: Self = this.set("productTile", js.undefined)
    @scala.inline
    def setTitleProps(value: js.Any): Self = this.set("titleProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleProps: Self = this.set("titleProps", js.undefined)
  }
  
}

