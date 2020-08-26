package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client column.
  */
@js.native
trait ASPxClientTreeListColumn extends js.Object {
  /**
    * Gets the name of the database field assigned to the current column.
    */
  var fieldName: String = js.native
  /**
    * Gets the column's position within the collection.
    */
  var index: Double = js.native
  /**
    * Gets the name that uniquely identifies the column.
    */
  var name: String = js.native
}

object ASPxClientTreeListColumn {
  @scala.inline
  def apply(fieldName: String, index: Double, name: String): ASPxClientTreeListColumn = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListColumn]
  }
  @scala.inline
  implicit class ASPxClientTreeListColumnOps[Self <: ASPxClientTreeListColumn] (val x: Self) extends AnyVal {
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
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

