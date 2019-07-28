package typings.dynamodb.dynamodbMod

import typings.dynamodb.callbackMod.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTables extends js.Object {
  def apply(): js.Promise[_] = js.native
  def apply(callback: Callback): Unit = js.native
  def apply(options: CreateTablesOptions): js.Promise[_] = js.native
  def apply(options: CreateTablesOptions, callback: Callback): Unit = js.native
}

