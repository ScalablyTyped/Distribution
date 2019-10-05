package typings.expressDashOpenapi.expressDashOpenapiMod.OpenApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecuritySchemeObject extends js.Object {
  var authorizationUrl: String
  var description: js.UndefOr[String] = js.undefined
  var flow: String
  var in: String
  var name: String
  var scopes: ScopesObject
  var tokenUrl: String
  var `type`: String
}

object SecuritySchemeObject {
  @scala.inline
  def apply(
    authorizationUrl: String,
    flow: String,
    in: String,
    name: String,
    scopes: ScopesObject,
    tokenUrl: String,
    `type`: String,
    description: String = null
  ): SecuritySchemeObject = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl, flow = flow, in = in, name = name, scopes = scopes, tokenUrl = tokenUrl)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[SecuritySchemeObject]
  }
}

