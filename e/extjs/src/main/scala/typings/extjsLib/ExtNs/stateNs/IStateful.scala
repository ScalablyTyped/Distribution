package typings
package extjsLib.ExtNs.stateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IStateful
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Method] Add events that will trigger the state to be saved
  		* @param events String/String[] The event name or an array of event names.
  		*/
  var addStateEvents: js.UndefOr[js.Function1[/* events */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Applies the state to the object
  		* @param state Object The state
  		*/
  var applyState: js.UndefOr[js.Function1[/* state */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Destroys this stateful object  */
  var destroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Gets the current state of the object
  		* @returns Object The current state
  		*/
  var getState: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Number) */
  var saveDelay: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Conditionally saves a single property from this object to the given state object
  		* @param propName String The name of the property to save.
  		* @param state Object The state object in to which to save the property.
  		* @param stateName String The name to use for the property in state.
  		* @returns Boolean True if the property was saved, false if not.
  		*/
  var savePropToState: js.UndefOr[
    js.Function3[
      /* propName */ js.UndefOr[java.lang.String], 
      /* state */ js.UndefOr[js.Any], 
      /* stateName */ js.UndefOr[java.lang.String], 
      scala.Boolean
    ]
  ] = js.undefined
  /** [Method] Gathers additional named properties of the instance and adds their current values to the passed state object
  		* @param propNames String/String[] The name (or array of names) of the property to save.
  		* @param state Object The state object in to which to save the property values.
  		* @returns Object state
  		*/
  var savePropsToState: js.UndefOr[
    js.Function2[/* propNames */ js.UndefOr[js.Any], /* state */ js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] Saves the state of the object to the persistence store  */
  var saveState: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String[]) */
  var stateEvents: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Config Option] (String) */
  var stateId: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var stateful: js.UndefOr[scala.Boolean] = js.undefined
}

