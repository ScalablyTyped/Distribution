package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IIdGenerator
  extends extjsLib.ExtNs.IBase {
  /** [Method] Generates and returns the next id
  		* @returns String The next id.
  		*/
  var generate: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Boolean) */
  var isGenerator: js.UndefOr[scala.Boolean] = js.undefined
}

