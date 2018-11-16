package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Data or objects used
     */

trait AuditEventEntity extends BackboneElement {
  /**
           * Contains extended information for property 'description'.
           */
  var _description: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'name'.
           */
  var _name: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'query'.
           */
  var _query: js.UndefOr[Element] = js.undefined
  /**
           * Descriptive text
           */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Additional Information about the entity
           */
  var detail: js.UndefOr[js.Array[AuditEventEntityDetail]] = js.undefined
  /**
           * Specific instance of object
           */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
           * Life-cycle stage for the entity
           */
  var lifecycle: js.UndefOr[Coding] = js.undefined
  /**
           * Descriptor for entity
           */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Query parameters
           */
  var query: js.UndefOr[base64Binary] = js.undefined
  /**
           * Specific instance of resource
           */
  var reference: js.UndefOr[Reference] = js.undefined
  /**
           * What role the entity played
           */
  var role: js.UndefOr[Coding] = js.undefined
  /**
           * Security labels on the entity
           */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
           * Type of entity involved
           */
  var `type`: js.UndefOr[Coding] = js.undefined
}

