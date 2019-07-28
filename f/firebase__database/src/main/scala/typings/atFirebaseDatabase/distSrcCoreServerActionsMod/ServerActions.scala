package typings.atFirebaseDatabase.distSrcCoreServerActionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atFirebaseDatabase.distSrcApiQueryMod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/ServerActions", "ServerActions")
@js.native
abstract class ServerActions () extends js.Object {
  /**
    * @param {!Query} query
    * @param {function():string} currentHashFn
    * @param {?number} tag
    * @param {function(string, *)} onComplete
    */
  def listen(
    query: Query,
    currentHashFn: js.Function0[String],
    tag: Double,
    onComplete: js.Function2[/* a */ String, /* b */ js.Any, Unit]
  ): Unit = js.native
  def listen(
    query: Query,
    currentHashFn: js.Function0[String],
    tag: Null,
    onComplete: js.Function2[/* a */ String, /* b */ js.Any, Unit]
  ): Unit = js.native
  /**
    * @param {string} pathString
    * @param {*} data
    * @param {function(string, ?string)} onComplete
    * @param {string=} hash
    */
  def merge(
    pathString: String,
    data: js.Any,
    onComplete: js.Function2[/* a */ String, /* b */ String | Null, Unit]
  ): Unit = js.native
  def merge(
    pathString: String,
    data: js.Any,
    onComplete: js.Function2[/* a */ String, /* b */ String | Null, Unit],
    hash: String
  ): Unit = js.native
  /**
    * @param {string} pathString
    * @param {function(string, string)=} onComplete
    */
  def onDisconnectCancel(pathString: String): Unit = js.native
  def onDisconnectCancel(pathString: String, onComplete: js.Function2[/* a */ String, /* b */ String, Unit]): Unit = js.native
  /**
    * @param {string} pathString
    * @param {*} data
    * @param {function(string, string)=} onComplete
    */
  def onDisconnectMerge(pathString: String, data: js.Any): Unit = js.native
  def onDisconnectMerge(pathString: String, data: js.Any, onComplete: js.Function2[/* a */ String, /* b */ String, Unit]): Unit = js.native
  /**
    * @param {string} pathString
    * @param {*} data
    * @param {function(string, string)=} onComplete
    */
  def onDisconnectPut(pathString: String, data: js.Any): Unit = js.native
  def onDisconnectPut(pathString: String, data: js.Any, onComplete: js.Function2[/* a */ String, /* b */ String, Unit]): Unit = js.native
  /**
    * @param {string} pathString
    * @param {*} data
    * @param {function(string, string)=} onComplete
    * @param {string=} hash
    */
  def put(pathString: String, data: js.Any): Unit = js.native
  def put(pathString: String, data: js.Any, onComplete: js.Function2[/* a */ String, /* b */ String, Unit]): Unit = js.native
  def put(
    pathString: String,
    data: js.Any,
    onComplete: js.Function2[/* a */ String, /* b */ String, Unit],
    hash: String
  ): Unit = js.native
  /**
    * Refreshes the auth token for the current connection.
    * @param {string} token The authentication token
    */
  def refreshAuthToken(token: String): Unit = js.native
  /**
    * @param {Object.<string, *>} stats
    */
  def reportStats(stats: StringDictionary[js.Any]): Unit = js.native
  def unlisten(query: Query): Unit = js.native
  /**
    * Remove a listen.
    *
    * @param {!Query} query
    * @param {?number} tag
    */
  def unlisten(query: Query, tag: Double): Unit = js.native
}

