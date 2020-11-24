package typings.dynamodb.modelMod.Model

import org.scalablytyped.runtime.StringDictionary
import typings.dynamodb.callbackMod.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestroyOperation extends js.Object {
  
  def apply(data: String, callback: Callback): Unit = js.native
  def apply(data: String, options: OperationOptions, callback: Callback): Unit = js.native
  def apply(data: StringDictionary[js.Any], callback: Callback): Unit = js.native
  def apply(data: StringDictionary[js.Any], options: OperationOptions, callback: Callback): Unit = js.native
  def apply(hashKey: String): js.Promise[_] = js.native
  def apply(hashKey: String, options: String): js.Promise[_] = js.native
  def apply(hashKey: String, options: OperationOptions): js.Promise[_] = js.native
  def apply(hashKey: String, rangeKey: String, callback: Callback): Unit = js.native
  def apply(hashKey: String, rangeKey: String, options: OperationOptions): js.Promise[_] = js.native
  def apply(hashKey: String, rangeKey: String, options: OperationOptions, callback: Callback): Unit = js.native
}
