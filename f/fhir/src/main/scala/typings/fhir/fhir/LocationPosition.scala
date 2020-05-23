package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The absolute geographic location
  */
trait LocationPosition extends BackboneElement {
  /**
    * Contains extended information for property 'altitude'.
    */
  var _altitude: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'latitude'.
    */
  var _latitude: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'longitude'.
    */
  var _longitude: js.UndefOr[Element] = js.undefined
  /**
    * Altitude with WGS84 datum
    */
  var altitude: js.UndefOr[decimal] = js.undefined
  /**
    * Latitude with WGS84 datum
    */
  var latitude: decimal
  /**
    * Longitude with WGS84 datum
    */
  var longitude: decimal
}

object LocationPosition {
  @scala.inline
  def apply(
    latitude: decimal,
    longitude: decimal,
    _altitude: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _latitude: Element = null,
    _longitude: Element = null,
    altitude: js.UndefOr[decimal] = js.undefined,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): LocationPosition = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    if (_altitude != null) __obj.updateDynamic("_altitude")(_altitude.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_latitude != null) __obj.updateDynamic("_latitude")(_latitude.asInstanceOf[js.Any])
    if (_longitude != null) __obj.updateDynamic("_longitude")(_longitude.asInstanceOf[js.Any])
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationPosition]
  }
}

