package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Contributor information
     */

trait Contributor extends Element {
  /**
           * Contains extended information for property 'name'.
           */
  var _name: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'type'.
           */
  var _type: js.UndefOr[Element] = js.undefined
  /**
           * Contact details of the contributor
           */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  /**
           * Who contributed the content
           */
  var name: java.lang.String
  /**
           * author | editor | reviewer | endorser
           */
  var `type`: code
}

