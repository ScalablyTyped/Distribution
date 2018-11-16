package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Request to perform some action on or in regards to an existing resource
     */

trait ProcessRequest extends DomainResource {
  /**
           * Contains extended information for property 'action'.
           */
  var _action: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'created'.
           */
  var _created: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'exclude'.
           */
  var _exclude: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Contains extended information for property 'include'.
           */
  var _include: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Contains extended information for property 'nullify'.
           */
  var _nullify: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'reference'.
           */
  var _reference: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * cancel | poll | reprocess | status
           */
  var action: js.UndefOr[code] = js.undefined
  /**
           * Creation date
           */
  var created: js.UndefOr[dateTime] = js.undefined
  /**
           * Resource type(s) to exclude
           */
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Business Identifier
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * Resource type(s) to include
           */
  var include: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Items to re-adjudicate
           */
  var item: js.UndefOr[js.Array[ProcessRequestItem]] = js.undefined
  /**
           * Remove history
           */
  var nullify: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Responsible organization
           */
  var organization: js.UndefOr[Reference] = js.undefined
  /**
           * Selection period
           */
  var period: js.UndefOr[Period] = js.undefined
  /**
           * Responsible practitioner
           */
  var provider: js.UndefOr[Reference] = js.undefined
  /**
           * Reference number/string
           */
  var reference: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Reference to the Request resource
           */
  var request: js.UndefOr[Reference] = js.undefined
  /**
           * Reference to the Response resource
           */
  var response: js.UndefOr[Reference] = js.undefined
  /**
           * active | cancelled | draft | entered-in-error
           */
  var status: js.UndefOr[code] = js.undefined
  /**
           * Party which is the target of the request
           */
  var target: js.UndefOr[Reference] = js.undefined
}

