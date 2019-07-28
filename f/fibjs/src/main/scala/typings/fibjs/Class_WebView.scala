package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_WebView")
@js.native
class Class_WebView () extends Class_EventEmitter {
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和绑定窗口关闭事件，WebView 关闭后会触发此时间，相当于 on("closed", func);
  	 * 
  	 * 
  	 * @type Function
  	 */
  var onclosed: js.Function = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和绑定加载成功事件，相当于 on("load", func);
  	 * 
  	 * 
  	 * @type Function
  	 */
  var onload: js.Function = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和绑定接受 webview 内 postMessage 消息事件，相当于 on("message", func);
  	 * 
  	 * 
  	 * @type Function
  	 */
  var onmessage: js.Function = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和绑定窗口移动事件，相当于 on("move", func);
  	 * 
  	 * 以下示例会在窗口移动时输出窗口的左上角坐标：
  	 * ```JavaScript
  	 * var gui = require('gui');
  	 * var webview = gui.open('fs:index.html');
  	 * 
  	 * webview.onmove = evt => console.log(evt.left, evt.top);
  	 * ```
  	 * 
  	 * 
  	 * 
  	 * @type Function
  	 */
  var onmove: js.Function = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和绑定窗口尺寸改变事件，相当于 on("size", func);
  	 * 
  	 * 以下示例会在窗口改变大小时输出窗口的尺寸：
  	 * ```JavaScript
  	 * var gui = require('gui');
  	 * var webview = gui.open('fs:index.html');
  	 * 
  	 * webview.onresize = evt => console.log(evt.width, evt.height);
  	 * ```
  	 * 
  	 * 
  	 * 
  	 * @type Function
  	 */
  var onresize: js.Function = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和设置窗口是否显示
  	 * 
  	 * 
  	 * @type Boolean
  	 */
  var visible: Boolean = js.native
  /**
  	 * 
  	 * @brief 关闭当前窗口
  	 * 
  	 * @async
  	 */
  def close(): Unit = js.native
  /**
  	 * 
  	 * @brief 向 webview 内发送消息
  	 * postMessage 需要在窗口加载完成后发送消息，在此之前发送的消息会丢失。因此建议在 onload 事件触发后再调用此方法。
  	 * @param msg 要发送的消息
  	 * 
  	 * 
  	 * @async
  	 */
  def postMessage(msg: String): Unit = js.native
  /**
  	 * 
  	 * @brief 打印当前窗口文档
  	 * @param mode 打印参数，0: 快速打印; 1: 标准打印; 2: 打印预览。缺省为 1
  	 * 
  	 * 
  	 * @async
  	 */
  def print(): Unit = js.native
  def print(mode: Double): Unit = js.native
  /**
  	 * 
  	 * @brief 设置 webview 的页面 html
  	 * @param html 设置的 html
  	 * 
  	 * 
  	 * @async
  	 */
  def setHtml(html: String): Unit = js.native
}

