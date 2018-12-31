package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Named sections for reader convenience
  */
trait StructureMapGroup extends BackboneElement {
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'extends'.
    */
  var _extends: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'typeMode'.
    */
  var _typeMode: js.UndefOr[Element] = js.undefined
  /**
    * Additional description/explaination for group
    */
  var documentation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Another group that this group adds rules to
    */
  var `extends`: js.UndefOr[id] = js.undefined
  /**
    * Named instance provided when invoking the map
    */
  var input: js.Array[StructureMapGroupInput]
  /**
    * Human-readable label
    */
  var name: id
  /**
    * Transform Rule from source to target
    */
  var rule: js.Array[StructureMapGroupRule]
  /**
    * none | types | type-and-types
    */
  var typeMode: code
}

