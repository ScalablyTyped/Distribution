package typings.gapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSource extends js.Object {
  /** Information about an application which feeds sensor data into the platform. */
  var application: js.UndefOr[Application] = js.undefined
  var dataQualityStandard: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A unique identifier for the data stream produced by this data source. The identifier includes:
    *
    *
    * - The physical device's manufacturer, model, and serial number (UID).
    * - The application's package name or name. Package name is used when the data source was created by an Android application. The developer project number
    * is used when the data source was created by a REST client.
    * - The data source's type.
    * - The data source's stream name.  Note that not all attributes of the data source are used as part of the stream identifier. In particular, the version
    * of the hardware/the application isn't used. This allows us to preserve the same stream through version updates. This also means that two DataSource
    * objects may represent the same data stream even if they're not equal.
    *
    * The exact format of the data stream ID created by an Android application is:
    * type:dataType.name:application.packageName:device.manufacturer:device.model:device.uid:dataStreamName
    *
    * The exact format of the data stream ID created by a REST client is: type:dataType.name:developer project
    * number:device.manufacturer:device.model:device.uid:dataStreamName
    *
    * When any of the optional fields that comprise of the data stream ID are blank, they will be omitted from the data stream ID. The minimum viable data
    * stream ID would be: type:dataType.name:developer project number
    *
    * Finally, the developer project number is obfuscated when read by any REST or Android client that did not create the data source. Only the data source
    * creator will see the developer project number in clear and normal form.
    */
  var dataStreamId: js.UndefOr[String] = js.undefined
  /**
    * The stream name uniquely identifies this particular data source among other data sources of the same type from the same underlying producer. Setting
    * the stream name is optional, but should be done whenever an application exposes two streams for the same data type, or when a device has two equivalent
    * sensors.
    */
  var dataStreamName: js.UndefOr[String] = js.undefined
  /** The data type defines the schema for a stream of data being collected by, inserted into, or queried from the Fitness API. */
  var dataType: js.UndefOr[DataType] = js.undefined
  /** Representation of an integrated device (such as a phone or a wearable) that can hold sensors. */
  var device: js.UndefOr[Device] = js.undefined
  /** An end-user visible name for this data source. */
  var name: js.UndefOr[String] = js.undefined
  /** A constant describing the type of this data source. Indicates whether this data source produces raw or derived data. */
  var `type`: js.UndefOr[String] = js.undefined
}

object DataSource {
  @scala.inline
  def apply(
    application: Application = null,
    dataQualityStandard: js.Array[String] = null,
    dataStreamId: String = null,
    dataStreamName: String = null,
    dataType: DataType = null,
    device: Device = null,
    name: String = null,
    `type`: String = null
  ): DataSource = {
    val __obj = js.Dynamic.literal()
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (dataQualityStandard != null) __obj.updateDynamic("dataQualityStandard")(dataQualityStandard.asInstanceOf[js.Any])
    if (dataStreamId != null) __obj.updateDynamic("dataStreamId")(dataStreamId.asInstanceOf[js.Any])
    if (dataStreamName != null) __obj.updateDynamic("dataStreamName")(dataStreamName.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSource]
  }
}

