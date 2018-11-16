package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Group of resources as used in .page.package
     */

trait ImplementationGuidePackage extends BackboneElement {
  /**
           * Contains extended information for property 'description'.
           */
  var _description: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'name'.
           */
  var _name: js.UndefOr[Element] = js.undefined
  /**
           * Human readable text describing the package
           */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Name used .page.package
           */
  var name: java.lang.String
  /**
           * Resource in the implementation guide
           */
  var resource: js.Array[ImplementationGuidePackageResource]
}

