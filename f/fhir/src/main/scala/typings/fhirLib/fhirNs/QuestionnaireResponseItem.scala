package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Groups and questions
     */

trait QuestionnaireResponseItem extends BackboneElement {
  /**
           * Contains extended information for property 'definition'.
           */
  var _definition: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'linkId'.
           */
  var _linkId: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'text'.
           */
  var _text: js.UndefOr[Element] = js.undefined
  /**
           * The response(s) to the question
           */
  var answer: js.UndefOr[js.Array[QuestionnaireResponseItemAnswer]] = js.undefined
  /**
           * ElementDefinition - details for the item
           */
  var definition: js.UndefOr[uri] = js.undefined
  /**
           * Nested questionnaire response items
           */
  var item: js.UndefOr[js.Array[QuestionnaireResponseItem]] = js.undefined
  /**
           * Pointer to specific item from Questionnaire
           */
  var linkId: java.lang.String
  /**
           * The subject this group's answers are about
           */
  var subject: js.UndefOr[Reference] = js.undefined
  /**
           * Name for group or question text
           */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

