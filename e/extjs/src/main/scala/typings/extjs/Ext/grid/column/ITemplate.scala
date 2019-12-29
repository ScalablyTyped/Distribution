package typings.extjs.Ext.grid.column

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITemplate extends IColumn {
  /** [Method] When defined this will take precedence over the renderer config
  		* @param value Object
  		* @param meta Object
  		* @param record Object
  		*/
  @JSName("defaultRenderer")
  var defaultRenderer_ITemplate: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* meta */ js.UndefOr[js.Any], 
      /* record */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
}

object ITemplate {
  @scala.inline
  def apply(
    IColumn: IColumn = null,
    defaultRenderer: (/* value */ js.UndefOr[js.Any], /* meta */ js.UndefOr[js.Any], /* record */ js.UndefOr[js.Any]) => Unit = null
  ): ITemplate = {
    val __obj = js.Dynamic.literal()
    if (IColumn != null) js.Dynamic.global.Object.assign(__obj, IColumn)
    if (defaultRenderer != null) __obj.updateDynamic("defaultRenderer")(js.Any.fromFunction3(defaultRenderer))
    __obj.asInstanceOf[ITemplate]
  }
}

