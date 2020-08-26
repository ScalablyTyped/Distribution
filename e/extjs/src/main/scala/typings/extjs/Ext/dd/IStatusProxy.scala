package typings.extjs.Ext.dd

import typings.extjs.Ext.Array
import typings.extjs.Ext.IComponent
import typings.extjs.Ext.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStatusProxy extends IComponent {
  /** [Config Option] (String) */
  var dropAllowed: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var dropNotAllowed: js.UndefOr[String] = js.native
  /** [Method] Returns the ghost element
    * @returns Ext.Element el
    */
  var getGhost: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Method] Causes the proxy to return to its position of origin via an animation
    * @param xy Number[] The XY position of the element ([x, y])
    * @param callback Function The function to call after the repair is complete.
    * @param scope Object The scope (this reference) in which the callback function is executed. Defaults to the browser window.
    */
  var repair: js.UndefOr[
    js.Function3[
      /* xy */ js.UndefOr[Array], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Resets the status indicator to the default dropNotAllowed value
    * @param clearGhost Boolean True to also remove all content from the ghost, false to preserve it
    */
  var reset: js.UndefOr[js.Function1[/* clearGhost */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Updates the proxy s visual element to indicate the status of whether or not drop is allowed over the current target e
    * @param cssClass String The css class for the new drop status indicator image
    */
  var setStatus: js.UndefOr[js.Function1[/* cssClass */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Stops the repair animation if it s currently running */
  var stop: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Force the Layer to sync its shadow and shim positions to the element */
  var sync: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Updates the contents of the ghost element
    * @param html String/HTMLElement The html that will replace the current innerHTML of the ghost element, or a DOM node to append as the child of the ghost element (in which case the innerHTML will be cleared first).
    */
  @JSName("update")
  var update_IStatusProxy: js.UndefOr[js.Function1[/* html */ js.UndefOr[js.Any], Unit]] = js.native
}

object IStatusProxy {
  @scala.inline
  def apply(): IStatusProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStatusProxy]
  }
  @scala.inline
  implicit class IStatusProxyOps[Self <: IStatusProxy] (val x: Self) extends AnyVal {
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
    def setDropAllowed(value: String): Self = this.set("dropAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropAllowed: Self = this.set("dropAllowed", js.undefined)
    @scala.inline
    def setDropNotAllowed(value: String): Self = this.set("dropNotAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropNotAllowed: Self = this.set("dropNotAllowed", js.undefined)
    @scala.inline
    def setGetGhost(value: () => IElement): Self = this.set("getGhost", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetGhost: Self = this.set("getGhost", js.undefined)
    @scala.inline
    def setRepair(
      value: (/* xy */ js.UndefOr[Array], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("repair", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRepair: Self = this.set("repair", js.undefined)
    @scala.inline
    def setReset(value: /* clearGhost */ js.UndefOr[Boolean] => Unit): Self = this.set("reset", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    @scala.inline
    def setSetStatus(value: /* cssClass */ js.UndefOr[String] => Unit): Self = this.set("setStatus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetStatus: Self = this.set("setStatus", js.undefined)
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
    @scala.inline
    def setSync(value: () => Unit): Self = this.set("sync", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
    @scala.inline
    def setUpdate(value: /* html */ js.UndefOr[js.Any] => Unit): Self = this.set("update", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

