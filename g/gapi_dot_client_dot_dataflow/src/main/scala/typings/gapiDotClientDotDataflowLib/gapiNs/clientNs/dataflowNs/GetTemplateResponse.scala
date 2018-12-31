package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTemplateResponse extends js.Object {
  /**
    * The template metadata describing the template name, available
    * parameters, etc.
    */
  var metadata: js.UndefOr[TemplateMetadata] = js.undefined
  /**
    * The status of the get template request. Any problems with the
    * request will be indicated in the error_details.
    */
  var status: js.UndefOr[Status] = js.undefined
}

