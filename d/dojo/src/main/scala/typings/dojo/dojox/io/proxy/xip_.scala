package typings.dojo.dojox.io.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/io/proxy/xip.html
  *
  * Object that implements the iframe handling for XMLHttpRequest
  * IFrame Proxying.
  *
  * Do not use this object directly. See the Dojo Book page
  * on XMLHttpRequest IFrame Proxying:
  * http://dojotoolkit.org/book/dojo-book-0-4/part-5-connecting-pieces/i-o/cross-domain-xmlhttprequest-using-iframe-proxy
  * Usage of XHR IFrame Proxying does not work from local disk in Safari.
  *
  */
trait xip_ extends js.Object {
  /**
    *
    */
  var urlLimit: Double
  /**
    *
    */
  var xipClientUrl: js.Object
  /**
    * XMLHttpRequest facade object used by dojox.io.proxy.xip.
    *
    * Do not use this object directly. See the Dojo Book page
    * on XMLHttpRequest IFrame Proxying:
    * http://dojotoolkit.org/book/dojo-book-0-4/part-5-connecting-pieces/i-o/cross-domain-xmlhttprequest-using-iframe-proxy
    *
    * @param ifpServerUrl
    */
  def XhrIframeFacade(ifpServerUrl: js.Any): Unit
  /**
    *
    */
  def createFacade(): js.Any
  /**
    *
    * @param stateId
    */
  def destroyState(stateId: String): Unit
  /**
    *
    * @param frag
    */
  def fragmentReceived(frag: js.Any): Unit
  /**
    * HTML5 document messaging endpoint. Unpack the event to see if we want to use it.
    *
    * @param evt
    */
  def fragmentReceivedEvent(evt: js.Any): Unit
  /**
    *
    * @param stateId
    */
  def frameLoaded(stateId: String): Unit
  /**
    *
    * @param stateId
    * @param cmd
    * @param message
    */
  def makeServerUrl(stateId: js.Any, cmd: js.Any, message: js.Any): String
  /**
    *
    * @param stateId
    * @param urlEncodedData
    */
  def receive(stateId: String, urlEncodedData: String): Unit
  /**
    * starts the xdomain request using the provided facade.
    * This method first does some init work, then delegates to _realSend.
    *
    * @param facade
    */
  def send(facade: js.Object): js.Any
  /**
    *
    * @param stateId
    * @param encodedData
    */
  def sendRequest(stateId: js.Any, encodedData: js.Any): Unit
  /**
    *
    * @param stateId
    */
  def sendRequestPart(stateId: js.Any): Unit
  /**
    *
    * @param stateId
    */
  def sendRequestStart(stateId: js.Any): Unit
  /**
    *
    * @param stateId
    * @param cmd
    * @param message
    */
  def setServerUrl(stateId: js.Any, cmd: js.Any, message: js.Any): Unit
  /**
    *
    * @param encodedMessage
    */
  def unpackMessage(encodedMessage: js.Any): js.Object
}

object xip_ {
  @scala.inline
  def apply(
    XhrIframeFacade: js.Any => Unit,
    createFacade: () => js.Any,
    destroyState: String => Unit,
    fragmentReceived: js.Any => Unit,
    fragmentReceivedEvent: js.Any => Unit,
    frameLoaded: String => Unit,
    makeServerUrl: (js.Any, js.Any, js.Any) => String,
    receive: (String, String) => Unit,
    send: js.Object => js.Any,
    sendRequest: (js.Any, js.Any) => Unit,
    sendRequestPart: js.Any => Unit,
    sendRequestStart: js.Any => Unit,
    setServerUrl: (js.Any, js.Any, js.Any) => Unit,
    unpackMessage: js.Any => js.Object,
    urlLimit: Double,
    xipClientUrl: js.Object
  ): xip_ = {
    val __obj = js.Dynamic.literal(XhrIframeFacade = js.Any.fromFunction1(XhrIframeFacade), createFacade = js.Any.fromFunction0(createFacade), destroyState = js.Any.fromFunction1(destroyState), fragmentReceived = js.Any.fromFunction1(fragmentReceived), fragmentReceivedEvent = js.Any.fromFunction1(fragmentReceivedEvent), frameLoaded = js.Any.fromFunction1(frameLoaded), makeServerUrl = js.Any.fromFunction3(makeServerUrl), receive = js.Any.fromFunction2(receive), send = js.Any.fromFunction1(send), sendRequest = js.Any.fromFunction2(sendRequest), sendRequestPart = js.Any.fromFunction1(sendRequestPart), sendRequestStart = js.Any.fromFunction1(sendRequestStart), setServerUrl = js.Any.fromFunction3(setServerUrl), unpackMessage = js.Any.fromFunction1(unpackMessage), urlLimit = urlLimit.asInstanceOf[js.Any], xipClientUrl = xipClientUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[xip_]
  }
}

