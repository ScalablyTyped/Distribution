package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends js.Object {
  /**
    * child nodes, recursive definition, configurations are the
    * same as
    * [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.silent.children
    */
  var children: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Enable hyperlink jump when clicking on node.
    * It is avaliable when
    * [series-treemap.nodeClick](https://echarts.apache.org/en/option.html#series-treemap.nodeClick)
    * is `'link'`.
    *
    * See
    * [series-treemap.data.target](https://echarts.apache.org/en/option.html#series-treemap.data.target)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.silent.link
    */
  var link: js.UndefOr[String] = js.undefined
  /**
    * The same meaning as `target` in `html` `<a>` label, See
    * [series-treemap.data.link](https://echarts.apache.org/en/option.html#series-treemap.data.link)
    * . Option values are: `'blank'` or `'self'`.
    *
    *
    * @default
    * "blank"
    * @see https://echarts.apache.org/en/option.html#series-treemap.silent.target
    */
  var target: js.UndefOr[String] = js.undefined
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.silent.tooltip
    */
  var tooltip: js.UndefOr[ExtraCssText] = js.undefined
}

object Link {
  @scala.inline
  def apply(
    children: js.Array[_] = null,
    link: String = null,
    target: String = null,
    tooltip: ExtraCssText = null
  ): Link = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
}

