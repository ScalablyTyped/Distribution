package typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dingtalk-robot-sender", JSImport.Namespace)
@js.native
class ^ protected () extends ChatBot {
  def this(options: BaseUrlOptions) = this()
  /**
    * 机器人工厂，所有的消息推送项目都会调用 this.webhook 接口进行发送
    *
    * @param options.webhook 完整的接口地址
    * @param options.baseUrl 接口地址
    * @param options.accessToken accessToken
    * @param options.httpclient 例如 urllib / axios
    */
  def this(options: WebHookOptions) = this()
}

