package typings.fetchMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object fetchMockStrings {
  @js.native
  sealed trait DELETE extends js.Object
  
  @js.native
  sealed trait GET extends js.Object
  
  @js.native
  sealed trait HEAD extends js.Object
  
  @js.native
  sealed trait POST extends js.Object
  
  @js.native
  sealed trait PUT extends js.Object
  
  @js.native
  sealed trait always extends js.Object
  
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  @scala.inline
  def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  @scala.inline
  def always: always = "always".asInstanceOf[always]
}

