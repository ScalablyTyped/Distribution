package typings.extjs.Ext.grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateColumn
  extends typings.extjs.Ext.grid.column.IColumn {
  /** [Method] When defined this will take precedence over the renderer config
  		* @param value Object
  		*/
  @JSName("defaultRenderer")
  var defaultRenderer_IDateColumn: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (String) */
  var format: js.UndefOr[java.lang.String] = js.undefined
}

object IDateColumn {
  @scala.inline
  def apply(
    IColumn: typings.extjs.Ext.grid.column.IColumn = null,
    defaultRenderer: /* value */ js.UndefOr[js.Any] => Unit = null,
    format: java.lang.String = null
  ): IDateColumn = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IColumn)
    if (defaultRenderer != null) __obj.updateDynamic("defaultRenderer")(js.Any.fromFunction1(defaultRenderer))
    if (format != null) __obj.updateDynamic("format")(format)
    __obj.asInstanceOf[IDateColumn]
  }
}

