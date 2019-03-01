package typings
package fxnLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object fxnLibStrings {
  @js.native
  sealed trait DELETE
    extends fxnLib.fxnMod.HttpMethod
  
  @js.native
  sealed trait GET
    extends fxnLib.fxnMod.HttpMethod
  
  @js.native
  sealed trait OPTIONS
    extends fxnLib.fxnMod.HttpMethod
  
  @js.native
  sealed trait POST
    extends fxnLib.fxnMod.HttpMethod
  
  @js.native
  sealed trait PUT
    extends fxnLib.fxnMod.HttpMethod
  
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  @scala.inline
  def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
}

