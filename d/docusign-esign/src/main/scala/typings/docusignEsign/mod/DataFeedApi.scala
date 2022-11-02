package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "DataFeedApi")
@js.native
open class DataFeedApi () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  def getDataFeedElement(accountId: String, dataFeedElementId: String): js.Promise[Unit] = js.native
  def getDataFeedElement(accountId: String, dataFeedElementId: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def getDataFeedElement(
    accountId: String,
    dataFeedElementId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Unit] = js.native
}
