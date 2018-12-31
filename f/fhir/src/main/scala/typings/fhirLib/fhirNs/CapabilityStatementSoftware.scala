package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Software that is covered by this capability statement
  */
trait CapabilityStatementSoftware extends BackboneElement {
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'releaseDate'.
    */
  var _releaseDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  /**
    * A name the software is known by
    */
  var name: java.lang.String
  /**
    * Date this version released
    */
  var releaseDate: js.UndefOr[dateTime] = js.undefined
  /**
    * Version covered by this statement
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

