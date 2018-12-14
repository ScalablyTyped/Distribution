package typings
package atFirebaseDatabaseLib.distSrcCoreServerActionsMod

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
    query: atFirebaseDatabaseLib.distSrcApiQueryMod.Query,
    currentHashFn: js.Function0[java.lang.String],
    tag: scala.Double,
    onComplete: js.Function2[/* a */ java.lang.String, /* b */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
       * @param {!Query} query
       * @param {function():string} currentHashFn
       * @param {?number} tag
       * @param {function(string, *)} onComplete
       */
  def listen(
    query: atFirebaseDatabaseLib.distSrcApiQueryMod.Query,
    currentHashFn: js.Function0[java.lang.String],
    tag: scala.Null,
    onComplete: js.Function2[/* a */ java.lang.String, /* b */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
       * @param {string} pathString
       * @param {*} data
       * @param {function(string, ?string)} onComplete
       * @param {string=} hash
       */
  def merge(
    pathString: java.lang.String,
    data: js.Any,
    onComplete: js.Function2[/* a */ java.lang.String, /* b */ java.lang.String | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
       * @param {string} pathString
       * @param {*} data
       * @param {function(string, ?string)} onComplete
       * @param {string=} hash
       */
  def merge(
    pathString: java.lang.String,
    data: js.Any,
    onComplete: js.Function2[/* a */ java.lang.String, /* b */ java.lang.String | scala.Null, scala.Unit],
    hash: java.lang.String
  ): scala.Unit = js.native
  /**
       * @param {string} pathString
       * @param {function(string, string)=} onComplete
       */
  def onDisconnectCancel(pathString: java.lang.String): scala.Unit = js.native
  /**
       * @param {string} pathString
       * @param {function(string, string)=} onComplete
       */
  def onDisconnectCancel(
    pathString: java.lang.String,
    onComplete: js.Function2[/* a */ java.lang.String, /* b */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       * @param {string} pathString
       * @param {*} data
       * @param {function(string, string)=} onComplete
       */
  def onDisconnectMerge(pathString: java.lang.String, data: js.Any): scala.Unit = js.native
  /**
       * @param {string} pathString
       * @param {*} data
       * @param {function(string, string)=} onComplete
       */
  def onDisconnectMerge(
    pathString: java.lang.String,
    data: js.Any,
    onComplete: js.Function2[/* a */ java.lang.String, /* b */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       * @param {string} pathString
       * @param {*} data
       * @param {function(string, string)=} onComplete
       */
  def onDisconnectPut(pathString: java.lang.String, data: js.Any): scala.Unit = js.native
  /**
       * @param {string} pathString
       * @param {*} data
       * @param {function(string, string)=} onComplete
       */
  def onDisconnectPut(
    pathString: java.lang.String,
    data: js.Any,
    onComplete: js.Function2[/* a */ java.lang.String, /* b */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       * @param {string} pathString
       * @param {*} data
       * @param {function(string, string)=} onComplete
       * @param {string=} hash
       */
  def put(pathString: java.lang.String, data: js.Any): scala.Unit = js.native
  /**
       * @param {string} pathString
       * @param {*} data
       * @param {function(string, string)=} onComplete
       * @param {string=} hash
       */
  def put(
    pathString: java.lang.String,
    data: js.Any,
    onComplete: js.Function2[/* a */ java.lang.String, /* b */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       * @param {string} pathString
       * @param {*} data
       * @param {function(string, string)=} onComplete
       * @param {string=} hash
       */
  def put(
    pathString: java.lang.String,
    data: js.Any,
    onComplete: js.Function2[/* a */ java.lang.String, /* b */ java.lang.String, scala.Unit],
    hash: java.lang.String
  ): scala.Unit = js.native
  /**
       * Refreshes the auth token for the current connection.
       * @param {string} token The authentication token
       */
  def refreshAuthToken(token: java.lang.String): scala.Unit = js.native
  /**
       * @param {Object.<string, *>} stats
       */
  def reportStats(stats: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  /**
       * Remove a listen.
       *
       * @param {!Query} query
       * @param {?number} tag
       */
  def unlisten(query: atFirebaseDatabaseLib.distSrcApiQueryMod.Query): scala.Unit = js.native
  /**
       * Remove a listen.
       *
       * @param {!Query} query
       * @param {?number} tag
       */
  def unlisten(query: atFirebaseDatabaseLib.distSrcApiQueryMod.Query, tag: scala.Double): scala.Unit = js.native
}

