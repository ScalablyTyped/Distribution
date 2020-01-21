package typings.fetchIo

import typings.fetchIo.mod.TMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object fetchIoStrings {
  @js.native
  sealed trait delete extends TMethod
  
  @js.native
  sealed trait form extends js.Object
  
  @js.native
  sealed trait get extends TMethod
  
  @js.native
  sealed trait head extends TMethod
  
  @js.native
  sealed trait json extends js.Object
  
  @js.native
  sealed trait options extends TMethod
  
  @js.native
  sealed trait post extends TMethod
  
  @js.native
  sealed trait put extends TMethod
  
  @js.native
  sealed trait urlencoded extends js.Object
  
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  @scala.inline
  def form: form = "form".asInstanceOf[form]
  @scala.inline
  def get: get = "get".asInstanceOf[get]
  @scala.inline
  def head: head = "head".asInstanceOf[head]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def options: options = "options".asInstanceOf[options]
  @scala.inline
  def post: post = "post".asInstanceOf[post]
  @scala.inline
  def put: put = "put".asInstanceOf[put]
  @scala.inline
  def urlencoded: urlencoded = "urlencoded".asInstanceOf[urlencoded]
}

