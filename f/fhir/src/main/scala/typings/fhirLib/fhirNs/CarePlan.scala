package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Healthcare plan for patient or group
     */

trait CarePlan extends DomainResource {
  /**
           * Contains extended information for property 'description'.
           */
  var _description: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'intent'.
           */
  var _intent: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'title'.
           */
  var _title: js.UndefOr[Element] = js.undefined
  /**
           * Action to occur as part of plan
           */
  var activity: js.UndefOr[js.Array[CarePlanActivity]] = js.undefined
  /**
           * Health issues this plan addresses
           */
  var addresses: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Who is responsible for contents of the plan
           */
  var author: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Fulfills care plan
           */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Who's involved in plan?
           */
  var careTeam: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Type of plan
           */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Created in context of
           */
  var context: js.UndefOr[Reference] = js.undefined
  /**
           * Protocol or definition
           */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Summary of nature of plan
           */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Desired outcome of plan
           */
  var goal: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * External Ids for this plan
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * proposal | plan | order | option
           */
  var intent: code
  /**
           * Comments about the plan
           */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
           * Part of referenced CarePlan
           */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Time period plan covers
           */
  var period: js.UndefOr[Period] = js.undefined
  /**
           * CarePlan replaced by this CarePlan
           */
  var replaces: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * draft | active | suspended | completed | entered-in-error | cancelled | unknown
           */
  var status: code
  /**
           * Who care plan is for
           */
  var subject: Reference
  /**
           * Information considered as part of plan
           */
  var supportingInfo: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Human-friendly name for the CarePlan
           */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

