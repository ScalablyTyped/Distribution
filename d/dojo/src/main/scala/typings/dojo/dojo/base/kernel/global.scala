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
trait global extends js.Object {
  /**
    *
    */
  @JSName("$")
  def $(): js.Any
  /**
    *
    * @param start
    * @param data
    * @param responseCode
    * @param errorMsg
    */
  def GoogleSearchStoreCallback_undefined_NaN(start: js.Any, data: js.Any, responseCode: js.Any, errorMsg: js.Any): Unit
  /**
    *
    */
  def jQuery(): js.Any
  /**
    *
    */
  def swfIsInHTML(): Unit
  /**
    *
    */
  def undefined_onload(): Unit
}

object global {
  @scala.inline
  def apply(
    $: () => js.Any,
    GoogleSearchStoreCallback_undefined_NaN: (js.Any, js.Any, js.Any, js.Any) => Unit,
    jQuery: () => js.Any,
    swfIsInHTML: () => Unit,
    undefined_onload: () => Unit
  ): global = {
    val __obj = js.Dynamic.literal($ = js.Any.fromFunction0($), GoogleSearchStoreCallback_undefined_NaN = js.Any.fromFunction4(GoogleSearchStoreCallback_undefined_NaN), jQuery = js.Any.fromFunction0(jQuery), swfIsInHTML = js.Any.fromFunction0(swfIsInHTML), undefined_onload = js.Any.fromFunction0(undefined_onload))
    __obj.asInstanceOf[global]
  }
}

