package typings.expressSession.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressSession.expressSessionStrings.destroy
import typings.expressSession.expressSessionStrings.keep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionOptions extends js.Object {
  
  /**
    * Settings object for the session ID cookie.
    * @see CookieOptions
    */
  var cookie: js.UndefOr[CookieOptions] = js.native
  
  /**
    * Function to call to generate a new session ID. Provide a function that returns a string that will be used as a session ID.
    * The function is given the request as the first argument if you want to use some value attached to it when generating the ID.
    *
    * The default value is a function which uses the uid-safe library to generate IDs.
    * Be careful to generate unique IDs so your sessions do not conflict.
    */
  var genid: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]] = js.native
  
  /**
    * The name of the session ID cookie to set in the response (and read from in the request).
    * The default value is 'connect.sid'.
    *
    * Note if you have multiple apps running on the same hostname (this is just the name, i.e. `localhost` or `127.0.0.1`; different schemes and ports do not name a different hostname),
    *   then you need to separate the session cookies from each other.
    * The simplest method is to simply set different names per app.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Trust the reverse proxy when setting secure cookies (via the "X-Forwarded-Proto" header).
    * The default value is undefined.
    *
    * - `true`: The `X-Forwarded-Proto` header will be used.
    * - `false`: All headers are ignored and the connection is considered secure only if there is a direct TLS/SSL connection.
    * - `undefined`: Uses the "trust proxy" setting from express
    */
  var proxy: js.UndefOr[Boolean] = js.native
  
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
  var resave: js.UndefOr[Boolean] = js.native
  
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
  var rolling: js.UndefOr[Boolean] = js.native
  
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
  var saveUninitialized: js.UndefOr[Boolean] = js.native
  
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
  var secret: String | js.Array[String] = js.native
  
  /**
    * The session store instance, defaults to a new `MemoryStore` instance.
    * @see MemoryStore
    */
  var store: js.UndefOr[Store] = js.native
  
  /**
    * Control the result of unsetting req.session (through delete, setting to null, etc.).
    * - `destroy`: The session will be destroyed (deleted) when the response ends.
    * - `keep`: The session in the store will be kept, but modifications made during the request are ignored and not saved.
    * @default 'keep'
    */
  var unset: js.UndefOr[destroy | keep] = js.native
}
object SessionOptions {
  
  @scala.inline
  def apply(secret: String | js.Array[String]): SessionOptions = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionOptions]
  }
  
  @scala.inline
  implicit class SessionOptionsOps[Self <: SessionOptions] (val x: Self) extends AnyVal {
    
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
    def setSecretVarargs(value: String*): Self = this.set("secret", js.Array(value :_*))
    
    @scala.inline
    def setSecret(value: String | js.Array[String]): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookie(value: CookieOptions): Self = this.set("cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    
    @scala.inline
    def setGenid(value: /* req */ Request_[ParamsDictionary, _, _, Query] => String): Self = this.set("genid", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGenid: Self = this.set("genid", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProxy(value: Boolean): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setResave(value: Boolean): Self = this.set("resave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResave: Self = this.set("resave", js.undefined)
    
    @scala.inline
    def setRolling(value: Boolean): Self = this.set("rolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRolling: Self = this.set("rolling", js.undefined)
    
    @scala.inline
    def setSaveUninitialized(value: Boolean): Self = this.set("saveUninitialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveUninitialized: Self = this.set("saveUninitialized", js.undefined)
    
    @scala.inline
    def setStore(value: Store): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    
    @scala.inline
    def setUnset(value: destroy | keep): Self = this.set("unset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnset: Self = this.set("unset", js.undefined)
  }
}
