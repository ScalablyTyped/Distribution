package typings.ejWebAll.ej.datavisualization.SymbolPalette

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Palette extends js.Object {
  /** Defines whether the palette must be in expanded state or in collapsed state
    * @Default {true}
    */
  var expanded: js.UndefOr[Boolean] = js.native
  /** Defines the palette items
    * @Default {[]}
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  /** Defines the name of the palette
    * @Default {null}
    */
  var name: js.UndefOr[String] = js.native
}

object Palette {
  @scala.inline
  def apply(): Palette = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Palette]
  }
  @scala.inline
  implicit class PaletteOps[Self <: Palette] (val x: Self) extends AnyVal {
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
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

