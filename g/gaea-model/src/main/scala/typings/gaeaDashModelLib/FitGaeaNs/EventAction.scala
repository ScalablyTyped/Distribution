package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventAction extends js.Object {
  var call: js.UndefOr[EventCallType] = js.undefined
  var name: java.lang.String
  // 动作类型
  // call: 调用传进来的方法
  // jumpUrl: 跳转一个网址
  var `type`: java.lang.String
}

