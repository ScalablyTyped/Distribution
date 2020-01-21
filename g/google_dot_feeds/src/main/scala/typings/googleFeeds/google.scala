package typings.googleFeeds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google")
@js.native
object google extends js.Object {
  @js.native
  object feeds extends js.Object {
    @js.native
    class Feed () extends js.Object {
      def this(url: String) = this()
      def findFeeds(): Unit = js.native
      def findFeeds(query: String): Unit = js.native
      def findFeeds(query: String, callback: js.Function1[/* result */ findResult, Unit]): Unit = js.native
      def getElementsByTagNameNS(node: String, ns: String, localName: String): js.Array[_] = js.native
      def includeHistoricalEntries(): Unit = js.native
      def load(): Unit = js.native
      def load(callback: js.Function1[/* result */ feedResult, Unit]): Unit = js.native
      def setNumEntries(num: Double): Unit = js.native
      def setResultFormat(format: String): Unit = js.native
    }
    
  }
  
}

