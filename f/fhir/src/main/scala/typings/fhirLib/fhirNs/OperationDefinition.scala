package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of an operation or a named query
  */
trait OperationDefinition extends DomainResource {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.undefined
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
    * Contains extended information for property 'idempotent'.
    */
  var _idempotent: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'instance'.
    */
  var _instance: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'kind'.
    */
  var _kind: js.UndefOr[Element] = js.undefined
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
    * Contains extended information for property 'resource'.
    */
  var _resource: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  /**
    * Marks this as a profile of the base
    */
  var base: js.UndefOr[Reference] = js.undefined
  /**
    * Name used to invoke the operation
    */
  var code: code
  /**
    * Additional information about use
    */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
    * Natural language description of the operation definition
    */
  var description: js.UndefOr[markdown] = js.undefined
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether content is unchanged by the operation
    */
  var idempotent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Invoke on an instance?
    */
  var instance: scala.Boolean
  /**
    * Intended jurisdiction for operation definition (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * operation | query
    */
  var kind: code
  /**
    * Name for this operation definition (computer friendly)
    */
  var name: java.lang.String
  /**
    * Define overloaded variants for when  generating code
    */
  var overload: js.UndefOr[js.Array[OperationDefinitionOverload]] = js.undefined
  /**
    * Parameters for the operation/query
    */
  var parameter: js.UndefOr[js.Array[OperationDefinitionParameter]] = js.undefined
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Why this operation definition is defined
    */
  var purpose: js.UndefOr[markdown] = js.undefined
  /**
    * Types this operation applies to
    */
  var resource: js.UndefOr[js.Array[code]] = js.undefined
  /**
    * draft | active | retired | unknown
    */
  var status: code
  /**
    * Invoke at the system level?
    */
  var system: scala.Boolean
  /**
    * Invole at the type level?
    */
  var `type`: scala.Boolean
  /**
    * Logical URI to reference this operation definition (globally unique)
    */
  var url: js.UndefOr[uri] = js.undefined
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  /**
    * Business version of the operation definition
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

