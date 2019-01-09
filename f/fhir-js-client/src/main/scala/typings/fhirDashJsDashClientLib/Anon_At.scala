package typings
package fhirDashJsDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_At
  extends /**
  * Making this interface extendable so that we can add more custom filter parameters
  */
/* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Type: dateTime	Only include resource versions that were current at some point during the time period specified
    * in the date time value (may be more than one)
    */
  var _at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * To specify alternative response formats by their MIME-types.
    * This parameter allows a client to override the accept header value when it is unable to set it correctly due to internal limitations
    * (e.g. XSLT usage). For the _format parameter, the values xml, text/xml, application/xml, and application/fhir+xml SHALL be interpreted
    * to mean the XML format, the codes json, application/json and application/fhir+json SHALL be interpreted
    * to mean the JSON format, and the codes ttl and text/turtle SHALL be interpreted to mean the Turtle RDF format.
    * In addition, the values html and text/html are allowed.
    */
  var _format: js.UndefOr[java.lang.String] = js.undefined
}

