package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "NotaryApi")
@js.native
open class NotaryApi () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  def createNotary(): js.Promise[Notary] = js.native
  def createNotary(optsOrCallback: Any): js.Promise[Notary] = js.native
  def createNotary(optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[Notary] = js.native
  def createNotary(optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[Notary] = js.native
  
  def createNotaryJurisdictions(): js.Promise[NotaryJurisdiction] = js.native
  def createNotaryJurisdictions(optsOrCallback: Any): js.Promise[NotaryJurisdiction] = js.native
  def createNotaryJurisdictions(optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[NotaryJurisdiction] = js.native
  def createNotaryJurisdictions(optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[NotaryJurisdiction] = js.native
  
  def deleteNotaryJurisdiction(jurisdictionId: String): js.Promise[Unit] = js.native
  def deleteNotaryJurisdiction(jurisdictionId: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def getNotary(): js.Promise[NotaryResult] = js.native
  def getNotary(optsOrCallback: Any): js.Promise[NotaryResult] = js.native
  def getNotary(optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[NotaryResult] = js.native
  def getNotary(optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[NotaryResult] = js.native
  
  def getNotaryJurisdiction(jurisdictionId: String): js.Promise[NotaryJurisdiction] = js.native
  def getNotaryJurisdiction(jurisdictionId: String, callback: js.Function0[Unit]): js.Promise[NotaryJurisdiction] = js.native
  
  def getNotaryJurisdictionSeal(jurisdictionId: String): js.Promise[Unit] = js.native
  def getNotaryJurisdictionSeal(jurisdictionId: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def getNotaryJurisdictions(): js.Promise[NotaryJurisdictionList] = js.native
  def getNotaryJurisdictions(callback: js.Function0[Unit]): js.Promise[NotaryJurisdictionList] = js.native
  
  def listNotaryJournals(): js.Promise[NotaryJournalList] = js.native
  def listNotaryJournals(optsOrCallback: Any): js.Promise[NotaryJournalList] = js.native
  def listNotaryJournals(optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[NotaryJournalList] = js.native
  def listNotaryJournals(optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[NotaryJournalList] = js.native
  
  def updateNotary(): js.Promise[Notary] = js.native
  def updateNotary(optsOrCallback: Any): js.Promise[Notary] = js.native
  def updateNotary(optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[Notary] = js.native
  def updateNotary(optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[Notary] = js.native
  
  def updateNotaryJurisdiction(jurisdictionId: String): js.Promise[NotaryJurisdiction] = js.native
  def updateNotaryJurisdiction(jurisdictionId: String, optsOrCallback: Any): js.Promise[NotaryJurisdiction] = js.native
  def updateNotaryJurisdiction(jurisdictionId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[NotaryJurisdiction] = js.native
  def updateNotaryJurisdiction(jurisdictionId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[NotaryJurisdiction] = js.native
}
