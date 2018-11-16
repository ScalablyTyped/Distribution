package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Search Parameter for a resource
     */

trait SearchParameter extends DomainResource {
  /**
           * Contains extended information for property 'base'.
           */
  var _base: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Contains extended information for property 'chain'.
           */
  var _chain: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Contains extended information for property 'code'.
           */
  var _code: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'comparator'.
           */
  var _comparator: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Contains extended information for property 'date'.
           */
  var _date: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'derivedFrom'.
           */
  var _derivedFrom: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'description'.
           */
  var _description: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'experimental'.
           */
  var _experimental: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'expression'.
           */
  var _expression: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'modifier'.
           */
  var _modifier: js.UndefOr[js.Array[Element]] = js.undefined
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
           * Contains extended information for property 'target'.
           */
  var _target: js.UndefOr[js.Array[Element]] = js.undefined
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
           * Contains extended information for property 'xpath'.
           */
  var _xpath: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'xpathUsage'.
           */
  var _xpathUsage: js.UndefOr[Element] = js.undefined
  /**
           * The resource type(s) this search parameter applies to
           */
  var base: js.Array[code]
  /**
           * Chained names supported
           */
  var chain: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Code used in URL
           */
  var code: code
  /**
           * eq | ne | gt | lt | ge | le | sa | eb | ap
           */
  var comparator: js.UndefOr[js.Array[code]] = js.undefined
  /**
           * For Composite resources to define the parts
           */
  var component: js.UndefOr[js.Array[SearchParameterComponent]] = js.undefined
  /**
           * Contact details for the publisher
           */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  /**
           * Date this was last changed
           */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
           * Original Definition for the search parameter
           */
  var derivedFrom: js.UndefOr[uri] = js.undefined
  /**
           * Natural language description of the search parameter
           */
  var description: markdown
  /**
           * For testing purposes, not real usage
           */
  var experimental: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * FHIRPath expression that extracts the values
           */
  var expression: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Intended jurisdiction for search parameter (if applicable)
           */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * missing | exact | contains | not | text | in | not-in | below | above | type
           */
  var modifier: js.UndefOr[js.Array[code]] = js.undefined
  /**
           * Name for this search parameter (computer friendly)
           */
  var name: java.lang.String
  /**
           * Name of the publisher (organization or individual)
           */
  var publisher: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Why this search parameter is defined
           */
  var purpose: js.UndefOr[markdown] = js.undefined
  /**
           * draft | active | retired | unknown
           */
  var status: code
  /**
           * Types of resource (if a resource reference)
           */
  var target: js.UndefOr[js.Array[code]] = js.undefined
  /**
           * number | date | string | token | reference | composite | quantity | uri
           */
  var `type`: code
  /**
           * Logical URI to reference this search parameter (globally unique)
           */
  var url: uri
  /**
           * Context the content is intended to support
           */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  /**
           * Business version of the search parameter
           */
  var version: js.UndefOr[java.lang.String] = js.undefined
  /**
           * XPath that extracts the values
           */
  var xpath: js.UndefOr[java.lang.String] = js.undefined
  /**
           * normal | phonetic | nearby | distance | other
           */
  var xpathUsage: js.UndefOr[code] = js.undefined
}

