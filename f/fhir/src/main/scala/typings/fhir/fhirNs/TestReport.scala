package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the results of a TestScript execution
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhirNs.Resource because Already inherited */ trait TestReport extends DomainResource {
  /**
    * Contains extended information for property 'issued'.
    */
  var _issued: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'result'.
    */
  var _result: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'score'.
    */
  var _score: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'tester'.
    */
  var _tester: js.UndefOr[Element] = js.undefined
  /**
    * External identifier
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * When the TestScript was executed and this TestReport was generated
    */
  var issued: js.UndefOr[dateTime] = js.undefined
  /**
    * Informal name of the executed TestScript
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * A participant in the test execution, either the execution engine, a client, or a server
    */
  var participant: js.UndefOr[js.Array[TestReportParticipant]] = js.undefined
  /**
    * pass | fail | pending
    */
  var result: code
  /**
    * The final score (percentage of tests passed) resulting from the execution of the TestScript
    */
  var score: js.UndefOr[decimal] = js.undefined
  /**
    * The results of the series of required setup operations before the tests were executed
    */
  var setup: js.UndefOr[TestReportSetup] = js.undefined
  /**
    * completed | in-progress | waiting | stopped | entered-in-error
    */
  var status: code
  /**
    * The results of running the series of required clean up steps
    */
  var teardown: js.UndefOr[TestReportTeardown] = js.undefined
  /**
    * A test executed from the test script
    */
  var test: js.UndefOr[js.Array[TestReportTest]] = js.undefined
  /**
    * Reference to the  version-specific TestScript that was executed to produce this TestReport
    */
  var testScript: Reference
  /**
    * Name of the tester producing this report (Organization or individual)
    */
  var tester: js.UndefOr[String] = js.undefined
}

object TestReport {
  @scala.inline
  def apply(
    result: code,
    status: code,
    testScript: Reference,
    _id: Element = null,
    _implicitRules: Element = null,
    _issued: Element = null,
    _language: Element = null,
    _name: Element = null,
    _resourceType: Element = null,
    _result: Element = null,
    _score: Element = null,
    _status: Element = null,
    _tester: Element = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    issued: dateTime = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    participant: js.Array[TestReportParticipant] = null,
    resourceType: code = null,
    score: js.UndefOr[decimal] = js.undefined,
    setup: TestReportSetup = null,
    teardown: TestReportTeardown = null,
    test: js.Array[TestReportTest] = null,
    tester: String = null,
    text: Narrative = null
  ): TestReport = {
    val __obj = js.Dynamic.literal(result = result, status = status, testScript = testScript)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_issued != null) __obj.updateDynamic("_issued")(_issued)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_result != null) __obj.updateDynamic("_result")(_result)
    if (_score != null) __obj.updateDynamic("_score")(_score)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (_tester != null) __obj.updateDynamic("_tester")(_tester)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (issued != null) __obj.updateDynamic("issued")(issued)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    if (participant != null) __obj.updateDynamic("participant")(participant)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score)
    if (setup != null) __obj.updateDynamic("setup")(setup)
    if (teardown != null) __obj.updateDynamic("teardown")(teardown)
    if (test != null) __obj.updateDynamic("test")(test)
    if (tester != null) __obj.updateDynamic("tester")(tester)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TestReport]
  }
}

