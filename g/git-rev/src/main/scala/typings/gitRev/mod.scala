package typings.gitRev

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("git-rev", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def branch(callback: js.Function1[/* branch */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("branch")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def log(callback: js.Function1[/* log */ js.Array[js.Array[String]], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def long(callback: js.Function1[/* long */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("long")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def short(callback: js.Function1[/* short */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("short")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def tag(callback: js.Function1[/* tag */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tag")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
