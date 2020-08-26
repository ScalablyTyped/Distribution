package typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This resource represents a long-running operation that is the result of a
  * network API call.
  */
@js.native
trait SchemaOperation extends js.Object {
  /**
    * If the value is `false`, it means the operation is still in progress. If
    * `true`, the operation is completed, and either `error` or `response` is
    * available.
    */
  var done: js.UndefOr[Boolean] = js.native
  /**
    * The error result of the operation in case of failure or cancellation.
    */
  var error: js.UndefOr[SchemaStatus] = js.native
  /**
    * Service-specific metadata associated with the operation.  It typically
    * contains progress information and common metadata such as create time.
    * Some services might not provide such metadata.  Any method that returns a
    * long-running operation should document the metadata type, if any.
    */
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The server-assigned name, which is only unique within the same service
    * that originally returns it. If you use the default HTTP mapping, the
    * `name` should have the format of `operations/some/unique/name`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The normal response of the operation in case of success.  If the original
    * method returns no data on success, such as `Delete`, the response is
    * `google.protobuf.Empty`.  If the original method is standard
    * `Get`/`Create`/`Update`, the response should be the resource.  For other
    * methods, the response should have the type `XxxResponse`, where `Xxx` is
    * the original method name.  For example, if the original method name is
    * `TakeSnapshot()`, the inferred response type is `TakeSnapshotResponse`.
    */
  var response: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SchemaOperation {
  @scala.inline
  def apply(): SchemaOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperation]
  }
  @scala.inline
  implicit class SchemaOperationOps[Self <: SchemaOperation] (val x: Self) extends AnyVal {
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
    def setDone(value: Boolean): Self = this.set("done", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    @scala.inline
    def setError(value: SchemaStatus): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setMetadata(value: StringDictionary[js.Any]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setResponse(value: StringDictionary[js.Any]): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
  }
  
}

