package typings.dynogels.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentCollection extends js.Object {
  var ConsumedCapacity: typings.dynogels.mod.ConsumedCapacity = js.native
  var Count: Double = js.native
  var Items: js.Array[Document] = js.native
  var LastEvaluatedKey: js.UndefOr[js.Any] = js.native
  var ScannedCount: Double = js.native
}

object DocumentCollection {
  @scala.inline
  def apply(ConsumedCapacity: ConsumedCapacity, Count: Double, Items: js.Array[Document], ScannedCount: Double): DocumentCollection = {
    val __obj = js.Dynamic.literal(ConsumedCapacity = ConsumedCapacity.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any], ScannedCount = ScannedCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentCollection]
  }
  @scala.inline
  implicit class DocumentCollectionOps[Self <: DocumentCollection] (val x: Self) extends AnyVal {
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
    def setConsumedCapacity(value: ConsumedCapacity): Self = this.set("ConsumedCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: Document*): Self = this.set("Items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Document]): Self = this.set("Items", value.asInstanceOf[js.Any])
    @scala.inline
    def setScannedCount(value: Double): Self = this.set("ScannedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastEvaluatedKey(value: js.Any): Self = this.set("LastEvaluatedKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastEvaluatedKey: Self = this.set("LastEvaluatedKey", js.undefined)
  }
  
}

