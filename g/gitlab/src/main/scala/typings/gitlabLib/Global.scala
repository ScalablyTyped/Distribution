package typings
package gitlabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Global extends js.Object {
  var URL: Anon_Base = js.native
  var URLSearchParams: Anon_Init = js.native
  @JSName("encodeURIComponent")
  var encodeURIComponent_Original: js.Function1[
    /* uriComponent */ java.lang.String | scala.Double | scala.Boolean, 
    java.lang.String
  ] = js.native
  def encodeURIComponent(uriComponent: java.lang.String): java.lang.String = js.native
  def encodeURIComponent(uriComponent: scala.Boolean): java.lang.String = js.native
  def encodeURIComponent(uriComponent: scala.Double): java.lang.String = js.native
}

