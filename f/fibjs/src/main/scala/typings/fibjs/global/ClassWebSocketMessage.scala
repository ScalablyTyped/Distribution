package typings.fibjs.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
open class ClassWebSocketMessage ()
  extends StObject
     with typings.fibjs.ClassWebSocketMessage {
  def this(`type`: Double) = this()
  def this(`type`: Double, masked: Boolean) = this()
  def this(`type`: Unit, masked: Boolean) = this()
  def this(`type`: Double, masked: Boolean, compress: Boolean) = this()
  def this(`type`: Double, masked: Unit, compress: Boolean) = this()
  def this(`type`: Unit, masked: Boolean, compress: Boolean) = this()
  def this(`type`: Unit, masked: Unit, compress: Boolean) = this()
  def this(`type`: Double, masked: Boolean, compress: Boolean, maxSize: Double) = this()
  def this(`type`: Double, masked: Boolean, compress: Unit, maxSize: Double) = this()
  def this(`type`: Double, masked: Unit, compress: Boolean, maxSize: Double) = this()
  def this(`type`: Double, masked: Unit, compress: Unit, maxSize: Double) = this()
  def this(`type`: Unit, masked: Boolean, compress: Boolean, maxSize: Double) = this()
  def this(`type`: Unit, masked: Boolean, compress: Unit, maxSize: Double) = this()
  def this(`type`: Unit, masked: Unit, compress: Boolean, maxSize: Double) = this()
  def this(`type`: Unit, masked: Unit, compress: Unit, maxSize: Double) = this()
}
