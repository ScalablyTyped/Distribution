package typings
package googleDotFeedsLib.googleNs.feedsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.feeds.Feed")
@js.native
class Feed () extends js.Object {
  def this(url: java.lang.String) = this()
  def findFeeds(): scala.Unit = js.native
  def findFeeds(query: java.lang.String): scala.Unit = js.native
  def findFeeds(
    query: java.lang.String,
    callback: js.Function1[/* result */ googleDotFeedsLib.findResult, scala.Unit]
  ): scala.Unit = js.native
  def getElementsByTagNameNS(node: java.lang.String, ns: java.lang.String, localName: java.lang.String): js.Array[_] = js.native
  def includeHistoricalEntries(): scala.Unit = js.native
  def load(): scala.Unit = js.native
  def load(callback: js.Function1[/* result */ googleDotFeedsLib.feedResult, scala.Unit]): scala.Unit = js.native
  def setNumEntries(num: scala.Double): scala.Unit = js.native
  def setResultFormat(format: java.lang.String): scala.Unit = js.native
}

