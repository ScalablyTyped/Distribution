package typings
package extjsLib.ExtNs.stateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProvider
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Method] Clears a value from the state
  		* @param name String The key name
  		*/
  var clear: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Decodes a string previously encoded with encodeValue
  		* @param value String The value to decode
  		* @returns Object The decoded value
  		*/
  var decodeValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Encodes a value including type information
  		* @param value Object The value to encode
  		* @returns String The encoded value
  		*/
  var encodeValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], java.lang.String]] = js.undefined
  /** [Method] Returns the current value for a key
  		* @param name String The key name
  		* @param defaultValue Object A default value to return if the key's value is not found
  		* @returns Object The state data
  		*/
  var get: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[java.lang.String], /* defaultValue */ js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Config Option] (String) */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value for a key
  		* @param name String The key name
  		* @param value Object The value to set
  		*/
  var set: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
}

