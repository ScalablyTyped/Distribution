package typings.extjs.Ext.dd

import typings.extjs.Ext.Array
import typings.extjs.Ext.IComponent
import typings.extjs.Ext.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStatusProxy extends IComponent {
  /** [Config Option] (String) */
  var dropAllowed: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var dropNotAllowed: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the ghost element
  		* @returns Ext.Element el
  		*/
  var getGhost: js.UndefOr[js.Function0[IElement]] = js.undefined
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
  ] = js.undefined
  /** [Method] Resets the status indicator to the default dropNotAllowed value
  		* @param clearGhost Boolean True to also remove all content from the ghost, false to preserve it
  		*/
  var reset: js.UndefOr[js.Function1[/* clearGhost */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Updates the proxy s visual element to indicate the status of whether or not drop is allowed over the current target e
  		* @param cssClass String The css class for the new drop status indicator image
  		*/
  var setStatus: js.UndefOr[js.Function1[/* cssClass */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Stops the repair animation if it s currently running */
  var stop: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Force the Layer to sync its shadow and shim positions to the element */
  var sync: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Updates the contents of the ghost element
  		* @param html String/HTMLElement The html that will replace the current innerHTML of the ghost element, or a DOM node to append as the child of the ghost element (in which case the innerHTML will be cleared first).
  		*/
  @JSName("update")
  var update_IStatusProxy: js.UndefOr[js.Function1[/* html */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IStatusProxy {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    dropAllowed: java.lang.String = null,
    dropNotAllowed: java.lang.String = null,
    getGhost: () => IElement = null,
    repair: (/* xy */ js.UndefOr[Array], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    reset: /* clearGhost */ js.UndefOr[Boolean] => Unit = null,
    setStatus: /* cssClass */ js.UndefOr[java.lang.String] => Unit = null,
    stop: () => Unit = null,
    sync: () => Unit = null,
    update: /* html */ js.UndefOr[js.Any] => Unit = null
  ): IStatusProxy = {
    val __obj = js.Dynamic.literal()
    if (IComponent != null) js.Dynamic.global.Object.assign(__obj, IComponent)
    if (dropAllowed != null) __obj.updateDynamic("dropAllowed")(dropAllowed.asInstanceOf[js.Any])
    if (dropNotAllowed != null) __obj.updateDynamic("dropNotAllowed")(dropNotAllowed.asInstanceOf[js.Any])
    if (getGhost != null) __obj.updateDynamic("getGhost")(js.Any.fromFunction0(getGhost))
    if (repair != null) __obj.updateDynamic("repair")(js.Any.fromFunction3(repair))
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction1(reset))
    if (setStatus != null) __obj.updateDynamic("setStatus")(js.Any.fromFunction1(setStatus))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction0(stop))
    if (sync != null) __obj.updateDynamic("sync")(js.Any.fromFunction0(sync))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1(update))
    __obj.asInstanceOf[IStatusProxy]
  }
}

