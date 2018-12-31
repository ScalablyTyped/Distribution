package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonWriter
  extends extjsLib.ExtNs.dataNs.writerNs.IWriter {
  /** [Config Option] (Boolean) */
  var allowSingle: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var encode: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var expandData: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] The Reader classes support dot delimited data mappings for extracting nested raw data into fields so the writer must
  		* @param data Object
  		*/
  var getExpandedData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var root: js.UndefOr[java.lang.String] = js.undefined
}

