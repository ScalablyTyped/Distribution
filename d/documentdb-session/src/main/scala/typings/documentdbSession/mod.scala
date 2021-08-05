package typings.documentdbSession

import org.scalablytyped.runtime.Instantiable1
import typings.documentdbSession.anon.FnCall
import typings.expressSession.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(expressSession: FnCall): DocumentDBStoreConstructor = ^.asInstanceOf[js.Dynamic].apply(expressSession.asInstanceOf[js.Any]).asInstanceOf[DocumentDBStoreConstructor]
  
  @JSImport("documentdb-session", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait DocumentDBStoreConstructor
    extends StObject
       with Instantiable1[/* options */ Options, Store]
  
  trait Options extends StObject {
    
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
    
    inline def apply(host: String, key: String): Options = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      inline def setDiscriminator(value: js.Object): Self = StObject.set(x, "discriminator", value.asInstanceOf[js.Any])
      
      inline def setDiscriminatorUndefined: Self = StObject.set(x, "discriminator", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
}
