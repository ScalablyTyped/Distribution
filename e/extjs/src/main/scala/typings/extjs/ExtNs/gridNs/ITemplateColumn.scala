package typings.extjs.ExtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITemplateColumn
  extends typings.extjs.ExtNs.gridNs.columnNs.IColumn {
  /** [Method] When defined this will take precedence over the renderer config
  		* @param value Object
  		* @param meta Object
  		* @param record Object
  		*/
  @JSName("defaultRenderer")
  var defaultRenderer_ITemplateColumn: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* meta */ js.UndefOr[js.Any], 
      /* record */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
}

object ITemplateColumn {
  @scala.inline
  def apply(
    IColumn: typings.extjs.ExtNs.gridNs.columnNs.IColumn = null,
    defaultRenderer: (/* value */ js.UndefOr[js.Any], /* meta */ js.UndefOr[js.Any], /* record */ js.UndefOr[js.Any]) => Unit = null,
    tpl: js.Any = null
  ): ITemplateColumn = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IColumn)
    if (defaultRenderer != null) __obj.updateDynamic("defaultRenderer")(js.Any.fromFunction3(defaultRenderer))
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    __obj.asInstanceOf[ITemplateColumn]
  }
}

