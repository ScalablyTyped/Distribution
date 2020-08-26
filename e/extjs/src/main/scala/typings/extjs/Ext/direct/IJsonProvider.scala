package typings.extjs.Ext.direct

import typings.extjs.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJsonProvider extends IProvider {
  /** [Method] Create an event from a response object
    * @param response Object Response object
    * @returns Ext.direct.Event The event
    */
  var createEvent: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], IEvent]] = js.native
  /** [Method] Creates a set of events based on the XHR response
    * @param response Object The XHR response
    * @returns Ext.direct.Event[] An array of Ext.direct.Event
    */
  var createEvents: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], Array]] = js.native
}

object IJsonProvider {
  @scala.inline
  def apply(): IJsonProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJsonProvider]
  }
  @scala.inline
  implicit class IJsonProviderOps[Self <: IJsonProvider] (val x: Self) extends AnyVal {
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
    def setCreateEvent(value: /* response */ js.UndefOr[js.Any] => IEvent): Self = this.set("createEvent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreateEvent: Self = this.set("createEvent", js.undefined)
    @scala.inline
    def setCreateEvents(value: /* response */ js.UndefOr[js.Any] => Array): Self = this.set("createEvents", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreateEvents: Self = this.set("createEvents", js.undefined)
  }
  
}

