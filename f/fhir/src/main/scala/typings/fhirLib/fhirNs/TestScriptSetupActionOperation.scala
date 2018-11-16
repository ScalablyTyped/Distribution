package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The setup operation to perform
     */

trait TestScriptSetupActionOperation extends BackboneElement {
  /**
           * Contains extended information for property 'accept'.
           */
  var _accept: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'contentType'.
           */
  var _contentType: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'description'.
           */
  var _description: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'destination'.
           */
  var _destination: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'encodeRequestUrl'.
           */
  var _encodeRequestUrl: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'label'.
           */
  var _label: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'origin'.
           */
  var _origin: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'params'.
           */
  var _params: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'requestId'.
           */
  var _requestId: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'resource'.
           */
  var _resource: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'responseId'.
           */
  var _responseId: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'sourceId'.
           */
  var _sourceId: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'targetId'.
           */
  var _targetId: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'url'.
           */
  var _url: js.UndefOr[Element] = js.undefined
  /**
           * xml | json | ttl | none
           */
  var accept: js.UndefOr[code] = js.undefined
  /**
           * xml | json | ttl | none
           */
  var contentType: js.UndefOr[code] = js.undefined
  /**
           * Tracking/reporting operation description
           */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Server responding to the request
           */
  var destination: js.UndefOr[integer] = js.undefined
  /**
           * Whether or not to send the request url in encoded format
           */
  var encodeRequestUrl: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Tracking/logging operation label
           */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Server initiating the request
           */
  var origin: js.UndefOr[integer] = js.undefined
  /**
           * Explicitly defined path parameters
           */
  var params: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Each operation can have one or more header elements
           */
  var requestHeader: js.UndefOr[js.Array[TestScriptSetupActionOperationRequestHeader]] = js.undefined
  /**
           * Fixture Id of mapped request
           */
  var requestId: js.UndefOr[id] = js.undefined
  /**
           * Resource type
           */
  var resource: js.UndefOr[code] = js.undefined
  /**
           * Fixture Id of mapped response
           */
  var responseId: js.UndefOr[id] = js.undefined
  /**
           * Fixture Id of body for PUT and POST requests
           */
  var sourceId: js.UndefOr[id] = js.undefined
  /**
           * Id of fixture used for extracting the [id],  [type], and [vid] for GET requests
           */
  var targetId: js.UndefOr[id] = js.undefined
  /**
           * The operation code type that will be executed
           */
  var `type`: js.UndefOr[Coding] = js.undefined
  /**
           * Request URL
           */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

