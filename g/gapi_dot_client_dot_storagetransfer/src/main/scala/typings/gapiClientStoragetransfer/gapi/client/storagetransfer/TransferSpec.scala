package typings.gapiClientStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferSpec extends js.Object {
  /** An AWS S3 data source. */
  var awsS3DataSource: js.UndefOr[AwsS3Data] = js.native
  /** A Google Cloud Storage data sink. */
  var gcsDataSink: js.UndefOr[GcsData] = js.native
  /** A Google Cloud Storage data source. */
  var gcsDataSource: js.UndefOr[GcsData] = js.native
  /** An HTTP URL data source. */
  var httpDataSource: js.UndefOr[HttpData] = js.native
  /**
    * Only objects that satisfy these object conditions are included in the set
    * of data source and data sink objects.  Object conditions based on
    * objects' `lastModificationTime` do not exclude objects in a data sink.
    */
  var objectConditions: js.UndefOr[ObjectConditions] = js.native
  /**
    * If the option `deleteObjectsUniqueInSink` is `true`, object conditions
    * based on objects' `lastModificationTime` are ignored and do not exclude
    * objects in a data source or a data sink.
    */
  var transferOptions: js.UndefOr[TransferOptions] = js.native
}

object TransferSpec {
  @scala.inline
  def apply(): TransferSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferSpec]
  }
  @scala.inline
  implicit class TransferSpecOps[Self <: TransferSpec] (val x: Self) extends AnyVal {
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
    def setAwsS3DataSource(value: AwsS3Data): Self = this.set("awsS3DataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsS3DataSource: Self = this.set("awsS3DataSource", js.undefined)
    @scala.inline
    def setGcsDataSink(value: GcsData): Self = this.set("gcsDataSink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGcsDataSink: Self = this.set("gcsDataSink", js.undefined)
    @scala.inline
    def setGcsDataSource(value: GcsData): Self = this.set("gcsDataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGcsDataSource: Self = this.set("gcsDataSource", js.undefined)
    @scala.inline
    def setHttpDataSource(value: HttpData): Self = this.set("httpDataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpDataSource: Self = this.set("httpDataSource", js.undefined)
    @scala.inline
    def setObjectConditions(value: ObjectConditions): Self = this.set("objectConditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectConditions: Self = this.set("objectConditions", js.undefined)
    @scala.inline
    def setTransferOptions(value: TransferOptions): Self = this.set("transferOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferOptions: Self = this.set("transferOptions", js.undefined)
  }
  
}

