package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fixture in the test script - by reference (uri)
  */
trait TestScriptFixture extends BackboneElement {
  /**
    * Contains extended information for property 'autocreate'.
    */
  var _autocreate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'autodelete'.
    */
  var _autodelete: js.UndefOr[Element] = js.undefined
  /**
    * Whether or not to implicitly create the fixture during setup
    */
  var autocreate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether or not to implicitly delete the fixture during teardown
    */
  var autodelete: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Reference of the resource
    */
  var resource: js.UndefOr[Reference] = js.undefined
}

