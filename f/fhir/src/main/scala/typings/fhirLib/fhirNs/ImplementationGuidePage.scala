package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Page/Section in the Guide
     */

trait ImplementationGuidePage extends BackboneElement {
  /**
           * Contains extended information for property 'format'.
           */
  var _format: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'kind'.
           */
  var _kind: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'package'.
           */
  var _package: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Contains extended information for property 'source'.
           */
  var _source: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'title'.
           */
  var _title: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'type'.
           */
  var _type: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Format of the page (e.g. html, markdown, etc.)
           */
  var format: js.UndefOr[code] = js.undefined
  /**
           * page | example | list | include | directory | dictionary | toc | resource
           */
  var kind: code
  /**
           * Name of package to include
           */
  var `package`: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Nested Pages / Sections
           */
  var page: js.UndefOr[js.Array[ImplementationGuidePage]] = js.undefined
  /**
           * Where to find that page
           */
  var source: uri
  /**
           * Short title shown for navigational assistance
           */
  var title: java.lang.String
  /**
           * Kind of resource to include in the list
           */
  var `type`: js.UndefOr[js.Array[code]] = js.undefined
}

