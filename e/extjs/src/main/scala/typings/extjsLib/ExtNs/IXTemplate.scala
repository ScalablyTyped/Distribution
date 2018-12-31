package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXTemplate extends ITemplate {
  /** [Method] Appends the result of this template to the provided output array
  		* @param values Object
  		* @param out Object
  		* @param parent Object
  		* @returns Array The given out array.
  		*/
  @JSName("applyOut")
  var applyOut_IXTemplate: js.UndefOr[
    js.Function3[
      /* values */ js.UndefOr[js.Any], 
      /* out */ js.UndefOr[js.Any], 
      /* parent */ js.UndefOr[js.Any], 
      Array
    ]
  ] = js.undefined
  /** [Config Option] (String/Array) */
  var definitions: js.UndefOr[js.Any] = js.undefined
}

