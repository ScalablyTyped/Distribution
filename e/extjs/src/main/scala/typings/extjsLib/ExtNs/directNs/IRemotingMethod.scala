package typings
package extjsLib.ExtNs.directNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IRemotingMethod
  extends extjsLib.ExtNs.IBase {
  /** [Method] Takes the arguments for the Direct function and splits the arguments from the scope and the callback
  		* @param args Array The arguments passed to the direct call
  		* @returns Object An object with 3 properties: args, callback &amp; scope.
  		*/
  var getCallData: js.UndefOr[js.Function1[/* args */ js.UndefOr[extjsLib.ExtNs.Array], _]] = js.undefined
}

