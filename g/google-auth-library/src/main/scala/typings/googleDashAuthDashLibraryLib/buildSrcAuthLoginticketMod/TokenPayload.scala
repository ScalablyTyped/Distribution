package typings
package googleDashAuthDashLibraryLib.buildSrcAuthLoginticketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TokenPayload extends js.Object {
  /**
       * Access token hash. Provides validation that the access token is tied to the
       * identity token. If the ID token is issued with an access token in the
       * server flow, this is always included. This can be used as an alternate
       * mechanism to protect against cross-site request forgery attacks, but if you
       * follow Step 1 and Step 3 it is not necessary to verify the access token.
       */
  var at_hash: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Identifies the audience that this ID token is intended for. It must be one
       * of the OAuth 2.0 client IDs of your application.
       */
  var aud: java.lang.String
  /**
       * The client_id of the authorized presenter. This claim is only needed when
       * the party requesting the ID token is not the same as the audience of the ID
       * token. This may be the case at Google for hybrid apps where a web
       * application and Android app have a different client_id but share the same
       * project.
       */
  var azp: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The user's email address. This may not be unique and is not suitable for
       * use as a primary key. Provided only if your scope included the string
       * "email".
       */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /**
       * True if the user's e-mail address has been verified; otherwise false.
       */
  var email_verified: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The time the ID token expires, represented in Unix time (integer seconds).
       */
  var exp: scala.Double
  /**
       * The user's family name, in a displayable form. Might be provided when:
       * - The request scope included the string "profile"
       * - The ID token is returned from a token refresh
       * - When name claims are present, you can use them to update your app's user
       * records. Note that this claim is never guaranteed to be present.
       */
  var family_name: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The user's given name, in a displayable form. Might be provided when:
       * - The request scope included the string "profile"
       * - The ID token is returned from a token refresh
       * - When name claims are present, you can use them to update your app's user
       * records. Note that this claim is never guaranteed to be present.
       */
  var given_name: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The hosted G Suite domain of the user. Provided only if the user belongs to
       * a hosted domain.
       */
  var hd: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The time the ID token was issued, represented in Unix time (integer
       * seconds).
       */
  var iat: scala.Double
  /**
       * The Issuer Identifier for the Issuer of the response. Always
       * https://accounts.google.com or accounts.google.com for Google ID tokens.
       */
  var iss: java.lang.String
  /**
       * The user's full name, in a displayable form. Might be provided when:
       * - The request scope included the string "profile"
       * - The ID token is returned from a token refresh
       * - When name claims are present, you can use them to update your app's user
       * records. Note that this claim is never guaranteed to be present.
       */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The value of the nonce supplied by your app in the authentication request.
       * You should enforce protection against replay attacks by ensuring it is
       * presented only once.
       */
  var nonce: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The URL of the user's profile picture. Might be provided when:
       * - The request scope included the string "profile"
       * - The ID token is returned from a token refresh
       * - When picture claims are present, you can use them to update your app's
       * user records. Note that this claim is never guaranteed to be present.
       */
  var picture: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The URL of the user's profile page. Might be provided when:
       * - The request scope included the string "profile"
       * - The ID token is returned from a token refresh
       * - When profile claims are present, you can use them to update your app's
       * user records. Note that this claim is never guaranteed to be present.
       */
  var profile: js.UndefOr[java.lang.String] = js.undefined
  /**
       * An identifier for the user, unique among all Google accounts and never
       * reused. A Google account can have multiple emails at different points in
       * time, but the sub value is never changed. Use sub within your application
       * as the unique-identifier key for the user.
       */
  var sub: java.lang.String
}

