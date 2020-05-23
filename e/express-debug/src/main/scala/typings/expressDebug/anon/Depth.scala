package typings.expressDebug.anon

import typings.expressDebug.mod.CustomPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Depth extends js.Object {
  /**
    * How deep to recurse through printed objects. This is the default unless the
    * print_obj function is passed an options object with a 'depth' property.
    */
  var depth: js.UndefOr[Double] = js.undefined
  /**
    * If you need to add arbitrary attributes to the containing element of EDT,
    * this allows you to.
    */
  var extra_attrs: js.UndefOr[String] = js.undefined
  /**
    * Additional panels to show.
    */
  var extra_panels: js.UndefOr[js.Array[CustomPanel]] = js.undefined
  /**
    * Allows changing the default panel.
    */
  var panels: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Path to render standalone express-debug.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * Global option to determine sort order of printed object values. false for
    * default order, true for basic default sort, or a function to use for sort.
    */
  var sort: js.UndefOr[Boolean | (js.Function2[/* a */ Double, /* b */ Double, Double])] = js.undefined
  /**
    * Absolute path to a css file to include and override EDT's default css.
    */
  var theme: js.UndefOr[String] = js.undefined
}

object Depth {
  @scala.inline
  def apply(
    depth: js.UndefOr[Double] = js.undefined,
    extra_attrs: String = null,
    extra_panels: js.Array[CustomPanel] = null,
    panels: js.Array[String] = null,
    path: String = null,
    sort: Boolean | (js.Function2[/* a */ Double, /* b */ Double, Double]) = null,
    theme: String = null
  ): Depth = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.get.asInstanceOf[js.Any])
    if (extra_attrs != null) __obj.updateDynamic("extra_attrs")(extra_attrs.asInstanceOf[js.Any])
    if (extra_panels != null) __obj.updateDynamic("extra_panels")(extra_panels.asInstanceOf[js.Any])
    if (panels != null) __obj.updateDynamic("panels")(panels.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Depth]
  }
}

