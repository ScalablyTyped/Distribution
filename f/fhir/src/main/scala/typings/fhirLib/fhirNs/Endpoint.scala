package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The technical details of an endpoint that can be used for electronic services
  */
trait Endpoint extends DomainResource {
  /**
    * Contains extended information for property 'address'.
    */
  var _address: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'header'.
    */
  var _header: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'payloadMimeType'.
    */
  var _payloadMimeType: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * The technical base address for connecting to this endpoint
    */
  var address: uri
  /**
    * Protocol/Profile/Standard to be used with this endpoint connection
    */
  var connectionType: Coding
  /**
    * Contact details for source (e.g. troubleshooting)
    */
  var contact: js.UndefOr[js.Array[ContactPoint]] = js.undefined
  /**
    * Usage depends on the channel type
    */
  var header: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Identifies this endpoint across multiple systems
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Organization that manages this endpoint (may not be the organization that exposes the endpoint)
    */
  var managingOrganization: js.UndefOr[Reference] = js.undefined
  /**
    * A name that this endpoint can be identified by
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Mimetype to send. If not specified, the content could be anything (including no payload, if the connectionType defined this)
    */
  var payloadMimeType: js.UndefOr[js.Array[code]] = js.undefined
  /**
    * The type of content that may be used at this endpoint (e.g. XDS Discharge summaries)
    */
  var payloadType: js.Array[CodeableConcept]
  /**
    * Interval the endpoint is expected to be operational
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * active | suspended | error | off | entered-in-error | test
    */
  var status: code
}

