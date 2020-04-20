package typings.devextreme.mod.DevExpress

import typings.devextreme.mod.DevExpress.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataHelperMixin extends js.Object {
  /** @name DataHelperMixin.getDataSource() */
  def getDataSource(): DataSource
}

object DataHelperMixin {
  @scala.inline
  def apply(getDataSource: () => DataSource): DataHelperMixin = {
    val __obj = js.Dynamic.literal(getDataSource = js.Any.fromFunction0(getDataSource))
    __obj.asInstanceOf[DataHelperMixin]
  }
}

