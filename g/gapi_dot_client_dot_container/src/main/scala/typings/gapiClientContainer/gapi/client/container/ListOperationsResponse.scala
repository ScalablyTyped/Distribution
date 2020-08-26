package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOperationsResponse extends js.Object {
  /**
    * If any zones are listed here, the list of operations returned
    * may be missing the operations from those zones.
    */
  var missingZones: js.UndefOr[js.Array[String]] = js.native
  /** A list of operations in the project in the specified zone. */
  var operations: js.UndefOr[js.Array[Operation]] = js.native
}

object ListOperationsResponse {
  @scala.inline
  def apply(): ListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOperationsResponse]
  }
  @scala.inline
  implicit class ListOperationsResponseOps[Self <: ListOperationsResponse] (val x: Self) extends AnyVal {
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
    def setMissingZonesVarargs(value: String*): Self = this.set("missingZones", js.Array(value :_*))
    @scala.inline
    def setMissingZones(value: js.Array[String]): Self = this.set("missingZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMissingZones: Self = this.set("missingZones", js.undefined)
    @scala.inline
    def setOperationsVarargs(value: Operation*): Self = this.set("operations", js.Array(value :_*))
    @scala.inline
    def setOperations(value: js.Array[Operation]): Self = this.set("operations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperations: Self = this.set("operations", js.undefined)
  }
  
}

