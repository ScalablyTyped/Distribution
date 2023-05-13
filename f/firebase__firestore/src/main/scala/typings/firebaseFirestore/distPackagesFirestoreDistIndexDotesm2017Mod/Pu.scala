package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `WebStorageSharedClientState` uses WebStorage (window.localStorage) as the
  * backing store for the SharedClientState. It keeps track of all active
  * clients and supports modifications of the local client's data.
  */ @js.native
trait Pu extends StObject {
  
  @JSName("$r")
  def $r(t: Any): Unit = js.native
  
  var Ar: js.RegExp = js.native
  
  /**
    * Parses a client state in WebStorage. Returns 'null' if the value could not
    * be parsed.
    */ def Br(t: Any, e: Any): Au | Null = js.native
  
  def Cr(t: Any): Unit = js.native
  
  def Dr(t: Any, e: Any, n: Any): Unit = js.native
  
  var Er: js.RegExp = js.native
  
  def Fr(t: Any, e: Any): Any = js.native
  
  def Gr(t: Any): Any = js.native
  
  var Ir: String = js.native
  
  def Kr(t: Any): Any = js.native
  
  /**
    * Parses a mutation batch state in WebStorage. Returns 'null' if the value
    * could not be parsed.
    */ def Lr(t: Any, e: Any): Tu | Null = js.native
  
  def Mr(t: Any): Unit = js.native
  
  def Nr: Any = js.native
  
  /**
    * Parses a client state key in WebStorage. Returns null if the key does not
    * match the expected key format.
    */ def Or(t: Any): String | Null = js.native
  
  def Pr(): Unit = js.native
  
  var Rr: String = js.native
  
  def Sr(t: Any): Ee = js.native
  
  var Tr: js.RegExp = js.native
  
  /**
    * Parses a query target state from WebStorage. Returns 'null' if the value
    * could not be parsed.
    */ def Ur(t: Any, e: Any): Eu | Null = js.native
  
  def Vr(t: Any): Unit = js.native
  
  def _r(t: Any): Unit = js.native
  
  def addLocalQueryTarget(t: Any): String = js.native
  
  def addPendingMutation(t: Any): Unit = js.native
  
  /**
    * Parses an online state from WebStorage. Returns 'null' if the value
    * could not be parsed.
    */ def br(t: Any): vu | Null = js.native
  
  def clearQueryState(t: Any): Unit = js.native
  
  var currentUser: Any = js.native
  
  def getAllActiveQueryTargets(): Ee = js.native
  
  def getItem(t: Any): Any = js.native
  
  var gr: pe = js.native
  
  def handleUserChange(t: Any, e: Any, n: Any): Unit = js.native
  
  var ii: Any = js.native
  
  def isActiveQueryTarget(t: Any): Boolean = js.native
  
  def isLocalQueryTarget(t: Any): Any = js.native
  
  def kr(t: Any, e: Any, n: Any): Unit = js.native
  
  def mr(t: Any): Unit = js.native
  
  def notifyBundleLoaded(t: Any): Unit = js.native
  
  var onlineStateHandler: Any = js.native
  
  var persistenceKey: Any = js.native
  
  var pr: String = js.native
  
  def qr(t: Any): js.Promise[Any] = js.native
  
  def removeItem(t: Any): Unit = js.native
  
  def removeLocalQueryTarget(t: Any): Unit = js.native
  
  var sequenceNumberHandler: Any = js.native
  
  def setItem(t: Any, e: Any): Unit = js.native
  
  def setOnlineState(t: Any): Unit = js.native
  
  def shutdown(): Unit = js.native
  
  def start(): js.Promise[Unit] = js.native
  
  var started: Boolean = js.native
  
  var storage: Any = js.native
  
  var syncEngine: Any = js.native
  
  def updateMutationState(t: Any, e: Any, n: Any): Unit = js.native
  
  def updateQueryState(t: Any, e: Any, n: Any): Unit = js.native
  
  var vr: String = js.native
  
  var window: Any = js.native
  
  var wr: Any = js.native
  
  def writeSequenceNumber(t: Any): Unit = js.native
  
  /**
    * Captures WebStorage events that occur before `start()` is called. These
    * events are replayed once `WebStorageSharedClientState` is started.
    */
  var yr: js.Array[Any] = js.native
}
