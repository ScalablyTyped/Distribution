package typings.faker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Branch extends js.Object {
  
  def branch(): String = js.native
  
  def commitEntry(): String = js.native
  def commitEntry(options: Merge): String = js.native
  
  def commitMessage(): String = js.native
  
  def commitSha(): String = js.native
  
  def shortSha(): String = js.native
}
