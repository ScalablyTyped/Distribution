package typings
package eggLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response
  extends koaLib.koaMod.ApplicationNs.Response {
  // tslint:disable-line
  /**
    * read response real status code.
    *
    * e.g.: Using 302 status redirect to the global error page
    * instead of show current 500 status page.
    * And access log should save 500 not 302,
    * then the `realStatus` can help us find out the real status code.
    * @member {Number} Context#realStatus
    */
  var realStatus: scala.Double = js.native
}

