package typings.dojo.dojo.base.kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.global.html
  *
  * Alias for the current window. 'global' can be modified
  * for temporary context shifting. See also withGlobal().
  * Use this rather than referring to 'window' to ensure your code runs
  * correctly in managed contexts.
  *
  */
@js.native
trait global extends js.Object {
  /**
    *
    */
  @JSName("$")
  def $(): js.Any = js.native
  /**
    *
    * @param start
    * @param data
    * @param responseCode
    * @param errorMsg
    */
  def GoogleSearchStoreCallback_undefined_NaN(start: js.Any, data: js.Any, responseCode: js.Any, errorMsg: js.Any): Unit = js.native
  /**
    *
    */
  def jQuery(): js.Any = js.native
  /**
    *
    */
  def swfIsInHTML(): Unit = js.native
  /**
    *
    */
  def undefined_onload(): Unit = js.native
}

