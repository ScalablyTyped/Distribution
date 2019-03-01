package typings
package extjsLib.ExtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateColumn
  extends extjsLib.ExtNs.gridNs.columnNs.IColumn {
  /** [Method] When defined this will take precedence over the renderer config
  		* @param value Object
  		*/
  @JSName("defaultRenderer")
  var defaultRenderer_IDateColumn: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var format: js.UndefOr[java.lang.String] = js.undefined
}

object IDateColumn {
  @scala.inline
  def apply(
    IColumn: extjsLib.ExtNs.gridNs.columnNs.IColumn = null,
    defaultRenderer: js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit] = null,
    format: java.lang.String = null
  ): IDateColumn = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IColumn)
    if (defaultRenderer != null) __obj.updateDynamic("defaultRenderer")(defaultRenderer)
    if (format != null) __obj.updateDynamic("format")(format)
    __obj.asInstanceOf[IDateColumn]
  }
}

