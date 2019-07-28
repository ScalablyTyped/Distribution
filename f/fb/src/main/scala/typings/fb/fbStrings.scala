package typings.fb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object fbStrings {
  @js.native
  sealed trait connected extends LoginStatus
  
  @js.native
  sealed trait delete extends ApiMethod
  
  @js.native
  sealed trait get extends ApiMethod
  
  @js.native
  sealed trait not_authorized extends LoginStatus
  
  @js.native
  sealed trait post extends ApiMethod
  
  @js.native
  sealed trait unknown extends LoginStatus
  
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  @scala.inline
  def get: get = "get".asInstanceOf[get]
  @scala.inline
  def not_authorized: not_authorized = "not_authorized".asInstanceOf[not_authorized]
  @scala.inline
  def post: post = "post".asInstanceOf[post]
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
}

