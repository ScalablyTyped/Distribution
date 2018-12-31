package typings
package gapiDotClientDotScriptLib.gapiNs.clientNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionResponse extends js.Object {
  /**
    * The return value of the script function. The type matches the object type
    * returned in Apps Script. Functions called through the Execution API cannot
    * return Apps Script-specific objects (such as a `Document` or a `Calendar`);
    * they can only return primitive types such as a `string`, `number`, `array`,
    * `object`, or `boolean`.
    */
  var result: js.UndefOr[js.Any] = js.undefined
}

