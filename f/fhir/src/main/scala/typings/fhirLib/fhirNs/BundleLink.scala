package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Links related to this Bundle
     */

trait BundleLink extends BackboneElement {
  /**
           * Contains extended information for property 'relation'.
           */
  var _relation: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'url'.
           */
  var _url: js.UndefOr[Element] = js.undefined
  /**
           * See http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1
           */
  var relation: java.lang.String
  /**
           * Reference details for the link
           */
  var url: uri
}

