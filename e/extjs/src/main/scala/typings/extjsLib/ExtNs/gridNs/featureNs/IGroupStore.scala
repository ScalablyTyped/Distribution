package typings
package extjsLib.ExtNs.gridNs.featureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGroupStore
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Method] Get the index within the entire dataset
  		* @param record Ext.data.Model The Ext.data.Model object to find.
  		* @returns Number The index of the passed Record. Returns -1 if not found.
  		*/
  var indexOfTotal: js.UndefOr[
    js.Function1[/* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], scala.Double]
  ] = js.undefined
}

