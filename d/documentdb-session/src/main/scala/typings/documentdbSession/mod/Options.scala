package typings.documentdbSession.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The ID of the collection where the session data should be stored.
    * If the collection does not exist, it will be created when the session store initializes.
    * The collection may contain other data, or it may be a dedicated collection just for sessions.
    *
    * @default `"sessions"`
    */
  var collection: js.UndefOr[String] = js.native
  /**
    * The ID of the database where the session data should be stored.
    * If the database does not exist, it will be creaed when the session store initializes.
    *
    * @default `"sessionstore"`
    */
  var database: js.UndefOr[String] = js.native
  /**
    * By default, `documentdb-session` sets a `"type"` attribute on each session document with a value of `"session"`,
    * to distinguish session documents from other documents in the collection.
    * If you would like a different attribute or value to be used to discriminate session documents from other documents,
    * enter that as an attribute-value pair in an object here, e.g. `{ site: "mysite.com" }` or `{ _type: "session" }`.
    *
    * @default `{ type: "session" }`
    */
  var discriminator: js.UndefOr[js.Object] = js.native
  /**
    * The URL / hostname of your DocumentDB database account, usually of the form `https://mydbaccount.documents.azure.com:443/`.
    * You can also provide this in an environment variable, (`DOCUMENTDB_URL`) instead.
    */
  var host: String = js.native
  /**
    * The primary key for your DocumentDB account.
    * A primary key is required because `documentdb-session` may create a new database for your account, if none exists.
    * You can also provide this in an environment variable (`DOCUMENTDB_KEY`) instead.
    */
  var key: String = js.native
  /**
    * The TTL (time-to-live or expiration time) for your sessions, in seconds.
    * After this time has elapsed since the last change to the session data, the session will be deleted.
    * A session's TTL is extended each time session data is changed, restarting the timer.
    * See more on [**Configuring TTL**](https://github.com/dwhieb/documentdb-session#configuring-ttl-time-to-live-or-expiration-time).
    * *Enabling TTL is strongly recommended.*
    */
  var ttl: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(host: String, key: String): Options = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollection(value: String): Self = this.set("collection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollection: Self = this.set("collection", js.undefined)
    @scala.inline
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    @scala.inline
    def setDiscriminator(value: js.Object): Self = this.set("discriminator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscriminator: Self = this.set("discriminator", js.undefined)
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
  
}

