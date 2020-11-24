package typings.gitRev

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git-rev", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def branch(callback: js.Function1[/* branch */ String, Unit]): Unit = js.native
  
  def log(callback: js.Function1[/* log */ js.Array[js.Array[String]], Unit]): Unit = js.native
  
  def long(callback: js.Function1[/* long */ String, Unit]): Unit = js.native
  
  def short(callback: js.Function1[/* short */ String, Unit]): Unit = js.native
  
  def tag(callback: js.Function1[/* tag */ String, Unit]): Unit = js.native
}
