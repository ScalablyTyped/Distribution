package typings.expressSession

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.expressSession.anon.SessionPartialSessionData
import typings.expressSession.expressSessionStrings.auto
import typings.expressSession.expressSessionStrings.destroy
import typings.expressSession.expressSessionStrings.keep
import typings.expressSession.expressSessionStrings.lax
import typings.expressSession.expressSessionStrings.none
import typings.expressSession.expressSessionStrings.strict
import typings.expressSession.mod.global.Express.Request
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def apply(options: SessionOptions): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  @JSImport("express-session", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("express-session", "Cookie")
  @js.native
  open class Cookie ()
    extends StObject
       with CookieOptions {
    
    /** Returns the original `maxAge` (time-to-live), in milliseconds, of the session cookie. */
    var originalMaxAge: Double = js.native
  }
  
  /**
    * **Warning:** the default server-side session storage, `MemoryStore`, is purposely not designed for a production environment.
    * It will leak memory under most conditions, does not scale past a single process, and is only meant for debugging and developing.
    */
  @JSImport("express-session", "MemoryStore")
  @js.native
  open class MemoryStore () extends Store {
    def this(options: EventEmitterOptions) = this()
    
    @JSName("all")
    def all_MMemoryStore(
      callback: js.Function2[/* err */ Any, /* obj */ js.UndefOr[StringDictionary[SessionData] | Null], Unit]
    ): Unit = js.native
    
    @JSName("clear")
    def clear_MMemoryStore(): Unit = js.native
    @JSName("clear")
    def clear_MMemoryStore(callback: js.Function1[/* err */ js.UndefOr[Any], Unit]): Unit = js.native
    
    @JSName("length")
    def length_MMemoryStore(callback: js.Function2[/* err */ Any, /* length */ Double, Unit]): Unit = js.native
    
    @JSName("touch")
    def touch_MMemoryStore(sid: String, session: SessionData): Unit = js.native
    @JSName("touch")
    def touch_MMemoryStore(sid: String, session: SessionData, callback: js.Function0[Unit]): Unit = js.native
  }
  
  @JSImport("express-session", "Session")
  @js.native
  open class Session protected () extends StObject {
    /* private */ def this(request: Request, data: SessionData) = this()
    
    /**
      * Each session has a unique cookie object accompany it.
      * This allows you to alter the session cookie per visitor.
      * For example we can set `req.session.cookie.expires` to `false` to enable the cookie to remain for only the duration of the user-agent.
      */
    var cookie: Cookie = js.native
    
    /** Destroys the session and will unset the `req.session` property. Once complete, the `callback` will be invoked. */
    def destroy(callback: js.Function1[/* err */ Any, Unit]): this.type = js.native
    
    /**
      * Each session has a unique ID associated with it.
      * This property is an alias of `req.sessionID` and cannot be modified.
      * It has been added to make the session ID accessible from the session object.
      */
    var id: String = js.native
    
    /** To regenerate the session simply invoke the method. Once complete, a new SID and `Session` instance will be initialized at `req.session` and the `callback` will be invoked. */
    def regenerate(callback: js.Function1[/* err */ Any, Unit]): this.type = js.native
    
    /** Reloads the session data from the store and re-populates the `req.session` object. Once complete, the `callback` will be invoked. */
    def reload(callback: js.Function1[/* err */ Any, Unit]): this.type = js.native
    
    /**
      * Resets the cookie's `maxAge` to `originalMaxAge`
      * @see Cookie
      */
    def resetMaxAge(): this.type = js.native
    
    /**
      * Save the session back to the store, replacing the contents on the store with the contents in memory
      *   (though a store may do something else - consult the store's documentation for exact behavior).
      *
      * This method is automatically called at the end of the HTTP response if the session data has been altered
      *   (though this behavior can be altered with various options in the middleware constructor).
      * Because of this, typically this method does not need to be called.
      * There are some cases where it is useful to call this method, for example: redirects, long-lived requests or in WebSockets.
      */
    def save(): this.type = js.native
    def save(callback: js.Function1[/* err */ Any, Unit]): this.type = js.native
    
    /** Updates the `maxAge` property. Typically this is not necessary to call, as the session middleware does this for you. */
    def touch(): this.type = js.native
  }
  
  @JSImport("express-session", "Store")
  @js.native
  abstract class Store () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    /** Returns all sessions in the store */
    // https://github.com/DefinitelyTyped/DefinitelyTyped/pull/38783, https://github.com/expressjs/session/pull/700#issuecomment-540855551
    var all: js.UndefOr[
        js.Function1[
          /* callback */ js.Function2[
            /* err */ Any, 
            /* obj */ js.UndefOr[js.Array[SessionData] | StringDictionary[SessionData] | Null], 
            Unit
          ], 
          Unit
        ]
      ] = js.native
    
    /** Delete all sessions from the store. */
    var clear: js.UndefOr[
        js.Function1[/* callback */ js.UndefOr[js.Function1[/* err */ js.UndefOr[Any], Unit]], Unit]
      ] = js.native
    
    def createSession(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      session: SessionData
    ): Session & SessionData = js.native
    
    /** Destroys the dession with the given session ID. */
    def destroy(sid: String): Unit = js.native
    def destroy(sid: String, callback: js.Function1[/* err */ js.UndefOr[Any], Unit]): Unit = js.native
    
    /**
      * Gets the session from the store given a session ID and passes it to `callback`.
      *
      * The `session` argument should be a `Session` object if found, otherwise `null` or `undefined` if the session was not found and there was no error.
      * A special case is made when `error.code === 'ENOENT'` to act like `callback(null, null)`.
      */
    def get(
      sid: String,
      callback: js.Function2[/* err */ Any, /* session */ js.UndefOr[SessionData | Null], Unit]
    ): Unit = js.native
    
    /** Returns the amount of sessions in the store. */
    var length: js.UndefOr[
        js.Function1[/* callback */ js.Function2[/* err */ Any, /* length */ Double, Unit], Unit]
      ] = js.native
    
    def load(sid: String, callback: js.Function2[/* err */ Any, /* session */ js.UndefOr[SessionData], Any]): Unit = js.native
    
    def regenerate(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      callback: js.Function1[/* err */ js.UndefOr[Any], Any]
    ): Unit = js.native
    
    /** Upsert a session in the store given a session ID and `SessionData` */
    def set(sid: String, session: SessionData): Unit = js.native
    def set(sid: String, session: SessionData, callback: js.Function1[/* err */ js.UndefOr[Any], Unit]): Unit = js.native
    
    /** "Touches" a given session, resetting the idle timer. */
    var touch: js.UndefOr[
        js.Function3[
          /* sid */ String, 
          /* session */ SessionData, 
          /* callback */ js.UndefOr[js.Function0[Unit]], 
          Unit
        ]
      ] = js.native
  }
  
  trait CookieOptions extends StObject {
    
    /**
      * Specifies the value for the `Domain Set-Cookie` attribute.
      * By default, no domain is set, and most clients will consider the cookie to apply to only the current domain.
      */
    var domain: js.UndefOr[String] = js.undefined
    
    var encode: js.UndefOr[js.Function1[/* val */ String, String]] = js.undefined
    
    /**
      * Specifies the `Date` object to be the value for the `Expires Set-Cookie` attribute.
      * By default, no expiration is set, and most clients will consider this a "non-persistent cookie" and will delete it on a condition like exiting a web browser application.
      *
      * If both `expires` and `maxAge` are set in the options, then the last one defined in the object is what is used.
      *
      * @deprecated The `expires` option should not be set directly; instead only use the `maxAge` option
      * @see maxAge
      */
    var expires: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Specifies the boolean value for the `HttpOnly Set-Cookie` attribute. When truthy, the `HttpOnly` attribute is set, otherwise it is not.
      * By default, the `HttpOnly` attribute is set.
      *
      * Be careful when setting this to `true`, as compliant clients will not allow client-side JavaScript to see the cookie in `document.cookie`.
      */
    var httpOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the number (in milliseconds) to use when calculating the `Expires Set-Cookie` attribute.
      * This is done by taking the current server time and adding `maxAge` milliseconds to the value to calculate an `Expires` datetime. By default, no maximum age is set.
      *
      * If both `expires` and `maxAge` are set in the options, then the last one defined in the object is what is used.
      * `maxAge` should be preferred over `expires`.
      *
      * @see expires
      */
    var maxAge: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies the value for the `Path Set-Cookie` attribute.
      * By default, this is set to '/', which is the root path of the domain.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the boolean or string to be the value for the `SameSite Set-Cookie` attribute.
      * - `true` will set the `SameSite` attribute to `Strict` for strict same site enforcement.
      * - `false` will not set the `SameSite` attribute.
      * - `lax` will set the `SameSite` attribute to `Lax` for lax same site enforcement.
      * - `none` will set the `SameSite` attribute to `None` for an explicit cross-site cookie.
      * - `strict` will set the `SameSite` attribute to `Strict` for strict same site enforcement.
      *
      * More information about the different enforcement levels can be found in the specification.
      *
      * **Note:** This is an attribute that has not yet been fully standardized, and may change in the future.
      * This also means many clients may ignore this attribute until they understand it.
      */
    var sameSite: js.UndefOr[Boolean | lax | strict | none] = js.undefined
    
    /**
      * Specifies the boolean value for the `Secure Set-Cookie` attribute. When truthy, the `Secure` attribute is set, otherwise it is not. By default, the `Secure` attribute is not set.
      * Be careful when setting this to true, as compliant clients will not send the cookie back to the server in the future if the browser does not have an HTTPS connection.
      *
      * Please note that `secure: true` is a **recommended option**.
      * However, it requires an https-enabled website, i.e., HTTPS is necessary for secure cookies.
      * If `secure` is set, and you access your site over HTTP, **the cookie will not be set**.
      *
      * The cookie.secure option can also be set to the special value `auto` to have this setting automatically match the determined security of the connection.
      * Be careful when using this setting if the site is available both as HTTP and HTTPS, as once the cookie is set on HTTPS, it will no longer be visible over HTTP.
      * This is useful when the Express "trust proxy" setting is properly setup to simplify development vs production configuration.
      *
      * If you have your node.js behind a proxy and are using `secure: true`, you need to set "trust proxy" in express. Please see the [README](https://github.com/expressjs/session) for details.
      *
      * Please see the [README](https://github.com/expressjs/session) for an example of using secure cookies in production, but allowing for testing in development based on NODE_ENV.
      */
    var secure: js.UndefOr[Boolean | auto] = js.undefined
    
    var signed: js.UndefOr[Boolean] = js.undefined
  }
  object CookieOptions {
    
    inline def apply(): CookieOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieOptions]
    }
    
    extension [Self <: CookieOptions](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setEncode(value: /* val */ String => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      inline def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSameSite(value: Boolean | lax | strict | none): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      inline def setSecure(value: Boolean | auto): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setSigned(value: Boolean): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
      
      inline def setSignedUndefined: Self = StObject.set(x, "signed", js.undefined)
    }
  }
  
  /**
    * This interface allows you to declare additional properties on your session object using [declaration merging](https://www.typescriptlang.org/docs/handbook/declaration-merging.html).
    *
    * @example
    * declare module 'express-session' {
    *     interface SessionData {
    *         views: number;
    *     }
    * }
    *
    */
  trait SessionData extends StObject {
    
    var cookie: Cookie
  }
  object SessionData {
    
    inline def apply(cookie: Cookie): SessionData = {
      val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionData]
    }
    
    extension [Self <: SessionData](x: Self) {
      
      inline def setCookie(value: Cookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    }
  }
  
  trait SessionOptions extends StObject {
    
    /**
      * Settings object for the session ID cookie.
      * @see CookieOptions
      */
    var cookie: js.UndefOr[CookieOptions] = js.undefined
    
    /**
      * Function to call to generate a new session ID. Provide a function that returns a string that will be used as a session ID.
      * The function is given the request as the first argument if you want to use some value attached to it when generating the ID.
      *
      * The default value is a function which uses the uid-safe library to generate IDs.
      * Be careful to generate unique IDs so your sessions do not conflict.
      */
    var genid: js.UndefOr[
        js.Function1[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          String
        ]
      ] = js.undefined
    
    /**
      * The name of the session ID cookie to set in the response (and read from in the request).
      * The default value is 'connect.sid'.
      *
      * Note if you have multiple apps running on the same hostname (this is just the name, i.e. `localhost` or `127.0.0.1`; different schemes and ports do not name a different hostname),
      *   then you need to separate the session cookies from each other.
      * The simplest method is to simply set different names per app.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Trust the reverse proxy when setting secure cookies (via the "X-Forwarded-Proto" header).
      * The default value is undefined.
      *
      * - `true`: The `X-Forwarded-Proto` header will be used.
      * - `false`: All headers are ignored and the connection is considered secure only if there is a direct TLS/SSL connection.
      * - `undefined`: Uses the "trust proxy" setting from express
      */
    var proxy: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Forces the session to be saved back to the session store, even if the session was never modified during the request.
      * Depending on your store this may be necessary, but it can also create race conditions where a client makes two parallel requests to your server
      *   and changes made to the session in one request may get overwritten when the other request ends, even if it made no changes (this behavior also depends on what store you're using).
      *
      * The default value is `true`, but using the default has been deprecated, as the default will change in the future.
      * Please research into this setting and choose what is appropriate to your use-case. Typically, you'll want `false`.
      *
      * How do I know if this is necessary for my store? The best way to know is to check with your store if it implements the `touch` method.
      * If it does, then you can safely set `resave: false`.
      * If it does not implement the `touch` method and your store sets an expiration date on stored sessions, then you likely need `resave: true`.
      */
    var resave: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Force the session identifier cookie to be set on every response. The expiration is reset to the original `maxAge`, resetting the expiration countdown.
      * The default value is `false`.
      *
      * With this enabled, the session identifier cookie will expire in `maxAge` *since the last response was sent* instead of in `maxAge` *since the session was last modified by the server*.
      * This is typically used in conjuction with short, non-session-length `maxAge` values to provide a quick timeout of the session data
      *   with reduced potential of it occurring during on going server interactions.
      *
      * Note that when this option is set to `true` but the `saveUninitialized` option is set to `false`, the cookie will not be set on a response with an uninitialized session.
      * This option only modifies the behavior when an existing session was loaded for the request.
      *
      * @see saveUninitialized
      */
    var rolling: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Forces a session that is "uninitialized" to be saved to the store. A session is uninitialized when it is new but not modified.
      * Choosing `false` is useful for implementing login sessions, reducing server storage usage, or complying with laws that require permission before setting a cookie.
      * Choosing `false` will also help with race conditions where a client makes multiple parallel requests without a session.
      *
      * The default value is `true`, but using the default has been deprecated, as the default will change in the future.
      * Please research into this setting and choose what is appropriate to your use-case.
      *
      * **If you are using `express-session` in conjunction with PassportJS:**
      * Passport will add an empty Passport object to the session for use after a user is authenticated, which will be treated as a modification to the session, causing it to be saved.
      * This has been fixed in PassportJS 0.3.0.
      */
    var saveUninitialized: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This is the secret used to sign the session cookie. This can be either a string for a single secret, or an array of multiple secrets.
      * If an array of secrets is provided, **only the first element will be used to sign** the session ID cookie,
      *   while **all the elements will be considered when verifying the signature** in requests.
      * The secret itself should be not easily parsed by a human and would best be a random set of characters
      *
      * Best practices may include:
      * - The use of environment variables to store the secret, ensuring the secret itself does not exist in your repository.
      * - Periodic updates of the secret, while ensuring the previous secret is in the array.
      *
      * Using a secret that cannot be guessed will reduce the ability to hijack a session to only guessing the session ID (as determined by the `genid` option).
      *
      * Changing the secret value will invalidate all existing sessions.
      * In order to rotate the secret without invalidating sessions, provide an array of secrets,
      *   with the new secret as first element of the array, and including previous secrets as the later elements.
      */
    var secret: String | js.Array[String]
    
    /**
      * The session store instance, defaults to a new `MemoryStore` instance.
      * @see MemoryStore
      */
    var store: js.UndefOr[Store] = js.undefined
    
    /**
      * Control the result of unsetting req.session (through delete, setting to null, etc.).
      * - `destroy`: The session will be destroyed (deleted) when the response ends.
      * - `keep`: The session in the store will be kept, but modifications made during the request are ignored and not saved.
      * @default 'keep'
      */
    var unset: js.UndefOr[destroy | keep] = js.undefined
  }
  object SessionOptions {
    
    inline def apply(secret: String | js.Array[String]): SessionOptions = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionOptions]
    }
    
    extension [Self <: SessionOptions](x: Self) {
      
      inline def setCookie(value: CookieOptions): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setGenid(
        value: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ] => String
      ): Self = StObject.set(x, "genid", js.Any.fromFunction1(value))
      
      inline def setGenidUndefined: Self = StObject.set(x, "genid", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProxy(value: Boolean): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setResave(value: Boolean): Self = StObject.set(x, "resave", value.asInstanceOf[js.Any])
      
      inline def setResaveUndefined: Self = StObject.set(x, "resave", js.undefined)
      
      inline def setRolling(value: Boolean): Self = StObject.set(x, "rolling", value.asInstanceOf[js.Any])
      
      inline def setRollingUndefined: Self = StObject.set(x, "rolling", js.undefined)
      
      inline def setSaveUninitialized(value: Boolean): Self = StObject.set(x, "saveUninitialized", value.asInstanceOf[js.Any])
      
      inline def setSaveUninitializedUndefined: Self = StObject.set(x, "saveUninitialized", js.undefined)
      
      inline def setSecret(value: String | js.Array[String]): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretVarargs(value: String*): Self = StObject.set(x, "secret", js.Array(value*))
      
      inline def setStore(value: Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setUnset(value: destroy | keep): Self = StObject.set(x, "unset", value.asInstanceOf[js.Any])
      
      inline def setUnsetUndefined: Self = StObject.set(x, "unset", js.undefined)
    }
  }
  
  object global {
    
    object Express {
      
      // Inject additional properties on express.Request
      trait Request extends StObject {
        
        /**
          * This request's `Session` object.
          * Even though this property isn't marked as optional, it won't exist until you use the `express-session` middleware
          * [Declaration merging](https://www.typescriptlang.org/docs/handbook/declaration-merging.html) can be used to add your own properties.
          *
          * @see SessionData
          */
        var session: SessionPartialSessionData
        
        /**
          * This request's session ID.
          * Even though this property isn't marked as optional, it won't exist until you use the `express-session` middleware
          */
        var sessionID: String
        
        /**
          * The Store in use.
          * Even though this property isn't marked as optional, it won't exist until you use the `express-session` middleware
          * The function `generate` is added by express-session
          */
        var sessionStore: SessionStore
      }
      object Request {
        
        inline def apply(session: SessionPartialSessionData, sessionID: String, sessionStore: SessionStore): Request = {
          val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], sessionID = sessionID.asInstanceOf[js.Any], sessionStore = sessionStore.asInstanceOf[js.Any])
          __obj.asInstanceOf[Request]
        }
        
        extension [Self <: Request](x: Self) {
          
          inline def setSession(value: SessionPartialSessionData): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
          
          inline def setSessionID(value: String): Self = StObject.set(x, "sessionID", value.asInstanceOf[js.Any])
          
          inline def setSessionStore(value: SessionStore): Self = StObject.set(x, "sessionStore", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait SessionStore extends Store {
        
        def generate(req: Request): Unit = js.native
      }
    }
  }
}
