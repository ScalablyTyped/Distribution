package typings
package extjsLib.ExtNs.stateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICookieProvider extends IProvider {
  /** [Method] private
  		* @param name Object
  		*/
  @JSName("clear")
  var clear_ICookieProvider: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Date) */
  var expires: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] private
  		* @param name Object
  		* @param value Object
  		*/
  @JSName("set")
  var set_ICookieProvider: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
}

