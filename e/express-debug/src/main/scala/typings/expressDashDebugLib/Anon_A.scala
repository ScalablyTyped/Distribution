package typings
package expressDashDebugLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_A extends js.Object {
  /**
    * How deep to recurse through printed objects. This is the default unless the
    * print_obj function is passed an options object with a 'depth' property.
    */
  var depth: js.UndefOr[scala.Double] = js.undefined
  /**
    * If you need to add arbitrary attributes to the containing element of EDT,
    * this allows you to.
    */
  var extra_attrs: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Additional panels to show.
    */
  var extra_panels: js.UndefOr[js.Array[expressDashDebugLib.expressDashDebugMod.CustomPanel]] = js.undefined
  /**
    * Allows changing the default panel.
    */
  var panels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Path to render standalone express-debug.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Global option to determine sort order of printed object values. false for
    * default order, true for basic default sort, or a function to use for sort.
    */
  var sort: js.UndefOr[
    scala.Boolean | (js.Function2[/* a */ scala.Double, /* b */ scala.Double, scala.Double])
  ] = js.undefined
  /**
    * Absolute path to a css file to include and override EDT's default css.
    */
  var theme: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_A {
  @scala.inline
  def apply(
    depth: scala.Int | scala.Double = null,
    extra_attrs: java.lang.String = null,
    extra_panels: js.Array[expressDashDebugLib.expressDashDebugMod.CustomPanel] = null,
    panels: js.Array[java.lang.String] = null,
    path: java.lang.String = null,
    sort: scala.Boolean | (js.Function2[/* a */ scala.Double, /* b */ scala.Double, scala.Double]) = null,
    theme: java.lang.String = null
  ): Anon_A = {
    val __obj = js.Dynamic.literal()
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (extra_attrs != null) __obj.updateDynamic("extra_attrs")(extra_attrs)
    if (extra_panels != null) __obj.updateDynamic("extra_panels")(extra_panels)
    if (panels != null) __obj.updateDynamic("panels")(panels)
    if (path != null) __obj.updateDynamic("path")(path)
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[Anon_A]
  }
}

