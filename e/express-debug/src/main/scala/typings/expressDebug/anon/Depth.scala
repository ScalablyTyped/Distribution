package typings.expressDebug.anon

import typings.expressDebug.mod.CustomPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Depth extends js.Object {
  /**
    * How deep to recurse through printed objects. This is the default unless the
    * print_obj function is passed an options object with a 'depth' property.
    */
  var depth: js.UndefOr[Double] = js.native
  /**
    * If you need to add arbitrary attributes to the containing element of EDT,
    * this allows you to.
    */
  var extra_attrs: js.UndefOr[String] = js.native
  /**
    * Additional panels to show.
    */
  var extra_panels: js.UndefOr[js.Array[CustomPanel]] = js.native
  /**
    * Allows changing the default panel.
    */
  var panels: js.UndefOr[js.Array[String]] = js.native
  /**
    * Path to render standalone express-debug.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Global option to determine sort order of printed object values. false for
    * default order, true for basic default sort, or a function to use for sort.
    */
  var sort: js.UndefOr[Boolean | (js.Function2[/* a */ Double, /* b */ Double, Double])] = js.native
  /**
    * Absolute path to a css file to include and override EDT's default css.
    */
  var theme: js.UndefOr[String] = js.native
}

object Depth {
  @scala.inline
  def apply(): Depth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Depth]
  }
  @scala.inline
  implicit class DepthOps[Self <: Depth] (val x: Self) extends AnyVal {
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
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    @scala.inline
    def setExtra_attrs(value: String): Self = this.set("extra_attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra_attrs: Self = this.set("extra_attrs", js.undefined)
    @scala.inline
    def setExtra_panelsVarargs(value: CustomPanel*): Self = this.set("extra_panels", js.Array(value :_*))
    @scala.inline
    def setExtra_panels(value: js.Array[CustomPanel]): Self = this.set("extra_panels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra_panels: Self = this.set("extra_panels", js.undefined)
    @scala.inline
    def setPanelsVarargs(value: String*): Self = this.set("panels", js.Array(value :_*))
    @scala.inline
    def setPanels(value: js.Array[String]): Self = this.set("panels", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanels: Self = this.set("panels", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setSortFunction2(value: (/* a */ Double, /* b */ Double) => Double): Self = this.set("sort", js.Any.fromFunction2(value))
    @scala.inline
    def setSort(value: Boolean | (js.Function2[/* a */ Double, /* b */ Double, Double])): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

