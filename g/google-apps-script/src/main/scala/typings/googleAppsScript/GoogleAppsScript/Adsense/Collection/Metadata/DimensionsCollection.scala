package typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Metadata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DimensionsCollection extends js.Object {
  // List the metadata for the dimensions available to this AdSense account.
  def list(): typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.Metadata = js.native
}

object DimensionsCollection {
  @scala.inline
  def apply(list: () => typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.Metadata): DimensionsCollection = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction0(list))
    __obj.asInstanceOf[DimensionsCollection]
  }
  @scala.inline
  implicit class DimensionsCollectionOps[Self <: DimensionsCollection] (val x: Self) extends AnyVal {
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
    def setList(value: () => typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.Metadata): Self = this.set("list", js.Any.fromFunction0(value))
  }
  
}

