package typings.googleFeeds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object google {
  
  object feeds {
    
    @js.native
    trait Feed extends StObject {
      
      def findFeeds(): Unit = js.native
      def findFeeds(query: String): Unit = js.native
      def findFeeds(query: String, callback: js.Function1[/* result */ findResult, Unit]): Unit = js.native
      def findFeeds(query: Unit, callback: js.Function1[/* result */ findResult, Unit]): Unit = js.native
      
      def getElementsByTagNameNS(node: String, ns: String, localName: String): js.Array[js.Any] = js.native
      
      def includeHistoricalEntries(): Unit = js.native
      
      def load(): Unit = js.native
      def load(callback: js.Function1[/* result */ feedResult, Unit]): Unit = js.native
      
      def setNumEntries(num: Double): Unit = js.native
      
      def setResultFormat(format: String): Unit = js.native
    }
  }
}
