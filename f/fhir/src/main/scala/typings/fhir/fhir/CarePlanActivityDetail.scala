package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In-line definition of activity
  */
trait CarePlanActivityDetail extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'prohibited'.
    */
  var _prohibited: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'scheduledString'.
    */
  var _scheduledString: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'statusReason'.
    */
  var _statusReason: js.UndefOr[Element] = js.undefined
  /**
    * diet | drug | encounter | observation | procedure | supply | other
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Detail type of activity
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * How to consume/day?
    */
  var dailyAmount: js.UndefOr[Quantity] = js.undefined
  /**
    * Protocol or definition
    */
  var definition: js.UndefOr[Reference] = js.undefined
  /**
    * Extra info describing activity to perform
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Goals this activity relates to
    */
  var goal: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Where it should happen
    */
  var location: js.UndefOr[Reference] = js.undefined
  /**
    * Who will be responsible?
    */
  var performer: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * What is to be administered/supplied
    */
  var productCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * What is to be administered/supplied
    */
  var productReference: js.UndefOr[Reference] = js.undefined
  /**
    * Do NOT do
    */
  var prohibited: js.UndefOr[Boolean] = js.undefined
  /**
    * How much to administer/supply/consume
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Why activity should be done or why activity was prohibited
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Condition triggering need for activity
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * When activity is to occur
    */
  var scheduledPeriod: js.UndefOr[Period] = js.undefined
  /**
    * When activity is to occur
    */
  var scheduledString: js.UndefOr[String] = js.undefined
  /**
    * When activity is to occur
    */
  var scheduledTiming: js.UndefOr[Timing] = js.undefined
  /**
    * not-started | scheduled | in-progress | on-hold | completed | cancelled | unknown
    */
  var status: code
  /**
    * Reason for current status
    */
  var statusReason: js.UndefOr[String] = js.undefined
}

object CarePlanActivityDetail {
  @scala.inline
  def apply(
    status: code,
    _description: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _prohibited: Element = null,
    _scheduledString: Element = null,
    _status: Element = null,
    _statusReason: Element = null,
    category: CodeableConcept = null,
    code: CodeableConcept = null,
    dailyAmount: Quantity = null,
    definition: Reference = null,
    description: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    goal: js.Array[Reference] = null,
    id: String = null,
    location: Reference = null,
    modifierExtension: js.Array[Extension] = null,
    performer: js.Array[Reference] = null,
    productCodeableConcept: CodeableConcept = null,
    productReference: Reference = null,
    prohibited: js.UndefOr[Boolean] = js.undefined,
    quantity: Quantity = null,
    reasonCode: js.Array[CodeableConcept] = null,
    reasonReference: js.Array[Reference] = null,
    scheduledPeriod: Period = null,
    scheduledString: String = null,
    scheduledTiming: Timing = null,
    statusReason: String = null
  ): CarePlanActivityDetail = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_prohibited != null) __obj.updateDynamic("_prohibited")(_prohibited.asInstanceOf[js.Any])
    if (_scheduledString != null) __obj.updateDynamic("_scheduledString")(_scheduledString.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_statusReason != null) __obj.updateDynamic("_statusReason")(_statusReason.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (dailyAmount != null) __obj.updateDynamic("dailyAmount")(dailyAmount.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (goal != null) __obj.updateDynamic("goal")(goal.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (performer != null) __obj.updateDynamic("performer")(performer.asInstanceOf[js.Any])
    if (productCodeableConcept != null) __obj.updateDynamic("productCodeableConcept")(productCodeableConcept.asInstanceOf[js.Any])
    if (productReference != null) __obj.updateDynamic("productReference")(productReference.asInstanceOf[js.Any])
    if (!js.isUndefined(prohibited)) __obj.updateDynamic("prohibited")(prohibited.get.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode.asInstanceOf[js.Any])
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference.asInstanceOf[js.Any])
    if (scheduledPeriod != null) __obj.updateDynamic("scheduledPeriod")(scheduledPeriod.asInstanceOf[js.Any])
    if (scheduledString != null) __obj.updateDynamic("scheduledString")(scheduledString.asInstanceOf[js.Any])
    if (scheduledTiming != null) __obj.updateDynamic("scheduledTiming")(scheduledTiming.asInstanceOf[js.Any])
    if (statusReason != null) __obj.updateDynamic("statusReason")(statusReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarePlanActivityDetail]
  }
}

