package typings.firebaseDatabase.distInternalMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface defining the set of actions that can be performed against the Firebase server
  * (basically corresponds to our wire protocol).
  *
  * @interface
  */
@js.native
trait ServerActions extends StObject {
  
  /**
    * Get the server value satisfying this query.
    */
  def get(query: QueryContext): js.Promise[String] = js.native
  
  def listen(
    query: QueryContext,
    currentHashFn: js.Function0[String],
    tag: Double,
    onComplete: js.Function2[/* a */ String, /* b */ Any, Unit]
  ): Unit = js.native
  def listen(
    query: QueryContext,
    currentHashFn: js.Function0[String],
    tag: Null,
    onComplete: js.Function2[/* a */ String, /* b */ Any, Unit]
  ): Unit = js.native
  
  def merge(
    pathString: String,
    data: Any,
    onComplete: js.Function2[/* a */ String, /* b */ String | Null, Unit]
  ): Unit = js.native
  def merge(
    pathString: String,
    data: Any,
    onComplete: js.Function2[/* a */ String, /* b */ String | Null, Unit],
    hash: String
  ): Unit = js.native
  
  def onDisconnectCancel(pathString: String): Unit = js.native
  def onDisconnectCancel(pathString: String, onComplete: js.Function2[/* a */ String, /* b */ String, Unit]): Unit = js.native
  
  def onDisconnectMerge(pathString: String, data: Any): Unit = js.native
  def onDisconnectMerge(pathString: String, data: Any, onComplete: js.Function2[/* a */ String, /* b */ String, Unit]): Unit = js.native
  
  def onDisconnectPut(pathString: String, data: Any): Unit = js.native
  def onDisconnectPut(pathString: String, data: Any, onComplete: js.Function2[/* a */ String, /* b */ String, Unit]): Unit = js.native
  
  def put(pathString: String, data: Any): Unit = js.native
  def put(pathString: String, data: Any, onComplete: js.Function2[/* a */ String, /* b */ String, Unit]): Unit = js.native
  def put(
    pathString: String,
    data: Any,
    onComplete: js.Function2[/* a */ String, /* b */ String, Unit],
    hash: String
  ): Unit = js.native
  def put(pathString: String, data: Any, onComplete: Unit, hash: String): Unit = js.native
  
  /**
    * Refreshes the app check token for the current connection.
    * @param token The app check token
    */
  def refreshAppCheckToken(token: String): Unit = js.native
  
  /**
    * Refreshes the auth token for the current connection.
    * @param token - The authentication token
    */
  def refreshAuthToken(token: String): Unit = js.native
  
  def reportStats(stats: StringDictionary[Any]): Unit = js.native
  
  /**
    * Remove a listen.
    */
  def unlisten(query: QueryContext): Unit = js.native
  def unlisten(query: QueryContext, tag: Double): Unit = js.native
}
