package typings.dojo.dojo.request

import typings.dojo.dojo.Deferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/request/watch.html
  *
  * Watches the io request represented by dfd to see if it completes.
  *
  * @param dfd The Deferred object to watch.
  */
@js.native
trait watch extends js.Object {
  /**
    * Function used to check if basic IO call worked. Gets the dfd
    * object as its only argument.
    *
    */
  var ioCheck: js.Function = js.native
  /**
    * Function used to process response. Gets the dfd
    * object as its only argument.
    *
    */
  var resHandle: js.Function = js.native
  /**
    * Function used to check if the IO request is still valid. Gets the dfd
    * object as its only argument.
    *
    */
  var validCheck: js.Function = js.native
  def apply(dfd: Deferred): Unit = js.native
  /**
    * Cancels all pending IO requests, regardless of IO type
    *
    */
  def cancelAll(): Unit = js.native
}

