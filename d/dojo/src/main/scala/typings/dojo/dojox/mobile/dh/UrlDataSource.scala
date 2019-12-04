package typings.dojo.dojox.mobile.dh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/dh/UrlDataSource.html
  *
  * A component that accesses the given URL and fetches the data as text.
  *
  * @param url
  */
@JSGlobal("dojox.mobile.dh.UrlDataSource")
@js.native
class UrlDataSource protected () extends js.Object {
  def this(url: String) = this()
  /**
    *
    */
  var text: String = js.native
  /**
    * Returns a Deferred that accesses the given URL and fetches the data as text.
    *
    */
  def getData(): js.Any = js.native
}

