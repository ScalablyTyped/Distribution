package typings
package extjsLib.ExtNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventDomain
  extends extjsLib.ExtNs.IBase {
  /** [Config Option] (String) */
  var idProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Object) */
  var instances: js.UndefOr[js.Any] = js.undefined
  /** [Method] This method matches the firer of the event the target to the given selector
  		* @param target Object The firer of the event.
  		* @param selector String The selector to which to match the target.
  		* @returns Boolean true if the target matches the selector.
  		*/
  var `match`: js.UndefOr[
    js.Function2[
      /* target */ js.UndefOr[js.Any], 
      /* selector */ js.UndefOr[java.lang.String], 
      scala.Boolean
    ]
  ] = js.undefined
  /** [Method] This method is called by the derived class to monitor fireEvent calls
  		* @param observable Ext.Class The Observable to monitor for events.
  		*/
  var monitor: js.UndefOr[js.Function1[/* observable */ js.UndefOr[extjsLib.ExtNs.IClass], scala.Unit]] = js.undefined
}

