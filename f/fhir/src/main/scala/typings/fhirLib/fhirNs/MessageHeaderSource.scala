package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Message source application
     */

trait MessageHeaderSource extends BackboneElement {
  /**
           * Contains extended information for property 'endpoint'.
           */
  var _endpoint: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'name'.
           */
  var _name: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'software'.
           */
  var _software: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'version'.
           */
  var _version: js.UndefOr[Element] = js.undefined
  /**
           * Human contact for problems
           */
  var contact: js.UndefOr[ContactPoint] = js.undefined
  /**
           * Actual message source address or id
           */
  var endpoint: uri
  /**
           * Name of system
           */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Name of software running the system
           */
  var software: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Version of software running
           */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

