package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A structured set of questions
     */

trait Questionnaire extends DomainResource {
  /**
           * Contains extended information for property 'approvalDate'.
           */
  var _approvalDate: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'copyright'.
           */
  var _copyright: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'date'.
           */
  var _date: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'description'.
           */
  var _description: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'experimental'.
           */
  var _experimental: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'lastReviewDate'.
           */
  var _lastReviewDate: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'name'.
           */
  var _name: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'publisher'.
           */
  var _publisher: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'purpose'.
           */
  var _purpose: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'subjectType'.
           */
  var _subjectType: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Contains extended information for property 'title'.
           */
  var _title: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'url'.
           */
  var _url: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'version'.
           */
  var _version: js.UndefOr[Element] = js.undefined
  /**
           * When the questionnaire was approved by publisher
           */
  var approvalDate: js.UndefOr[date] = js.undefined
  /**
           * Concept that represents the overall questionnaire
           */
  var code: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
           * Contact details for the publisher
           */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  /**
           * Use and/or publishing restrictions
           */
  var copyright: js.UndefOr[markdown] = js.undefined
  /**
           * Date this was last changed
           */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
           * Natural language description of the questionnaire
           */
  var description: js.UndefOr[markdown] = js.undefined
  /**
           * When the questionnaire is expected to be used
           */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  /**
           * For testing purposes, not real usage
           */
  var experimental: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Additional identifier for the questionnaire
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * Questions and sections within the Questionnaire
           */
  var item: js.UndefOr[js.Array[QuestionnaireItem]] = js.undefined
  /**
           * Intended jurisdiction for questionnaire (if applicable)
           */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * When the questionnaire was last reviewed
           */
  var lastReviewDate: js.UndefOr[date] = js.undefined
  /**
           * Name for this questionnaire (computer friendly)
           */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Name of the publisher (organization or individual)
           */
  var publisher: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Why this questionnaire is defined
           */
  var purpose: js.UndefOr[markdown] = js.undefined
  /**
           * draft | active | retired | unknown
           */
  var status: code
  /**
           * Resource that can be subject of QuestionnaireResponse
           */
  var subjectType: js.UndefOr[js.Array[code]] = js.undefined
  /**
           * Name for this questionnaire (human friendly)
           */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Logical URI to reference this questionnaire (globally unique)
           */
  var url: js.UndefOr[uri] = js.undefined
  /**
           * Context the content is intended to support
           */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  /**
           * Business version of the questionnaire
           */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

