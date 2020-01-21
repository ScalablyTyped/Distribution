package typings.expressRouters

import typings.expressRouters.expressRoutersMod.RouteConfigMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object expressRoutersStrings {
  @js.native
  sealed trait DELETE extends RouteConfigMethod
  
  @js.native
  sealed trait GET extends RouteConfigMethod
  
  @js.native
  sealed trait PATCH extends RouteConfigMethod
  
  @js.native
  sealed trait POST extends RouteConfigMethod
  
  @js.native
  sealed trait PUT extends RouteConfigMethod
  
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
}

