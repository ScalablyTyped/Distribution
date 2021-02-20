package typings.gitRev

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("git-rev", "branch")
  @js.native
  def branch(callback: js.Function1[/* branch */ String, Unit]): Unit = js.native
  
  @JSImport("git-rev", "log")
  @js.native
  def log(callback: js.Function1[/* log */ js.Array[js.Array[String]], Unit]): Unit = js.native
  
  @JSImport("git-rev", "long")
  @js.native
  def long(callback: js.Function1[/* long */ String, Unit]): Unit = js.native
  
  @JSImport("git-rev", "short")
  @js.native
  def short(callback: js.Function1[/* short */ String, Unit]): Unit = js.native
  
  @JSImport("git-rev", "tag")
  @js.native
  def tag(callback: js.Function1[/* tag */ String, Unit]): Unit = js.native
}
