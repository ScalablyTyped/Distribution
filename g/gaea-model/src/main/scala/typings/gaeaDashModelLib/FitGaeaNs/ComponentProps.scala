package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentProps
  extends reactLib.reactMod.ReactNs.HTMLProps[js.Any]
     with /**
  * 渲染编辑回调
  */
// renderEditer?:(React.ComponentClass<FitGaea.ComponentProps>,{})=>void
/* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * 是否可以拖入子元素
    */
  var canDragIn: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 父组件传递的数据
    */
  var gaeaData: js.UndefOr[js.Any] = js.undefined
  /**
    * 编辑信息
    */
  var gaeaEdit: js.UndefOr[js.Array[ComponentPropsGaeaEdit]] = js.undefined
  /**
    * 事件定义
    */
  var gaeaEvent: js.UndefOr[GaeaEvent] = js.undefined
  /**
    * 存储事件设置
    */
  var gaeaEventData: js.UndefOr[js.Array[EventData]] = js.undefined
  /**
    * 组件图标,为 fontAwesome
    */
  var gaeaIcon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 组件的中文名
    */
  var gaeaName: java.lang.String
  /**
    * 存储native事件设置
    */
  var gaeaNativeEventData: js.UndefOr[js.Array[EventData]] = js.undefined
  /**
    * 是否在预览模式，preivew 会传入 true
    */
  var gaeaPreview: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 唯一的 key,用来唯一标识这个组件,所有盖亚内部组件都以 gaea- 为前缀
    */
  var gaeaUniqueKey: java.lang.String
  /**
    * 存储变量信息
    */
  var gaeaVariables: js.UndefOr[org.scalablytyped.runtime.StringDictionary[VariableData]] = js.undefined
}

