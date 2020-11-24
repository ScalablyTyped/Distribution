package typings.fibjs.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Class_WebSocketMessage")
@js.native
/**
  * 
  * @brief 包处理消息对象构造函数
  * @param type websocket 消息类型，缺省为 websocket.BINARY
  * @param masked websocket 消息掩码，缺省为 true
  * @param compress 标记消息是否压缩，缺省为 false
  * @param maxSize 最大包尺寸，以 MB 为单位，缺省为 67108864(64M)
  * 
  * 
  * 
  */
class ClassWebSocketMessage ()
  extends typings.fibjs.ClassWebSocketMessage {
  def this(`type`: Double) = this()
  def this(`type`: js.UndefOr[scala.Nothing], masked: Boolean) = this()
  def this(`type`: Double, masked: Boolean) = this()
  def this(`type`: js.UndefOr[scala.Nothing], masked: js.UndefOr[scala.Nothing], compress: Boolean) = this()
  def this(`type`: js.UndefOr[scala.Nothing], masked: Boolean, compress: Boolean) = this()
  def this(`type`: Double, masked: js.UndefOr[scala.Nothing], compress: Boolean) = this()
  def this(`type`: Double, masked: Boolean, compress: Boolean) = this()
  def this(
    `type`: js.UndefOr[scala.Nothing],
    masked: js.UndefOr[scala.Nothing],
    compress: js.UndefOr[scala.Nothing],
    maxSize: Double
  ) = this()
  def this(
    `type`: js.UndefOr[scala.Nothing],
    masked: js.UndefOr[scala.Nothing],
    compress: Boolean,
    maxSize: Double
  ) = this()
  def this(
    `type`: js.UndefOr[scala.Nothing],
    masked: Boolean,
    compress: js.UndefOr[scala.Nothing],
    maxSize: Double
  ) = this()
  def this(`type`: js.UndefOr[scala.Nothing], masked: Boolean, compress: Boolean, maxSize: Double) = this()
  def this(
    `type`: Double,
    masked: js.UndefOr[scala.Nothing],
    compress: js.UndefOr[scala.Nothing],
    maxSize: Double
  ) = this()
  def this(`type`: Double, masked: js.UndefOr[scala.Nothing], compress: Boolean, maxSize: Double) = this()
  def this(`type`: Double, masked: Boolean, compress: js.UndefOr[scala.Nothing], maxSize: Double) = this()
  def this(`type`: Double, masked: Boolean, compress: Boolean, maxSize: Double) = this()
}
