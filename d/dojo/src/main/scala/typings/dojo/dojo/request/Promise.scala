package typings.dojo.dojo.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/request.__Promise.html
  *
  *
  */
@JSGlobal("dojo.request.__Promise")
@js.native
class Promise ()
  extends typings.dojo.dojo.promise.Promise[js.Any] {
  /**
    * A promise resolving to an object representing
    * the response from the server.
    *
    */
  var response: js.Object = js.native
  /**
    * Add a callback to be invoked when the promise is resolved
    * or rejected.
    *
    * @param callbackOrErrback               OptionalA function that is used both as a callback and errback.
    */
  def always(callbackOrErrback: js.Function): js.Any = js.native
  def otherwise(errback: js.Function): js.Any = js.native
  def `then`(callback: js.Function): typings.dojo.dojo.promise.Promise[_] = js.native
  def `then`(callback: js.Function, errback: js.Function): typings.dojo.dojo.promise.Promise[_] = js.native
  def `then`(callback: js.Function, errback: js.Function, progback: js.Function): typings.dojo.dojo.promise.Promise[_] = js.native
}

