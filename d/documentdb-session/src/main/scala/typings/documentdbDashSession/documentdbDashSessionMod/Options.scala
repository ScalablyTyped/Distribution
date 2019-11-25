package typings.documentdbDashSession.documentdbDashSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The ID of the collection where the session data should be stored.
    * If the collection does not exist, it will be created when the session store initializes.
    * The collection may contain other data, or it may be a dedicated collection just for sessions.
    *
    * @default `"sessions"`
    */
  var collection: js.UndefOr[String] = js.undefined
  /**
    * The ID of the database where the session data should be stored.
    * If the database does not exist, it will be creaed when the session store initializes.
    *
    * @default `"sessionstore"`
    */
  var database: js.UndefOr[String] = js.undefined
  /**
    * By default, `documentdb-session` sets a `"type"` attribute on each session document with a value of `"session"`,
    * to distinguish session documents from other documents in the collection.
    * If you would like a different attribute or value to be used to discriminate session documents from other documents,
    * enter that as an attribute-value pair in an object here, e.g. `{ site: "mysite.com" }` or `{ _type: "session" }`.
    *
    * @default `{ type: "session" }`
    */
  var discriminator: js.UndefOr[js.Object] = js.undefined
  /**
    * The URL / hostname of your DocumentDB database account, usually of the form `https://mydbaccount.documents.azure.com:443/`.
    * You can also provide this in an environment variable, (`DOCUMENTDB_URL`) instead.
    */
  var host: String
  /**
    * The primary key for your DocumentDB account.
    * A primary key is required because `documentdb-session` may create a new database for your account, if none exists.
    * You can also provide this in an environment variable (`DOCUMENTDB_KEY`) instead.
    */
  var key: String
  /**
    * The TTL (time-to-live or expiration time) for your sessions, in seconds.
    * After this time has elapsed since the last change to the session data, the session will be deleted.
    * A session's TTL is extended each time session data is changed, restarting the timer.
    * See more on [**Configuring TTL**](https://github.com/dwhieb/documentdb-session#configuring-ttl-time-to-live-or-expiration-time).
    * *Enabling TTL is strongly recommended.*
    */
  var ttl: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    host: String,
    key: String,
    collection: String = null,
    database: String = null,
    discriminator: js.Object = null,
    ttl: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (collection != null) __obj.updateDynamic("collection")(collection.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (discriminator != null) __obj.updateDynamic("discriminator")(discriminator.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

