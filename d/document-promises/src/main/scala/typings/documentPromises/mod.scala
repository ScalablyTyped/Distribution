package typings.documentPromises

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("document-promises", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("document-promises", "contentLoaded")
  @js.native
  def contentLoaded: js.Promise[Unit] = js.native
  @scala.inline
  def contentLoaded_=(x: js.Promise[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contentLoaded")(x.asInstanceOf[js.Any])
  
  @JSImport("document-promises", "loaded")
  @js.native
  def loaded: js.Promise[Unit] = js.native
  @scala.inline
  def loaded_=(x: js.Promise[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loaded")(x.asInstanceOf[js.Any])
  
  @JSImport("document-promises", "parsed")
  @js.native
  def parsed: js.Promise[Unit] = js.native
  @scala.inline
  def parsed_=(x: js.Promise[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parsed")(x.asInstanceOf[js.Any])
}
