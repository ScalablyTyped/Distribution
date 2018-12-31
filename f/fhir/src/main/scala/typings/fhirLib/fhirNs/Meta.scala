package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about a resource
  */
trait Meta extends Element {
  /**
    * Contains extended information for property 'lastUpdated'.
    */
  var _lastUpdated: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'profile'.
    */
  var _profile: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'versionId'.
    */
  var _versionId: js.UndefOr[Element] = js.undefined
  /**
    * When the resource version last changed
    */
  var lastUpdated: js.UndefOr[instant] = js.undefined
  /**
    * Profiles this resource claims to conform to
    */
  var profile: js.UndefOr[js.Array[uri]] = js.undefined
  /**
    * Security Labels applied to this resource
    */
  var security: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * Tags applied to this resource
    */
  var tag: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * Version specific identifier
    */
  var versionId: js.UndefOr[id] = js.undefined
}

