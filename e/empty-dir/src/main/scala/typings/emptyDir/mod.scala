package typings.emptyDir

import typings.node.NodeJS.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(dir: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def apply(dir: String, cb: js.Function2[/* err */ ErrnoException, /* isEmpty */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(dir: String, filter: js.Function1[/* path */ String, Boolean]): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def apply(
    dir: String,
    filter: js.Function1[/* path */ String, Boolean],
    cb: js.Function2[/* err */ ErrnoException, /* isEmpty */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("empty-dir", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def sync(dir: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(dir.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def sync(dir: String, filter: js.Function1[/* path */ String, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(dir.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
