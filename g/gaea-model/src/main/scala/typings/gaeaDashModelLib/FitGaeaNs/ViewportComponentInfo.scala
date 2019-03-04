package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportComponentInfo extends js.Object {
  /**
    * 子元素（canDragIn才有）
    * 只存子元素在 map 中的 key
    */
  var layoutChilds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * 父级 mapUniqueKey, 这样不但方便寻找父级,还能根据是否为 null 判断是否为根元素
    */
  var parentMapUniqueKey: java.lang.String
  /**
    * props
    */
  var props: ComponentProps
}

object ViewportComponentInfo {
  @scala.inline
  def apply(
    parentMapUniqueKey: java.lang.String,
    props: ComponentProps,
    layoutChilds: js.Array[java.lang.String] = null
  ): ViewportComponentInfo = {
    val __obj = js.Dynamic.literal(parentMapUniqueKey = parentMapUniqueKey, props = props)
    if (layoutChilds != null) __obj.updateDynamic("layoutChilds")(layoutChilds)
    __obj.asInstanceOf[ViewportComponentInfo]
  }
}

