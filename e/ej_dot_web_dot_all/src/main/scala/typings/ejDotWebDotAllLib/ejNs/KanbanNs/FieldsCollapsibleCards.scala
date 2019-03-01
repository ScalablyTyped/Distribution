package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldsCollapsibleCards extends js.Object {
  /** It is used to specify the collapsible card's field mapping.
    * @Default {null}
    */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /** It is used to specify the collapsible card's key mapping which is available in datasource value of field mapped in collapsibleCards.field.
    * @Default {null}
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
}

object FieldsCollapsibleCards {
  @scala.inline
  def apply(field: java.lang.String = null, key: java.lang.String = null): FieldsCollapsibleCards = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[FieldsCollapsibleCards]
  }
}

