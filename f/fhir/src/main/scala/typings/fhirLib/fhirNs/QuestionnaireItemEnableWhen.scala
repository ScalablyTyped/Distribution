package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Only allow data when
     */

trait QuestionnaireItemEnableWhen extends BackboneElement {
  /**
           * Contains extended information for property 'answerBoolean'.
           */
  var _answerBoolean: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'answerDate'.
           */
  var _answerDate: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'answerDateTime'.
           */
  var _answerDateTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'answerDecimal'.
           */
  var _answerDecimal: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'answerInteger'.
           */
  var _answerInteger: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'answerString'.
           */
  var _answerString: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'answerTime'.
           */
  var _answerTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'answerUri'.
           */
  var _answerUri: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'hasAnswer'.
           */
  var _hasAnswer: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'question'.
           */
  var _question: js.UndefOr[Element] = js.undefined
  /**
           * Value question must have
           */
  var answerAttachment: js.UndefOr[Attachment] = js.undefined
  /**
           * Value question must have
           */
  var answerBoolean: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Value question must have
           */
  var answerCoding: js.UndefOr[Coding] = js.undefined
  /**
           * Value question must have
           */
  var answerDate: js.UndefOr[date] = js.undefined
  /**
           * Value question must have
           */
  var answerDateTime: js.UndefOr[dateTime] = js.undefined
  /**
           * Value question must have
           */
  var answerDecimal: js.UndefOr[decimal] = js.undefined
  /**
           * Value question must have
           */
  var answerInteger: js.UndefOr[integer] = js.undefined
  /**
           * Value question must have
           */
  var answerQuantity: js.UndefOr[Quantity] = js.undefined
  /**
           * Value question must have
           */
  var answerReference: js.UndefOr[Reference] = js.undefined
  /**
           * Value question must have
           */
  var answerString: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Value question must have
           */
  var answerTime: js.UndefOr[time] = js.undefined
  /**
           * Value question must have
           */
  var answerUri: js.UndefOr[uri] = js.undefined
  /**
           * Enable when answered or not
           */
  var hasAnswer: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Question that determines whether item is enabled
           */
  var question: java.lang.String
}

