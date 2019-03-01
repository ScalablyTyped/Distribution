package typings
package elementDashResizeDashDetectorLib.elementDashResizeDashDetectorMod.elementResizeDetectorMakerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErdmOptions extends js.Object {
  /**
    * Determines if listeners should be called when they are getting added.
    * If true, the listener is guaranteed to be called when it has been added.
    * If false, the listener will not be guarenteed to be called when
    * it has been added (does not prevent it from being called).
    *
    * @default true
    */
  var callOnAdd: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set to true, the the system will report debug messages as default
    * for the listenTo method.
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A custom id handler that is responsible for generating,
    * setting and retrieving id's for elements.
    * If not provided, a default id handler will be used.
    */
  var idHandler: js.UndefOr[IdHandlerProps] = js.undefined
  /**
    * A custom reporter that handles reporting logs, warnings and errors.
    * If not provided, a default id handler will be used.
    * If set to false, then nothing will be reported.
    */
  var reporter: js.UndefOr[ReporterProps] = js.undefined
  var strategy: js.UndefOr[
    elementDashResizeDashDetectorLib.elementDashResizeDashDetectorLibStrings.scroll | elementDashResizeDashDetectorLib.elementDashResizeDashDetectorLibStrings.`object`
  ] = js.undefined
}

object ErdmOptions {
  @scala.inline
  def apply(
    callOnAdd: js.UndefOr[scala.Boolean] = js.undefined,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    idHandler: IdHandlerProps = null,
    reporter: ReporterProps = null,
    strategy: elementDashResizeDashDetectorLib.elementDashResizeDashDetectorLibStrings.scroll | elementDashResizeDashDetectorLib.elementDashResizeDashDetectorLibStrings.`object` = null
  ): ErdmOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(callOnAdd)) __obj.updateDynamic("callOnAdd")(callOnAdd)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (idHandler != null) __obj.updateDynamic("idHandler")(idHandler)
    if (reporter != null) __obj.updateDynamic("reporter")(reporter)
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErdmOptions]
  }
}

