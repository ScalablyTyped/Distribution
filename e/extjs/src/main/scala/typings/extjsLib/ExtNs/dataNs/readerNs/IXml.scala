package typings
package extjsLib.ExtNs.dataNs.readerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IXml extends IReader {
  /** [Method] Normalizes the data object
  		* @param data Object The raw data object
  		* @returns Object The documentElement property of the data object if present, or the same object if not.
  		*/
  var getData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (String) */
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var record: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Object) */
  var xmlData: js.UndefOr[js.Any] = js.undefined
}

