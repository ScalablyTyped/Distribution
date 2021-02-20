package typings.gitBranch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("git-branch", JSImport.Namespace)
  @js.native
  def apply(): Unit = js.native
  @JSImport("git-branch", JSImport.Namespace)
  @js.native
  def apply(callback: js.Function2[/* err */ Null | String, /* name */ String, Unit]): Unit = js.native
  @JSImport("git-branch", JSImport.Namespace)
  @js.native
  def apply(
    cwd: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Null | String, /* name */ String, Unit]
  ): Unit = js.native
  @JSImport("git-branch", JSImport.Namespace)
  @js.native
  def apply(cwd: String): Unit = js.native
  @JSImport("git-branch", JSImport.Namespace)
  @js.native
  def apply(cwd: String, callback: js.Function2[/* err */ Null | String, /* name */ String, Unit]): Unit = js.native
  
  @JSImport("git-branch", "sync")
  @js.native
  def sync(): String = js.native
  @JSImport("git-branch", "sync")
  @js.native
  def sync(cwd: String): String = js.native
}
