package typings
package extjsLib.ExtNs.stateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILocalStorageProvider extends IProvider {
  /** [Method] private
  		* @param name Object
  		*/
  @JSName("clear")
  var clear_ILocalStorageProvider: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value for a key
  		* @param name Object
  		* @param value Object
  		*/
  @JSName("set")
  var set_ILocalStorageProvider: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
}

