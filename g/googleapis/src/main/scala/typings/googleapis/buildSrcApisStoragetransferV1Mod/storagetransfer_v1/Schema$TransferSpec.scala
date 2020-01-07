package typings.googleapis.buildSrcApisStoragetransferV1Mod.storagetransfer_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for running a transfer.
  */
@js.native
trait Schema$TransferSpec extends js.Object {
  /**
    * An AWS S3 data source.
    */
  var awsS3DataSource: js.UndefOr[Schema$AwsS3Data] = js.native
  /**
    * A Google Cloud Storage data sink.
    */
  var gcsDataSink: js.UndefOr[Schema$GcsData] = js.native
  /**
    * A Google Cloud Storage data source.
    */
  var gcsDataSource: js.UndefOr[Schema$GcsData] = js.native
  /**
    * An HTTP URL data source.
    */
  var httpDataSource: js.UndefOr[Schema$HttpData] = js.native
  /**
    * Only objects that satisfy these object conditions are included in the set
    * of data source and data sink objects.  Object conditions based on
    * objects&#39; `lastModificationTime` do not exclude objects in a data
    * sink.
    */
  var objectConditions: js.UndefOr[Schema$ObjectConditions] = js.native
  /**
    * If the option `deleteObjectsUniqueInSink` is `true`, object conditions
    * based on objects&#39; `lastModificationTime` are ignored and do not
    * exclude objects in a data source or a data sink.
    */
  var transferOptions: js.UndefOr[Schema$TransferOptions] = js.native
}

object Schema$TransferSpec {
  @scala.inline
  def apply(
    awsS3DataSource: Schema$AwsS3Data = null,
    gcsDataSink: Schema$GcsData = null,
    gcsDataSource: Schema$GcsData = null,
    httpDataSource: Schema$HttpData = null,
    objectConditions: Schema$ObjectConditions = null,
    transferOptions: Schema$TransferOptions = null
  ): Schema$TransferSpec = {
    val __obj = js.Dynamic.literal()
    if (awsS3DataSource != null) __obj.updateDynamic("awsS3DataSource")(awsS3DataSource.asInstanceOf[js.Any])
    if (gcsDataSink != null) __obj.updateDynamic("gcsDataSink")(gcsDataSink.asInstanceOf[js.Any])
    if (gcsDataSource != null) __obj.updateDynamic("gcsDataSource")(gcsDataSource.asInstanceOf[js.Any])
    if (httpDataSource != null) __obj.updateDynamic("httpDataSource")(httpDataSource.asInstanceOf[js.Any])
    if (objectConditions != null) __obj.updateDynamic("objectConditions")(objectConditions.asInstanceOf[js.Any])
    if (transferOptions != null) __obj.updateDynamic("transferOptions")(transferOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TransferSpec]
  }
}

