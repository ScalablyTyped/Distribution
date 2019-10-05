package typings.dojo.dojo.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/request/util.html
  *
  *
  */
@js.native
trait util extends js.Object {
  /**
    *
    * @param provider
    * @param methods
    */
  def addCommonMethods(provider: js.Any, methods: js.Any): Unit = js.native
  /**
    *
    * @param stat
    */
  def checkStatus(stat: js.Any): Boolean = js.native
  /**
    *
    * @param target
    * @param source
    */
  def deepCopy(target: js.Any, source: js.Any): js.Any = js.native
  /**
    *
    * @param source
    * @param properties
    */
  def deepCreate(source: js.Any, properties: js.Any): js.Any = js.native
  /**
    *
    * @param response The object used as the value of the request promise.
    * @param cancel
    * @param isValid
    * @param isReady
    * @param handleResponse
    * @param last
    */
  def deferred(
    response: js.Object,
    cancel: js.Any,
    isValid: js.Any,
    isReady: js.Any,
    handleResponse: js.Any,
    last: js.Any
  ): js.Any = js.native
  def notify(`type`: String): js.Any = js.native
  def notify(`type`: String, listener: js.Function): js.Any = js.native
  /**
    *
    * @param url
    * @param options
    * @param skipData
    */
  def parseArgs(url: js.Any, options: js.Any, skipData: js.Any): js.Object = js.native
}

