package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Children extends js.Object {
  /**
    * child nodes, recursive definition, configurations are the
    * same as
    * [series-treemap.data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data)
    * .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.silent.children
    */
  var children: js.UndefOr[js.Array[_]] = js.native
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
  var link: js.UndefOr[java.lang.String] = js.native
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
  var target: js.UndefOr[java.lang.String] = js.native
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.silent.tooltip
    */
  var tooltip: js.UndefOr[Anon_BackgroundColorTextStyle] = js.native
}

