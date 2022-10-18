package typings.framesync

import typings.framesync.anon.Delta
import typings.framesync.libTypesMod.CancelSync
import typings.framesync.libTypesMod.FlushSync
import typings.framesync.libTypesMod.Sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("framesync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("framesync", JSImport.Default)
  @js.native
  val default: Sync = js.native
  
  @JSImport("framesync", "cancelSync")
  @js.native
  val cancelSync: CancelSync = js.native
  
  @JSImport("framesync", "flushSync")
  @js.native
  val flushSync: FlushSync = js.native
  
  inline def getFrameData(): Delta = ^.asInstanceOf[js.Dynamic].applyDynamic("getFrameData")().asInstanceOf[Delta]
}
