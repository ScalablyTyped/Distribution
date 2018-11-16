package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IMemento
  extends extjsLib.ExtNs.IBase {
  /** [Method] Captures the specified properties from the target object in this memento
  		* @param props String/String[] The property or array of properties to capture.
  		* @param target Object The object from which to capture properties.
  		*/
  var capture: js.UndefOr[
    js.Function2[/* props */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Removes the specified properties from this memento
  		* @param props String/String[] The property or array of properties to remove.
  		*/
  var remove: js.UndefOr[js.Function1[/* props */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Restores the specified properties from this memento to the target object
  		* @param props String/String[] The property or array of properties to restore.
  		* @param clear Boolean True to remove the restored properties from this memento or false to keep them (default is true).
  		* @param target Object The object to which to restore properties.
  		*/
  var restore: js.UndefOr[
    js.Function3[
      /* props */ js.UndefOr[js.Any], 
      /* clear */ js.UndefOr[scala.Boolean], 
      /* target */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Restores all captured properties in this memento to the target object
  		* @param clear Boolean True to remove the restored properties from this memento or false to keep them (default is true).
  		* @param target Object The object to which to restore properties.
  		*/
  var restoreAll: js.UndefOr[
    js.Function2[/* clear */ js.UndefOr[scala.Boolean], /* target */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Property] (Object) */
  var target: js.UndefOr[js.Any] = js.undefined
}

