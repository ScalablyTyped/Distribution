package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A structured set of questions and their answers
  */
trait QuestionnaireResponse extends DomainResource {
  /**
    * Contains extended information for property 'authored'.
    */
  var _authored: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Person who received and recorded the answers
    */
  var author: js.UndefOr[Reference] = js.undefined
  /**
    * Date the answers were gathered
    */
  var authored: js.UndefOr[dateTime] = js.undefined
  /**
    * Request fulfilled by this QuestionnaireResponse
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Encounter or Episode during which questionnaire was completed
    */
  var context: js.UndefOr[Reference] = js.undefined
  /**
    * Unique id for this set of answers
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Groups and questions
    */
  var item: js.UndefOr[js.Array[QuestionnaireResponseItem]] = js.undefined
  /**
    * Part of this action
    */
  var parent: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Form being answered
    */
  var questionnaire: js.UndefOr[Reference] = js.undefined
  /**
    * The person who answered the questions
    */
  var source: js.UndefOr[Reference] = js.undefined
  /**
    * in-progress | completed | amended | entered-in-error | stopped
    */
  var status: code
  /**
    * The subject of the questions
    */
  var subject: js.UndefOr[Reference] = js.undefined
}

