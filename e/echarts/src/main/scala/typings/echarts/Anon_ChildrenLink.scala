package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenLink extends js.Object {
  /**
    * child nodes, recursive definition, configurations are the
    * same as
    * [series-treemap.data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data)
    * .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.silent.children
    */
  var children: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Enable hyperlink jump when clicking on node.
    * It is avaliable when
    * [series-treemap.nodeClick](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.nodeClick)
    * is `'link'`.
    *
    * See
    * [series-treemap.data.target](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.target)
    * .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.silent.link
    */
  var link: js.UndefOr[String] = js.undefined
  /**
    * The same meaning as `target` in `html` `<a>` label, See
    * [series-treemap.data.link](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.link)
    * . Option values are: `'blank'` or `'self'`.
    *
    *
    * @default
    * "blank"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.silent.target
    */
  var target: js.UndefOr[String] = js.undefined
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.silent.tooltip
    */
  var tooltip: js.UndefOr[Anon_BackgroundColorBorderColorBorderWidth] = js.undefined
}

object Anon_ChildrenLink {
  @scala.inline
  def apply(
    children: js.Array[_] = null,
    link: String = null,
    target: String = null,
    tooltip: Anon_BackgroundColorBorderColorBorderWidth = null
  ): Anon_ChildrenLink = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (link != null) __obj.updateDynamic("link")(link)
    if (target != null) __obj.updateDynamic("target")(target)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[Anon_ChildrenLink]
  }
}

