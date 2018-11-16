package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Placeholder for evaluated elements
     */

trait TestScriptVariable extends BackboneElement {
  /**
           * Contains extended information for property 'defaultValue'.
           */
  var _defaultValue: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'description'.
           */
  var _description: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'expression'.
           */
  var _expression: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'headerField'.
           */
  var _headerField: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'hint'.
           */
  var _hint: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'name'.
           */
  var _name: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'path'.
           */
  var _path: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'sourceId'.
           */
  var _sourceId: js.UndefOr[Element] = js.undefined
  /**
           * Default, hard-coded, or user-defined value for this variable
           */
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Natural language description of the variable
           */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The fluentpath expression against the fixture body
           */
  var expression: js.UndefOr[java.lang.String] = js.undefined
  /**
           * HTTP header field name for source
           */
  var headerField: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Hint help text for default value to enter
           */
  var hint: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Descriptive name for this variable
           */
  var name: java.lang.String
  /**
           * XPath or JSONPath against the fixture body
           */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Fixture Id of source expression or headerField within this variable
           */
  var sourceId: js.UndefOr[id] = js.undefined
}

