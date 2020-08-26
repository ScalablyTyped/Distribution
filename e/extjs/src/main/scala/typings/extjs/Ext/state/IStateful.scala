package typings.extjs.Ext.state

import typings.extjs.Ext.Array
import typings.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStateful extends IObservable {
  /** [Method] Add events that will trigger the state to be saved
    * @param events String/String[] The event name or an array of event names.
    */
  var addStateEvents: js.UndefOr[js.Function1[/* events */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Applies the state to the object
    * @param state Object The state
    */
  var applyState: js.UndefOr[js.Function1[/* state */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Destroys this stateful object  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Gets the current state of the object
    * @returns Object The current state
    */
  var getState: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Number) */
  var saveDelay: js.UndefOr[Double] = js.native
  /** [Method] Conditionally saves a single property from this object to the given state object
    * @param propName String The name of the property to save.
    * @param state Object The state object in to which to save the property.
    * @param stateName String The name to use for the property in state.
    * @returns Boolean True if the property was saved, false if not.
    */
  var savePropToState: js.UndefOr[
    js.Function3[
      /* propName */ js.UndefOr[String], 
      /* state */ js.UndefOr[js.Any], 
      /* stateName */ js.UndefOr[String], 
      Boolean
    ]
  ] = js.native
  /** [Method] Gathers additional named properties of the instance and adds their current values to the passed state object
    * @param propNames String/String[] The name (or array of names) of the property to save.
    * @param state Object The state object in to which to save the property values.
    * @returns Object state
    */
  var savePropsToState: js.UndefOr[
    js.Function2[/* propNames */ js.UndefOr[js.Any], /* state */ js.UndefOr[js.Any], _]
  ] = js.native
  /** [Method] Saves the state of the object to the persistence store  */
  var saveState: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String[]) */
  var stateEvents: js.UndefOr[Array] = js.native
  /** [Config Option] (String) */
  var stateId: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var stateful: js.UndefOr[Boolean] = js.native
}

object IStateful {
  @scala.inline
  def apply(): IStateful = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStateful]
  }
  @scala.inline
  implicit class IStatefulOps[Self <: IStateful] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddStateEvents(value: /* events */ js.UndefOr[js.Any] => Unit): Self = this.set("addStateEvents", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddStateEvents: Self = this.set("addStateEvents", js.undefined)
    @scala.inline
    def setApplyState(value: /* state */ js.UndefOr[js.Any] => Unit): Self = this.set("applyState", js.Any.fromFunction1(value))
    @scala.inline
    def deleteApplyState: Self = this.set("applyState", js.undefined)
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setGetState(value: () => _): Self = this.set("getState", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetState: Self = this.set("getState", js.undefined)
    @scala.inline
    def setSaveDelay(value: Double): Self = this.set("saveDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveDelay: Self = this.set("saveDelay", js.undefined)
    @scala.inline
    def setSavePropToState(
      value: (/* propName */ js.UndefOr[String], /* state */ js.UndefOr[js.Any], /* stateName */ js.UndefOr[String]) => Boolean
    ): Self = this.set("savePropToState", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSavePropToState: Self = this.set("savePropToState", js.undefined)
    @scala.inline
    def setSavePropsToState(value: (/* propNames */ js.UndefOr[js.Any], /* state */ js.UndefOr[js.Any]) => _): Self = this.set("savePropsToState", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSavePropsToState: Self = this.set("savePropsToState", js.undefined)
    @scala.inline
    def setSaveState(value: () => Unit): Self = this.set("saveState", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSaveState: Self = this.set("saveState", js.undefined)
    @scala.inline
    def setStateEvents(value: Array): Self = this.set("stateEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateEvents: Self = this.set("stateEvents", js.undefined)
    @scala.inline
    def setStateId(value: String): Self = this.set("stateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateId: Self = this.set("stateId", js.undefined)
    @scala.inline
    def setStateful(value: Boolean): Self = this.set("stateful", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateful: Self = this.set("stateful", js.undefined)
  }
  
}

