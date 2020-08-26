package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1DatastoreOptions extends js.Object {
  /** The kind to process. */
  var kind: js.UndefOr[GooglePrivacyDlpV2beta1KindExpression] = js.native
  /**
    * A partition ID identifies a grouping of entities. The grouping is always
    * by project and namespace, however the namespace ID may be empty.
    */
  var partitionId: js.UndefOr[GooglePrivacyDlpV2beta1PartitionId] = js.native
  /**
    * Properties to scan. If none are specified, all properties will be scanned
    * by default.
    */
  var projection: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1Projection]] = js.native
}

object GooglePrivacyDlpV2beta1DatastoreOptions {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1DatastoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1DatastoreOptions]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1DatastoreOptionsOps[Self <: GooglePrivacyDlpV2beta1DatastoreOptions] (val x: Self) extends AnyVal {
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
    def setKind(value: GooglePrivacyDlpV2beta1KindExpression): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPartitionId(value: GooglePrivacyDlpV2beta1PartitionId): Self = this.set("partitionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartitionId: Self = this.set("partitionId", js.undefined)
    @scala.inline
    def setProjectionVarargs(value: GooglePrivacyDlpV2beta1Projection*): Self = this.set("projection", js.Array(value :_*))
    @scala.inline
    def setProjection(value: js.Array[GooglePrivacyDlpV2beta1Projection]): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
  }
  
}

