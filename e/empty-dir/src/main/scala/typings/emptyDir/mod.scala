package typings.emptyDir

import typings.node.NodeJS.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("empty-dir", JSImport.Namespace)
  @js.native
  def apply(dir: String): js.Promise[Boolean] = js.native
  @JSImport("empty-dir", JSImport.Namespace)
  @js.native
  def apply(dir: String, cb: js.Function2[/* err */ ErrnoException, /* isEmpty */ Boolean, Unit]): Unit = js.native
  @JSImport("empty-dir", JSImport.Namespace)
  @js.native
  def apply(dir: String, filter: js.Function1[/* path */ String, Boolean]): js.Promise[Boolean] = js.native
  @JSImport("empty-dir", JSImport.Namespace)
  @js.native
  def apply(
    dir: String,
    filter: js.Function1[/* path */ String, Boolean],
    cb: js.Function2[/* err */ ErrnoException, /* isEmpty */ Boolean, Unit]
  ): Unit = js.native
  
  @JSImport("empty-dir", "sync")
  @js.native
  def sync(dir: String): Boolean = js.native
  @JSImport("empty-dir", "sync")
  @js.native
  def sync(dir: String, filter: js.Function1[/* path */ String, Boolean]): Boolean = js.native
}
