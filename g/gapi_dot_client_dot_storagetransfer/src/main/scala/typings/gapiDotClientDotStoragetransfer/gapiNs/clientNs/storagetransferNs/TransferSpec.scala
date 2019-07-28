package typings.gapiDotClientDotStoragetransfer.gapiNs.clientNs.storagetransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferSpec extends js.Object {
  /** An AWS S3 data source. */
  var awsS3DataSource: js.UndefOr[AwsS3Data] = js.undefined
  /** A Google Cloud Storage data sink. */
  var gcsDataSink: js.UndefOr[GcsData] = js.undefined
  /** A Google Cloud Storage data source. */
  var gcsDataSource: js.UndefOr[GcsData] = js.undefined
  /** An HTTP URL data source. */
  var httpDataSource: js.UndefOr[HttpData] = js.undefined
  /**
    * Only objects that satisfy these object conditions are included in the set
    * of data source and data sink objects.  Object conditions based on
    * objects' `lastModificationTime` do not exclude objects in a data sink.
    */
  var objectConditions: js.UndefOr[ObjectConditions] = js.undefined
  /**
    * If the option `deleteObjectsUniqueInSink` is `true`, object conditions
    * based on objects' `lastModificationTime` are ignored and do not exclude
    * objects in a data source or a data sink.
    */
  var transferOptions: js.UndefOr[TransferOptions] = js.undefined
}

object TransferSpec {
  @scala.inline
  def apply(
    awsS3DataSource: AwsS3Data = null,
    gcsDataSink: GcsData = null,
    gcsDataSource: GcsData = null,
    httpDataSource: HttpData = null,
    objectConditions: ObjectConditions = null,
    transferOptions: TransferOptions = null
  ): TransferSpec = {
    val __obj = js.Dynamic.literal()
    if (awsS3DataSource != null) __obj.updateDynamic("awsS3DataSource")(awsS3DataSource)
    if (gcsDataSink != null) __obj.updateDynamic("gcsDataSink")(gcsDataSink)
    if (gcsDataSource != null) __obj.updateDynamic("gcsDataSource")(gcsDataSource)
    if (httpDataSource != null) __obj.updateDynamic("httpDataSource")(httpDataSource)
    if (objectConditions != null) __obj.updateDynamic("objectConditions")(objectConditions)
    if (transferOptions != null) __obj.updateDynamic("transferOptions")(transferOptions)
    __obj.asInstanceOf[TransferSpec]
  }
}

