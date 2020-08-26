package typings.feathersjsAuthenticationOauth1.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeathersAuthenticationOAuth1Options extends js.Object {
  /**
    * A Verifier class. Defaults to the built-in one but can be a custom one. See below for details.
    */
  var Verifier: OAuth1Verifier = js.native
  /**
    * The route to register the callback handler
    */
  var callbackPath: String = js.native
  /**
    * hostname[:port]/auth/<provider>/callback',
    */
  var callbackURL: String = js.native
  /**
    * the entity that you are looking up
    */
  var entity: String = js.native
  /**
    * The response formatter. Defaults the the built in feathers-rest formatter, which returns JSON. todo: needs a proper type
    */
  var formatter: js.Any = js.native
  /**
    * Express middleware for handling the oauth callback. Defaults to the built in middleware. todo: needs a proper type
    */
  var handler: js.Any = js.native
  /**
    * The field to look up the entity by when logging in with the provider. Defaults to '<provider>Id' (ie. 'twitterId').
    */
  var idField: String = js.native
  /**
    * whether the request object should be passed to `verify`
    */
  var passReqToCallback: Boolean = js.native
  /**
    * The route to register the middleware
    */
  var path: String = js.native
  /**
    * the service to look up the entity
    */
  var service: String = js.native
  /**
    * whether to use sessions,
    */
  var session: Boolean = js.native
}

object FeathersAuthenticationOAuth1Options {
  @scala.inline
  def apply(
    Verifier: OAuth1Verifier,
    callbackPath: String,
    callbackURL: String,
    entity: String,
    formatter: js.Any,
    handler: js.Any,
    idField: String,
    passReqToCallback: Boolean,
    path: String,
    service: String,
    session: Boolean
  ): FeathersAuthenticationOAuth1Options = {
    val __obj = js.Dynamic.literal(Verifier = Verifier.asInstanceOf[js.Any], callbackPath = callbackPath.asInstanceOf[js.Any], callbackURL = callbackURL.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], formatter = formatter.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], idField = idField.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeathersAuthenticationOAuth1Options]
  }
  @scala.inline
  implicit class FeathersAuthenticationOAuth1OptionsOps[Self <: FeathersAuthenticationOAuth1Options] (val x: Self) extends AnyVal {
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
    def setVerifier(value: OAuth1Verifier): Self = this.set("Verifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallbackPath(value: String): Self = this.set("callbackPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallbackURL(value: String): Self = this.set("callbackURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntity(value: String): Self = this.set("entity", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormatter(value: js.Any): Self = this.set("formatter", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandler(value: js.Any): Self = this.set("handler", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdField(value: String): Self = this.set("idField", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassReqToCallback(value: Boolean): Self = this.set("passReqToCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: Boolean): Self = this.set("session", value.asInstanceOf[js.Any])
  }
  
}

