package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sources {
  
  @JSImport("flashpoint-launcher", "sources")
  @js.native
  val ^ : js.Any = js.native
  
  inline def findOne(sourceId: Double): js.Promise[js.UndefOr[Source]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findOne")(sourceId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Source]]]
}
