package typings
package googleDashGaxLib.googleDashGaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "PageDescriptor")
@js.native
class PageDescriptor protected ()
  extends googleDashGaxLib.buildSrcPagedIterationMod.PageDescriptor {
  /**
    * Describes the structure of a page-streaming call.
    *
    * @property {String} requestPageTokenField
    * @property {String} responsePageTokenField
    * @property {String} resourceField
    *
    * @param {String} requestPageTokenField - The field name of the page token in
    *   the request.
    * @param {String} responsePageTokenField - The field name of the page token in
    *   the response.
    * @param {String} resourceField - The resource field name.
    *
    * @constructor
    */
  def this(requestPageTokenField: java.lang.String, responsePageTokenField: java.lang.String, resourceField: java.lang.String) = this()
}

