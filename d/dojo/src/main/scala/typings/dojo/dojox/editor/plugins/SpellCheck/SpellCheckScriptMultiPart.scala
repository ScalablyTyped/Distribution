package typings.dojo.dojox.editor.plugins.SpellCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/SpellCheck._SpellCheckScriptMultiPart.html
  *
  * It is a base network service component. It transfers text to a remote service port
  * with cross domain ability enabled. It can split text into specified pieces and send
  * them out one by one so that it can handle the case when the service has a limitation of
  * the capability.
  * The encoding is UTF-8.
  *
  */
@JSGlobal("dojox.editor.plugins.SpellCheck._SpellCheckScriptMultiPart")
@js.native
class SpellCheckScriptMultiPart () extends js.Object {
  /**
    *
    */
  var ACTION_QUERY: String = js.native
  /**
    *
    */
  var ACTION_UPDATE: String = js.native
  /**
    *
    */
  var SEC: Double = js.native
  /**
    *
    */
  var callbackHandle: String = js.native
  /**
    *
    */
  var delimiter: String = js.native
  /**
    *
    */
  var label: String = js.native
  /**
    *
    */
  var maxBufferLength: Double = js.native
  /**
    *
    * @param data
    */
  def onLoad(data: String): Unit = js.native
  /**
    * Send the content to the service port with the specified action
    *
    * @param content The text to be sent
    * @param action               OptionalThe action the service should take. Current support actions areACTION_QUERY and ACTION_UPDATE
    */
  def send(content: String, action: String): Unit = js.native
  /**
    *
    * @param seconds
    */
  def setWaitingTime(seconds: Double): Unit = js.native
}

