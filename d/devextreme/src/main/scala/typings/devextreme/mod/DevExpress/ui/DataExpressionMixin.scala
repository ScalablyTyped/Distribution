package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataExpressionMixin extends js.Object {
  /** @name DataHelperMixin.getDataSource() */
  def getDataSource(): DataSource
}

object DataExpressionMixin {
  @scala.inline
  def apply(getDataSource: () => DataSource): DataExpressionMixin = {
    val __obj = js.Dynamic.literal(getDataSource = js.Any.fromFunction0(getDataSource))
  
    __obj.asInstanceOf[DataExpressionMixin]
  }
}

