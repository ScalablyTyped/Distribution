package typings.fhir.r2Mod

import typings.fhir.fhirStrings.bad
import typings.fhir.fhirStrings.conflict
import typings.fhir.fhirStrings.contains
import typings.fhir.fhirStrings.created
import typings.fhir.fhirStrings.empty
import typings.fhir.fhirStrings.equals
import typings.fhir.fhirStrings.forbidden
import typings.fhir.fhirStrings.gone
import typings.fhir.fhirStrings.greaterThan
import typings.fhir.fhirStrings.in
import typings.fhir.fhirStrings.json
import typings.fhir.fhirStrings.lessThan
import typings.fhir.fhirStrings.methodNotAllowed
import typings.fhir.fhirStrings.noContent
import typings.fhir.fhirStrings.notContains
import typings.fhir.fhirStrings.notEmpty
import typings.fhir.fhirStrings.notEquals
import typings.fhir.fhirStrings.notFound
import typings.fhir.fhirStrings.notIn
import typings.fhir.fhirStrings.notModified
import typings.fhir.fhirStrings.okay
import typings.fhir.fhirStrings.preconditionFailed
import typings.fhir.fhirStrings.request
import typings.fhir.fhirStrings.response
import typings.fhir.fhirStrings.unprocessable
import typings.fhir.fhirStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptSetupActionAssert
  extends StObject
     with BackboneElement {
  
  var _compareToSourceId: js.UndefOr[Element] = js.undefined
  
  var _compareToSourcePath: js.UndefOr[Element] = js.undefined
  
  var _contentType: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _direction: js.UndefOr[Element] = js.undefined
  
  var _headerField: js.UndefOr[Element] = js.undefined
  
  var _label: js.UndefOr[Element] = js.undefined
  
  var _minimumId: js.UndefOr[Element] = js.undefined
  
  var _navigationLinks: js.UndefOr[Element] = js.undefined
  
  var _operator: js.UndefOr[Element] = js.undefined
  
  var _path: js.UndefOr[Element] = js.undefined
  
  var _resource: js.UndefOr[Element] = js.undefined
  
  var _response: js.UndefOr[Element] = js.undefined
  
  var _responseCode: js.UndefOr[Element] = js.undefined
  
  var _sourceId: js.UndefOr[Element] = js.undefined
  
  var _validateProfileId: js.UndefOr[Element] = js.undefined
  
  var _value: js.UndefOr[Element] = js.undefined
  
  var _warningOnly: js.UndefOr[Element] = js.undefined
  
  /**
    * Id of fixture used to compare the "sourceId/path" evaluations to.
    */
  var compareToSourceId: js.UndefOr[String] = js.undefined
  
  /**
    * XPath or JSONPath expression against fixture used to compare the "sourceId/path" evaluations to.
    */
  var compareToSourcePath: js.UndefOr[String] = js.undefined
  
  /**
    * The content-type or mime-type to use for RESTful operation in the 'Content-Type' header.
    */
  var contentType: js.UndefOr[xml | json] = js.undefined
  
  /**
    * The description would be used by test engines for tracking and reporting purposes.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The direction to use for the assertion.
    */
  var direction: js.UndefOr[response | request] = js.undefined
  
  /**
    * The HTTP header field name e.g. 'Location'.
    */
  var headerField: js.UndefOr[String] = js.undefined
  
  /**
    * The label would be used for tracking/logging purposes by test engines.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of a fixture.  Asserts that the response contains at a minimumId the fixture specified by minimumId.
    */
  var minimumId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether or not the test execution performs validation on the bundle navigation links.
    */
  var navigationLinks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The operator type.
    */
  var operator: js.UndefOr[
    equals | notEquals | in | notIn | greaterThan | lessThan | empty | notEmpty | contains | notContains
  ] = js.undefined
  
  /**
    * The XPath or JSONPath expression to be evaluated against the fixture representing the response received from server.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the resource.  See http://hl7-fhir.github.io/resourcelist.html.
    */
  var resource: js.UndefOr[String] = js.undefined
  
  /**
    * okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable.
    */
  var response: js.UndefOr[
    okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable
  ] = js.undefined
  
  /**
    * The value of the HTTP response code to be tested.
    */
  var responseCode: js.UndefOr[String] = js.undefined
  
  /**
    * Fixture to evaluate the XPath/JSONPath expression or the headerField  against.
    */
  var sourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Profile to validate against.
    */
  var validateProfileId: js.UndefOr[String] = js.undefined
  
  /**
    * The value to compare to.
    */
  var value: js.UndefOr[String] = js.undefined
  
  /**
    * Whether or not the test execution will produce a warning only on error for this assert.
    */
  var warningOnly: js.UndefOr[Boolean] = js.undefined
}
object TestScriptSetupActionAssert {
  
  inline def apply(): TestScriptSetupActionAssert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestScriptSetupActionAssert]
  }
  
  extension [Self <: TestScriptSetupActionAssert](x: Self) {
    
    inline def setCompareToSourceId(value: String): Self = StObject.set(x, "compareToSourceId", value.asInstanceOf[js.Any])
    
    inline def setCompareToSourceIdUndefined: Self = StObject.set(x, "compareToSourceId", js.undefined)
    
    inline def setCompareToSourcePath(value: String): Self = StObject.set(x, "compareToSourcePath", value.asInstanceOf[js.Any])
    
    inline def setCompareToSourcePathUndefined: Self = StObject.set(x, "compareToSourcePath", js.undefined)
    
    inline def setContentType(value: xml | json): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDirection(value: response | request): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setHeaderField(value: String): Self = StObject.set(x, "headerField", value.asInstanceOf[js.Any])
    
    inline def setHeaderFieldUndefined: Self = StObject.set(x, "headerField", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMinimumId(value: String): Self = StObject.set(x, "minimumId", value.asInstanceOf[js.Any])
    
    inline def setMinimumIdUndefined: Self = StObject.set(x, "minimumId", js.undefined)
    
    inline def setNavigationLinks(value: Boolean): Self = StObject.set(x, "navigationLinks", value.asInstanceOf[js.Any])
    
    inline def setNavigationLinksUndefined: Self = StObject.set(x, "navigationLinks", js.undefined)
    
    inline def setOperator(
      value: equals | notEquals | in | notIn | greaterThan | lessThan | empty | notEmpty | contains | notContains
    ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResponse(
      value: okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseCode(value: String): Self = StObject.set(x, "responseCode", value.asInstanceOf[js.Any])
    
    inline def setResponseCodeUndefined: Self = StObject.set(x, "responseCode", js.undefined)
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceIdUndefined: Self = StObject.set(x, "sourceId", js.undefined)
    
    inline def setValidateProfileId(value: String): Self = StObject.set(x, "validateProfileId", value.asInstanceOf[js.Any])
    
    inline def setValidateProfileIdUndefined: Self = StObject.set(x, "validateProfileId", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWarningOnly(value: Boolean): Self = StObject.set(x, "warningOnly", value.asInstanceOf[js.Any])
    
    inline def setWarningOnlyUndefined: Self = StObject.set(x, "warningOnly", js.undefined)
    
    inline def set_compareToSourceId(value: Element): Self = StObject.set(x, "_compareToSourceId", value.asInstanceOf[js.Any])
    
    inline def set_compareToSourceIdUndefined: Self = StObject.set(x, "_compareToSourceId", js.undefined)
    
    inline def set_compareToSourcePath(value: Element): Self = StObject.set(x, "_compareToSourcePath", value.asInstanceOf[js.Any])
    
    inline def set_compareToSourcePathUndefined: Self = StObject.set(x, "_compareToSourcePath", js.undefined)
    
    inline def set_contentType(value: Element): Self = StObject.set(x, "_contentType", value.asInstanceOf[js.Any])
    
    inline def set_contentTypeUndefined: Self = StObject.set(x, "_contentType", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_direction(value: Element): Self = StObject.set(x, "_direction", value.asInstanceOf[js.Any])
    
    inline def set_directionUndefined: Self = StObject.set(x, "_direction", js.undefined)
    
    inline def set_headerField(value: Element): Self = StObject.set(x, "_headerField", value.asInstanceOf[js.Any])
    
    inline def set_headerFieldUndefined: Self = StObject.set(x, "_headerField", js.undefined)
    
    inline def set_label(value: Element): Self = StObject.set(x, "_label", value.asInstanceOf[js.Any])
    
    inline def set_labelUndefined: Self = StObject.set(x, "_label", js.undefined)
    
    inline def set_minimumId(value: Element): Self = StObject.set(x, "_minimumId", value.asInstanceOf[js.Any])
    
    inline def set_minimumIdUndefined: Self = StObject.set(x, "_minimumId", js.undefined)
    
    inline def set_navigationLinks(value: Element): Self = StObject.set(x, "_navigationLinks", value.asInstanceOf[js.Any])
    
    inline def set_navigationLinksUndefined: Self = StObject.set(x, "_navigationLinks", js.undefined)
    
    inline def set_operator(value: Element): Self = StObject.set(x, "_operator", value.asInstanceOf[js.Any])
    
    inline def set_operatorUndefined: Self = StObject.set(x, "_operator", js.undefined)
    
    inline def set_path(value: Element): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
    
    inline def set_pathUndefined: Self = StObject.set(x, "_path", js.undefined)
    
    inline def set_resource(value: Element): Self = StObject.set(x, "_resource", value.asInstanceOf[js.Any])
    
    inline def set_resourceUndefined: Self = StObject.set(x, "_resource", js.undefined)
    
    inline def set_response(value: Element): Self = StObject.set(x, "_response", value.asInstanceOf[js.Any])
    
    inline def set_responseCode(value: Element): Self = StObject.set(x, "_responseCode", value.asInstanceOf[js.Any])
    
    inline def set_responseCodeUndefined: Self = StObject.set(x, "_responseCode", js.undefined)
    
    inline def set_responseUndefined: Self = StObject.set(x, "_response", js.undefined)
    
    inline def set_sourceId(value: Element): Self = StObject.set(x, "_sourceId", value.asInstanceOf[js.Any])
    
    inline def set_sourceIdUndefined: Self = StObject.set(x, "_sourceId", js.undefined)
    
    inline def set_validateProfileId(value: Element): Self = StObject.set(x, "_validateProfileId", value.asInstanceOf[js.Any])
    
    inline def set_validateProfileIdUndefined: Self = StObject.set(x, "_validateProfileId", js.undefined)
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
    
    inline def set_warningOnly(value: Element): Self = StObject.set(x, "_warningOnly", value.asInstanceOf[js.Any])
    
    inline def set_warningOnlyUndefined: Self = StObject.set(x, "_warningOnly", js.undefined)
  }
}
