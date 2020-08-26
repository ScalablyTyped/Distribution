package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This contains item&#39;s status and any errors.
  */
@js.native
trait SchemaItemStatus extends js.Object {
  /**
    * Status code.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * Error details in case the item is in ERROR state.
    */
  var processingErrors: js.UndefOr[js.Array[SchemaProcessingError]] = js.native
  /**
    * Repository error reported by connector.
    */
  var repositoryErrors: js.UndefOr[js.Array[SchemaRepositoryError]] = js.native
}

object SchemaItemStatus {
  @scala.inline
  def apply(): SchemaItemStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaItemStatus]
  }
  @scala.inline
  implicit class SchemaItemStatusOps[Self <: SchemaItemStatus] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setProcessingErrorsVarargs(value: SchemaProcessingError*): Self = this.set("processingErrors", js.Array(value :_*))
    @scala.inline
    def setProcessingErrors(value: js.Array[SchemaProcessingError]): Self = this.set("processingErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessingErrors: Self = this.set("processingErrors", js.undefined)
    @scala.inline
    def setRepositoryErrorsVarargs(value: SchemaRepositoryError*): Self = this.set("repositoryErrors", js.Array(value :_*))
    @scala.inline
    def setRepositoryErrors(value: js.Array[SchemaRepositoryError]): Self = this.set("repositoryErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepositoryErrors: Self = this.set("repositoryErrors", js.undefined)
  }
  
}

