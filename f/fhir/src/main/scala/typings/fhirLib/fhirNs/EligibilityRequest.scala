package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Determine insurance validity and scope of coverage
     */

trait EligibilityRequest extends DomainResource {
  /**
           * Contains extended information for property 'businessArrangement'.
           */
  var _businessArrangement: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'created'.
           */
  var _created: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'servicedDate'.
           */
  var _servicedDate: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * Type of services covered
           */
  var benefitCategory: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Detailed services covered within the type
           */
  var benefitSubCategory: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Business agreement
           */
  var businessArrangement: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Insurance or medical plan
           */
  var coverage: js.UndefOr[Reference] = js.undefined
  /**
           * Creation date
           */
  var created: js.UndefOr[dateTime] = js.undefined
  /**
           * Author
           */
  var enterer: js.UndefOr[Reference] = js.undefined
  /**
           * Servicing Facility
           */
  var facility: js.UndefOr[Reference] = js.undefined
  /**
           * Business Identifier
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * Target
           */
  var insurer: js.UndefOr[Reference] = js.undefined
  /**
           * Responsible organization
           */
  var organization: js.UndefOr[Reference] = js.undefined
  /**
           * The subject of the Products and Services
           */
  var patient: js.UndefOr[Reference] = js.undefined
  /**
           * Desired processing priority
           */
  var priority: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Responsible practitioner
           */
  var provider: js.UndefOr[Reference] = js.undefined
  /**
           * Estimated date or dates of Service
           */
  var servicedDate: js.UndefOr[date] = js.undefined
  /**
           * Estimated date or dates of Service
           */
  var servicedPeriod: js.UndefOr[Period] = js.undefined
  /**
           * active | cancelled | draft | entered-in-error
           */
  var status: js.UndefOr[code] = js.undefined
}

