package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGrouper extends ISorter {
  /** [Method] Returns the value for grouping to be used
  		* @param instance Ext.data.Model The Model instance
  		* @returns String The group string for this model
  		*/
  var getGroupString: js.UndefOr[
    js.Function1[/* instance */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], java.lang.String]
  ] = js.undefined
}

